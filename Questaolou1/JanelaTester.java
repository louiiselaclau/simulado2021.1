//Louise Felix Laclau 0050014910  
package questaolou1;

import java.util.ArrayList;

public class JanelaTester {
	
	public static void main(String[] args) {

		Splash win = new Splash();
						
		ArrayList<Splash> splash = new ArrayList<Splash>();
		
		splash.add(win);
		
		win.abrir(splash);
		win.fechar(splash);

	}

}