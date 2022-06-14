package org.java.tutorials.designpatterns.behavioral.chainofresponsibility;

public class ConcreteHandlerThree extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getValue() >= 0) {
            //if eligible request
            System.out.println("Zero values are handled by ConcreteHandlerThree:");
            System.out.println("\tConcreteHandlerThree.HandleRequest : " + request.getDescription() + request.getValue());
        }
    }
}
