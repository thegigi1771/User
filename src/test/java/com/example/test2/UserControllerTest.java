package com.example.test2;

import com.example.test2.User.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebFluxTest
public class UserControllerTest {
    @Autowired
    private WebTestClient webTestClient;

    /*
    @Test
    public void testGetUserById() {
        webTestClient.get().uri("/users/1")
                .exchange()
                .expectStatus().isOk()
                .expectBody(User.class);
    }*/
}
