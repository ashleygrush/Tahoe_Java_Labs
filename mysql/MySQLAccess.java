package mysql;

import mysql.Course;

import java.sql.*;
import java.util.ArrayList;

public class MySQLAccess {
    // not part of the Java library
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public static void main(String[] args) {
        MySQLAccess example = new MySQLAccess();


        try {
            example.readDataBase("JDBC Course 1", 3, "Computer Science");
        } catch (Exception e){
            System.out.println("error in readDateBase()" + e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }

    public void readDataBase(String course_name, int credits, String department)
            throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");


            // connect to SQL server
            // Setup the connection with the DB (a static method, using the class name)
            connection = DriverManager.getConnection("jdbc:mysql://localhost/tahoe_db?" +
                    "user=root&password=Firenze1@&useSSL=false&serverTimezone=UTC");
            // in the url: port; link; server; database,which table; username/password; serverTimezone

            // Statement is the object we use to execute queries from the connection
            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();

            // selects table to work with
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from tahoe_db.courses;");

            //writeResultSet(resultSet);
            ArrayList<Course> courses = mapResultSetToObjects(resultSet);

            for (Course c : courses){
                System.out.println(c.toString());
            }

            // inserts data into the table
            // PreparedStatements can use variables and are more efficient
            // ?, ? gets values for prepared statements below
            preparedStatement = connection
                    .prepareStatement("insert into tahoe_db.courses (name, credits, department) " +
                            "values (?, ?, ?)");
            // Parameters start with 1
            preparedStatement.setString(1, course_name);
           // preparedStatement.setString(2, credits);
            preparedStatement.setInt(2, credits);
            //preparedStatement.setString(4, department);
            preparedStatement.setString(3, department);
            preparedStatement.executeUpdate();


            preparedStatement = connection.prepareStatement("SELECT * from tahoe_db.courses");
            resultSet = preparedStatement.executeQuery();

            writeResultSet(resultSet);



             //Remove again the insert comment
            preparedStatement = connection
                    .prepareStatement("delete from tahoe_db.courses where name = ? ; ");
            preparedStatement.setString(1, "JDBC Course 1");
            preparedStatement.executeUpdate();

            resultSet = statement.executeQuery("select * from tahoe_db.courses");

            writeMetaData(resultSet);

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            close();
        }

    }

    private void writeMetaData(ResultSet resultSet) throws SQLException {
        //         Now get some metadata from the database
        // Result set get the result of the SQL query

        System.out.println("The columns in the table are: ");

        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));

        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
        }
    }

    private void writeResultSet(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getString(2);
            int id = resultSet.getInt("id");
            String course = resultSet.getString("name");
            //String description = resultSet.getString("description");
            int credits = resultSet.getInt("credits");
            //String department = resultSet.getString("department");
            String department = resultSet.getString("department");

            System.out.println("ID number: " + id);
            System.out.println("Course: " + course);
           // System.out.println("Description: " + description);
            System.out.println("Credits: " + credits);
           // System.out.println("Department: " + department);
            System.out.println("Department: " + department);
            System.out.println("---------------------------------");
            System.out.println("---------------------------------");

        }
    }

    private ArrayList<Course> mapResultSetToObjects(ResultSet resultSet) throws SQLException {

        ArrayList<Course> retList = new ArrayList();

        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            Course c = new Course();
            c.setId(resultSet.getInt("id"));
            c.setName(resultSet.getString("name"));
            c.setCredits(resultSet.getInt("credits"));
            c.setDepartment(resultSet.getString("department"));

            retList.add(c);
        }

        return retList;
    }


    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {

        }
    }

}