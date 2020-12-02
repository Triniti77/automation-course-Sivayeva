package com.company.homework.hw15;

public class ListTest {

    public static void main(String[] args) {

        test1();
        test2();

    }

    public static  void test1(){

        List<String> list1 = new List<String>();

        List<String> list2 = new List<String>();

        List<String> list3 = new List<String>();

//        list1.concatListsToUniqueList()

        list1.add("Acer");
        list1.add("Apple");
        list1.add("HP");
        list1.add("Asus");
        list1.add("Lenovo");

        list2.add("Dell");
        list2.add("Asus");
        list2.add("Lenovo");
        list2.add("Sony");
        list2.add("MSI");

        list3 = List.concatListsToUniqueList(list1,list2);

        System.out.println(list3);
    }

    public static void test2(){

        List<String> list1 = new List<String>();

        List<String> list2 = new List<String>();

        List<String> list3 = new List<String>();

//        list1.concatListsToUniqueList()

        list1.add("Acer");
        list1.add("Apple");
        list1.add("HP");
        list1.add("Asus");
        list1.add("Lenovo");

        list2.add("Dell");
        list2.add("Asus");
        list2.add("Lenovo");
        list2.add("Sony");
        list2.add("MSI");

        list3.add("Acer");
        list3.add("Apple");
        list3.add("HP");
        list3.add("Asus");
        list3.add("Lenovo");

        System.out.println(List.listComparator(list1,list2));
        System.out.println(List.listComparator(list1,list3));
    }

}
