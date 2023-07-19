public class Robo {
	private static final int STATUS_DESLIGADO = 0;
	private static final int STATUS_LIGADO = 1;
	private static final int STATUS_PARADO = 2;
	private static final int STATUS_ANDANDO = 3;
	private static int count = 0;
	private int numero;
	private int status;
	private int x;
	private int y;
	private double quantidadePo;
	private double limitePo;

	public int getNumero() {
		return numero;
	}

	public int getStatus() {
		return status;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getQuantidadePo() {
		return quantidadePo;
	}

	public double getLimitePo() {
		return limitePo;
	}

	Robo(double limitePo) {
		this.numero = ++count;
		this.status = STATUS_DESLIGADO;
		this.x = 0;
		this.y = 0;
		this.quantidadePo = 0;
		this.limitePo = limitePo;
	}

	public void andar(int x, int y) {
		if (this.status == STATUS_LIGADO) {
			this.x += x;
			this.y += y;
			this.status = STATUS_ANDANDO;
		}
	}

	public void parar() {
		if (this.status == STATUS_ANDANDO) {
			this.status = STATUS_PARADO;
		}
	}

	public void aspirarPo(double quantidadePo) {
		if (this.status == STATUS_ANDANDO) {
			this.quantidadePo += quantidadePo;
			if (this.quantidadePo > this.limitePo) {
				this.quantidadePo = this.limitePo;
				this.desligar();
				System.out.println("Robo " + this.numero + " desligado por excesso de po");
			}
		}
	}

	public void ligar() {
		if (this.status == STATUS_DESLIGADO) {
			this.status = STATUS_LIGADO;
		}
	}

	public void desligar() {
		if (this.status == STATUS_PARADO) {
			this.status = STATUS_DESLIGADO;
		}
	}

	@Override
	public String toString() {
		return "Robo [numero=" + numero + ", status=" + status + ", x=" + x + ", y=" + y + ", quantidadePo="
				+ quantidadePo + ", limitePo=" + limitePo + "]";
	}
}
