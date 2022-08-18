package com.vivekanandpv.interpreter;

import java.util.Deque;
import java.util.LinkedList;

public class ContextImplementation implements Context {
    private final Deque<String> stack = new LinkedList<>();

    @Override
    public String getResult() {
        return stack.pop();
    }

    @Override
    public void pushResult(String result) {
        stack.push(result);
    }
}
