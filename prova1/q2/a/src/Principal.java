public class Principal {
	public static void main(String[] args) {

		Carro carro1 = new Carro("Fiat", "Uno");
		carro1.ano = 2010;
		System.out.println("Carro 1: " + carro1.marca + " " + carro1.modelo);

		Carro carro2 = new Carro("Honda");
		carro2.ano = 2016;
		carro2.modelo = "Civic";
		System.out.println("Carro 2: " + carro2.marca + " " + carro2.modelo);
	}
}