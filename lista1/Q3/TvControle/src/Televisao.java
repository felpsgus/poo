public class Televisao {
	private int canal;
	private int volume;

	Televisao() {
		this.canal = 0;
		this.volume = 0;
	}

	Televisao(int canal, int volume) {
		this.canal = canal;
		this.volume = volume;
	}

	public void alteraCanal(int canal) {
		this.canal = canal;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return this.canal;
	}

	public int getVolume() {
		return this.volume;
	}

	public void aumentarVolume() {
		this.volume++;
	}

	public void diminuirVolume() {
		this.volume--;
	}

	@Override
	public String toString() {
		return "Canal: " + this.canal + "\nVolume: " + this.volume;
	}
}
