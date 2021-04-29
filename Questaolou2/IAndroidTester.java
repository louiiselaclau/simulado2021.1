//Louise Felix Laclau 0050014910  

package questaolou2;

import java.util.Scanner;

public class IAndroidTester {

	public static void main(String[] args) {
		
		CellPhone cellphone = new IAndroid();
		
		IAndroid iandroid = new IAndroid();
		
		Scanner in = new Scanner(System.in);
		
		String marcasdecelulares;
		
		System.out.println("Informe a marca do seu telefone:");
		marcasdecelulares = in.nextLine();
		
		iandroid.setMarcas(marcasdecelulares);
		iandroid.mostrar_marca();
		
		cellphone.ligar();
		cellphone.desligar();
				
		in.close();
	}

}