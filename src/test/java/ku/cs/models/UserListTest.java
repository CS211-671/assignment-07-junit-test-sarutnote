package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    User user;
    UserList userList;

    @BeforeEach
    void setUp() {
        userList = new UserList();
        user = new User("Note", "1234");
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        userList.addUser("A", "1111");
        userList.addUser("B", "2222");
        userList.addUser("C", "3333");

        // TODO: find one of them
        User findUser = userList.findUserByUsername("A");
        assertEquals("A", findUser.getUsername());

        // TODO: assert that UserList found User
         String expected = "A";
         String actual = findUser.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        userList.addUser("D", "4444");
        userList.addUser("E", "5555");
        userList.addUser("F", "6666");

        // TODO: change password of one user
        boolean changePass = userList.changePassword("D", "4444", "6789");


        // TODO: assert that user can change password
        assertTrue(changePass);

    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("G", "7777");
        userList.addUser("H", "8888");
        userList.addUser("I", "9999");
        // TODO: call login() with correct username and password
        User actual = userList.login("G", "7777");

        // TODO: assert that User object is found
        String expected = "G";
        assertEquals(expected, actual.getUsername());
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("J", "1010");
        userList.addUser("K", "1101");
        userList.addUser("L", "1212");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("J", "1234");
        // TODO: assert that the method return null
        assertNull(actual);
    }

}