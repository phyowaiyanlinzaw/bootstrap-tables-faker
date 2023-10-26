package com.example.testdatatableswithfaker;

import com.github.javafaker.Faker;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakerService {

    private final Faker faker = new Faker();

    public List<User> getUsers(int count) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            User user = new User();
            user.setId((long) i);
            user.setEmail(faker.internet().emailAddress());
            user.setName(faker.name().fullName());
            user.setDepartment(faker.job().field());
            user.setRole(faker.job().position());
            user.setProjectCount(faker.number().numberBetween(0, 10));
            users.add(user);
        }
        return users;
    }
}
