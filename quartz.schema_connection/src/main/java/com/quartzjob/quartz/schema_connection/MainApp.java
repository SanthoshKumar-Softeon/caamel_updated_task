package com.quartzjob.quartz.schema_connection;

import org.apache.camel.spring.Main;

public class MainApp {

            public static void main(String[] args) throws Exception {
        	Main m = new Main();
	        m.setApplicationContextUri("META-INF/spring/Camel-Context.xml");
	        m.start();
	        Thread.sleep(600000);
	        m.stop();
	
}		

}

