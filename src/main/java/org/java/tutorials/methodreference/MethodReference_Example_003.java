package org.java.tutorials.methodreference;

public class MethodReference_Example_003 {
    public static void main(String[] args) {
        Thread t2 = new Thread(MethodReference_Example_003::ThreadStatus);
        t2.start();
    }
    public static void ThreadStatus(){
        System.out.println("Thread is running...");
    }
}
