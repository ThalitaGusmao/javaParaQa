package robos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaiaRobo {
     public void abrirChrome(){
         WebDriverManager.chromedriver().setup();
         ChromeDriver thalitaDriver = new ChromeDriver();

         thalitaDriver.get("http://juliodelima.com.br/taskit");
     }


     public void fazerLogin() {
         System.out.println("Vou fazer login!");

     }

     public void lancarNota() {
         System.out.println("Vou lancar nota!");

     }


}
