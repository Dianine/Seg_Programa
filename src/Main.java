import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Produtos:");
		
		String produto1 = "Computador";
		String produto2 = "Mouse";
		String data = "Registro:";
		
		int tempo = 30;
		int id = 5290;
		char sexo = 'F';
		
		double pre�o1 = 2100.0;
		double pre�o2 = 650.50;
		double medir = 53.234567;
				
		System.out.println(produto1 + ", pre�o unit�rio: R$" + pre�o1);
		System.out.println(produto2 + ", pre�o unit�rio: R$" + pre�o2);
		
		System.out.println(data +  tempo + " anos," + " c�digo " + id + " e g�nero: " + sexo );
		
		System.out.println("Medida com seis casas decimais: " + medir);
		System.out.printf("Medida com tr�s casas decimais:%.3f%n", medir);
		
		Locale.setDefault(Locale.US);
		System.out.printf("Usando o ponto como separador decimal dos US:%.3f%n", medir);
		
	}

}
