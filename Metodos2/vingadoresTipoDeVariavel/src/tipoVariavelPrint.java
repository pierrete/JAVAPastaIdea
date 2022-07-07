public class tipoVariavelPrint {
    public static void main(String[] args) {
        String filme = "Vingadores";
        int anoLancamento = 2015;
        int duracao = 240;
        float notaCritica = 8.7f;
        char letraInicial ='V';
        boolean foiSucesso = true;


        System.out.println("Filme: " + filme);
        System.out.println("Ano de lançamento: "  + anoLancamento);
        System.out.println("Duração: " + duracao + " minutos.");
        System.out.println("Nota média: " + notaCritica);
        System.out.println("Letra Inicial: " + letraInicial);
        System.out.println("Foi um sucesso? " + foiSucesso);

        System.out.format("O filme %s lançado em %d tem a duração de %d minutos\n\n\n",filme,anoLancamento,duracao);
        String texto = String.format("O filme %s lançado em %d tem \na duração de %d minutos",filme,anoLancamento,duracao);
        System.out.println(texto);

        String canal = "Academia dos Devs";
        String mensagem = "Se inscreva!";
        String mensagem2 = "Obrigado";
        int meta = 1000;
        //String mensagemFinal =  mensagem+canal+mensagem2;
        String mensagemFinal = String.format("%s %s. %d. %s",mensagem,canal,meta,mensagem2);
        System.out.println(mensagemFinal);

    }
}
