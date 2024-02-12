package Lesson_25.homework1;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<E> implements MyList<E> {
    private int capacity;

    private Object[] o;

    private int size;

    public MyArrayList() {
        this.capacity = 10;
        o = new Object[capacity];
    }

    public MyArrayList(int capacity1) {
        this.capacity = capacity1;
        o = new Object[capacity];
    }

    public MyArrayList(Collection<E> c) {
        add((E) c);
    }


    public int length() {
        return capacity;
    }

    private void capacity() {
        if (capacity == size) {
            double a1 = 3;
            double a2 = 2;
            double a = a1 / a2;

            double b1 = capacity * a + 1;

            this.capacity = (int) b1;
        }

    }

    @Override
    public int size() {
        int k = 0;
        for (Object o : o) {
            if (o == null) {
                continue;
            }
            k++;
        }
        size = k;
        return size;
    }


    @Override
    public boolean add(E e) {
        if (e != null) {
            capacity();
            Object[] a = new Object[capacity];
            int i = 0;
            for (int j = 0; j < size(); j++) {
                a[i++] = o[j];
            }
            a[i] = e;
            o = a;
            size();

            return true;
        }
        return false;
    }


    @Override
    public boolean addAll(MyArrayList c) {
        try {
            for (int i = 0; i < c.size(); i++) {
                add((E) c.o[i]);
            }
            return true;
        } catch (ClassCastException s) {
            return false;
        }


    }


    @Override
    public boolean remove(E e) {
        if (e != null) {
            if (contains(e)) {
                capacity();
            int k = (o.length - 1);
            Object[] a = new Object[k];
            int l = 0;
                for (int i = 0; i < size; i++) {
                    if (e == o[i] || e.equals(o[i])) {
                        continue;
                    }
                    a[l++] = o[i];
                }
            o = a;
            size();
            return true;
        }
    }
        return false;
    }


    @Override
    public E remove(int index) {
        if (index >= size) {
            return null;
        }
        size();
        E t = null;
        int k = (o.length - 1);
        Object[] a = new Object[k];
        int l = 0;
        for (int i = 0; i < o.length; i++) {
            if (index == i) {
                t = (E) o[i];
                continue;
            }
            a[l++] = o[i];
        }
        o = a;
        size();

        return t;
    }

    @Override
    public boolean removeAll(MyArrayList<E> c) {
        boolean b = false;
        for (Object e : c.o) {
            if (remove((E) e)) {
                b = true;
            }
        }
        return b;
    }

    @Override
    public void clear() {
        this.capacity = 10;
        this.size = 0;
        o = new Object[capacity];
    }

    @Override
    public boolean contains(E e) {
        for (Object object : o) {
            if (e == object || e.equals(object)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(int index, E element) {
        capacity();
        Object[] a = new Object[capacity];
        int l = 0;
        for (int i = 0; i < o.length; i++) {
            if (i == index) {
                a[l++] = element;
            }

            a[l++] = o[i];
        }
        o = a;
        size();
    }

    @Override
    public E get(int index) {
        if (index >= size) {
            return null;
        }
        return (E)o[index];
    }

    @Override
    public E set(int index, E element) {
        if (index >= size) {
            return null;
        }
        o[index] = element;
        return element;
    }

    @Override
    public int indexOf(Object e) {
        size();
        for (int i = 0; i < size; i++) {
            if (e == o[i] || o.equals(e)) {
                return i;
            }
        }
        return  -1;
    }

    @Override
    public String toString() {
        Object[] b = new Object[size];
        for (int i = 0; i < size; i++) {
            b[i] = o[i];
        }

        o = new Object[b.length];
        for (int i = 0; i < o.length; i++) {
            o[i] = b[i];
        }
        return Arrays.toString(o);
    }

}
