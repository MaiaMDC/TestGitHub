package FirstProgram;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {

		int marcio = 0;
		int danilo = 0;
		int result = 0;
		
		Scanner imput = new Scanner(System.in);

		System.out.println("Insira a idade do Marcio");
		marcio = imput.nextInt();

		System.out.println("Insira a idade do Danilo");
		danilo = imput.nextInt();

		if (marcio > danilo) {
			System.out.println("Marcio é mais velho");
			result = marcio;
		} else {
			System.out.println("Danilo é mais velho");
			result = danilo;
		}
		
		
		
		System.out.println("idade " + result);
	}

}
