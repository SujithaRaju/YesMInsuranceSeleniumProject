package com.insurance.utillity;

import java.io.*;
import java.util.Properties;

public class ReadConfig {
    public Properties properties;

    public ReadConfig() {
        File src = new File("./Configuration/Config.Properties");
        try {
            FileInputStream fileInputStream = new FileInputStream(src);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getBaseURl() {
       String url=properties.getProperty("baseUrl");
       return url;
    }

    public String getUsername(){
        String userName=properties.getProperty("username");
        return userName;
    }

    public String getAdminPwd(){
        String passWord= properties.getProperty("password");
        return passWord;
    }

    public String getChromePath(){
        String chromePath=properties.getProperty("chrompath");
        return chromePath;

    }
}
