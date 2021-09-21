import javax.swing.JOptionPane;

/*
IFTM 17/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo


-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

22 - Faça um programa para verificar se determinado
número inteiro é divisivel por 3 ou 5, mas não 
simultaneamente pelos dois. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle de sistema*******************/
        double entraUsuario = 17;
        boolean portresDivisivel = false, porCincoDivisivel = false;

        /*Verificando se entradaUsuario é divivel por 3 e por 5*/
        if (entraUsuario % 3 == 0) {
            portresDivisivel = true;
        }
        
        if (entraUsuario % 5 == 0) {
            portresDivisivel = true;
        }

        /*Imprimindo para usuario resultado e caso não seja divivel, mensagem de erro.*/
        if (portresDivisivel || porCincoDivisivel) {
            JOptionPane.showMessageDialog(null, "Divivel por 3 ou 5: | Entrada: "+ entraUsuario +" \n"+
                                            "Divisivel por 3: | "+ portresDivisivel +"\n"+ 
                                            "Divisivel por 5: | "+ porCincoDivisivel , 
                                            "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Não é divisivel por 3 ou 5:",  
                                            "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
