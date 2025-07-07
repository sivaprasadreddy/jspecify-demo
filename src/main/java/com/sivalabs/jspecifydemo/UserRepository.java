package com.sivalabs.jspecifydemo;

import org.jspecify.annotations.Nullable;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class UserRepository {
    private final Random random = new Random();

    public List<User> getUsers() {
        if(random.nextBoolean()) {
            return null;
        }
        return List.of(
                new User(1L, "Siva", "siva@mail.com"),
                new User(2L, "Marco", "marco@mail.com")
        );
    }
}
