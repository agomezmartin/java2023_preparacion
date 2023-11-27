package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TiemposService {
	String ruta="c:\\temp\\tiempos.txt";
	public double[] tiempos() {
		Path pt=Path.of(ruta);
		try {
			return Files.lines(pt) //Stream<String>
			.mapToDouble(s->Double.parseDouble(s.split(",")[1]))//DoubleStream con los tiempos solamente
			.toArray();			
		}
		catch(IOException ex) {
			return new double[0];
		}
		
	}
}
