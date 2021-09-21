import javax.swing.JOptionPane;

/*
IFTM 15/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

4 - Leia uma velicidade em KM/H(quilometros por hora)
e apresente convertida em m/s(metros por segundo). 
A formula de conversão é M = K/36. sendo k a velocidade 
em km/h e M em m/s.
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema*****************/
        int kilometroHora = 0;
        double metrosSegundo = 0;

        /*Recebendo entrada do usuario *********************/
        kilometroHora = Integer.parseInt(JOptionPane.showInputDialog("Digite QTD de KM a serem convertidos:"));
        
        /* Conversão de kilometros/h em metros/s************/
        metrosSegundo = (1000*kilometroHora) / 3600;

        /*Imprimindo a conversão na tela para usuario*******/
        JOptionPane.showMessageDialog(null, "Resultado:\n" +
                                        "------------------------\n" +
                                        "KM/h: " + kilometroHora + "\n" + 
                                        "M/s: "+ metrosSegundo + "\n" ,
                                        "Conversor de KM/h em M/s:", JOptionPane.INFORMATION_MESSAGE);
        /*Imprimi no prompt cmd resultado. */
        metrosSegundo = kilometroHora / 3.6;
        System.out.println(metrosSegundo);

    }
}
