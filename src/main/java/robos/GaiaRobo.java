package robos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaiaRobo {

    public ChromeDriver thalitaDriver;

     public GaiaRobo() {
        WebDriverManager.chromedriver().setup();
        thalitaDriver = new ChromeDriver();

     }

     public void acessarUmSite()  {
         thalitaDriver.get("http://juliodelima.com.br/taskit");

     }


     public void fazerLogin() {
         System.out.println("Vou fazer login!");

     }

     public void lancarNota() {
         System.out.println("Vou lancar nota!");

     }

}
