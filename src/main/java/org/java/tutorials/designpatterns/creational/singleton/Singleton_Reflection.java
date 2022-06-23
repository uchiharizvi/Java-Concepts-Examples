package org.java.tutorials.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;

/*public class Singleton_Reflection {
    public static void main(String[] args) {
        Singleton_Eager instanceOne = Singleton_Eager.getInstance();
        Singleton_Eager instanceTwo = null;
        try{
            Constructor[] constructors = Singleton_Eager.class.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                constructor.setAccessible(true);
                instanceTwo = (Singleton_Eager) constructor.getInstance();
                break;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}*/
