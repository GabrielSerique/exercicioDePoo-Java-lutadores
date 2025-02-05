
public  class MoldeLutadores implements Lutadores {
    private String nome;
    private String nacionalidade; 
    private int idade; 
    private double altura;
    private categoriaDoLutador categoria; 
    private HistoricoDeResultados resultados; 
    private Luta lutas; 
    private int peso; 
    
    public MoldeLutadores (String nome, String nacionalidade, int idade, double altura, int peso) {
        this.nome = nome; 
        this.nacionalidade = nacionalidade; 
        this.idade = idade; 
        this.altura = altura; 
        this.peso = peso; 
        this.categoria = new categoriaDoLutador(peso); 
        this.resultados = new HistoricoDeResultados(); 
    }

    @Override
    public void apresentar() {
        System.out.println("Nome do lutador: " + nome);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Categoria: " + categoria.getCategoria());
    }

    @Override
    public void status() {
        System.out.println(resultados.getHistoricoDeResultados()); 
    }

    @Override
    public void ganharLuta() {
        resultados.adicionarVitoria();
    }

    @Override
    public void empatarLuta() {
       resultados.adicionarEmpate();
    }

    @Override
    public void perderLuta() {
        resultados.adicionarDerrota();
    }

     @Override
    public String categoria() {
         System.out.println("Categoria:" + categoria.getCategoria());
         return categoria.getCategoria(); 
    }

    
    
    @Override 
    public void marcarLuta() {
        lutas.lutar(this, this);
    }
}
        