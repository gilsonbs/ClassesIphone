
import com.musica.ReprodutorMusical;
import com.navegador.NavegadorInternet;
import com.telefone.AparelhoTelefonico;

public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.iniciandoReprodutorMusical();

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.iniciandoAparelhoTelefonico();

        NavegadorInternet navegadorInternet = new NavegadorInternet();
        navegadorInternet.Internet();


    }
}
