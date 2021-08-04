package seleniumgluecode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class IniciarSesion {
	
	private ChromeDriver driver;
	
	@Given("^El usuario accede a la URL del Portal de Firma$")
	public void el_usuario_accede_a_la_URL_del_Portal_de_Firma() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://192.168.0.152:8473/Portal_Firma_RNE_Web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}

	@Given("^Ingresa su nombre de usuario Usuario(\\d+)$")
	public void ingresa_su_nombre_de_usuario_Usuario(int arg1) throws Throwable {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
	}

	@When("^Da clic en Continuar$")
	public void da_clic_en_Continuar() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@When("^Ingresa su clave de acceso (\\d+)Qw\\.$")
	public void ingresa_su_clave_de_acceso_Qw(int arg1) throws Throwable {
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
	}

	@When("^Da clic en el botón Ingresar$")
	public void da_clic_en_el_botón_Ingresar() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^El usuario inicia sesión correctamente$")
	public void el_usuario_inicia_sesión_correctamente() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.xpath("//span[contains(.,\'Salir\')]")).click();
		driver.quit();

	}
	
}
