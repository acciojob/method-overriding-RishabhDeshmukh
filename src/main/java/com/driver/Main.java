package com.driver;

public class Main {
    public class A{
        String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        @Override
        String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args) {
        B object= new B();
        object.meth();

        B b= new B();
        b.meth();
    }
}
