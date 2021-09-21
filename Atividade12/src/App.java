import javax.swing.JOptionPane;

/*
IFTM 16/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

12 - Faça um programa que leia dois números e mostre
o maior deles. Se, por acaso, os dois números forem]
iguais, imprima a mesagem "Números Iguais."
*/

public class App {
    public static void main(String[] args) throws Exception {
        double a, b;

        /*Entrada do usuario dos valores para comparação*****/
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de A:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de B:"));

        /*Comparando os numeros para seleionar maior ou se são iguais. */
        if (a > b) {
            JOptionPane.showMessageDialog(null, "A é maior que B.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        if (b > a) {
            JOptionPane.showMessageDialog(null, "B é maior que A.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Numeros Iguais:", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }

        
    }
}
