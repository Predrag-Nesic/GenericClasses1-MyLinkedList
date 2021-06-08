package com.company;

public class Red1 {
    protected static class Elem {
        Object object;
        Elem next = null;

        Elem (Object object) {
            this.object = object;
        }
    }

    protected Elem first = null;
    protected Elem last = null;

    // this method adds new element to be first, or on top of the stack
    public Red1 addFirst(Object object) {
        Elem nuevo = new Elem(object);
        if(last == null) {
            last = nuevo;
        } else {
            nuevo.next = first;
        }
        first = nuevo;
        return this;
    }

    // and this one adds objects to the bottom
    public Red1 addLast(Object object) {
        Elem nuevo = new Elem(object);
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
