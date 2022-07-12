import javax.swing.*;

public class App {
    public static void main(String[]args){
        //SOMA COMUM COM VARIÁVEIS
       /* int numeroA, numeroB, resultado;
        numeroA = 5;
        numeroB = 6;
        resultado = numeroA + numeroB;
        JOptionPane.showMessageDialog(null,resultado,"SOMA COMUM",JOptionPane.INFORMATION_MESSAGE);


        DIVISÃO (Double e float casting[Forçar saída em um tipo específico])
        double result = 5/2;
        Ele vai mostrar a divisão 5 / 2 = 2.0  Porque tá dividindo inteiros e o resultado será inteiro mas com ponto flutuante.
        double result = (double)5/2;
        float result = (float)5/2;
        Casting: forçando o resultado a ser do tipo DOUBLE ou FLOAT.
        Ou coloca pelo menos um dos valores com ponto para o Java identificar como um valor quebrado (DOUBLE ou FLOAT)
        double result = 5.0 / 2;*/
        int result = 10 % 8;
        //numero % 2 = se der 0 é par se for diferentede 0 é ímpar.
        JOptionPane.showMessageDialog(null,result,"RESTO",JOptionPane.INFORMATION_MESSAGE);

        // contador++  é o mesmo que contador = contador + 1
        //contador += 2 é o mesmo que contador = contador + 2
        //++contador  será contador = contador + 1 e imprimirá o valor atualizado.
        //contador++ imprime o valor antigo e depois soma + 1 contador = contador + 1




    }

}
