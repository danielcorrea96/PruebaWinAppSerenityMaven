package com.accenture.PruebaWinAppSerenityMaven.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {	
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception 
    {	
            String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
    		TakesScreenshot ts = (TakesScreenshot) driver;
    		File source = ts.getScreenshotAs(OutputType.FILE);
    		String destination = System.getProperty("user.dir") + "/TestsScreenshots/"+screenshotName+dateName+".png";
    		File finalDestination = new File(destination);
    		FileUtils.copyFile(source, finalDestination);
    		return destination;
    }
	
	
}
