package com.company;

public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;

        OnTaskErrorListener listenerError = () -> 33;

        Worker worker = new Worker(listener, listenerError);
        worker.start();
    }
}
