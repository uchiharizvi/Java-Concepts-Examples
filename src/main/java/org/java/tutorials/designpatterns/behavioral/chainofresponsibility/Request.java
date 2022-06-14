package org.java.tutorials.designpatterns.behavioral.chainofresponsibility;

public class Request {
    private int m_value;
    private String m_description;

    public Request(String description, int value) {
        this.m_value = value;
        this.m_description = description;
    }

    public int getValue() {
        return m_value;
    }

    public String getDescription() {
        return m_description;
    }
}
