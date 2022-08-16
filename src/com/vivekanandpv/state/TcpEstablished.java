package com.vivekanandpv.state;

public class TcpEstablished implements TcpState {
    @Override
    public void open() {
        System.out.println("TCP Established: Open");
    }

    @Override
    public void close() {
        System.out.println("TCP Established: Close");
    }

    @Override
    public void acknowledge() {
        System.out.println("TCP Established: Acknowledge");
    }
}
