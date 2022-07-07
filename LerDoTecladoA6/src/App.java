import java.util.Scanner;

public class App {
    public static void main(String[]args){

      /*  float numero;
        //Scanner -> classe   || nwe Scanner (instancia a classe)  || System.in é de onde vai vir a entrada.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:  ");
        numero = leitor.nextFloat();
        System.out.println("O número é " + numero);*/

        String jogo;
        Scanner leitor = new Scanner(System.in);
        leitor.useDelimiter("[\r\n]+"); //UsaDemilitador Cancelando o espaço como um separador. Ele diz que o separador pode ser quebra de linha. Entre colchetes representa as possibilidades.O mais considera apenas 1 elemento repetido.
        System.out.println("Qual seu jogo do momento?");
        //jogo = leitor.next();
        jogo = leitor.nextLine(); //Identifica a quebra de linha.
        System.out.println("O jogo é " + jogo);









    }
}
