package classes;
public class MinhaClasse {
    public static void main(String [] args) {
        //System.out.print ("Olá mundo, Deus te abençoe!");
        
        //String BR = "Brasil";
        //double PI = 3.14;
        //int ESTADOS_BRASILEIRO = 27;
        //int ANO_2000 = 2000;

        String meuNome = "Gustavo";
        int idade = 25;
        double altura = 1.81;
        boolean verdadeira = true;
        boolean falso = false;

        idade = 26;

        String primeiroNome = "Gustavo";
        String segundoNome = " Aryan";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat("").concat(segundoNome);
    }


}
