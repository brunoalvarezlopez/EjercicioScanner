package com.ironhack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("results.txt");
        FileWriter writer = new FileWriter("results.txt", false);
        File origen = new File ("oscar_age_female.csv");
        Scanner scanner = new Scanner(origen);
        scanner.nextLine();

     while (scanner.hasNextLine()) {
         String line = scanner.nextLine();
         String [] dato = line.split(",");
         String name = dato[3];
         String year = dato[1];
         String age = dato[2];
         String movie = dato[4];
         writer.write("Name: "+ name+ "\n");
         writer.write("Year: "+ year + "\n");
         writer.write("Age: "+ age + "\n");
         writer.write("Movie: "+ movie+ "\n");
         writer.write("====================\n");

     }
         writer.close();
         scanner.close();







     }}
         /*

         writer.write("Name: "+ "variable\n");
         writer.write("Year: "+ "variable\n");
         writer.write("Age: "+ "variable\n");
         writer.write("Movie: "+ "variable\n");
         writer.write("====================\n");

         writer.close();
         scanner.close();

         System.out.println("proceso finalizado");
        }

    }
}

/*

    FileWriter writer = new FileWriter("demo.txt", true);
        writer.write("Hola mundo :D\n");
                writer.write("Segunda línea\n");
                writer.close();

                File file = new File("demo.txt");
                Scanner scanner = new Scanner(file);

                while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                }

                scanner.close();

                */


/* Create a program who reads the file called oscar_age_female.csv who have this columns Index, Year, Age, Name, Movie in format csv read it print it in a new file called result.txt in the following format.
Name: name
Year: year
Age: age
Movie: movie

*/
