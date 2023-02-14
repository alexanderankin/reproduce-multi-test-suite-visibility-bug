package org.example.reproducer.mtsvb;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ExampleControllerITest extends BaseIntegrationTest {

    @Test
    void integrationTest() {
        String responseBody = webTestClient.get().exchange()
                .expectBody(String.class).returnResult().getResponseBody();
        assertThat(responseBody, is(utilityFunction()));
    }
}
