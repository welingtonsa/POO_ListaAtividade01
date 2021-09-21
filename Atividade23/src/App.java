import javax.swing.JOptionPane;
/*
IFTM 17/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo

-Lista de Exercício Introdução Java
-Lista referente a presença dos dias 13 e 14/09

23 - Faça um programa que leia os coeficientes de 
uma equação do segundo grau. Em seguida, calcule e 
as raizes dessa equação, lembrando que as raizes são
calculadas como:

x = -b +- RAIZ delta
    -----------------
            2*a

em que delta - b^2 - 4ac e ax^2 + bx + c = 0 representa
uma equação do segundo grau. A variavel tem de ser diferente
de zero. Caso seja igual, imprima a mensagem "Não é 
equaçãoo do segundo grau." Do contrario, imprima:

    a - Se delta < 0, não existe raiz real. Imprima "Não existe raiz."
    b - Se delta = 0, existe uma raiz real. Imprima  "Raiz Unica."
    c - Se delta > 0, existem duas raizes reias.  Imprima as Raizes.*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema******************/
        double a = 4, b = 4, c = 1;
        double delta = 0,raizDelta = 0, x1, x2;    
        
        /*Verificando coeficiente de a *********************/
        if (a != 0 ) {
            /*Calculando delta e raiz de delta.*/
            delta = Math.pow(b, 2) - 4 * a * c;
            raizDelta = Math.sqrt(delta);

            /*Delta  > 0.***********************************/
            if (delta > 0) {
                x1 = ((+1) * b + raizDelta) / (2* a);
                x2 = ((+1) * b - raizDelta) / (2* a);

                /*Imprimindo na tela Raizes reais************/                
                System.out.println("Delta > 0: " + x1 + " | " + x2);
                JOptionPane.showMessageDialog(null, "Existem duas Raizes Reais: \n" +
                                                "1° Raiz: " + x1 + " \n" + 
                                                "2° Raiz: " + x2,
                                                "Resultado:", JOptionPane.INFORMATION_MESSAGE);
            } 
            /*Delta < 0.*************************************/
            if (delta < 0 ) {
                /*Imprimindo na tela Não existem Raizes.******/
                System.out.println("Delta < 0:");
                JOptionPane.showMessageDialog(null, "Não existem Raizes Reias." 
                                                ,"Resultado:", JOptionPane.INFORMATION_MESSAGE);

            }
            /*delta == 0.************************************/
            if (delta == 0) {
                x1 = ((+1) * b + raizDelta) / (2* a);
                x2 = ((+1) * b - raizDelta) / (2* a);

                /*Imprimindo para usuario raiz unica.*********/
                System.out.println("Delta == 0:");
                System.out.printf(" Raiz 1: %.2f" , x1);
                System.out.printf(" Raiz 1: %.2f" , x2);
                JOptionPane.showMessageDialog(null, "Unica Raiz: " + x1 + "\n" + 
                                                    "Unica Raiz: " + x2, 
                                                "Resultado:", JOptionPane.INFORMATION_MESSAGE);

            }    
        } else {
            System.out.println("Expressão invalida. Não é uma equação de 2° grau.");    
        }
        System.out.println(delta);
        System.out.println(raizDelta);
    }
}
