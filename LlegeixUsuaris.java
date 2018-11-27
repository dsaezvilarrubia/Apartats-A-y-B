/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llegeixusuaris;

/**
 *
 * @author Dani
 */
import java.util.Scanner;
public class LlegeixUsuaris {
    public static final int VALOR_MINIM = 0;
    public static final int VALOR_MAXIM = 1000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int codiUsuari,numPersones = 0;
        boolean dadaCorrecte;
        System.out.println("Quantes persones vols entrar? ");
        dadaCorrecte = lector.hasNextInt();
        if(dadaCorrecte || numPersones > 0){
            numPersones = lector.nextInt();
            int[] contingutUsuaris = new int [numPersones];
            for(int i = 0; i < numPersones; i++){
                int numUsuari = i + 1;
                System.out.println("Entra el valor del usuari " + numUsuari);
                dadaCorrecte = lector.hasNextInt();
                if(dadaCorrecte){ 
                    codiUsuari = lector.nextInt();
                    if(codiUsuari >= VALOR_MINIM && codiUsuari <= VALOR_MAXIM){
                        contingutUsuaris[i] = codiUsuari;
                    }
                }
                if(i == contingutUsuaris.length -1){
                    System.out.println("Llistat de codis entrats: ");
                    for(int j = 0;j < contingutUsuaris.length;j++){
                        System.out.println(contingutUsuaris[j]);
                    }
                }
            }
        }else{
            System.out.println("Dada incorrecte");            
        }
    }
    
}
