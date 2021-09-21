/*Importei a classe java.text.NumberFormat para teste, mas não usei.
** Formatei os calores usando String.format().*/
import java.text.NumberFormat;

import javax.swing.JOptionPane;

/*
IFTM 16/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

7 - A importancia de $780.000,00 será divida entre três
ganhadores de um concurso, sendo que:

a - O primeiro ganhador receberá 46% do total;
b - O segundo receberá 32% odo total;
c - O terceiro receberá o restante.

Calcule e imprima a quantia recebida por casa um dos
ganhadores.
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema******************/
        double importancia = 780000.00;
        double cenParte;
        double primeiroGanhador;
        double segundoGanhador;
        double terceiroGanhador;
        double premioTotal;

        /*Calculo e distinção dos calores********************/
        cenParte = importancia / 100;        
        primeiroGanhador = cenParte * 46;
        segundoGanhador = cenParte * 35;
        terceiroGanhador = importancia -(primeiroGanhador + segundoGanhador) ;
        premioTotal = primeiroGanhador + segundoGanhador + terceiroGanhador;

        /*Imprimindo na tela para usurio resultado dos prmeios*/
        JOptionPane.showMessageDialog(null, "Valor Bruto:           " + String.format("%,.2f", importancia) + "\n" +
                                        "------------------------------------------\n" +
                                        "Ganhadores:                Valor:\n" +
                                        "------------------------------------------\n" +
                                        "1°  Ganhador:           "+ String.format("%,.2f", primeiroGanhador) + "\n" +
                                        "2°  Ganhador:           "+ String.format("%,.2f", segundoGanhador) + "\n" +
                                        "3°  Ganhador:           "+ String.format("%,.2f", terceiroGanhador) + "\n" +
                                        "------------------------------------------\n" +
                                        "Total Premio:           "+ String.format("%,.2f", premioTotal) , 
                                        "Valores de acordo com ganhador:", JOptionPane.INFORMATION_MESSAGE);

        /*Imprimindo o resultado no prompt de cmd ************/
        System.out.println(String.format("%,.2f", importancia));
        System.out.println(String.format("%,.2f", cenParte));
        System.out.println(String.format("%,.2f", primeiroGanhador));
        System.out.println(String.format("%,.2f", segundoGanhador));
        System.out.println(String.format("%,.2f", terceiroGanhador));
        System.out.println(String.format("%,.2f", premioTotal));

    }
}
