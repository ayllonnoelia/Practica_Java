package puerta1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import static java.util.concurrent.TimeUnit.SECONDS;

import java.lang.ref.Cleaner.Cleanable;

public class PuertaTemporizada {

	public void timeout() {
		
		//creo una interfaz con un solo hilo
		final ScheduledExecutorService se = Executors.newScheduledThreadPool(1);
		
		//utilizo runnable para ejecutar el hilo
		final Runnable r = new Runnable() {
			
			//declaro el contador con los segundos que tiene el usuario para introducir el código.
			int segundos = 5;
			
			@Override
			public void run() {
				//a cada vuelta el contador va restando uno hasta llegar a cero
				segundos--;
				
				//creo la condición para cuando el número sea menor a 0
				if (segundos < 0) {
					System.out.println("\nLo sentimos, el tiempo de espera se ha agotado.");
					//finalizo la ejecución del siguiente programa
					System.exit(0);
					
				}
				
			}
		};
		
		//ejecuto la acción y pongo los parámetros necesarios (la variable runnable, 
		//el delay en milisegundos de la tarea para ser ejecutada, el tiempo en milisegundos 
		//entre ejecuciones de tareas y la unidad de tiempo).
		se.scheduleAtFixedRate(r, 0, 1, SECONDS);

	}
	
}
