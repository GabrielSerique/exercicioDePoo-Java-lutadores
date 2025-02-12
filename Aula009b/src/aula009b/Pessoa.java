
package aula009b;

public class Pessoa {
    private String nome; 
    private int idade; 
    private String sexo; 

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }
    
    
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo; 
    }

    
    
    public void fazerAniversario() {
        setIdade(idade + 1);
    }
    
    public void status() {
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: " + idade);
    }
    
}
