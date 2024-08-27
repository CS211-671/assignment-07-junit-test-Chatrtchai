package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("Add Score")
    void testAddScore(){
        Student student = new Student("6xxxxxxxx", "StudentTest");
        student.addScore(40); // Add 40 (current score 40)
        assertEquals(40, student.getScore());
        student.addScore(30); // Add 30 (current score 70)
        assertEquals(70, student.getScore());
    }

    @Test
    @DisplayName("Calculate Grade")
    void testCalculateGrade(){
        Student student = new Student("6xxxxxxxx", "StudentTest", 50);
        student.addScore(10); // Add 10 (current score 60)
        assertEquals("C", student.grade());
    }

    @Test
    @DisplayName("Is same ID?")
    void testisId() {
        Student student = new Student("6610401951", "Chatrtchai Chotsawat", 0);
        assertEquals("6610401951", student.getId());
    }

    @Test
    @DisplayName("Change Name")
    void testChangeName() {
        Student student = new Student("6610401951", "Chatrtchai Chotsawat", 0);
        student.changeName("Pepo");
        assertEquals("Pepo", student.getName());
    }

}