import org.junit.Test;

import static org.junit.Assert.*;

public class MyTest {

    @Test
    public void R1TestCase() {
        Student student = new Student(50, -2);
        assertEquals(output.InvalidInput, student.checkDistinction());
    }

    @Test
    public void R2TestCase() {
        Student student = new Student(50, 3.0);
        assertEquals(output.NotDistinction, student.checkDistinction());
    }

    @Test
    public void R3TestCase() {
        Student student = new Student(20, 3.8);
        assertEquals(output.NotDistinction, student.checkDistinction());
    }

    @Test
    public void R4TestCase() {
        Student student = new Student(15, 4.1);
        assertEquals(output.InvalidInput, student.checkDistinction());
    }

    @Test
    public void R5TestCase() {
        Student student = new Student(80, -2.3);
        assertEquals(output.InvalidInput, student.checkDistinction());
    }

    @Test
    public void R6TestCase() {
        Student student = new Student(85, 2.8);
        assertEquals(output.NotDistinction, student.checkDistinction());
    }

    @Test
    public void R7TestCase() {
        Student student = new Student(90, 3.5);
        assertEquals(output.Distinction, student.checkDistinction());
    }

    @Test
    public void R8TestCase() {
        Student student = new Student(84, 4.2);
        assertEquals(output.InvalidInput, student.checkDistinction());
    }

    @Test
    public void R9TestCase() {
        Student student = new Student(120, -3);
        assertEquals(output.InvalidInput, student.checkDistinction());
    }

    @Test
    public void R10TestCase() {
        Student student = new Student(110, 3);
        assertEquals(output.InvalidInput, student.checkDistinction());
    }

    @Test
    public void R11TestCase() {
        Student student = new Student(105, 3.6);
        assertEquals(output.InvalidInput, student.checkDistinction());
    }

    @Test
    public void R12TestCase() {
        Student student = new Student(115, 4.3);
        assertEquals(output.InvalidInput, student.checkDistinction());
    }

}