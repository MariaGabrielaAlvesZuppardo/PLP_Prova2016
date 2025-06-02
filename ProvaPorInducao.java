import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProvaPorInducao {

    // Função para validar se n está no intervalo válido
    public static void validarN(int n, List<?> lista) {
        if (n < 0 || n > lista.size()) {
            throw new IllegalArgumentException(
                "O valor de n deve estar entre 0 e " + lista.size() + ". Valor recebido: " + n
            );
        }
    }

    // Função E: Retorna os primeiros n elementos
    public static <T> List<T> E(List<T> lista, int n) {
        validarN(n, lista);
        if (n == 0 || lista.isEmpty()) {
            return new ArrayList<>();
        }
        List<T> resultado = new ArrayList<>();
        resultado.add(lista.get(0));
        resultado.addAll(E(lista.subList(1, lista.size()), n - 1));
        return resultado;
    }

    // Função D: Retorna os elementos após os n primeiros
    public static <T> List<T> D(List<T> lista, int n) {
        validarN(n, lista);
        if (n == 0) {
            return new ArrayList<>(lista);
        }
        if (lista.isEmpty()) {
            return new ArrayList<>();
        }
        return D(lista.subList(1, lista.size()), n - 1);
    }

    // Concatenação de duas listas
    public static <T> List<T> concat(List<T> lista1, List<T> lista2) {
        List<T> resultado = new ArrayList<>(lista1);
        resultado.addAll(lista2);
        return resultado;
    }

    // Função que testa a propriedade E(xs, n) ++ D(xs, n) == xs
    public static <T> boolean testarPropriedade(List<T> lista, int n) {
        validarN(n, lista);
        List<T> primeiros = E(lista, n);
        List<T> restantes = D(lista, n);
        List<T> concatenado = concat(primeiros, restantes);
        return concatenado.equals(lista);
    }

    public static void main(String[] args) {
        // Listas para teste
        List<String> lista1 = Arrays.asList("a", "b", "c", "d");
        List<Integer> lista2 = Arrays.asList(1, 2, 3, 4, 5);
        List<String> listaVazia = new ArrayList<>();

        // Testando lista1
        for (int n = 0; n <= lista1.size(); n++) {
            System.out.println("Teste lista1 com n=" + n + ": " + testarPropriedade(lista1, n));
        }

        // Testando lista2
        for (int n = 0; n <= lista2.size(); n++) {
            System.out.println("Teste lista2 com n=" + n + ": " + testarPropriedade(lista2, n));
        }

        // Testando lista vazia
        System.out.println("Teste lista vazia com n=0: " + testarPropriedade(listaVazia, 0));

        // 🔥 Teste de valor inválido (descomente para testar) aqui vai dar erro 
       
       /*  try {
            testarPropriedade(lista1, -1);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            testarPropriedade(lista1, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }*/
        
    }
}

