/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula7;

/**
 *
 * @author aluno
 */
public class ExemploVetorMeses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maior",
            "Junho", "Julho", "Agosto", "Setembro", "Outubro",
            "Novembro", "Dezembro"};
        int[] diasDoMes = {31, 28, 31, 30, 10, 3, 5, 6, 7, 8, 31, 20};
        
        for(int i = 0; i < meses.length; i++){
            System.out.println("O mes " + meses[i] + " tem " + diasDoMes[i] + " dias");
        }
    }

}
