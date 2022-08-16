package com.vivekanandpv.state;

public class TcpListen implements TcpState {
    @Override
    public void open() {
        System.out.println("TCP Listen: Open");
    }

    @Override
    public void close() {
        System.out.println("TCP Listen: Close");
    }

    @Override
    public void acknowledge() {
        System.out.println("TCP Listen: Acknowledge");
    }
}
