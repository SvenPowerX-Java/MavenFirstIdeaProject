package ua.com.sevenpowerx.java.maven.hello.main;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import ua.com.sevenpowerx.java.maven.hello.frontend.Frontend;

/**
 * @author v.chibrikov
 */
public class Main {
	public static void main(String[] args) throws Exception {
		Frontend frontend = new Frontend();
		
		Server server = new Server(8888);
		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
		context.addServlet(new ServletHolder(frontend), "/authform");
		
		server.setHandler(context);
		
		server.start();
		server.join();
	}
}