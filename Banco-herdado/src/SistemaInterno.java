public class SistemaInterno extends FuncionarioAutenticavel {
	
	private int senha = 2222;
	
	public void autentica(FuncionarioAutenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("pode entrar no sistema");
		}else {
			System.out.println("nao pode entrar");
		}
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}
}
