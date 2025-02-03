
public class HistoricoDeResultados {
    private int vitoria;
    private int empate; 
    private int derrota; 
    
    public void adicionarVitoria() {
        this.vitoria = vitoria + 1; 
    }
    
    public void adicionarEmpate() {
        this.empate = empate + 1; 
    }
    
    public void adicionarDerrota() {
        this.derrota = derrota + 1; 
    }
    
    public String getHistoricoDeResultados() {
        return "Vitorias: " + vitoria + ", derrotas: " + derrota  + ", empates: " + empate; 
    }
}
