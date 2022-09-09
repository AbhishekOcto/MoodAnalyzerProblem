package com.bridgelabz.moodAnalyzer;

public class MoodAnalyzer {
    //AnalyzeMood function

    public static String analyzeMood(String message){
        if(message.contains("Sad")) {
            System.out.println("I am in sad Mood");
            return "SAD";
        }
        else{
            return "HAPPY";

        }
    }
}
