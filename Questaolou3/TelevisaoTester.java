//Louise Felix Laclau 0050014910  

package questaolou3;

import java.util.Scanner;

public class TesterConsoletv {

	public static void main(String[] args) {
		
		Consoletv consoletv = new Consoletv();
		Controletv controletv = new Controletv();
		
		Scanner in = new Scanner(System.in);
		
		console.setNome("Televisao");
		
		System.out.println("Este console é da " + consoletv.getNome());
		
		controletv.controll();
		
		in.close();
	}

}