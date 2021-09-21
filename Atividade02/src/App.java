import javax.swing.JOptionPane;

/*
IFTM 15/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

2- Faça um programa que leia três valores inteiros e mostre sua soma. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema*******************/
        int A, B, C;
        int soma = 0;

        /*Recebendo valor do usuario*************************/
        A = Integer.parseInt(JOptionPane.showInputDialog("A"));
        soma = soma + A;
        B = Integer.parseInt(JOptionPane.showInputDialog("B"));
        soma = soma + B;
        C = Integer.parseInt(JOptionPane.showInputDialog("C"));
        soma = soma + C;
        
        /*Imprimindo resultado valor na tela para usuario****/
        JOptionPane.showMessageDialog(null, "Resultado: \n" +
                                        "_______________\n"+
                                        A + "        A\n " +
                                        B + "       B\n " +
                                        C + "       C +\n " + 
                                        "_______________\n"+                                       
                                        soma+ "     Total\n",
                                        "Soma de variaveis", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
