import javax.swing.JOptionPane;

/*
IFTM 17/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

21 -Usando o comando switch, escreva um programa 
que leia um inteiro entre 1 - 7 e imprima o dia 
da semana correspondente a esse numero. Isto é,
domingo, se 1 é segunda, se é 2, e assimpor diante.
*/

public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema ******************/
        int operacao = 0;

        /*Recebendo entrada do usuario */
        operacao = Integer.parseInt(JOptionPane.showInputDialog("Entre com numero de 1 - 7:\n" + 
                                        "Domingo       : 1 \n" +
                                        "Segunda-Feira : 2 \n" +
                                        "Terça-Feira   : 3 \n" +
                                        "Quarta-Feira  : 4 \n" +
                                        "Quinta-Feira  : 5 \n" +
                                        "Sexta-Feira   : 6 \n" +
                                        "Sabado        : 7 " ));

        /*selecionando operacao de acordo com entrada do usuario*/
        switch(operacao) {
            case 1:
              // code block
              JOptionPane.showMessageDialog(null, "Domingo!", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 2:
              // code block
              JOptionPane.showMessageDialog(null, "Segunda-Feira!", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 3:
              // code block
              JOptionPane.showMessageDialog(null, "Terça-Feira!", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 4:
              // code block
              JOptionPane.showMessageDialog(null, "Quarta-Feira!", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 5:
              // code block
              JOptionPane.showMessageDialog(null, "Quinta-Feira!", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 6:
              // code block
              JOptionPane.showMessageDialog(null, "Sexta-Feira!", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 7:
              // code block
              JOptionPane.showMessageDialog(null, "Sabado!", 
                                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            default:
              // code block
          }
          
    }
}
