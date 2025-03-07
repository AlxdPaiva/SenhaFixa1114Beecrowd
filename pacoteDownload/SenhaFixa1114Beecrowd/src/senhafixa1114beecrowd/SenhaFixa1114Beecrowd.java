/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package senhafixa1114beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class SenhaFixa1114Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int senha = 0;
        
        while (senha != 2002) {
            senha = teclado.nextInt();
            if (senha != 2002) {
                System.out.println("Senha Invalida");
            }            
        }
        
        System.out.println("Acesso Permitido");
    }
    
}
