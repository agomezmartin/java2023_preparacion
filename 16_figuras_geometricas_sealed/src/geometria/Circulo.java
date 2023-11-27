package geometria;

public non-sealed class Circulo extends Figura {
	private int radio;
	
	public Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double superficie() {
		// TODO Auto-generated method stub
		return Math.PI*radio*radio;
		//return Math.PI*Math.pow(radio, 2);
	}

}
