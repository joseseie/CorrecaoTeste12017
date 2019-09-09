
package correcaoteste12017;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author joseseie
 */
public class CorrecaoTeste12017 {
    
    
    private void exercicio2 () {
        
        int x[] = {-2, 3, 9, 5, 4, 8, 2, 3, -9, -8};
        int S;
        int k = 0;
        
        //a)
        for (int i = 9; i > 0; i--) {
            x[i] = 2 * x[i];
        }
        //Resposta: x[] = [-2, 6, 18, 10, 8, 16, 4, 6, -18, -16]
        //k = 0;
        
        
        //b)
        for (int i = 0; i < 10; i += 2) {
            x[i] = 2 * x[i];
        }
        //Resposta: x[] = [-4, 3, 18, 5, 8, 8, 4, 3, -18, -8]
        //k = 0;
        
        //c)
        for (int i = 0; i < x.length; i += 2) 
            k = k + x[i];
        //Resposta: x[] = [-2, 3, 9, 5, 4, 8, 2, 3, -9, -8]
        //k = 4;
        
        
        
       System.out.println("" + Arrays.toString(x));
        System.out.println("k: " + k);
    }
    
    private void exercicio3 () {
        
        int[] nums = new int[5];
        
        Scanner s = new Scanner(System.in);
        
        //Leitura dos numeros:
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Digite o numero: [" + (i+1) + "]");
            nums[i] = s.nextInt();
        }
        
        //Soma de todos existentes
        int soma = 0;
        for (int i = 0; i < nums.length; i++) 
            soma = soma + nums[i];
          
        //Maior numero
        int maior = -1000000000;
        for (int i = 0; i < nums.length; i++)  
            if (nums[i] > maior) 
                maior = nums[i];
         
        
        
        System.out.println("Array lido: " + Arrays.toString(nums));
        System.out.println("Valor da soma: " + soma);
        System.out.println("Maior numero: " + maior);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CorrecaoTeste12017 c = new CorrecaoTeste12017();
        
//        c.exercicio2();
        c.exercicio3();
        
        // Exercicio 1.
        int a = 1;
        double d = 1.0;
        //a) 
        double A = 46 % 9 + 4 * 4 - 2; // = 15.0
        System.out.println("resultado a:) " + A);
        
        //b)
        double B = 45 + 45 * 50 % a --; // = 45.0
        System.out.println("resultado b:) " + B);
        
         //c)
        double C = 3.5 * (a + 5) * d++; // = 21.0
        System.out.println("resultado c:) " + C);
        
        //d)
        double D = 10 + (a + 3 * (++d)); // = 17.0
        System.out.println("resultado d:) " + D);
    }
    
    
}
