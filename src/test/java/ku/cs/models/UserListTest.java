package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {

        UserList userList = new UserList();

        // TODO: add 3 users to UserList
        userList.addUser("Pepo", "pepo123");
        userList.addUser("Chatchai", "chatchai123");
        userList.addUser("Chotsawat", "chotsawat123");

        // TODO: find one of them
        User user = userList.findUserByUsername("Pepo");

        // TODO: assert that UserList found User
        String expected = "Pepo";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {

        UserList userList = new UserList();

        // TODO: add 3 users to UserList
        userList.addUser("Pepo", "pepo123");
        userList.addUser("Chatchai", "chatchai123");
        userList.addUser("Chotsawat", "chotsawat123");

        // TODO: change password of one user
        boolean actual = userList.changePassword("Pepo", "pepo123", "pepo090148");

        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {

        UserList userList = new UserList();

        // TODO: add 3 users to UserList
        userList.addUser("Pepo", "pepo123");
        userList.addUser("Chatchai", "chatchai123");
        userList.addUser("Chotsawat", "chotsawat123");

        // TODO: call login() with correct username and password
        User user = userList.login("Pepo", "pepo123");

        // TODO: assert that User object is found
        String expected = "Pepo";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with incorrect username or incorrect password

        // TODO: assert that the method return null
        // assertNull(actual);
    }

}