public class Fulano {
	public String nombre;
	private static Integer edad;
	private Integer gatos_arg;
	private Integer gatos_esp;

	// Constructor
	public Fulano(String nombre, Integer edad, Integer gatos_arg, Integer gatos_esp) {
		this.nombre = nombre;
		this.edad = edad;
		this.gatos_arg = gatos_arg;
		this.gatos_esp = gatos_esp;
	}

	// Default constructor
	public Fulano() {
		this.nombre = "Fulanito";
		this.edad = 42;
		this.gatos_arg = 5;
		this.gatos_esp = 3;
	}

	public void saludar() {
		System.out.println("Hola, mi nombre es " + nombre);
	}

	public static void decirEdad() {
		System.out.println("Tengo " + edad + " años");
	}

	public void decirGatos() {
		System.out.println("Tengo " + gatos_arg + " gatos en Argentina");
		System.out.println("Tengo " + gatos_esp + " gatos en España");
		System.out.println("Tengo " + totalGatos() + " gatos en total");
	}

	public Integer totalGatos() {
		return gatos_arg + gatos_esp;
	}
}

