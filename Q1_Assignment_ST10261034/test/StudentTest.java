/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testGetName() {
        Student student = new Student("Ameer", 18); 
        String expResult = "Ameer";
        String result = student.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAge() {
        Student student = new Student("Ameer", 20); 
        int expResult = 20;
        int result = student.getAge();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetName() {
        Student student = new Student("Ameer", 22); 
        student.setName("Ameer");
        String expResult = "Ameer";
        String result = student.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAge() {
        Student student = new Student("Ameer", 25);
        student.setAge(30);
        int expResult = 30;
        int result = student.getAge();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        Student student = new Student("Ameer", 28); 
        String expResult = "Name: Ameer, Age: 28";
        String result = student.toString();
        assertEquals(expResult, result);
    }

    
    
}
    

