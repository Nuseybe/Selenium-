package com.techtorial.Utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFromFile {

    public static void main(String [] args) {
    }

        public static String getProperties (String key) throws IOException {

            //specify the file needed
            File credsFile = new File("src/test/Resources/credentials.properties");

            //read from the file, read my file
            FileReader fileReader = new FileReader(credsFile); //credsfile is which file u'll be reading
            Properties properties = new Properties();
            properties.load(fileReader);


            String login = properties.getProperty("login");
            String password = properties.getProperty("password");


            System.out.println("my login from properties file is" + login);
            System.out.println("my password from properties file is" + password);


            String value = properties.getProperty(key);

            return value;


        }

    }
