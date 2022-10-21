import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);

		boolean bandera = true;

		while (bandera == true) {

			System.out.println("Introduce la opción a ejecutar 1: suma 2: resta 3: multiplicación 4 división");
			int opcion = lector.nextInt();

			System.out.println("Introduce el primer número a evaluar");
			int num1 = lector.nextInt();
			System.out.println("Introduce el segundo número a evaluar");
			int num2 = lector.nextInt();

			switch (opcion) {
				case 1:
					System.out.println("La suma de los números es " + (num1 + num2));
					break;
				case 2:
					System.out.println("La resta de los números es " + (num1 - num2));
					break;
				case 3:
					System.out.println("La multipliación de los números es " + (num1 * num2));
					break;
				case 4:
					System.out.println("La división de los números es " + (num1 / num2));
					break;
			}

			System.out.println("Desea seguir ejecutabndo operaciones?");
			bandera = lector.nextBoolean();

		}

	}

}
