package com.vivekanandpv.interpreter;

public interface Context {
    String getResult();
    void pushResult(String result);
}
