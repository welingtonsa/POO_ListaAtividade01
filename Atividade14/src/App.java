import javax.swing.JOptionPane;

/*
IFTM 16/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

14 - Faça um programa que leia um número e, caso 
ele seja positivo, cálcule e mostre:
    a - O numero digitado ao quadrado
    b - A raiz quadrada do numero digitado. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Varias de controle do sistema*********************/
        double entradaUsuario, quadrado, raiz;

        /*Recebendo da do usuario***************************/
        entradaUsuario = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero:"));

        /*Verificando se entrada do usuario é positivo******/
        if (entradaUsuario > 0) {

            /*Calculado o quadrado e a raiz da entrada do usuario*/
            quadrado = Math.pow(entradaUsuario, 2);
            raiz =  Math.sqrt(entradaUsuario);

            /*Exibindo para o usuario resultado ************/
            JOptionPane.showMessageDialog(null, "Numero positivo >  0   =  " + entradaUsuario + "\n" +
                                                "Quadrado    =   " + quadrado + "\n" +
                                                "Raiz    =    " +String.format("%.2f", raiz) + "\n" ,
                                                "Resultado:", JOptionPane.INFORMATION_MESSAGE);

        }else{
            /*Condição falsa apresenta mensagem para usuario*****/
            JOptionPane.showMessageDialog(null, "Numero negotivo < 0.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        

    }
}
