package application;

import entities.Employee2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramClassComparable {

    public static void main(String[] args) {

        List<Employee2> list = new ArrayList<>();
        String path = "C:\\Users\\josem\\Documents\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee2(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }

            Collections.sort(list);
            for (Employee2 s : list) {
                System.out.println(s.getName() + "," + s.getSalary());
            }

        }
        catch (IOException err) {
            System.out.println("Error: " + err.getMessage());
        }

    }
}
