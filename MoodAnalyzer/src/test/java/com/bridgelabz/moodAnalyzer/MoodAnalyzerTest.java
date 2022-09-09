package com.bridgelabz.moodAnalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void messageIsSad_ReturnSad(){
        MoodAnalyzer moodAnalyze = new MoodAnalyzer("This is Sad message");
        String result1 = moodAnalyze.analyzeMood();
        Assertions.assertEquals("SAD",result1);
    }
    @Test
    public void messageIsNotSad_ReturnHappy(){
        MoodAnalyzer moodAnalyze = new MoodAnalyzer("This is HAPPY message");
        String result2 = moodAnalyze.analyzeMood();
        Assertions.assertEquals("HAPPY",result2);
    }
}