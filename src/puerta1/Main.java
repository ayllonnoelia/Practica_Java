package puerta1;

public class Main {

	public static void main(String[] args) {

		PuertaTemporizada temp = new PuertaTemporizada();
		temp.timeout();
		
		Puerta puerta = new Puerta();
		puerta.metodoBloqueo();
		
	}

}