
package aula009b;


public class Aula009b {

    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[3];
        Livro[] livro = new Livro [3]; 
        
        pessoa[0] = new Pessoa("Enzo", 18, "Masculino"); 
        pessoa[1] = new Pessoa("Manu", 19, "Feminino"); 
        livro[0] = new Livro("Dom Casmurro", pessoa[0], 220, pessoa[1]); 
        livro[1] = new Livro("A volta dos que nao foram", pessoa[1], 220, pessoa[0]); 
        livro[1].folhear(100);
        livro[1].avançarPag();
        System.out.println(livro[1].detalhes());  
    }
    
}
