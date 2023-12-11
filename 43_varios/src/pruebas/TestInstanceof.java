package pruebas;

import java.time.LocalDate;

public class TestInstanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void m(Object obj) {
		if (obj instanceof LocalDate date)
			System.out.println(date);
		else
			System.out.println(date);
	}
	public void n(Object obj) {
		if (obj instanceof LocalDate date)
			return;
		else
			System.out.println(date);
	}
	public void o(Object obj) {
		if (!obj instanceof LocalDate date)
			return;
		else
			System.out.println(date);
	}
	public void p(Object obj) {
		if (!(obj instanceof LocalDate date))
			return;
		else
			System.out.println(date);
	}
	public void q(Object obj) {
		if (!obj instanceof LocalDate date)
			return;
		System.out.println(date);
	}
	public void r(Object obj) {
		if (!(obj instanceof LocalDate date))
			return;
		System.out.println(date);
	}

}
