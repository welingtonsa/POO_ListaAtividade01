import javax.swing.JOptionPane;

/*
IFTM 15/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

3- Faço um programa que calcula o ano de nascimento
de uma pessoa a partir de sua idade e do ano atual. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema******************/
        int anoInput = 2021;
        int idadeInput = 38; 
        int anoNascimento;

        /*Recebendo ano e idade atual do usuario*************/
        anoInput = Integer.parseInt(JOptionPane.showInputDialog("Digite ano atual:"));
        idadeInput = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade atual:"));

        /*Calculando o ano de nascimento de acordo com entrada*/
        anoNascimento = anoInput - idadeInput;

        /*Imprimindo o ano do nascimento  do usuario na tela*/
        JOptionPane.showMessageDialog(null, "Ano de nascimento!\n" + 
                                        "______________________\n" +
                                        "Ano: " + anoNascimento, 
                                        "Resultado:", JOptionPane.INFORMATION_MESSAGE);

        System.out.println(anoNascimento);


    }
}
