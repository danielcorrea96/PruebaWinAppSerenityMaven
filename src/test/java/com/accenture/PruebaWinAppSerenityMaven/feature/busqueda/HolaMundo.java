package com.accenture.PruebaWinAppSerenityMaven.feature.busqueda;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.accenture.PruebaWinAppSerenityMaven.pasos.Pasos;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class HolaMundo {
	
	@Managed(driver = "appium")
	WebDriver driver;
	
	@Steps
    public Pasos ana;
	
	@Before
	public void cargaDriver() {
		ana.setDriver(driver);
	}
	
	@Test
    public void sumaEnCalculadoradeWindows() throws Exception {
		ana.realizaConfiguracionInicial();
		ana.escribeEnLaBarraDeBusqueda();
		ana.cierraLaAplicacion();
    }

}
