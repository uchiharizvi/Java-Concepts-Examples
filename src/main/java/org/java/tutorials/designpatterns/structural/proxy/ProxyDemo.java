package org.java.tutorials.designpatterns.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        OfficeInternetAccess officeInternetAccess = new ProxyInternetAccess("Ashwani Rajput");
        officeInternetAccess.grantInternetAccess();
    }
}
