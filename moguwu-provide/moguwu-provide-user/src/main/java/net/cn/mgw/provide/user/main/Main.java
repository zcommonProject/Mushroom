package net.cn.mgw.provide.user.main;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import javax.servlet.ServletContext;

public class Main {
    public static void main(String[] args) throws Exception {
//        String relativelyPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
//        relativelyPath = relativelyPath.replaceFirst("/target/.*", "/");
        Server server = new Server(8081);
        WebAppContext webAppContext = new WebAppContext();

        webAppContext.setConfigurationDiscovered(true);
        webAppContext.setResourceBase("./");
        server.setHandler(webAppContext);
        try {
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
