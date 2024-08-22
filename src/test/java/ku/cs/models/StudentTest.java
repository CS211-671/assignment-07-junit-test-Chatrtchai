package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testAddScore(){
        Student s = new Student("6xxxxxxxx", "StudentTest");
        s.addScore(40); // Add 40 (current score 40)
        assertEquals(40, s.getScore());
        s.addScore(30); // Add 30 (current score 70)
        assertEquals(70, s.getScore());
    }

    @Test
    void testCalculateGrade(){
        Student s = new Student("6xxxxxxxx", "StudentTest", 50);
        s.addScore(10); // Add 10 (current score 60)
        assertEquals("C", s.grade());
    }

    @Test
    void testID() {
        Student s = new Student("6610401951", "Chatrtchai Chotsawat", 0);
        assertEquals("6610401951", s.getId());
    }

    @Test
    void testChangeName() {
        Student s = new Student("6610401951", "Chatrtchai Chotsawat", 0);
        s.changeName("Pepo");
        assertEquals("Pepo", s.getName());
    }

}