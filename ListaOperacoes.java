import java.util.ArrayList;
import java.util.List;

public class ListaOperacoes {

    public static <T> List<T> E(List<T> lista, int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        List<T> resultado = new ArrayList<>();
        resultado.add(lista.get(0));
        resultado.addAll(E(lista.subList(1, lista.size()), n - 1));
        return resultado;
    }

    public static <T> List<T> D(List<T> lista, int n) {
        if (n == 0) {
            return new ArrayList<>(lista);
        }
        return D(lista.subList(1, lista.size()), n - 1);
    }

    public static void main(String[] args) {
        List<String> lista = List.of("a", "b", "c", "d");

        List<String> primeiros = E(lista, 2);
        List<String> restantes = D(lista, 2);

        System.out.println("E(lista, 2) = " + primeiros);
        System.out.println("D(lista, 2) = " + restantes);
    }
}
