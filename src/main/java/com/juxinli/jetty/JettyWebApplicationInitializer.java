package com.juxinli.jetty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.io.IOException;


/**
 * Created by James on 16/8/12.
 */
public class JettyWebApplicationInitializer implements WebApplicationInitializer {
    private static final Log LOGGER = LogFactory.getLog(JettyWebApplicationInitializer.class.getName());
    private static ServletContext servletContext;
    private static String mapping_path;
    private static String mapping_pattern;
    private static final byte[] lock = new byte[0];
    private static Boolean started = false;

    private static void run(ServletContext servletContext) throws IOException {
      synchronized (lock) {
        if (!started && servletContext != null && mapping_path != null && !mapping_path.trim().isEmpty()) {
          XmlWebApplicationContext mvcContext = new XmlWebApplicationContext();
          mvcContext.setConfigLocation(mapping_path);

          DispatcherServlet dispatcherServlet = new DispatcherServlet(mvcContext);
          ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", dispatcherServlet);
          dispatcher.setAsyncSupported(true);// 支持异步servlet
          dispatcher.setLoadOnStartup(1);// 确保在default servlet加载完成之后再加载
          dispatcher.addMapping(mapping_pattern);
          started = true;
        }
      }
    }

    //指定配置文件
    public static void config_mvc(String mapping_path, String mapping_pattern) throws IOException {
        System.out.println( "mapping path = " + mapping_path );
        System.out.println( "mapping pattern = " + mapping_pattern );
      JettyWebApplicationInitializer.mapping_path = mapping_path;
      JettyWebApplicationInitializer.mapping_pattern = mapping_pattern == null ? "/*" : mapping_pattern;
      run(servletContext);
    }

    public static void start_mvc(ServletContext servletContext) throws IOException {
      JettyWebApplicationInitializer.servletContext = servletContext;
      run(servletContext);
    }

    @Override
    public void onStartup(ServletContext servletContext)
        throws ServletException {
      try {
        start_mvc(servletContext);
      } catch (IOException e) {
        LOGGER.error("启动MVC框架失败:", e);
        System.exit(1);
      }
    }
}
