package com.accenture.PruebaWinAppSerenityMaven.pasos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.accenture.PruebaWinAppSerenityMaven.util.Utils;

import io.appium.java_client.windows.WindowsDriver;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;

public class Pasos {
	
	WebDriver driver;
	
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	@Step("Configuracion Inicial")
	public void realizaConfiguracionInicial() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
	}

	@Step("Suma de dos numeros")
    public void escribeEnLaBarraDeBusqueda() throws Exception {
		 driver.findElement(By.name("Uno")).click();
		 Utils.getScreenshot(this.driver, "Prueba 1" );
		 driver.findElement(By.name("Más")).click();
		 Utils.getScreenshot(this.driver, "Prueba 2" );
		 driver.findElement(By.name("Uno")).click();
		 Utils.getScreenshot(this.driver, "Prueba 3" );
		 driver.findElement(By.name("Es igual a")).click();
		 Utils.getScreenshot(this.driver, "Prueba 4" );
    }
	
	@Step("Finaliza la calculadora")
    public void cierraLaAplicacion() {
		 driver.quit();
    }
		
}
