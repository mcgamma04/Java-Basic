package jdbc.services;

import jdbc.enums.Gender;
import jdbc.models.Student;

public interface Studentduties {
     boolean saveStudent(Student student);
     void displayAll();
     void  Search(Student student);
     void update(Student student);
     void delete(Student student);


}
