package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class MainClient {


    public static void main(String[] studentsListgs) {


        ArrayList<Student> studentsList = new ArrayList<Student>();

        // Adding entries in above List
        // using add() method
        studentsList.add(new Student(111, "Mayank", "london"));
        studentsList.add(new Student(131, "Anshul", "nyc"));
        studentsList.add(new Student(121, "Solanki", "jaipur"));
        studentsList.add(new Student(101, "AggstudentsListwal", "Hongkong"));

        // Display message on console for better readability
        System.out.println("Unsorted");

        // Iterating over entries to print them
        for (int i = 0; i < studentsList.size(); i++)
            System.out.println(studentsList.get(i));

        Collections.sort(studentsList);
        System.out.println("AFTER SORTING USING COMPARABLE INTERFACE");

        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < studentsList.size(); i++)
            System.out.println(studentsList.get(i));



        System.out.println("AFTER SORTING USING comparator INTERFACE");
        System.out.println("------------------------------------------------------------");
        Collections.sort(studentsList,new RollNocomparator());
        for (int i = 0; i < studentsList.size(); i++)
            System.out.println(studentsList.get(i));


        System.out.println("Sorting using address comparator");

        System.out.println("--------------------------------------------------------");

        Collections.sort(studentsList,new AddressComparator());

        for (int i = 0; i < studentsList.size(); i++)
            System.out.println(studentsList.get(i));



    }
}
