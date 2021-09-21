import javax.swing.JOptionPane;

/*
IFTM 16/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

6 - Leia um programa que represente uma temperatura em graus 
Celsius e apresentá-la convertida em graus Fahrenheit. 
Aformula de conversão é: F = C*(9.5/5.0)+32.0, sendo F a 
temperatura em Fahrenheit e C a temperatura em Celsius. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*VAriavei de controle *****************************/
        double grausCelsius = 44;
        double grausFahrenheit = 0;

        /*Entrada do usuario para temperatura. ***************/
        grausCelsius = Double.parseDouble(JOptionPane.showInputDialog("Digite temperatura em Graus Celsius:"));

        /*Calculo/conversão de CElsius° em Fahnheit.**********/
        grausFahrenheit = grausCelsius* (9.0/5.0) + 32.0;

        /*Imprimindo na tela informações digitada pelo usuario
        **e resultado da conversão.***************************/
        JOptionPane.showMessageDialog(null, "         " + grausFahrenheit + "                 =                  " + grausCelsius + "\n" +
                                        "Grau Fahnheit                        Graus Celsius", 
                                        "Temperatura", JOptionPane.INFORMATION_MESSAGE);

        /*Imprimi no prompt de cmd graus celsius e fahnheit*****/
        System.out.println(grausCelsius);
        System.out.println(grausFahrenheit);
    }
}
