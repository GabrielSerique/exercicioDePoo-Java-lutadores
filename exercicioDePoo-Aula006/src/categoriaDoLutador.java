
public class categoriaDoLutador {
    private String categoria; 
    
    public categoriaDoLutador(int peso) {
        if (peso <  77) {
            this.categoria = "peso-leve"; 
        } else if (peso < 87) {
            this.categoria = "peso-medio";
        } else if (peso < 97) {
            this.categoria = "peso-pesado"; 
        }
    }

    public String getCategoria() {
        return categoria;
    }
}
