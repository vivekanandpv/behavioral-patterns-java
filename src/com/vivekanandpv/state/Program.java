package com.vivekanandpv.state;

public class Program {
    public static void main(String[] args) {
        TcpState established = new TcpEstablished();
        TcpState listen = new TcpListen();
        TcpState closed = new TcpClosed();

        TcpConnection connection = new TcpConnection(established);

        connection.open();
        connection.acknowledge();
        connection.close();

        System.out.println("---------------------------------------");

        connection.setState(listen);

        connection.open();
        connection.acknowledge();
        connection.close();

        System.out.println("---------------------------------------");

        connection.setState(closed);

        connection.open();
        connection.acknowledge();
        connection.close();
    }
}
