package Lesson_25.homework1;

import java.util.Collection;


public interface MyList<E> {

    boolean add(E e);

    boolean   addAll(MyArrayList c);

    boolean remove(E e);

    E remove(int index);

    boolean removeAll(MyArrayList<E> e);

    int size();

    void clear();

    boolean contains(E e);

    boolean isEmpty();

    void add(int index, E element);

    E get(int index);

    E set(int index, E element);

    int indexOf(Object o);

    int length();

}
