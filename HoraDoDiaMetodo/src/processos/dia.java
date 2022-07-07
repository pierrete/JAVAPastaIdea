package processos;

public class dia {
    public static void main(String[] args){

    }

    public static void manha(int a)
    {

        if (a>=6 && a<12) {
            System.out.println("Bom Dia, bebê!");
        }
    }

    public  static void tarde(int a)
    {
        if (a>=12 && a<18) {
            System.out.println("Boa tarde, bebê!");
        }
    }

    public static void noite(int a)
    {
        if (a>18&&a<=24) {
            System.out.println("Boa noite, bebê!");
        }
    }

    public static void madrugada(int a)
    {
        if (a>0 && a<=5) {
            System.out.println("Vai dormir, bebê!");
        }
    }
}
