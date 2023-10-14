public class Main {
	public static void main(String[] args) {
		Fulano menga = new Fulano("Menganito", 25, 2, 3);
		menga.saludar();
		menga.decirEdad();
		menga.decirGatos();
		Integer gatos = menga.totalGatos();
		System.out.println(menga.nombre + " " + gatos + " gatos en total\n");

		Fulano fulanito = new Fulano();
		fulanito.saludar();


		Fulano.decirEdad();
	}
}
