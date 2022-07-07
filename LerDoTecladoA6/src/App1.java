import java.util.Scanner;

public class App1 {
    public static void main(String[]args){
        String elo;
        String campeao;
        String valor;
        int tier; //posição   classe = Integer
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual seu elo?"); //Ouro, prata, bronze.
        elo = leitor.nextLine();

        System.out.println("Qual o seu tier?");
        valor = leitor.nextLine();
        //tier = leitor.nextInt();
        tier = Integer.parseInt(valor); //converte a String valor para inteiro e atribui em Tier.

        System.out.println("Qual seu campeão preferido?");
        campeao =leitor.nextLine();// ele entendeu o nextint como um \n no campeao. por isso ele pula de linha. P evitar esse bug usar o next ou nextline.
        System.out.println(tier +1);
        System.out.println("Você é mono "+campeao+" no elo "+elo+" "+tier);



    }


}
