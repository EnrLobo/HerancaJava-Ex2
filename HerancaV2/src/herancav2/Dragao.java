package herancav2;

public class Dragao extends Ave {

    public Dragao(String nome) {
        super(nome);
    }
    
    public void soltarFogo(){
        System.out.printf("%s dragao soltou uma bola de fogo \n", getNome());
    }
    
}
