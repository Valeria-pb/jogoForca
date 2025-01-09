// Declaração da classe jogador
public class Jogador {
    // modificador de acesso public permite que a classe seja acessada em outro lugar do programa

    private String nome; // atributo para guardar o nome do jogador
    //private significa que o atributo só pode ser acessado diretamente dentro da própria classe Jogador.

    public Jogador(String nome ) { // Comando para o construtor

        this.nome = nome;
        //É um método especial que é chamado automaticamente quando um objeto da classe é criado.
        // O que faz o construtor?
        // Ele recebe um parâmetro quando uma classe é instanciada.
        //O this refere-se ao atributo nome da classe.
        //O valor do parâmetro nome é atribuído ao atributo nome da classe.

    }

    public String getNome() { // MÉTODOS GET
        return nome; // Métodos público para obter o valor do atributo nome.
    // Como o atributo nome é privado (private), ele não pode ser acessado diretamente de fora da classe.
    // Esses métodos permitem acessar o valor de forma controlada.
    }

    public void setNome(String nome) { // MÉTODOS SET
        this.nome = nome; // Como o atributo nome é privado, ele não pode ser alterado diretamente de fora da classe.
        // Esses métodos permitem modificar o valor de forma controlada.
    }

/*
Resumo do Funcionamento:
Atributo nome: Guarda o nome do jogador.
Construtor: Inicializa o objeto Jogador com um nome.
Método getNome: Permite acessar o nome do jogador.
Método setNome: Permite modificar o nome do jogador.
 */
}
