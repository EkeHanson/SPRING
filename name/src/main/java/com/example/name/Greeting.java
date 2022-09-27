package com.example.name;

public class Greeting {
    private final Long id;
    private final String content;

    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getID(){
        return id;
    }
    public String getContent(){
        return content;
    }
}
