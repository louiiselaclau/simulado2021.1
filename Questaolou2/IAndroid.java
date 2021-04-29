//Louise Felix Laclau 0050014910  
package questaolou2;

public class IAndroid extends CellPhone{
	
	private String marcasdecelulares;

	public String getMarcas() {
		return marcasdecelulares;
	}

	public void setMarcas(String marcasdecelulares) {
		this.marcasdecelulares = marcasdecelulares;
	}
	
	@Override
	public void mostrar_marca() {
		
		System.out.println("Marca é: " + this.marcasdecelulares);
	}

}