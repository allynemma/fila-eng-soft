package eng_soft;

public class Fila {
	private String nomeItem;
	private static Fila fila;
	public static Fila getInstancia () {
		if (fila == null) {
			fila = new Fila();
		}
		return fila;
	}
	public void setItem (String nomeItem) {
		this.nomeItem = nomeItem;
	}
	public String getItem () {
		return nomeItem;
	}
	
	public void ImprimeDocumeto () {
		
	}
	public void RemoveDocumeto () {
		
	}
	public void RemoveTodosDocumetos () {
		
	}
}
