import javax.swing.JOptionPane;

/*
IFTM 17/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

19 - Faça um programa que leia três números inteiros positivos
e efetue o calculo de uma das seguintes médias de acordo com um
valor numérico digitado pelo usuario na tabela a seguir. 

Numero digitado     |       Media
        1           |     Geomatrica
                    |     x  * y * z 
        2           |      Pomderada
                    |   x + 2 * y + 3 * z
                    |  -------------------
                    |          6
        3           |     Aritimetica            
                    |      x + y + z
                    |     -----------
                    |          3  
        
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do Sistema*******************/
        int x = 0, y = 0, z = 0;
        int operacao = 0;
        double resultado;

        /*Recebendo entrada do usuario para operação e x, y e z*/
        operacao = Integer.parseInt(JOptionPane.showInputDialog("Selecione operação: \n" + 
                                        "Geometrica  : 1 \n" +
                                        "Ponderada   : 2 \n" +
                                        "Aritimetica : 3 \n" ));
        
        /*Recebendo valores para x, y e z */      
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite valor de X:"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite valor de Y:"));
            z = Integer.parseInt(JOptionPane.showInputDialog("Digite valor de Z:"));

            /*Notificando usuario caso x , y ou z forem menores que 0.*/
            if (x < 0 || y < 0 || z < 0) {
                JOptionPane.showMessageDialog(null, "Um dos valores é negativo. Informe os numeros novamente:",
                                                "Erro!", JOptionPane.INFORMATION_MESSAGE);
            }

        /*Retornando a entrada dos valores para x, y ou z caso sejam negativos.*/    
        } while (x < 0 || y < 0 || z < 0);

        switch(operacao) {
            case 1:
              /*Geometrica **********************************/
              resultado = x * y * z;

              /*Exibindo resultado para usuario*/
              JOptionPane.showMessageDialog(null, "Geometrica  =  " + resultado,
                                            "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 2:
              /*Ponderada ***********************************/
              resultado = (x + ((2 * y) + (3 * z))) / 6;
              /*Exibindo resultado para usuario*/
              JOptionPane.showMessageDialog(null, "Ponderada  =  " + resultado,
                                            "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 3:
              /*Aritimetica***********************************/
              resultado = (x + y + z) / 3;
              /*Exibindo resultado para usuario*/
              JOptionPane.showMessageDialog(null, "Aritimetica  =  " + resultado,
                                            "Resultado", JOptionPane.INFORMATION_MESSAGE); 
              break;
            default:
              // code block
          }
          


    }
}
