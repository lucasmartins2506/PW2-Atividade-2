public class ClienteSucessoTest {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.cpf ="50729673870";
		System.out.println(cliente.ehCPFValido());
	}

}
