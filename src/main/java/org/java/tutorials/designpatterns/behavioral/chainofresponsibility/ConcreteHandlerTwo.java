package org.java.tutorials.designpatterns.behavioral.chainofresponsibility;

public class ConcreteHandlerTwo extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getValue() > 0) {
            //if eligible request
            System.out.println("Positive values are handled by ConcreteHandlerTwo:");
            System.out.println("\tConcreteHandlerTwo.HandleRequest : " + request.getDescription() + request.getValue());
        }
    }
}
