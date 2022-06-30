public class Gerente extends Funcionario implements Autenticavel{

	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do Gerente");
		return + super.getSalario();
	}
		private AutenticacaoUtil autenticador;
		
		public Gerente() {
			this.autenticador = new AutenticacaoUtil();		}

		public void Administrador() {
			this.autenticador = new AutenticacaoUtil();
		}
		
		public boolean autentica(int senha) {
			return  this.autenticador.autentica(senha);
		}

		@Override
		public void setSenha(int senha) {
			this.autenticador.setSenha(senha);
		}

	}