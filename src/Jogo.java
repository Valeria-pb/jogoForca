import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {
    private final Palavra palavra;
    private final Jogador jogador;

    public Jogo(Palavra palavra, Jogador jogador) {
        this.palavra = palavra;
        this.jogador = jogador;
    }

    public void iniciarJogo(){
        int numeroChutes = 10;
        var chutes = new ArrayList<>();
        this.palavra.gerarPalavraSecreta();

        var scanner = new Scanner(System.in);//Ao usar var, o compilador analisa o tipo do valor que está sendo atribuído à variável e define o tipo correspondente. Isso significa que você ainda está trabalhando com uma variável fortemente tipada, mas o tipo é determinado pelo compilador.

        System.out.println("Olá "+ this.jogador.getNome()+", Bem-vindo ao Jogo da Forca");
        System.out.println("Você tem "+numeroChutes+" chutes para adivinhar a palavra secrete!");
        System.out.println(this.palavra.getPalavraComChute() +"\n");

while (!this.palavra.palavraCompleta() && chutes.size() < numeroChutes){
    System.out.println("Digite seu chute");
    String chute = scanner.nextLine();
    if (chutes.contains(chute)){
        System.out.println("Você jpa chutou essa letra! Tente novamente!");
        continue;
    }
    chutes.add(chute);
    this.palavra.revelarLetra(chute);

    System.out.println( "Palavra: " + this.palavra.getPalavraComChute() +"\n");

    if (this.palavra.palavraCompleta()){
        System.out.println("Parabéns, "+ this.jogador.getNome()+" você acertou!");
    } else if (chutes.size()== numeroChutes){
        System.out.println(this.jogador.getNome() + " você perdeu. Apalavra secreta era: "+this.palavra.getPalavraSecreta());
    }


}
    }
}
