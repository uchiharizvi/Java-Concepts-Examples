package org.java.tutorials.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**Invoker Class**/
class Agent {
    private List<Order> ordersQueue = new ArrayList();
    public Agent(){}
    void placeOrder (Order order){
        ordersQueue.add(order);
        //order.execute(ordersQueue.get);
    }
}
