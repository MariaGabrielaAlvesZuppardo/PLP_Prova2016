import java.util.stream.Stream;

public class StreamInfinito {
    public static void main(String[] args) {
        int resultado = Stream.iterate(5, n -> n + 1)  // Cria uma stream infinita
                              .findFirst()             // Pega o primeiro elemento
                              .get();
        System.out.println(resultado);  // Saída: 5
    }
}
