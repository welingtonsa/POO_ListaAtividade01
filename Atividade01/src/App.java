import javax.swing.JOptionPane;

/*
IFTM 15/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

1- Faça um programa que leia um número inteiro e 
retorne seu antecessor e seu sucessor. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*VAriaveis de controle do sistema*******************/
        int userInput;
        int count;

        /*Insrindo a tela para entrada do usuario************/
        userInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite aqui:", "Digite um numero inteiro: Exe: 0,1,..99", JOptionPane.QUESTION_MESSAGE));
        count = userInput;

        /*Imprimindo para usuario entrada o atencessor e o sucessor.*/
        JOptionPane.showMessageDialog(null, "Numero:               Inc/Dec:\n" +
                                        "__________________________\n"+
                                        --count + "                            Antecessor\n" +
                                        userInput + "                            Entrada Usuario\n" +
                                        ++userInput  + "                            Sucessor" ,
                                        "Incremento e Decremento", JOptionPane.INFORMATION_MESSAGE);
    }
}
