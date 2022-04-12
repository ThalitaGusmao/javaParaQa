package robos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaiaRobo {

    public ChromeDriver thalitaDriver;

     public GaiaRobo() {
        WebDriverManager.chromedriver().setup();
        thalitaDriver = new ChromeDriver();

     }

     public void acessarUmSiteChamadoTaskit()  {
         thalitaDriver.get("http://juliodelima.com.br/taskit");
     }

     public void acessarUmSiteChamadoGoogle()  {
        thalitaDriver.get("http://google.com.br/");

     }

    public void acessarUmSiteChamado(String site) {
        thalitaDriver.get(site):

    }

     public void fazerLogin(String login, String senha) {
         System.out.println("Vou fazer login!");

     }

     public void lancarNota() {
         System.out.println("Vou lancar nota!");

     }

}
