package tablero;

public class MostrarTablero {

	public static void main(String[] args) {
		String [][] tablero=new String[8][8];
		//rellenado
		for(int i=0;i<8;i++) {
			for(int k=0;k<8;k++) {
				tablero[i][k]=(i+k)%2==0?"B":"N";
			}
		}
		//mostrar tablero
		for(String[] s:tablero) {
			for(String c:s) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		

	}

}
