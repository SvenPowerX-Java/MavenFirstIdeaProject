package ua.com.sevenpowerx.java.maven.hello.servlet;


import org.eclipse.jetty.servlet.ServletHolder;
import ua.com.sevenpowerx.java.maven.hello.frontend.Frontend;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Main {
	public static void main(String[] args) throws Exception {
		Frontend frontend = new Frontend();
		
		Server server = new Server(8888);
		ServletContextHandler context =
				new ServletContextHandler(ServletContextHandler.SESSIONS);
		server.setHandler(context);
		context.addServlet(new ServletHolder(frontend), "/authform");
		
		server.start();
		server.join();
	}
}
