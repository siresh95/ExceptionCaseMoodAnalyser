package com.blz.mood.analyser.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    private Assertions Assert;

    //exception should be handled and return sad
    @Test
    public void givenNullMood_ShouldHandleException() throws InvalidMoodException{
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String actual = moodAnalyser.analyseMood();
        String expected = "SAD";
        Assert.assertEquals(expected, actual);
    }
    //exception should be handled and return happy
    @Test
    public void givenNullMood_ShouldHandleExceptionAndReturnHappy() throws InvalidMoodException{
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy mood");
        String actual = moodAnalyser.analyseMood();
        String expected = "HAPPY";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenInvalidMoodEmptyOrNullThrowCustomException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood();
        } catch (InvalidMoodException exception){
            InvalidMoodException.ExceptionType expected = InvalidMoodException.ExceptionType.NULL;
            Assert.assertEquals(expected,exception.exceptionType);
        }
    }

    @Test
    public void givenInvalidMoodEmptyShouldThrowCustomException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try {
            moodAnalyser.analyseMood();
        } catch (InvalidMoodException exception) {
            InvalidMoodException.ExceptionType expected = InvalidMoodException.ExceptionType.EMPTY;
            Assert.assertEquals(expected,exception.exceptionType);
        }
    }

}