package view;

import java.util.Arrays;

import service.TiemposService;

public class MostrarPosicion {

	public static void main(String[] args) {
		double tmpRef=3.38;
		TiemposService service=new TiemposService();
		double[] registrados=service.tiempos();
		Arrays.sort(registrados); //ordenamos
		int r=Arrays.binarySearch(registrados, tmpRef); //-pos-1
		System.out.println("Estaría en la posición "+r*-1);
	}

}
