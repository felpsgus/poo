public class App {
	public static void main(String[] args) throws Exception {

		Robo[] robo = new Robo[2];

		robo[0] = new Robo(10);
		robo[0].ligar();
		System.out.println(robo[0]);
		robo[0].andar(1, 1);
		System.out.println(robo[0]);
		robo[0].aspirarPo(10);
		System.out.println(robo[0]);
		robo[0].parar();
		System.out.println(robo[0]);
		robo[0].desligar();
		System.out.println(robo[0]);

		robo[1] = new Robo(19);
		robo[1].ligar();
		System.out.println(robo[1]);
		robo[1].andar(1, 10);
		System.out.println(robo[1]);
		robo[1].aspirarPo(20);
		System.out.println(robo[1]);
		robo[1].parar();
		System.out.println(robo[1]);
		robo[1].desligar();
		System.out.println(robo[1]);
	}
}
