package com.blz.mood.analyser.exception;

public class InvalidMoodException extends Exception{
    public String message;
    public ExceptionType exceptionType;

    public enum ExceptionType{
        NULL , EMPTY ;
    }
    InvalidMoodException(String message){
        this.message=message;
    }

    InvalidMoodException(ExceptionType exceptionType , String message){
        this.exceptionType = exceptionType;
        this.message = message;
    }


}