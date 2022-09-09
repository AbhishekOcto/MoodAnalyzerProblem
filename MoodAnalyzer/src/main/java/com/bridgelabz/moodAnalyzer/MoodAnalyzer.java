package com.bridgelabz.moodAnalyzer;

public class MoodAnalyzer {
    String message;
    //Constructor
    public MoodAnalyzer(String message){
        this.message = message;

    }
    //AnalyzeMood function
    public String analyzeMood(){
        if(message.contains("Sad")) {
            System.out.println("I am in sad Mood");
            return "SAD";
        }
        else{
            return "HAPPY";
        }
    }
}
