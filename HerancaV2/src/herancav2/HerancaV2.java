package herancav2;

import java.util.Scanner;

public class HerancaV2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome do cachorro: ");
        String nomeD = scan.nextLine();
        Cachorro dog = new Cachorro(nomeD);
        
        dog.comer();
        dog.latir();
        
        System.out.println("\nDigite o nome do gato: ");
        String nomeC = scan.nextLine();
        Gato cat = new Gato(nomeC);
        
        cat.miar();
        cat.beber();
        cat.comer();  
        
        System.out.println("\nDigite o nome do dragao: ");
        String nomeDr = scan.nextLine();
        Dragao dragon = new Dragao(nomeDr);
        
        dragon.beber();
        dragon.comer();
        dragon.voar();
        
        System.out.println("\nDigite o nome do pombp: ");
        String nomeP = scan.nextLine();
        Pombo pomb = new Pombo(nomeP);
        
        pomb.beber();
        pomb.comer();
        pomb.voar();
        
    }
    
}
