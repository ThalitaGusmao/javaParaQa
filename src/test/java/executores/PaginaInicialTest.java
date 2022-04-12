package executores;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import robos.GaiaRobo;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Classe de testes para a pagina inicial")
public class PaginaInicialTest {
    @Test
    @DisplayName("Validando se o título da pagina esta correto")
    public void validarTituloDaPagina() {
        GaiaRobo gaiaTiaDoJonas = new GaiaRobo();

        gaiaTiaDoJonas.acessarUmSiteChamado("http://www.juliodelima.com.br/taskit");

        String tituloDaPagina = gaiaTiaDoJonas.pegarOTituloDaPagina();

        Assertions.assertEquals("Task it!", tituloDaPagina);

    }

}
