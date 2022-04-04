package com.blz.mood.analyser.exception;

public class MoodAnalyser {
    public String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {

        this.message = message;
    }

    public String analyseMood() throws InvalidMoodException {
        try {
            if(this.message.isEmpty())
                throw new InvalidMoodException(InvalidMoodException.ExceptionType.EMPTY,"Please Enter valid mood");
            else if (this.message.contains("SAD"))
                return "SAD";
            return "HAPPY";
        }
        catch (NullPointerException e) {
            throw new InvalidMoodException(InvalidMoodException.ExceptionType.NULL,"Please Enter valid mood");
        }
    }
}