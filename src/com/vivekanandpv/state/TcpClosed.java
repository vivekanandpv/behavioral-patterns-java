package com.vivekanandpv.state;

public class TcpClosed implements TcpState {
    @Override
    public void open() {
        System.out.println("TCP Closed: Open");
    }

    @Override
    public void close() {
        System.out.println("TCP Closed: Close");
    }

    @Override
    public void acknowledge() {
        System.out.println("TCP Closed: Acknowledge");
    }
}
