/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise6student;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jetnipit Morakot
 */
public class StudentDatabaseJPA {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student std1 = new Student(1, "John", 4.00);
       Student std2 = new Student(2, "Marry", 3.00);
       StudentTable.insertStudent(std1);
       StudentTable.insertStudent(std2);
       
       List<Student> studentList = StudentTable.findAllStudent();
       printAllEmployee(studentList);
    }
    
    
     public static void printAllEmployee(List<Student> studentList) {
        for(Student std : studentList) {
           System.out.print(std.getId() + " ");
           System.out.print(std.getName() + " ");
           System.out.println(std.getGpa() + " ");
       }
    }
}
