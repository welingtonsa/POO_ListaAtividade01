import javax.swing.JOptionPane;
/*
IFTM 16/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

13 - FA um programa que leia o salari de um 
trabalhador e o valor da pretaçãe um emprestimos.
Se a prestação: 
    a - For maior que 20% do salario, imprima:
"Emprestimo não concebido". 
    b - Caso contrario, imprima: "Emprestimo cncedido."
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema*******************/
        double salario, prestacao, limeteEmprestimo;

        /*Recebendo valores do usuario **********************/
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite valor do Salario:"));
        prestacao = Double.parseDouble(JOptionPane.showInputDialog("Digite valor do Prestação:"));

        /*Calculando o limete do emprestimo *****************/
        limeteEmprestimo = (salario/100) * 20;

        /*Exibindo na tela resultado para usuario ************/
        if (prestacao <= limeteEmprestimo) {
            JOptionPane.showMessageDialog(null, "Limete Liberado.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Limete NÂO Liberado.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
