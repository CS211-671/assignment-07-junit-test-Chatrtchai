package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    StudentList studentList;

    @BeforeEach
    void setUp() {
        studentList = new StudentList();
    }

    @Test
    @DisplayName("Add User to Userlist")
    public void testaddNewStudent() {
        studentList.addNewStudent("6610401951", "Chatrtchai Chotsawat");
        studentList.addNewStudent("6610601372", "Suwitchaya Makrak");

        assertEquals(2, studentList.getStudents().size());
    }

    @Test
    @DisplayName("Find User by ID")
    public void testfindStudentById() {
        studentList.addNewStudent("6610401951", "Chatrtchai Chotsawat");
        Student student =  studentList.findStudentById("6610401951");

        assertNotNull(student);
    }

    @Test
    @DisplayName("Add score by ID")
    public void testgiveScoreToId() {
        studentList.addNewStudent("6610601372", "Suwitchaya Makrak", 0);
        studentList.giveScoreToId("6610601372", 10);

        assertEquals(10, studentList.findStudentById("6610601372").getScore());
    }

    @Test
    @DisplayName("View Grade by ID")
    public void testviewGradeOfId() {
        studentList.addNewStudent("6610401951", "Chatrtchai Chotsawat", 100);

        String expected = "A";
        String actual = studentList.viewGradeOfId("6610401951");

        assertEquals(expected, actual);

    }

}