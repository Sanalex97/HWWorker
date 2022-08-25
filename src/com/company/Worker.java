package com.company;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 40; i++) {
            if (i == errorCallback.onError()) {
                callback.onDone("Task " + i + " is error");
                continue;
            }
            callback.onDone("Task " + i + " is done");
        }
    }
}
