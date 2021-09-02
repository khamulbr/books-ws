package com.nazgulsoft.apis.booksws.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private User user = null;

    public UserService() {
        user = new User("myusername", "$2a$12$5rYnmiswPytMCmenD7BX6OmeYBe1jYFfKP3B5vG5d80K6gkr5Xr6C",
                true);
    }

    public User getUserByUsername(String username) {
        if(user.getUsername().equals(username))
            return user;
        return null;
    }
}
