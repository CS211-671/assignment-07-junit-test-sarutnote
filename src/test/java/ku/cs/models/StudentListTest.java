package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    Student student;
    StudentList studentList;

    @BeforeEach
    void setUp() {
        student = new Student("1234", "Note");
        studentList = new StudentList();
    }

    @Test
    public void testAddNewStudent(){
        studentList.addNewStudent("1111", "A");
        studentList.addNewStudent("2222", "B", 50.0);

        Student findStudent = studentList.findStudentById("1111");
        String expected = "{id: '1111', name: 'A', score: 0.0}";
        assertEquals(expected, findStudent.toString());
    }

    @Test
    public void testFindStudentById(){
        studentList.addNewStudent("3333", "C");
        Student findStudent = studentList.findStudentById("3333");
        assertEquals("C", findStudent.getName());
        assertEquals("3333", findStudent.getId());
    }

    @Test
    public void testGiveScoreToId(){
        studentList.addNewStudent("4444", "D");
        studentList.giveScoreToId("4444", 100);

        assertEquals(100, studentList.findStudentById("4444").getScore());
    }

    @Test
    public void testViewGradeOfId(){
        studentList.addNewStudent("5555", "E");
        studentList.giveScoreToId("5555", 79);

        assertEquals("B", studentList.viewGradeOfId("5555") );
    }


}