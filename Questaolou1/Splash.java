//Louise Felix Laclau 0050014910  

package questaolou1;

import java.util.ArrayList;

public class Splash implements IJanela{
	
	private String abrir;
	private String fechar;

	public String getAbrir(String string) {
		return abrir;
	}

	public void setAbrir(String abrir) {
		this.abrir = abrir;
	}

	public String getFechar(String string) {
		return fechar;
	}

	public void setFechar(String fechar) {
		this.fechar = fechar;
	}
	
	@Override
	public void abrir(ArrayList<Splash> splash) {
		
		System.out.println("Abrindo Janela");
		
	}

	@Override
	public void fechar(ArrayList<Splash> splash) {
		
		System.out.println("Fechando Janela");
		
	}

}