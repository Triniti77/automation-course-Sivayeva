package com.company.homework.hw15;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class List<T> implements Iterable<T>{
    private ArrayList<T> list;

    public List() {
        this.list = new ArrayList<T>();
    }

    public static <T> List concatListsToUniqueList(List<T> a, List<T>b){
        List<T> newlist = new List<>();
        Iterator<T> iter = a.iterator();
        while (iter.hasNext()) {
             newlist.add(iter.next());
        }
        iter = b.iterator();
        while (iter.hasNext()){
            T elm = iter.next();
            if (!newlist.contains(elm))  {
                newlist.add(elm);
            }
        }
        return newlist;
    }

    public boolean contains(T elm){
        return list.contains(elm);
    }

    public int size(){
        return list.size();
    }

    public T get(int a){
        return list.get(a);
    }

    public static <T> boolean listComparator(List<T> a, List<T>b){
        if (a.size()!=b.size()){
            return false;
        }
        Iterator<T> iter = a.iterator();
        while (iter.hasNext()){
            T elm = iter.next();
            if (!b.contains(elm)){
                return false;
            }

        }

        return true;
    }

    public List<T> add(T value){
        list.add(value);
        return this;
    }

    @Override
    public java.lang.String toString() {
        return "List{" +
                "list=" + list +
                '}';
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < list.size() && list.get(currentIndex) != null;
            }

            @Override
            public T next() {
                return list.get(currentIndex++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}
