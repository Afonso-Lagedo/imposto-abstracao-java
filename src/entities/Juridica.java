package entities;


public class Juridica extends Contribuinte{

	private Integer numFuncionario;
	
	public Juridica() {
		super();
	}
	
	
	public Juridica(String nome, Double rendaAnual, Integer numFuncionario) {
		super(nome, rendaAnual);
		this.numFuncionario = numFuncionario;
	}
	
	
	public Integer getNumFuncionario() {
		return numFuncionario;
	}


	public void setNumFuncionario(Integer numFuncionario) {
		this.numFuncionario = numFuncionario;
	}


	@Override
	public Double imposto() {
		Double a;
		
		
		if (getNumFuncionario()>10) {
			a=getRendaAnual()*0.14;
		}
		else {
			a=getRendaAnual()*0.16;
		}
		
		
		return a;
	}

}
