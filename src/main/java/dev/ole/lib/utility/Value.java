package dev.ole.lib.utility;

import lombok.Data;

import java.util.Objects;

@Data
public class Value<E> {

    private E value;

    public Value(E value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Value<?> value1)) {
            return false;
        }
        return Objects.equals(value, value1.value);
    }

    @Override
    public String toString() {
        return "Value{" + "value=" + value + '}';
    }

    public void setValue(E value) {
        this.value = value;
    }
}