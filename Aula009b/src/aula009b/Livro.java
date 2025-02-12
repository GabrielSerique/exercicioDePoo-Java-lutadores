
package aula009b;

public class Livro implements Publicar {
    private String tituloDoLivro; 
    private Pessoa autorDoLivro; 
    private int totalDePaginas; 
    private int paginaAtual;
    private boolean aberto; 
    private Pessoa leitor;

    public Livro(String tituloDoLivro, Pessoa autorDoLivro, int totalDePaginas, Pessoa leitor) {
        this.tituloDoLivro = tituloDoLivro;
        this.autorDoLivro = autorDoLivro;
        this.totalDePaginas = totalDePaginas;
        this.leitor = leitor; 
    }

    public boolean isAberto() {
        return aberto;
    }
    
    public void setAberto(boolean aberto) {
        this.aberto = aberto; 
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public int getTotalDePaginas() {
        return totalDePaginas;
    }

    public void setTotalDePaginas(int totalDePaginas) {
        this.totalDePaginas = totalDePaginas;
    }
   
    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void folhear(int p) {
       if (p > getTotalDePaginas()) {
           System.out.println("impossivel folhear um numero maior que o total de paginas");
           setPaginaAtual(paginaAtual = 0);
       } else {
           setPaginaAtual(p);
       }
    }

    @Override
    public void avançarPag() {
        setPaginaAtual(paginaAtual += 1);
    }

    @Override
    public void voltarPag() {
       setPaginaAtual(paginaAtual -= 1);
    }
    
    @Override
    public String detalhes() {
            return "Livro: " + tituloDoLivro + " autor: " + autorDoLivro.getNome() + " quantidade de paginas: " + totalDePaginas + " pagina atual: " + " leitor: " + leitor.getNome(); 
    }
}
