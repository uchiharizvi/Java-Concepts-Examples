package org.java.tutorials.designpatterns.structural.proxy;

public class ProxyInternetAccess implements OfficeInternetAccess{
    private String employeeName;
    private RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        if(getRole(employeeName)>4){
            // do something
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grantInternetAccess();
        }
        else{
            // do something
            System.out.println("No Internet access granted. Your job level is below 5");
        }
    }
    public int getRole(String employeeName){
        // Check role from the database based on Name and designation
        // return job level or job designation.
        return 9;
    }
}
