package com.bridgelabz.moodAnalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    void messageIsSad_returnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String message = "I am in Sad Mood";
        String result = MoodAnalyzer.analyzeMood("message");
        Assertions.assertEquals("SAD", result);
    }
}