package org.example.reproducer.mtsvb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ExampleControllerTest {
    ExampleController exampleController;

    @BeforeEach
    void setup() {
        exampleController = new ExampleController();
    }

    @Test
    void test() {
        assertThat(exampleController.hello().block(), is("world"));
    }

}
