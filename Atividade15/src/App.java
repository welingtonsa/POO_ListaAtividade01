import javax.swing.JOptionPane;

/*
IFTM 16/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

15 - Faça um programa que receba a altura e sexo
de uma pessoa e calcule e mostre seu peso ideal, 
utilizando as seguintes formulas (em que "h" corresponde
a altura): 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema******************/
        double altura = 0;
        double pesoIdeal;
        String sexo, masculino = "M", feminino = "F";


        /*Entrada do usuario para sexo********************/
        sexo =  JOptionPane.showInputDialog("Digite sexo do atleta: M - Masculino / F - Feminino");
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite Altura:")) ;

        /*Verificando sexo caso seja masculino*************/
        if (sexo.toUpperCase() .equals(masculino)) {
            /*Calculado peso de acordo com altura do atleta*/
            pesoIdeal = (72.2 * altura) - 58;
            JOptionPane.showMessageDialog(null, "Sexo Masculino: " + sexo.toUpperCase() + "\n" +
                                            "Peso Ideal: " + String.format("Kg %.2f", pesoIdeal) ,
                                            "Resultado:", JOptionPane.INFORMATION_MESSAGE);            
        }
        /*Verificando sexo caso seja feminino***************/
        if (sexo.toUpperCase() .equals(feminino)) {
            pesoIdeal = (62.1* altura) - 44.7;
            JOptionPane.showMessageDialog(null, "Sexo Feminino: " + sexo.toUpperCase() + "\n" +
                                            "Peso Ideal: " + String.format("Kg %.2f", pesoIdeal),
                                            "Resultado:", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }
}
