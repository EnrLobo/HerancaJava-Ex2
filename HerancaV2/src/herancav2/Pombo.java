package herancav2;

public class Pombo extends Ave {
    
    private int cartasEnviadas = 0;

    public Pombo(String nome) {
        super(nome);
    }
    
    public int enviarCarta(){
        System.out.printf("%s enviou uma carta", getNome());
        this.cartasEnviadas++;
        return this.cartasEnviadas;
    }

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }
    
}
