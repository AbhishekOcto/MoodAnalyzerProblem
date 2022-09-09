package com.bridgelabz.moodAnalyzer;

public class MoodAnalyzer {
    //AnalyzeMood function
    public static String analyzeMood(String message) {
        if (message.contains("Sad")) {
            System.out.println("Sad mood");
            return "Sad";
        } else {
            System.out.println("Happy mood");
            return "Happy";
        }
    }
}
