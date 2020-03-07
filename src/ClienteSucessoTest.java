import java.util.Date;

public class ClienteSucessoTest {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.cpf ="50729673870";
		System.out.println(cliente.ehCPFValido());
		Date dtget = DateTimeUtils.aniver(19, 11, 2002);
		cliente.nascimento = dtget;
	
		System.out.println(cliente.nascimento);
		System.out.println(cliente.toString());
	}

}
