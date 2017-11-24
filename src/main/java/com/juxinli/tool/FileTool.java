package com.juxinli.tool;

import com.google.common.io.Files;
import com.juxinli.Configurations;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;

/**
 * Created by admin on 2017/11/16.
 */
public class FileTool {

    private static final Logger LOG = Logger.getLogger(FileTool.class);

    public static void writeToFile(String filePath,String content){
        try {
            File file = new File(filePath);
            if(!file.exists()){
                Files.createParentDirs(file);
            }
            Files.write(content, new File(filePath), Configurations.charset);
        } catch (IOException e) {
            LOG.error("写文件失败",e);
            e.printStackTrace();
        }
    }
}
