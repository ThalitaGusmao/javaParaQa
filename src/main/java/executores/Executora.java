package executores;

import org.openqa.selenium.chrome.ChromeDriver;
import robos.GaiaRobo;
import robos.JonasRobo;

public class Executora {
    public static void main(String[] args) {
        GaiaRobo umaGaiaRobo = new GaiaRobo();

        umaGaiaRobo.acessarUmSite();
        umaGaiaRobo.fazerLogin();
        umaGaiaRobo.lancarNota();

        GaiaRobo umaOutraGaiaRobo = new GaiaRobo();
        umaOutraGaiaRobo.acessarUmSite();


    }

}
