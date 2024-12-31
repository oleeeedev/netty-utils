package dev.ole.lib.utility;

public interface Catcher<E, V> {

    E doCatch(V key);

}