import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.print("Digite seu nome: ");// Solicita o nome do jogador

        Scanner scanner = new Scanner(System.in); // Lê os dados digitados
        String nomeDigitado = scanner.nextLine(); // Recebe a entrada do usuário.

        String nomeMaiusculo = nomeDigitado.toUpperCase(); // Aplica toUpperCase. Apresenta tudo em maiúsculo.

        // usando o tipo var, o compilador analisa o tipo do valor que está sendo atribuído à variável e define o tipo correspondente.
        var jogador = new Jogador(nomeMaiusculo); //enviando os parâmetros

        var palavra = new Palavra();
        var jogo = new Jogo(palavra, jogador);// enviando os parâmetros definidos

        jogo.iniciarJogo(); // chama o método_da_classe jogo

        scanner.close();

    }
}