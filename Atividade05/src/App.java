/*
IFTM 15/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

5 - Faça um programa que leia a cotação do dolar. 
Em seguida, imprima o valor correspondente em dolar. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema******************/
        double realBrasileiro = 1.0;
        double cotacaoDolarAmericano = 5.22;
        double dolarAmericano = 1.0 ;

        dolarAmericano = (dolarAmericano / cotacaoDolarAmericano);

        System.out.println(dolarAmericano);


    }
}
