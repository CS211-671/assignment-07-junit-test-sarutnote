package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s1;

    @BeforeEach
    void init(){
        s1 = new Student("6610451133","Note");
    }

    @Test
    void testAddScore(){
//        Student s1 = new Student("6610451133", "Note");
        assertEquals(0, s1.getScore());
        s1.addScore(40.5);
        assertEquals(40.5, s1.getScore());
        s1.addScore(10);
        assertEquals(50.5, s1.getScore());
    }

    @Test
    @DisplayName("ทดสอบคิดเกรด")
    void testCalculateGrade(){
//        Student s1 = new Student("6610451133", "Note");
        s1.addScore(60);
        assertEquals("C", s1.grade());
    }

    @Test
    void testChangeName(){
        s1.changeName("NooJon");
        assertEquals("NooJon", s1.getName());
    }

    @Test



}