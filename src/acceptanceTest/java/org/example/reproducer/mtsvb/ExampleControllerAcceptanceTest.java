package org.example.reproducer.mtsvb;

import org.junit.jupiter.api.Test;

public class ExampleControllerAcceptanceTest extends BaseAcceptanceTest {
    @Test
    void acceptanceTest() {
        webTestClient.get().exchange()
                .expectStatus().isOk();
    }
}
