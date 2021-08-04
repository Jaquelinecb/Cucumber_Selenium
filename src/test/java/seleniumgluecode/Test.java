package seleniumgluecode;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test {
	
	private ChromeDriver driver;
	
	@Given("^El usuario se encuentra en la pagina Home de imalittletester$")
	public void el_usuario_se_encuentra_en_la_pagina_Home_de_imalittletester() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://imalittletester.com/");
		driver.manage().window().maximize();
	    
	}

	@When("^Hace click sobre el titulo The little tester comics$")
	public void hace_click_sobre_el_titulo_The_little_tester_comics() throws Throwable {
	    WebElement titleComicsLocator = driver.findElement(By.id("menu-item-2008"));
	    titleComicsLocator.click();
		
	}

	
	@Then("^Se debe redirigir a la pantalla Comics$")
	public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {
		
		 WebElement titleComicsLocator2 = driver.findElement(By.id("menu-item-2008"));
		 titleComicsLocator2.click();
		 driver.quit();	
    }
	}


