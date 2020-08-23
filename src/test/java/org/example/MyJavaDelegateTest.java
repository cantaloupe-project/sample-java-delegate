package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyJavaDelegateTest {

    private MyJavaDelegate delegate;

    @BeforeEach
    void setUp() {
        this.delegate = new MyJavaDelegate();
        delegate.setContext(new MockJavaContext());
    }

    @Test
    void preAuthorize() {
        assertTrue((boolean) delegate.preAuthorize());
    }

    // etc.

}
