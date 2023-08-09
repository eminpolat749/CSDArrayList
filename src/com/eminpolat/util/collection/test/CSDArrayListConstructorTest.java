package com.eminpolat.util.collection.test;

import com.eminpolat.util.Console;
import com.eminpolat.util.collection.CSDArrayList;

public class CSDArrayListConstructorTest {
    public static void run()
    {
        CSDArrayList<String> list = new CSDArrayList<>(11);

        Console.writeLine("Size:%d", list.size());
        Console.writeLine("Capacity:%d", list.capacity());
    }
    public static void main(String[] args)
    {
        run();
    }
}