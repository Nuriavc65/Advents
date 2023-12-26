package Uno2023;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream in = new FileInputStream("C:\\Users\\nuria\\OneDrive\\Escritorio\\Advents\\day1_2023.txt");
		Scanner scanner = new Scanner(in);
		ArrayList<String> data = new ArrayList<>();
		while(scanner.hasNextLine()) {
			data.add(scanner.nextLine());
		}
		int resultado = 0;
		int numeroPrimero;
		int numeroUltimo;
		for(int i=0;i<data.size();i++) {
			String linea = data.get(i);
			linea = linea.replaceAll("\\D", "");
			numeroUltimo = Integer.parseInt(""+linea.charAt(linea.length()-1));
			numeroPrimero = Integer.parseInt(""+linea.charAt(0));
			resultado += numeroPrimero*10+numeroUltimo;
		}
		System.out.println(resultado);
	}
}
