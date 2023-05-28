package org.example;

import org.example.service.StringList;
import org.example.service.impl.StringListImpl;

public class Main {
    public static void main(String[] args) {
        StringList stringList = new StringListImpl();
        stringList.add("Один");
        stringList.add("Два");
        stringList.add("Три");
        System.out.println(stringList.get(2));
    }
}