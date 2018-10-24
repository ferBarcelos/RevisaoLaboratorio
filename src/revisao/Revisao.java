//
package revisao;

import java.util.Scanner;
import javax.swing.JOptionPane;

//@author Fernando
public class Revisao {
  //Programa Principal
    public static void main(String[] args) {
        
        int[] a = new int [4];
        Scanner entrada = new Scanner (System.in);
        int soma = 0;
        //entrada fixa de dados
        a[0] = 1;
        a[1] = 3;
        a[2] = 5;
        a[3] = 7;
       
        //entrada de dados pelo TECLADO
        System.out.print(" Entre com o valor do vetor na posição 1: ");
        a[0] = entrada.nextInt();
       
        System.out.print(" Entre com o valor do vetor na posição 2: ");
        a[1] = entrada.nextInt();
       
        System.out.print(" Entre com o valor do vetor na posição 3: ");
        a[2] = entrada.nextInt();
       
        System.out.print(" Entre com o valor do vetor na posição 4: ");
        a[3] = entrada.nextInt();
        
        //entrada de dados pelo TECLADO com TELA
        // Integer.parseInt serve para converter uma String para Inteiro
         a[0] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do vetor na posição 1: "));
         a[1] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do vetor na posição 2: "));
         a[2] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do vetor na posição 3: "));
         a[3] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do vetor na posição 4: "));
        
         //Estrutura de Repetição para gerar entrada de dados pelo TECLADO
         for(int i = 0; i < 4; i++){
             System.out.print(" Entre com o valor do vetor na posição" + (i+1) +": ");
             a[i] = entrada.nextInt();
         }
         //Estrutura de Repetição para gerar entrada de dados pelo TECLADO com TELA
         for(int i = 0; i < 4; i++){
             a[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do vetor na posição "+ (i+1) +":"));
         }
         
         //cálculo FIXO do Somatório
         soma = a[0] + a[1] + a[2] + a[3];
         
         //Estrutura de Repetição para Cálculo do Somatório
          for(int i = 0; i < 4; i++){
              soma = soma + a[i];
          }
          
          int i=0;
          while ( i < 4){
              soma = soma + a[i];
              i++;
          }
          
          i = 0;
          do {
              soma = soma + a[i];
              i++;
          }while(i < 4);
          
          for( i = 0; i < 4; i++){
             System.out.print(" O valor da " + (i+1) +" posição é: " +a[i]);
            }
          for( i = 0; i < 4; i++){
            JOptionPane.showMessageDialog(null, " O valor da " + (i+1) +" posição é: " + a[i]);
         }
          
          //Saída de dados
          System.out.println("O resultado do somatorio é: " + soma);
          
          //Saída de dados na TELA
          JOptionPane.showMessageDialog(null,"O resultado do somatorio é: " + soma);
    }
    
}
