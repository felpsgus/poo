public class FabricaDocumentos extends Fabrica {

	@Override
	public Documento criarDocumento(String remetente, String tipo, int numero) {
		if (tipo.equals("carta")) {
			return new Carta(remetente, tipo, numero);
		} else if (tipo.equals("notificacao")) {
			return new Notificacao(remetente, tipo, numero);
		} else if (tipo.equals("telegrama")) {
			return new Telegrama(remetente, tipo, numero);
		} else {
			return null;
		}
	}
}
