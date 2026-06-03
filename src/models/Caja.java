package models;

public class Caja<T> {
    private T t;
    public void setT(T t) {
        this.t = t;
    }
    public T getT() {
        return t;
    }
    public boolean estaVacia() {
        if (t == null) {
            return true;
        } else {
            return false;
        }
    }
}
