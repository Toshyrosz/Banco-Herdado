public class TesteFuncionario {
	public static void main(String[] args) {

		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("2222222222");
		nico.setSalario(2222);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}
}
