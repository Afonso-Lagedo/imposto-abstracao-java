package entities;


public class Fisico extends Contribuinte{

	private Double gastoSaude;
	
	public Fisico() {
		super();
	}
	
	
	public Fisico(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	


	public Double getGastoSaude() {
		return gastoSaude;
	}


	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}


	@Override
	public Double imposto() {
		Double a;
		Double b =0.0;
		
		if (getRendaAnual()<20000) {
			a=getRendaAnual()*0.15;
		}
		else {
			a=getRendaAnual()*0.25;
		}
		if (getGastoSaude()>0) {
			b=getGastoSaude()*0.5;
		}
		
		return a-b;
	}

}
