import javax.swing.JOptionPane;

/*
IFTM 16/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

8 - Leia o valor do raio de um circulo. Calcule e imprima a área
dp circulo correspondente. A área do círculo é A = PI*raio^2.
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*VAriaveis de controle do sistema******************/
        double raio; 
        double area;

        /*Entrada do raio pelo usuario*/
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite raio do Circulo:")) ;

        /*Calculo da area usando entrada do raio pelo usuario
        **Math.pow() é usado para calcular a potencia.*/
        area = 3.14 * (Math.pow(raio, 2));

        JOptionPane.showMessageDialog(null, "Raio = "  + raio + "\n" +
                                        "A área do círculo (PI * 2) = " + area + "m",
                                        "Resultado: ", JOptionPane.INFORMATION_MESSAGE);

        /*Imprime no prompt de comando area do raio*/                                                
        System.out.println(area);
    }
}
