package com.vivekanandpv.state;

public interface TcpState {
    void open();
    void close();
    void acknowledge();
}
