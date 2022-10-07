package retoQA.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import retoQA.evidenciasWord.PasoyEvidencia;
import retoQA.evidenciasWord.PrintEvi;
import java.util.regex.Pattern;

public class stepdefinitions {
    WebDriver driver;
    Pattern pattern;
    PrintEvi impresion = new PrintEvi();
    PasoyEvidencia imprimedescripcionPaso;


  /*register*/
  @Given("^start testing of evidence register$")
  public void startTestingOfEvidenceRegister() throws Throwable{
      impresion.defineVariables();
  }

  @Given("^Open browser and website register$")
  public void openBrowserAndWebsiteRegister() {
  System.setProperty("webdriver.chrome.driver", "J:\\reto utp\\qa-challenge-Juan Paredes-word\\src\\test\\resources\\driver\\chromedriver.exe");
  driver= new ChromeDriver();
  driver.get("http://localhost:4000/register");
  System.out.println("Se abre la pagina y el navegador");
    }

    @Given("^when open the website make register with user \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void whenOpenTheWebsiteMakeRegisterWitnUserAndPassword(String arg1, String arg2)throws Throwable {

        driver.findElement(By.id(("email"))).sendKeys(arg1);
        System.out.println("se escribe user");

        imprimedescripcionPaso = new PasoyEvidencia("se escribe user");

        driver.findElement(By.id(("password"))).sendKeys(arg2);
        System.out.println("se escribe password");
        imprimedescripcionPaso = new PasoyEvidencia("se escribe password");

        driver.findElement(By.id(("register"))).click();
        System.out.println("se da click en iniciar sesion");
        imprimedescripcionPaso = new PasoyEvidencia("se da click para iniciar sesion");
    }

    @When("^realize register in the website$")
    public void realizeRegisterInTheWebsite() throws Throwable {
        System.out.println("se  VALIDA correcto mensaje iniciar sesion");
        imprimedescripcionPaso = new PasoyEvidencia("se  VALIDA correcto mensaje iniciar sesion");
    }

    @Then("^Genered report of evidency \"([^\"]*)\"$")
    public void generedReportOfEvidency(String arg1) throws Throwable{
        imprimedescripcionPaso = new PasoyEvidencia("Cierra la pagina");
        impresion.CloseFile(arg1);
    }

    @Then("^closed the browser$")
    public void closedTheBrowser() {
      driver.quit();
    }


 /*login*/

    @Given("^start testing of evidence$")
    public void startTestingOfEvidence() throws Throwable{
    impresion.defineVariables();
    }

    @Given("^Open browser and website login$")
    public void openBrowserAndWebsiteLogin() {
        System.setProperty("webdriver.chrome.driver", "J:\\reto utp\\qa-challenge-Juan Paredes-word\\src\\test\\resources\\driver\\chromedriver.exe");
            driver= new ChromeDriver();
        driver.get("http://localhost:4000/login");
        System.out.println("Se abre la pagina y el navegador");
    }

    @Given("^when open the website make login with user \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void whenOpenTheWebsiteMakeLoginWitnUserAndPasswordLogin(String arg1, String arg2)throws Throwable {
        driver.findElement(By.id(("email"))).sendKeys(arg1);
        System.out.println("se escribe user");

        imprimedescripcionPaso = new PasoyEvidencia("se escribe user");

        driver.findElement(By.id(("password"))).sendKeys(arg2);
        System.out.println("se escribe password");
          imprimedescripcionPaso = new PasoyEvidencia("se escribe password");

        driver.findElement(By.id(("login"))).click();
        System.out.println("se da click en iniciar sesion");
           imprimedescripcionPaso = new PasoyEvidencia("se da click para iniciar sesion");
    }

    @When("^realize login in the website$")
    public void realizeLoginInTheWebsite() throws Throwable {
        System.out.println("se  VALIDA correcto mensaje iniciar sesion");
        imprimedescripcionPaso = new PasoyEvidencia("se  VALIDA correcto mensaje iniciar sesion");

    }

    @Then("^Genered report of evidency login \"([^\"]*)\"$")
    public void generedReportOfEvidencyLogin(String arg1) throws Throwable{
        imprimedescripcionPaso = new PasoyEvidencia("Cierra la pagina");
        impresion.CloseFile(arg1);
    }

    @Then("^closed the browser login$")
    public void closedTheBrowserLogin() {
    driver.quit();
    }
}
