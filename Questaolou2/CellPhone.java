//Louise Felix Laclau 0050014910  

package questaolou2;

abstract class CellPhone {
	
	private Boolean phone = true ;
	
	public Boolean getPhone() {
		
		return phone;
	}

	public void setPhone(Boolean phone) {
		this.phone = phone;
	}
	
	public void ligar() {
	
		this.setPhone(true);
		System.out.println("Celular esta sendo ligado agora!");		
		
	}
	
	public void desligar() {
			
		this.setPhone(false);
		System.out.println("Celular esta sendo desligado agora!");
	
	}
	
	public void mostrar_marca() {
		
	}
	
}