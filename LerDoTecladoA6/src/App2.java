import javax.swing.*;

public class App2 {

    public static void main(String[]args){

        //Para ter uma interface gráfica
        //Classe JOptionPane e passando o método Mostrar caixa de input (OBJParente, MENSAGEM, TITULO, TIPO DE MENSAGEM DO JOPTIONPANE)
        String filme = JOptionPane.showInputDialog(null,"Qual teu filme favorito?","BRUNO PUTÃO",JOptionPane.QUESTION_MESSAGE); //SEMPRE RECEBE STRING. SE RECEBER NUMRO, PRECISA CONVERTER.
        String digiN = JOptionPane.showInputDialog(null,"Insira um número: ","PICA-PAU",JOptionPane.QUESTION_MESSAGE);
        int num = Integer.parseInt(digiN);
        //Se usa a variável RECIPIENTE para fazer operações Inteiras
        System.out.println(num * 2);
        //Para só exibir uma mensagem com botão OK
        JOptionPane.showMessageDialog(null,"Acabou, Marginal!","Florzinha",JOptionPane.INFORMATION_MESSAGE);


    }

}
