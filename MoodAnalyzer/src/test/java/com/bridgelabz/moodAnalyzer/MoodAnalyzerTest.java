package com.bridgelabz.moodAnalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
    @Test
    public void messageIsSad_ReturnSad(){ // TC1.1
        String message = "I am in Sad mood";
        String result1 = MoodAnalyzer.analyzeMood(message);
        Assertions.assertEquals("SAD",result1);
    }

    @Test
    void messageIsNotSad_returnHappy() { // TC1.2
        String message = "I am in Any Mood";
        String result = MoodAnalyzer.analyzeMood("message");
        Assertions.assertEquals("HAPPY", result);
    }
}