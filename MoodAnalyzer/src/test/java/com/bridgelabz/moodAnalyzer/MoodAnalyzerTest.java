package com.bridgelabz.moodAnalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
//    @Test
//    public void messageIsSad_ReturnSad(){
//        MoodAnalyzer moodAnalyze = new MoodAnalyzer("I am in Sad Mood");
//        String result1 = moodAnalyze.analyzeMood();
//        Assertions.assertEquals("SAD",result1);
//    }
    @Test
    public void messageIsNotSad_ReturnHappy(){
        MoodAnalyzer moodAnalyze = new MoodAnalyzer("I am in Happy mood");
        String result2 = moodAnalyze.analyzeMood();
        Assertions.assertEquals("HAPPY",result2);
    }
}