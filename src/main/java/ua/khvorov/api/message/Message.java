package ua.khvorov.api.message;

import java.io.Serializable;

public class Message<T, V> implements Serializable {

    private T type;
    private V value;

    public Message(T type, V value) {
        this.type = type;
        this.value = value;
    }

    public T getType() {
        return type;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
