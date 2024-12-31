package dev.ole.lib.utility.scheduler;

public interface Callback<C> {

    void call(C value);

}