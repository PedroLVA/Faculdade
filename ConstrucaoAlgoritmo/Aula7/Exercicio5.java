/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula7;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10];
        int countImpar = 0;
        int countPar = 0;
        int[] par = new int[10];
        int[] impar = new int[10];
        
        for(int i = 0; i < nums.length; i++){
            System.out.println("Digite o " + (i +1) + "numero: ");
            nums[i] = scan.nextInt();
            
            if(nums[i] % 2 == 0){
                par[i] = nums[i];
            }
            else{
                impar[i] = nums[i];
            }
            
        }
        for(int i = 0; i < nums.length; i++){
            System.out.println("Vetor impar: " + impar[i]);
        }
        for(int i = 0; i < nums.length; i++){
            System.out.println("Vetor par: " + par[i]);
            
        }
        
        
        
        
        
            
        
        
    }
}
