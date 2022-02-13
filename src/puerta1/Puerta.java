package puerta1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Puerta{

	public void metodoBloqueo() {
		
		//pido el pin para desbloquear la puerta
		System.out.print("Introduce el PIN para desbloquear la puerta (1234) -> ");
		
		//creo el objeto scanner
		Scanner leer = new Scanner(System.in);
		
		try {
			
			//leo el vair introducido
			int codigo = leer.nextInt();
			
			//si no es correcto -> mensaje error
			if (codigo != 1234) {
				System.out.println("C�digo incorrecto, puerta cerrada. -> [|]");
				System.exit(0);
			}else{
				//si es correcto -> mensaje ok
				System.out.println("C�digo correcto, puerta abierta. -> [__|__]");
				System.exit(0);
			}
			
		} catch (InputMismatchException e) {
			//en caso que se introduzca car�cteres no num�ricos
			System.out.println("Lo sentimos el PIN requerido es num�rico.");
			System.exit(0);
		}
		
		//hago que los recursos dejen de estar ocupados
		leer.close();
		
	}
	
}
