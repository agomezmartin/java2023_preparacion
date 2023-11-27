package geometria;

public abstract sealed class Figura permits Triangulo, Circulo{
	private String color;

	public Figura(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double superficie();
}
