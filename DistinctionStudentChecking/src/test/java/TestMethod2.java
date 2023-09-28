import org.junit.Test;

import static org.junit.Assert.*;

public class TestMethod2 {

    @Test
    public void P5TestCase() {
        Student student = new Student(40, -2.3);
        assertEquals(output.InvalidInput, student.checkDistinction());
    }

    @Test
    public void P6TestCase() {
        Student student = new Student(40, 2.8);
        assertEquals(output.NotDistinction, student.checkDistinction());
    }

    @Test
    public void P7TestCase() {
        Student student = new Student(40, 3.5);
        assertEquals(output.NotDistinction, student.checkDistinction());
    }

    @Test
    public void P8TestCase() {
        Student student = new Student(60, 4.2);
        assertEquals(output.InvalidInput, student.checkDistinction());
    }

    @Test
    public void P9TestCase() {
        Student student = new Student(90, -3);
        assertEquals(output.InvalidInput, student.checkDistinction());
    }

    @Test
    public void P10TestCase() {
        Student student = new Student(90, 3);
        assertEquals(output.NotDistinction, student.checkDistinction());
    }

    @Test
    public void P11TestCase() {
        Student student = new Student(95, 3.6);
        assertEquals(output.Distinction, student.checkDistinction());
    }

    @Test
    public void P12TestCase() {
        Student student = new Student(100, 4.3);
        assertEquals(output.InvalidInput, student.checkDistinction());
    }

    @Test
    public void P13TestCase() {
        Student student = new Student(120, -3);
        assertEquals(output.InvalidInput, student.checkDistinction());
    }

    @Test
    public void P14TestCase() {
        Student student = new Student(110, 3);
        assertEquals(output.InvalidInput, student.checkDistinction());
    }

    @Test
    public void P15TestCase() {
        Student student = new Student(105, 3.6);
        assertEquals(output.InvalidInput, student.checkDistinction());
    }

    @Test
    public void P16TestCase() {
        Student student = new Student(115, 4.3);
        assertEquals(output.InvalidInput, student.checkDistinction());
    }

}