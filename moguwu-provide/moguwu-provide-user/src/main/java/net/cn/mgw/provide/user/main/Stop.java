package net.cn.mgw.provide.user.main;

import org.eclipse.jetty.server.Server;

public class Stop {

    public static void main(String[] args) {
        Server server = new Server(8081);
        try {
            server.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
