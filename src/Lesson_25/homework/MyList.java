package Lesson_25.homework;

import java.util.Collection;

public interface MyList <E> {

    int size();

    boolean isEmpty();

    void add(E e);

    boolean remove(E e);

    void clear();

    E get(int index);

    void add(int index, E element);

}
