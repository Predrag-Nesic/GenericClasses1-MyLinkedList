package com.company;

public class Red2<E> {
    //now we are using generic methods

    protected static class Elem<T> {
        Object object;
        Elem<T> next = null;

        Elem (Object object) {
            this.object = object;
        }
    }

    protected Elem<E> first = null;
    protected Elem<E> last = null;

    // this method adds new element to be first, or on top of the stack
    public Red2<E> addFirst(Object object) {
        Elem<E> nuevo = new Elem<E>(object);
        if(last == null) {
            last = nuevo;
        } else {
            nuevo.next = first;
        }
        first = nuevo;
        return this;
    }

    // and this one adds objects to the bottom
    public Red2<E> addLast(Object object) {
        Elem<E> nuevo = new Elem<E>(object);
        if(first == null) {
            first = nuevo;
        } else {
            last.next = nuevo;
        }
        last = nuevo;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Elem current = first; current != null; current = current.next) {
            sb.append(current.object).append("\n");
        }
        return sb.toString();
    }
}
