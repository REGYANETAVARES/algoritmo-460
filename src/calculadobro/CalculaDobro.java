/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadobro;
import javax.swing.JOptionPane;

/**
 *
 * @author REGYANE
 */
public class CalculaDobro {

    public static void main(String[] args) {
        // Instância da classe auxiliar
        Operacoes operacoes = new Operacoes();
        
        // Laço para processar três números
        for (int i = 0; i < 3; i++) {
            // Solicitar um número ao usuário
            String input = JOptionPane.showInputDialog(null, "Digite um número:");
            
            try {
                // Converter o input para inteiro
                int numero = Integer.parseInt(input);
                
                // Calcular o dobro e exibir o resultado
                int dobro = operacoes.calcularDobro(numero);
                JOptionPane.showMessageDialog(null, "Dobro: " + dobro);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
                i--; // Repetir a tentativa caso o número seja inválido
            }
        }
    }
}
