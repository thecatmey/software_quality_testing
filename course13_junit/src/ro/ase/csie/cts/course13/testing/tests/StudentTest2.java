package ro.ase.csie.cts.course13.testing.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import ro.ase.csie.cts.course13.testing.exceptions.WrongAgeException;
import ro.ase.csie.cts.course13.testing.exceptions.WrongNameException;
import ro.ase.csie.cts.course13.testing.models.Student;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest2 {

    //Test fixture
    public Student student;
    static ArrayList<Integer> grades;
    static String initialName;
    static int initialAge;

    @org.junit.BeforeClass
    public static void setUpBeforeClass() throws Exception {
        grades = new ArrayList<>();
        grades.add(9);
        grades.add(10);
        initialName = "Steve";
        initialAge = 21;
    }

    @org.junit.AfterClass
    public static void setUpAfterClass() throws Exception {
        grades.clear();
        grades = null;
    }

    @Before
    public void setUp() throws Exception {
        student = new Student(initialName, initialAge, grades);
    }

    @After
    public void tearDown() throws Exception {
        student = null;
    }

    @org.junit.Ignore
    @org.junit.Test
    public void test() {
        fail("Not implemented yet");
    }

    @org.junit.Test
    public void setNameRightValues() throws WrongNameException {

        String newName = "Alice";
        student.setName(newName);

        assertEquals("Testing with proper name", newName, student.getName());
    }

    @org.junit.Test
    public void setAgeRightValues(){

        int newAge = initialAge + 1;
        try {
            student.setAge(newAge);
            assertEquals("Testing with proper age", newAge, student.getAge());
        } catch (WrongAgeException e) {
            fail("Unexpected exception");
        }

    }
}