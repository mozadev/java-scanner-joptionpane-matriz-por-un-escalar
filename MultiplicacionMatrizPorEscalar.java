/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacionmatrizporescalar;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class MultiplicacionMatrizPorEscalar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         Scanner entrada = new Scanner(System.in);
        Scanner  escalar = new Scanner(System.in);
        int matriz1[][], nfilas, ncol;
        int matriz2[][];
        
        nfilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        ncol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        
        
        matriz1 = new int[nfilas][ncol];
       
        System.out.println("digite una matriz 1");
        
        
         for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncol; j++) {
                System.out.println("matriz [" + i + "][" + j + "]:");
                matriz1[i][j] = entrada.nextInt();
            }
        }
     
         for(int i=0;i<nfilas;i++){
            for(int j=0;j<ncol;j++){
                System.out.print( matriz1[i][j]+" ");
            }
            System.out.println();
        }
        
         System.out.print("Introduce un número: ");
         int num = escalar.nextInt();
         
         System.out.println("\nMatriz multiplicada por el escalar " + num);
        
        for(int i=0;i<nfilas;i++){
            for(int j=0;j<ncol;j++){
                matriz1[i][j] = matriz1[i][j]*num;
            }
        }
        
        
        
        for(int i=0;i<nfilas;i++){
            for(int j=0;j<ncol;j++){
                System.out.print( matriz1[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
