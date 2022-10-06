package com.example.Services;

public class SourceNotFoundException extends RuntimeException{
    public SourceNotFoundException() {
        super("Source not found");
    }
}
