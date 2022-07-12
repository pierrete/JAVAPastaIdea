public class contadores {
    public static void main(String[] args) {
        int contador = 0;
        int relogio = 0;
//CONTADOR++ Pós-fixo
        contador++;
        System.out.println("Contador  = "+(contador+=2));
        //Se não isolar uma soma de variavel no meio da concatenação ele vai considerar os números como String também.
       //Pré-fixo
        ++relogio;
        System.out.println("Relógio = "+(relogio+2));




    }
}
