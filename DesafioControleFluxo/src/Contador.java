import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita ao usuário os dois números
            System.out.print("Digite o primeiro número inteiro: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int numero2 = scanner.nextInt();

            // Validação: o segundo número deve ser maior que o primeiro
            if (numero1 > numero2) {
                throw new ParametrosInvalidosException("O SEGUNDO PARAMETRO DEVE SER MAIOR QUE O PRIMEIRO");
            }

           int qtdeIteracoes = numero2 - numero1;

            // Loop para imprimir os números incrementados
            for (int i = 1; i <= qtdeIteracoes; i++) {
                System.out.println("IMPRIMINDO O NUMERO " + i);
            }

        } catch (ParametrosInvalidosException e) {
            System.out.println("Exceção: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: Por favor, digite apenas números inteiros.");
        } finally {
            scanner.close();
        }
    }
}
