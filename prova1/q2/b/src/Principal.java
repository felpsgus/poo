public class Principal {
	public static void main(String[] args) {

		Carro carro1 = new Carro("Fiat", "Uno");
		carro1.setAno(2010);
		System.out.println("Carro 1: " + carro1.getMarca() + " " + carro1.getModelo());

		Carro carro2 = new Carro("Honda");
		carro2.setAno(2016);
		carro2.setModelo("Civic");
		System.out.println("Carro 2: " + carro2.getMarca() + " " + carro2.getModelo());
	}
}