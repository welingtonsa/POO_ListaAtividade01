import javax.swing.JOptionPane;

/*
IFTM 16/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

10 - Faça um programa calculadora com as seguintes operações:
    somar
    subtrair
    multiplicar
    dividir
*/
 
public class App {
    public static void main(String[] args) throws Exception {
    /*Variaveis de controle do sistema***********************/
    int operacao = 0; 
    double a = 0, b = 0, resultado;  


    /*Loop para fazer operações******************************/
    do {
        /*Entrada da operação selecionada pelo usuario********/
        operacao = Integer.parseInt(JOptionPane.showInputDialog("Selecione Operação:\n" +
                                        "Exit:                  0\n" +     
                                        "Soma:              1\n" + 
                                        "Subtração:     2\n" + 
                                        "Divisão:           3\n" + 
                                        "Multiplicação: 4\n" ));

        /*Eliminando entrada do usuario caso ele saia do programa*/
        if (operacao != 0) {
            /*Entrada de valores para calculo matematico**********/
            a = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de A:"));
            b = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de B:"));            
        }
        
        /*Selecionando operação***********************************/
        switch(operacao) {
            case 1:
              /*Somar*/
              resultado = a + b;
              JOptionPane.showMessageDialog(null, "Soma = " + resultado,
                                         "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 2:
              /*Subtração*/
              resultado = a - b;
              JOptionPane.showMessageDialog(null, "Subtração = " + resultado,
                                         "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;
            case 3:
              /*Multiplicação*/
              resultado = a / b;
              JOptionPane.showMessageDialog(null, "Multiplicação = " + resultado,
                                         "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;  
            case 4:
              /*Divisão*/ 
              resultado = a * b;
              JOptionPane.showMessageDialog(null, "Divisão = " + resultado,
                                         "Resultado", JOptionPane.INFORMATION_MESSAGE);
              break;  
            default:
              // code block
        }                  
    } while (operacao != 0 );
    }
}

