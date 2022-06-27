
public class FuncionarioTeste {

	private String nome;
	private String cpf;
	private double salario;
	private int Tipo = 0; // 0 - funcionario comum,1 - gerente , 2 - diretor
	
	public FuncionarioTeste() {
		
	}
	
	
	public double getBonificacao() {
		
		if(this.Tipo == 0) {
		
		return this.salario * 1.1;
		}else if(this.Tipo == 1) {
			return this.salario;
		}else {
			return this.salario + 1000;
		}
	}
	
	public void setTipo(int tipo) {
		Tipo = tipo;
	}
	
	public int getTipo() {
		return Tipo;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
		
	
}
