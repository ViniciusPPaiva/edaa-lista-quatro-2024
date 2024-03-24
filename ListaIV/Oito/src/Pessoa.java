public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setnovaIdade(int novaIdade) {
        this.idade = novaIdade;
    }
}