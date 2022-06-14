package org.java.tutorials.designpatterns.behavioral.chainofresponsibility;

public abstract class Handler {
    protected Handler m_successor;

    public void setSuccessor(Handler successor) {
        this.m_successor = successor;
    }

    public abstract void handleRequest(Request request);
}
