import javax.swing.JOptionPane;
/*
IFTM 16/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

9 - Sejam a e b os vatetos de um triângulo cuja
 hipotenusa é obtida pela equação: h = RAIZ A^2 + b^2
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema*******************/
        double cateto01 = 0;
        double cateto02 = 0;
        double hipotenusa;

        cateto01 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor cateto A:"));
        cateto02 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor cateto B:"));

        /*Calculando hipotenusa*******************************/
        hipotenusa = Math.sqrt(Math.pow(cateto01, 2)+ Math.pow(cateto02, 2));

        /*Imprime na tela o resultado da hipotenusa **********/
        JOptionPane.showMessageDialog(null, "Cateto A:     " + cateto01 + "\n" +
                                            "Cateto B:     " + cateto02 + "\n" +
                                            "Hipotenusa: " +String.format("%.2f", hipotenusa) + "\n",
                                            "Resultado:", JOptionPane.INFORMATION_MESSAGE);

        /*Imprime no prompt de cmd resultado hipotenusa********/
        System.out.println(String.format("%.2f", hipotenusa));
    }
}
