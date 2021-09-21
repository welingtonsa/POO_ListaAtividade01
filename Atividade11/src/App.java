import javax.swing.JOptionPane;

/*
IFTM 16/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

11 - Faça i, programa qe leia dois numeros 
e mostre qual deles é o maior.
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*VAriaveid de controle do sistema.******************/
        double a, b;

        /*Entrada do usuario dos valores para comparação*****/
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de A:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de B:"));

        /*Comparando os valores e exibindo resultado para usuario*/
        if (a > b) {
            JOptionPane.showMessageDialog(null, "A é maior que B.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "B é maior que A.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        

    }
}
