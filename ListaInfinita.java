import java.util.ArrayList;
import java.util.List;

public class ListaInfinita {
    public static List<Integer> listaInfinita(int n) {
        List<Integer> lista = new ArrayList<>();
        while (true) {
            lista.add(n++);
        }
    }

    public static void main(String[] args) {
        List<Integer> lista = listaInfinita(5);  // Nunca termina!
        System.out.println(lista.get(0));  // Nunca chega aqui
    }
}
