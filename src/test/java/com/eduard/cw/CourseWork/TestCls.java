package com.eduard.cw.CourseWork;

import org.mockito.internal.matchers.Null;

import java.util.ArrayList;
import java.util.Collection;

public class TestCls {
    public static void main(String[] args) {
        Collection<String> collection = null;
        collection.add("qwe");
        collection.add("asd");
        collection.add("zxc");

        ArrayList<String> arrayList = null;

        arrayList = (ArrayList<String>) collection;

        System.out.println(arrayList.get(1));
    }
}
