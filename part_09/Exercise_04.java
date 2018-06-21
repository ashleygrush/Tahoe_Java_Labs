package part_09;


//Bonus questions not covered in book.

//Write a class that can get the date of the last modification, can check whether or not you can write to that file
//and can set a file to read-only.
//Hint, use the "File" class.


// file import: "/Users/ashleyalmeida/Desktop/CodingNomads/file"

import java.io.File;

class Exercise_04 {
    public static void main(String[] args) {

        // import file.
        File file = new File("/Users/ashleyalmeida/Desktop/CodingNomads/file.txt");

        // file.lastmodified
        file.lastModified();
        System.out.println(file.lastModified());

        // file.canRead
        file.canRead();

        // file.canWrite
        file.canWrite();
        System.out.println(file.canWrite());


        // file.setReadOnly
        file.setReadOnly();
        System.out.println(file.setReadOnly());

    }
}







