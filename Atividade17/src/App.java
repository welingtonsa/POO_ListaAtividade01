import javax.swing.JOptionPane;

/*
IFTM 17/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

17 - Faça um programa que, dada a idade de um 
nadador, o calssifique em uma das seguintes
categorias.

Categoria   Idade
Infantil A   5-7
Infantil B   8-10
Juvenil A   11-13
Juvenil B   14-17
Sênior      Maiores de 18 anos.
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema*******************/
        int idade; 

        /*Entrada do usuario para idade***********************/
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite idade do nadador:"));

        /*Verificando a idade para todos os casos*************/
        if (idade < 5) {
            JOptionPane.showMessageDialog(null, "Menos de 5 ANOS: \n" +
                                            "Idade Nadador: "+ idade,
                                            "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }

        /*Verificando a idade para Infantil A   5-7*************/
        if (idade >= 5 && idade <=7) {
            JOptionPane.showMessageDialog(null, "Infantil A \n" +
                                            "Idade Nadador: "+ idade,
                                            "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }

        /*Verificando a idade para Infantil B   8-10*************/
        if (idade >= 8 && idade <=10) {
            JOptionPane.showMessageDialog(null, "Infantil B \n" +
                                            "Idade Nadador: "+ idade,
                                            "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }

        /*Verificando a idade para Juvenil A   11-13*************/
        if (idade >= 11 && idade <=13) {
            JOptionPane.showMessageDialog(null, "Juvenil A \n" +
                                            "Idade Nadador: "+ idade,
                                            "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }

        /*Verificando a idade para Juvenil B   14-17*************/
        if (idade >= 14 && idade <=17) {
            JOptionPane.showMessageDialog(null, "Juvenil B \n" +
                                            "Idade Nadador: "+ idade,
                                            "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }

        /*Verificando a idade para maiores de 18*************/
        if (idade > 17) {
            JOptionPane.showMessageDialog(null, "Maiores de 18 ANOS \n" +
                                            "Idade Nadador: "+ idade,
                                            "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
