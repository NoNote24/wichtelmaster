package eu.sarahegger.wichteln;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostwomanTest {
    Postwoman postwoman = new Postwoman();

    @Test
    void sendEmail() {
        postwoman.setRecipient("YOUR.EMAIL@yourhost.com");
        postwoman.sendEmail("You", "Test");
    }
}