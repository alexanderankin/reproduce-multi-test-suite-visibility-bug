package org.example.reproducer.mtsvb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ExampleControllerITest extends BaseIntegrationTest {
    @Autowired
    WebTestClient webTestClient;

    @Test
    void test() {
        String responseBody = webTestClient.get().exchange()
                .expectStatus().isOk()
                .expectBody(String.class).returnResult().getResponseBody();
        assertThat(responseBody, is(utilityFunction()));
    }
}
