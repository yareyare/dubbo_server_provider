package com.juxinli;

import com.juxinli.jetty.JettyServer;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2017/11/9.
 */
public class Launch {

    private static final Logger LOG = Logger.getLogger(Launch.class);

    private static Integer httpPort = 8888;

    public static void main(String[] args)throws Exception {
        LOG.info("************** server start begin *****************");
        JettyServer.startJetty( httpPort );
        Thread.sleep(5000);
        LOG.info("************** server start end *****************");

        //读取配置文件
//        new ClassPathXmlApplicationContext(new String[]{"spring-mvc-servlet.xml"});
//        System.out.println("zk_dubbo_spring服务已注册");
        //使线程阻塞
//        System.in.read();
    }

}
