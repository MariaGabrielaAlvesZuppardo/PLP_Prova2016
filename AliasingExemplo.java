import java.util.ArrayList;
import java.util.List;

public class AliasingExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        alterarLista(numeros);

        System.out.println("Lista após alteração: " + numeros);
    }

    public static void alterarLista(List<Integer> lista) {
        lista.add(100);  // Modifica diretamente a lista original
    }
}
