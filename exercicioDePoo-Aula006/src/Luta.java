
public class Luta {
    
    private MoldeLutadores desafiante;
    private MoldeLutadores desafiado; 
    private boolean statusDaLuta; 
    
    public void lutar(MoldeLutadores desafiante, MoldeLutadores desafiado) {
        
        this.desafiante = desafiante; 
        this.desafiado = desafiado; 
        this.statusDaLuta = false; 
        
        if (desafiante == desafiado) {
            System.out.println("o desafiante nao pode se desafiar");
        } else  if (desafiante.categoria().equals(desafiado.categoria())) {
            System.out.println("Ok, ambos de mesma categoria, luta autorizada");
            this.statusDaLuta = true; 
        } else {
            System.out.println("luta nao pode acontecer, pois sao de categorias diferentes");
        }
        
        if (this.statusDaLuta == false) {
            System.out.println("luta nao pode começar");
        } else {
            desafiado.apresentar();
            desafiante.apresentar();
            double numeroAleatorio = Math.random() * 3; 
            int vencedor = (int) numeroAleatorio; 
            switch (vencedor) {
                case 0 -> {
                    System.out.println("empate");
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                }
                case 1 -> {
                    System.out.println("desafiante venceu");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                }
                case 2 -> {
                    System.out.println("desafiado ganhou");
                    desafiante.perderLuta();
                    desafiado.ganharLuta();
                }
                default -> throw new AssertionError();
            }
        }
    }
}