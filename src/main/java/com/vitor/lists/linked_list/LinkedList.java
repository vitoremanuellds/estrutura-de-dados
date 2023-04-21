package com.vitor.lists.linked_list;

public interface LinkedList<T> {
    
    public void insert(T value);

    public T remove(T value);

    public boolean search(T value);

    public int size();

    public T[] getAll();

}
