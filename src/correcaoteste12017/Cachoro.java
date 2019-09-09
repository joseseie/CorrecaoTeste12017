
package correcaoteste12017;

/**
 *
 * @author joseseie
 */

public class Cachoro {
    
    String nome;
    int idade;
    String raca;
    
    
    public Cachoro (String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }
        
   
    public void print () {
        
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Raca: " + this.raca);
        
        
    }
    
    
}
