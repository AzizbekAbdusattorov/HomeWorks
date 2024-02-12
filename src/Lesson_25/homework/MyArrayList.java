package Lesson_25.homework;

import java.util.Arrays;

public class MyArrayList<E> extends MyAbstractList<E> implements MyList<E> {

    private Object[] a = new Object[0];

    @Override
    public int size() {
        return a.length;
    }

    @Override
    public boolean isEmpty() {
        if (a.length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void add(E e) {
        if (a.length == 0) {
            a = new Object[1];
            a[0] = e;
        } else {
            Object[] b = new Object[a.length + 1];
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
            b[b.length - 1] = e;
            a = new Object[b.length];
            for (int i = 0; i < a.length; i++) {
                a[i] = b[i];
            }
        }
    }

    @Override
    public boolean remove(E e) {
        int removeIndex = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(e)) {
                removeIndex = i;
            }
        }

        if (removeIndex > -1) {
            if (removeIndex == a.length - 1) {
                Object[] b = new Object[a.length - 1];
                for (int i = 0; i < a.length - 1; i++) {
                    b[i] = a[i];
                }
                a = new Object[b.length];
                for (int i = 0; i < b.length; i++) {
                    a[i] = b[i];
                }
                return true;
            }

            Object[] b = new Object[a.length - 1];
            for (int i = 0; i < a.length - 1; i++) {
                if (removeIndex <= i) {
                    b[i] = a[i + 1];
                } else {
                    b[i] = a[i];
                }
            }

            a = new Object[b.length];
            for (int i = 0; i < b.length; i++) {
                a[i] = b[i];
            }
            return true;
        }

        return false;
    }

    @Override
    public void clear() {
        a = new Object[0];
    }

    @Override
    public E get(int index) {
        if (a.length > index) {
            Object b = a[index];
            return (E) b;
        }
        return null;
    }

    @Override
    public void add(int index, E element) {
        if (a.length != 0 && index <= a.length) {
            Object[] b = new Object[a.length + 1];
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }

            if (index == b.length - 1) {
                b[index] = element;

                a = new Object[b.length];
                for (int i = 0; i < b.length; i++) {
                    a[i] = b[i];
                }
            } else {
                for (int i = b.length - 2; i >= 0; i--) {
                    if (index <= i) {
                        b[i + 1] = b[i];
                    }

                    if (index == i) {
                        b[index] = element;
                    }
                }

                a = new Object[b.length];
                for (int i = 0; i < a.length; i++) {
                    a[i] = b[i];
                }
            }

        }


    }

    @Override
    public String toString() {
        return Arrays.toString(a);
    }
}
