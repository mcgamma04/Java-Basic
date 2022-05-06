package tutoriaontest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student =  new Student();

    @Test
    void studentDetails(){
        String sname =  "Adebayo";
        student.setSurname(sname);
        assertEquals(sname, student.getSurname());
    }
}