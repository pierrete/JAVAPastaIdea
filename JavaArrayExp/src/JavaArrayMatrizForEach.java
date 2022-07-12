import java.util.Arrays;

public class JavaArrayMatrizForEach {

    public static void main(String[]args)
    {
        String sequencia[] = {"1","2","3","4","5"};
        int planilha[][]  = {{0,10,15,20,50},{1,2,3,4,5}};

        //For each para imprimir toda a array sem usar um contador tradicional.
        //Cria uma variável para conter a array e coloca nos parametros.
        for(String i : sequencia) {
            System.out.println(i);
        }

        //Diferença de For Each para matriz: precisa ter [] depois do TIPO da array.
        //Para exibir precisa transformar para string (senão imprimirá os endereços dos índices da matriz. Arrays.toString(variável associada à array).
        for(int[] a : planilha){
            System.out.println(Arrays.toString(a));
        }




    }

}
