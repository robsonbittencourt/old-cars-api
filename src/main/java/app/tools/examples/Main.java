package app.tools.examples;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import com.sun.jersey.spi.container.servlet.ServletContainer;

public class Main {

	public static void main(String[] args) {
		Server server = new Server(Integer.valueOf(System.getenv("PORT")));

		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
		context.setContextPath("/");

		server.setHandler(context);

		ServletHolder holder = new ServletHolder(new ServletContainer());
		holder.setInitParameter("com.sun.jersey.config.property.packages", "app.tools.examples.rest");
		holder.setInitParameter("com.sun.jersey.api.json.POJOMappingFeature", "true");

		context.addServlet(holder, "/*");

		try {
			server.start();
			server.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
