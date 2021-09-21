import javax.swing.JOptionPane;

/*
IFTM 17/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

20 - Faça um programa que informe o mês de acordo 
com o número digitado pelo usuario. 

Exemplo: Entrada = 4 . Saida = Abril.
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema.*****************/
        int operacao = 0;

        /*Recebendo opção do usuario para selecionar mes****/
        operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero inteiro de 1 - 12:"));

        /*Selecionando opção de acordo entrada do usuario*.*/
        switch(operacao) {
            case 1:
              // code block
              JOptionPane.showMessageDialog(null, "Entrada = " + operacao + " |Saida = Janeiro", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 2:
              // code block
              JOptionPane.showMessageDialog(null, "Entrada = " + operacao + " |Saida = Fevereiro", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 3:
              // code block
              JOptionPane.showMessageDialog(null, "Entrada = " + operacao + " |Saida = Março", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 4:
              // code block
              JOptionPane.showMessageDialog(null, "Entrada = " + operacao + " |Saida = Abril", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 5:
              // code block
              JOptionPane.showMessageDialog(null, "Entrada = " + operacao + " |Saida = Maio", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 6:
              // code block
              JOptionPane.showMessageDialog(null, "Entrada = " + operacao + " |Saida = Junho", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 7:
              // code block
              JOptionPane.showMessageDialog(null, "Entrada = " + operacao + " |Saida = Julho", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 8:
              // code block
              JOptionPane.showMessageDialog(null, "Entrada = " + operacao + " |Saida = Agosto", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 9:
              // code block
              JOptionPane.showMessageDialog(null, "Entrada = " + operacao + " |Saida = Setembro", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 10:
              // code block
              JOptionPane.showMessageDialog(null, "Entrada = " + operacao + " |Saida = Outubro", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 11:
              // code block
              JOptionPane.showMessageDialog(null, "Entrada = " + operacao + " |Saida = Novembro", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 12:
              // code block
              JOptionPane.showMessageDialog(null, "Entrada = " + operacao + " |Saida = Dezembro", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            default:
              // code block
          }
          
    }
}
