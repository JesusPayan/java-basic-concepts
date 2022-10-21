import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Introduce cadena de texto");
		String cadena = lector.nextLine();
		
		
		char letras[] = cadena.toCharArray();
		
		for(int i =cadena.length()-1; i>=0;i--) {
			System.out.println(letras[i]);
		}

	}

}
