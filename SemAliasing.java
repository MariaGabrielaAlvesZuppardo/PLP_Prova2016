public class SemAliasing {
    public static void main(String[] args) {
        int numero = 5;
        alterarNumero(numero);
        System.out.println("Número após alteração: " + numero);
    }

    public static void alterarNumero(int num) {
        num += 10;
        System.out.println("Dentro da função: " + num);
    }
}
