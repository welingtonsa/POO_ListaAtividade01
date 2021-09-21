import javax.swing.JOptionPane;

/*
IFTM 17/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

18 - Faça um programa que leia a altura e o peso
de uma pessoa. De acordo com a tabela a seguir,
verifique e monstre qual a classificação dessa pessoa.
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema******************/
        double peso = 0, altura = 0;

        /*Recebendo valores do usuario para altura e peso*/
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite Altura:"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite Peso:"));



        /*1° Condição - verificar se altura é menor ou igual 1.20*/
        if (altura <= 1.20) {
            System.out.println("Menor do que 1,20CM de altura.");

            /*Verificar peso até 60kg*/
            if (peso < 60) {
                System.out.println("Peso A");
                JOptionPane.showMessageDialog(null, "Classificação A: \n" +
                                                    "Altura: " + altura + "\n" +
                                                    "Peso: "+ peso ,  "Resultado:", JOptionPane.INFORMATION_MESSAGE);
            }

            /*Verficar peso entre 60 e 90*/
            if (peso >= 60 && peso < 90) {
                System.out.println("Peso D");
                JOptionPane.showMessageDialog(null, "Classificação D: \n" +
                                                    "Altura: " + altura + "\n" +
                                                    "Peso: "+ peso ,  "Resultado:", JOptionPane.INFORMATION_MESSAGE);
            }

            /*Verificar peso acima de 90*/
            if (peso >= 90) {
                System.out.println("Peso G");
                JOptionPane.showMessageDialog(null, "Classificação G: \n" +
                                                    "Altura: " + altura + "\n" +
                                                    "Peso: "+ peso ,  "Resultado:", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        /*2° Condição - verificar se altura é maior que 1,20 e menor 1,70.*/
        if (altura >= 1.20 && altura < 1.70) {
            System.out.println("Maior que 1,20 e menor que 1,70CM de altura.");

            /*Verificando peso até 60kg*/
            if (peso < 60) {
                System.out.println("Peso B");
                JOptionPane.showMessageDialog(null, "Classificação B: \n" +
                                                    "Altura: " + altura + "\n" +
                                                    "Peso: "+ peso ,  "Resultado:", JOptionPane.INFORMATION_MESSAGE);
            }

            /*Verificando peso acima de 60 até 90kg*/
            if (peso >= 60 && peso < 90) {
                System.out.println("Peso E");
                JOptionPane.showMessageDialog(null, "Classificação E: \n" +
                                                    "Altura: " + altura + "\n" +
                                                    "Peso: "+ peso ,  "Resultado:", JOptionPane.INFORMATION_MESSAGE);
            }

            /*Verificando peso acima de 90kg*/
            if (peso >=90) {
                System.out.println("Peso H");
                JOptionPane.showMessageDialog(null, "Classificação H: \n" +
                                                    "Altura: " + altura + "\n" +
                                                    "Peso: "+ peso ,  "Resultado:", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        /*3° Condição - verificar se altura é maior que 1,70.*/
        if (altura >= 1.70 ) {
            System.out.println("Maior do que 1,70CM altura.");

            /*Verificando peso até 60kg*/
            if (peso < 60) {
                System.out.println("Peso C");
                JOptionPane.showMessageDialog(null, "Classificação C: \n" +
                                                    "Altura: " + altura + "\n" +
                                                    "Peso: "+ peso ,  "Resultado:", JOptionPane.INFORMATION_MESSAGE);                
            }

            /*Verficando peso entre 60 e 90kgs.*/
            if (peso >= 60 && peso < 90) {
                System.out.println("PEso F");
                JOptionPane.showMessageDialog(null, "Classificação F: \n" +
                                                    "Altura: " + altura + "\n" +
                                                    "Peso: "+ peso ,  "Resultado:", JOptionPane.INFORMATION_MESSAGE);
            }

            /*Verificando peso acima de 90*/
            if (peso >= 90 ) {
                System.out.println("Peso I");
                JOptionPane.showMessageDialog(null, "Classificação I: \n" +
                                                    "Altura: " + altura + "\n" +
                                                    "Peso: "+ peso ,  "Resultado:", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }
}
