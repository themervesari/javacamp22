package intro;

import java.nio.file.FileSystemAlreadyExistsException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		//değişken isimleri java'da camelCase yazılır
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		
		//integer
		int vade = 12;
		double dolarDun = 18.20;
		double dolarBugun = 18.30;
		boolean dolarDustuMu = false;
		String okYonu = "";
		
		if (dolarBugun<dolarDun) { //true
			okYonu ="down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun){
			okYonu ="up.svg";
			System.out.println(okYonu);
		} else {
			okYonu ="equal.svg";
			System.out.println(okYonu);
		}
		
		//array
		String[] krediler = {"Hızlı Kredi", "Maaaşını Halkbanktan", "Mutlu Emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}

}
