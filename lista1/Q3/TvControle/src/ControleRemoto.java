public class ControleRemoto {
	public static void main(String[] args) throws Exception {
		Televisao tv = new Televisao();

		System.out.println(tv);
		tv.alteraCanal(3);
		System.out.println(tv);
		tv.aumentarVolume();
		System.out.println(tv);
		tv.diminuirVolume();
		System.out.println(tv);
	}
}
