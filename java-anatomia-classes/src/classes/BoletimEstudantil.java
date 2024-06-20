package classes;
public class BoletimEstudantil {
    // Código sobre Identação
	public static void main(String[] args) {
		int mediaFinal = 8;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
	}
}