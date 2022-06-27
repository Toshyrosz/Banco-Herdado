
public class Editor extends Funcionario{

	
		public double getBonificacao() {
			System.out.println("Chamando o metodo de bonificacao do editor de video");
			return super.getBonificacao() + 100;

		}

	}


