import Mypackage1.Bank;

import java.awt.List;
import java.io.*;
import java.util.*;
import java.util.Collection;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
public  class Practice {

    public static void main(String[] args) throws IOException {
        Properties p=new Properties();
        FileInputStream f=new FileInputStream("D:\\Testing\\src\\Mypackage2\\file.properties");
        p.load(f);
        //System.out.println(p);
        p.setProperty("170050F","2A,C");
        System.out.println(p.getProperty("170021F"));
        FileOutputStream fo=new FileOutputStream("D:\\Testing\\src\\Mypackage2\\file.properties");
        p.setProperty("170047N","2A,B");
        p.store(fo,"Updated file");



    }
}























