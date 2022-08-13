package com.simplilearn.Docker.Phase4;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Docker_runFirefox {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		DesiredCapabilities caps = DesiredCapabilities.firefox();
	//	DesiredCapabilities caps = DesiredCapabilities.chrome();
	    URL hubUrl=new URL("http://ec2-3-91-68-222.compute-1.amazonaws.com:4444/wd/hub");
	    
	    System.out.println("connecting ....");
	    RemoteWebDriver driver = new RemoteWebDriver(hubUrl,caps);
	    
	    
	    System.out.println("starting test....");
	    driver.get("http://www.yahoo.com");
	    System.out.println("title= "+ driver.getTitle());
	    System.out.println("finished test....");
	    
	    Thread.sleep(60000);
	    driver.quit();
	    
	    System.out.println("driver quit....");
		}
	}

