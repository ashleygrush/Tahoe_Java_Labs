package part_09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
// file location:
// disney file location: /Users/ashleyalmeida/Desktop/CodingNomads/refugees_all_years.csv

class RefugeesScanner extends Exception {
    public static void main(String[] args){

        // import file.
        args = new String[1];
        args[0] = "/Users/ashleyalmeida/Desktop/CodingNomads/refugees_all_years.csv";

        //check for file
        if (!(args.length >= -1)) {
            System.out.println("No file found.");
            return;
        }

        // create array catch list.
        ArrayList<RefugeeData> data = new ArrayList<>();

        // create try-with-resources to open/close file
        try
            // import readers into try-with-resources
            (FileReader fReader = new FileReader(args[0]);
            BufferedReader bReader = new BufferedReader(fReader))
        {

            // variable to test reader line by line
            String line;

            // loop the scanner
                // try/catch to catch any null values
            while (null != (line = bReader.readLine())) {

                // Split commas into columns
                String[] values = line.split(",");

                // catch any null values
                if (values.length < 1){
                    return;
                }

                // initialize variables
                int id;
                int refYear;
                String refCountry;
                String refAsuylum;
                int refPopulation;
                int refRemaining;

                try {
                    // try to set the value for value[0] - ID Number
                    id  = Integer.parseInt(values[0]);
                } catch (Exception e){
                    // give it default -1 if there is an error
                    id = -1;
                }

                try {
                    // try to set the value for value[1] - Refugee Year
                    refYear = Integer.parseInt(values[1]);
                } catch (Exception e){
                    // give it default -1 if there is an error
                    refYear = -1;
                }

                try {
                    // try to set the value for value[2] - RefugeeCountry
                    refCountry  = values[2];
                } catch (Exception e){
                    // give it default -1 if there is an error
                    refCountry = "-1";
                }

                try {
                    // try to set the value for value[3] - RefugeeAsylmn
                    refAsuylum  = values[3];
                } catch (Exception e){
                    // give it default -1 if there is an error
                    refAsuylum = "-1";
                }

                try {
                    // try to set the value for value[4] - RefugeePopulation
                     refPopulation = Integer.parseInt(values[4]);
                } catch (Exception e){
                    // give it default -1 if there is an error
                    refPopulation = 0;
                }

                try {
                    // try to set the value for value[5] - RefugeeRemaining
                    refRemaining = Integer.parseInt(values[6]);
                } catch (Exception e){
                    // give it default -1 if there is an error
                    refRemaining = 0;
                }


                // columns into rows
                RefugeeData row = new RefugeeData(id, refYear, refCountry, refAsuylum, refPopulation, refRemaining);

                // arrange into array.
                data.add(row);
            }
        }
        // catch Exceptions
        catch (Exception e) {
            System.out.println("Exception found: " + e.getMessage());
            e.printStackTrace();
        }

        // sort data for bubble sort
        data = sortData(data);
        int sum = 0;

        for (RefugeeData ref : data) {
            System.out.println(ref.toString());
            sum += ref.getRefPopulation();
        }
    }

    // bubble sort method
    public static ArrayList<RefugeeData> sortData(ArrayList<RefugeeData> data){

        // iterate through list
        for (int i = 0; i < data.size(); i++) {

            //iterate through first row
            for (int j = data.size() - 1; j > i; j--){

                // compare through the loops
                if (data.get(j).getRefPopulation() > (data.get(j - 1).getRefPopulation())) {

                    //swap values:
                    //assign "temp" value to "i"
                    RefugeeData temp = data.get(i);

                    // pick up "i-1"
                    data.remove(j);
                    data.add(i, data.get(j-1));

                    // swap "i-1" with "temp"
                    data.remove(j-1);
                    data.add(j-1, temp);
                }
            }
        }

    return data;
    }
}
