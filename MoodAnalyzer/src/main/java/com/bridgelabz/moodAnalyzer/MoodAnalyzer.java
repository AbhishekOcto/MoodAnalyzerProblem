package com.bridgelabz.moodAnalyzer;

public class MoodAnalyzer {
    //AnalyzeMood function

    public static String analyzeMood(String message){
        if(message.contains("Happy")) {
            System.out.println("I am in Happy Mood");
            return "HAPPY";
        }
        else{
            System.out.println("In sad Mood");
            return "SAD";

        }
    }
}
