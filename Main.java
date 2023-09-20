package eng_soft;

public class Main {
	public static void main (String[] args) {
		Fila fila1 = Fila.getInstancia();
		fila1.setItem("item 1");
		System.out.println(fila1.getItem());
		
		Fila fila2 = Fila.getInstancia();
		fila2.setItem("item 1");
		System.out.println(fila2.getItem());
		
	}
}
