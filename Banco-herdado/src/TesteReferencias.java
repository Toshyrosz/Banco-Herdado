
public class TesteReferencias {

	public static void main(String[] args) {
		Funcionario g1 = new Gerente();
		// TODO FUNCIONARIO NAO É UM GERENTE
		g1.setNome("Toshyro");
		g1.setSalario(5000);
		

		Funcionario e = new Editor();
		e.setSalario(2500);
		
		Funcionario d = new Designer();
		d.setSalario(2500);
		
		ControleBonificacao controle = new 	ControleBonificacao();
		controle.registra(g1);
		controle.registra(e);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		}

}
