package com.example.bankapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles; // <-- MUST IMPORT THIS

@SpringBootTest
@ActiveProfiles("test") // <-- THIS LINE IS REQUIRED TO STOP MYSQL ERRORS
class BankappApplicationTests {

    @Test
    void contextLoads() {
    }

}
