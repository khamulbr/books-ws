package com.nazgulsoft.apis.booksws.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class UserServiceTest {

    private UserService userService = new UserService();

    @Test
    public void itShouldReturnTheProperUser__WhenAUserIsPresent() {
        //Given
        User expectedUser = new User("myusername", "$2a$12$5rYnmiswPytMCmenD7BX6OmeYBe1jYFfKP3B5vG5d80K6gkr5Xr6C", true);

        //When
        User actualUser = userService.getUserByUsername("myusername");

        //Then
        assertEquals(expectedUser, actualUser);
    }

    @Test
    public void itShouldReturnNull__WhenAUserIsNotPresent() {
        //Given
        User expectedUser = new User();

        //When
        User actualUser = userService.getUserByUsername("myusername2");

        //Then
        assertNull(actualUser);
    }

}