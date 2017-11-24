package com.juxinli;

import com.juxinli.tool.NativePath;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Properties;
import java.util.TimeZone;

/**
 * Created by admin on 2017/11/16.
 */
public class Configurations {

    public static String poetPic = null;

    public static String logPath = null;


    private static final Logger LOG = Logger.getLogger(Configurations.class.getName());

    public static final TimeZone timezone = TimeZone.getTimeZone("GMT+8");
    public static final Charset charset = StandardCharsets.UTF_8;

    public static String system;

    public static void init() {
        load();

        system();
    }

    private static void load() {
        Properties args_properties = new Properties();
        //        InputStream in =  Configurations.class.getClassLoader().getResourceAsStream("conf\\configuration.properties");
        try {
            InputStream in = Files.newInputStream(NativePath.get("conf/conf.properties"), StandardOpenOption.READ);
            args_properties.load(in);
            System.out.println("conf 配置文件加载");
        } catch (IOException e) {
            LOG.error("加载配置文件失败", e);
        }
    }

    private static void system() {
        if (System.getProperty("os.name").indexOf("Windows") != -1) {
            system = "Windows";
        } else {
            system = System.getProperty("os.name");
        }
    }

    private static final Charset CHARSET = StandardCharsets.UTF_8;

}
