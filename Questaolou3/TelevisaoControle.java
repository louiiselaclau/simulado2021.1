//Louise Felix Laclau 0050014910  

package questaolou3;

public class Controletv extends Consoletv {
	
	public String getNome() {
		
		return "Televisao";
				
	}
	
	public void controll() {
		
		System.out.println("Esse controle é da " + this.getNome());
		
	}

}