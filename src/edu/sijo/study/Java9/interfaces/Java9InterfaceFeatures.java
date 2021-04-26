package edu.sijo.study.Java9.interfaces;

import edu.sijo.study.Java9.interfaces.myinterface.MyInterface;
import edu.sijo.study.Java9.interfaces.myinterface.MyInterfaceImpl;

public class Java9InterfaceFeatures {
    public static void main(String[] args) {
        MyInterface myInterfaceImpl = new MyInterfaceImpl();
        myInterfaceImpl.sayHello();
    }
}
