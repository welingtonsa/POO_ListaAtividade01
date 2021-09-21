import javax.swing.JOptionPane;

/*
IFTM 16/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

16 - Uma empresa vende o mesmo produto para quatro
diferentes estados. Cada estado possui uma taxa diferente
de imposto sobre o produto. Faça um programa em que o usuario
entre com valor e o estado de destino  
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*VAriaveis de controle do sistema*******************/
        String estadoDestino;
        double valorPruduto = 0, imposto, valorTotal; 

        /*Recebendo entrada do usuario do destino e valor do produto*/
        estadoDestino = JOptionPane.showInputDialog("Destino do Produto:\n MG|SP|RJ|MS");
        valorPruduto = Double.parseDouble(JOptionPane.showInputDialog("Digite Valor do produto:"));

        /*Caso estado selecionado*****************************/
        switch(estadoDestino.toUpperCase()) {
            case "MG":

              /*Calculando imposto e valor total do produto***/
              imposto = (valorPruduto / 100) * 7;
              valorTotal = imposto + valorPruduto;

              /*Exibindo para usuario informações sobre produto, destino e imposto*/
              JOptionPane.showMessageDialog(null, "Destino do Produto Minas Gerais:\n" +
                                                "----------------------------------------------\n" +
                                                "Valor do Produto:  " + valorPruduto + "\n" +
                                                "Valor do Imposto:  " + imposto + "\n" +
                                                "Valor Total do Produto: " + valorTotal, 
                                                "Resultado:", JOptionPane.INFORMATION_MESSAGE);
              break;
            case "SP":
              // code block
              imposto = (valorPruduto / 100) * 12;
              valorTotal = imposto + valorPruduto;

              /*Exibindo para usuario informações sobre produto, destino e imposto*/
              JOptionPane.showMessageDialog(null, "Destino do Produto São Paulo:\n" +
                                                "----------------------------------------------\n" +
                                                "Valor do Produto:  " + valorPruduto + "\n" +
                                                "Valor do Imposto:  " + imposto + "\n" +
                                                "Valor Total do Produto: " + valorTotal, 
                                                "Resultado:", JOptionPane.INFORMATION_MESSAGE);
              break;
            case "RJ":
              // code block
              imposto = (valorPruduto / 100) * 15;
              valorTotal = imposto + valorPruduto;

              /*Exibindo para usuario informações sobre produto, destino e imposto*/
              JOptionPane.showMessageDialog(null, "Destino do Produto Rio de Janeiro:\n" +
                                                "----------------------------------------------\n" +
                                                "Valor do Produto:  " + valorPruduto + "\n" +
                                                "Valor do Imposto:  " + imposto + "\n" +
                                                "Valor Total do Produto: " + valorTotal, 
                                                "Resultado:", JOptionPane.INFORMATION_MESSAGE);
              break;
            case "MS":
              // code block
              imposto = (valorPruduto / 100) * 8;
              valorTotal = imposto + valorPruduto;

              /*Exibindo para usuario informações sobre produto, destino e imposto*/
              JOptionPane.showMessageDialog(null, "Destino do Produto Mato Grosso:\n" +
                                                "----------------------------------------------\n" +
                                                "Valor do Produto:  " + valorPruduto + "\n" +
                                                "Valor do Imposto:  " + imposto + "\n" +
                                                "Valor Total do Produto: " + valorTotal, 
                                                "Resultado:", JOptionPane.INFORMATION_MESSAGE);
              break;
            default:
              // code block
          }
          

    }
}
