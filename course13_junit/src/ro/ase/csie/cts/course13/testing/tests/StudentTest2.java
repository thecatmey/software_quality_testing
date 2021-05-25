package ro.ase.csie.cts.course13.testing.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import ro.ase.csie.cts.course13.testing.exceptions.WrongAgeException;
import ro.ase.csie.cts.course13.testing.exceptions.WrongGradeException;
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

    @org.junit.Test
    public void setNameErrorCondition(){
        String newName = "Io";
        try {
            student.setName(newName);
            fail("Did not get expected exception");
        } catch (WrongNameException e) {
            assertTrue(true);
        }
    }

    @org.junit.Test(expected = WrongAgeException.class )
    public void setAgeErrorCondition() throws WrongAgeException {
        int newAge = -4;
        student.setAge(newAge);
    }

    @org.junit.Test
    public void getMinGradeOrderingAsc() throws WrongGradeException {
        ArrayList<Integer> orderedGrades = new ArrayList<>();
        orderedGrades.add(7);
        orderedGrades.add(8);
        orderedGrades.add(9);

        student.setGrades(orderedGrades);

        int expectedGrade = 7;
        int minGrade = student.getMinGrade();

        assertEquals("Testing with an ordered array of grades", expectedGrade, minGrade);
    }

    @Test
    public void testGetMinGradeCardinalityZero() throws WrongGradeException {
        ArrayList<Integer> emptyGrades = new ArrayList<>();
        student.setGrades(emptyGrades);

        int expectedGrade = 0;
        int minGrade = student.getMinGrade();

        assertEquals("Testing with zero grades", expectedGrade, minGrade);
    }


    @Test
    public void testGetMinGradeCardinalityOne() throws WrongGradeException {
        int singleGrade = 9;
        ArrayList<Integer> oneGrade = new ArrayList<>();
        oneGrade.add(singleGrade);
        student.setGrades(oneGrade);

        int expectedGrade = singleGrade;
        int minGrade = student.getMinGrade();

        assertEquals("Testing with zero grades", expectedGrade, minGrade);
    }

    @Test
    public void testSetNameInverseRelation() throws WrongNameException{

        String newName = "Alice";
        student.setName(newName);

        assertNotEquals(initialName, student.getName());
    }
}