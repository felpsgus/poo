public class CadastroDocumentos {
	public static void main(String[] args) throws Exception {
		FabricaDocumentos fabrica = new FabricaDocumentos();
		Documento documento = fabrica.criarDocumento("João", "carta", 1);

		System.out.println(documento);
	}
}
