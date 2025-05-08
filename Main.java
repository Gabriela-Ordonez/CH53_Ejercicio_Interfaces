
public class Main {

	public static void main(String[] args) {
		// Instancias de todas las figuras geométricas
		FiguraGeometrica t1 = new Triangulo("Bermudas", 20, 10, 15);
		FiguraGeometrica t2 = new Triangulo("Triángulo T", 200, 100, 150);
		FiguraGeometrica c1 = new Cuadrado("Cuadrado", 12);
		FiguraGeometrica r1 = new Rectangulo("Rectángulo", 15, 8);
		FiguraGeometrica ro1 = new Rombo("Rombo", 10, 6, 7);
		FiguraGeometrica rd1 = new Romboide("Romboide", 14, 9, 6);
		FiguraGeometrica tr1 = new Trapecio("Trapecio", 10, 6, 4, 5, 5);

		// Llamada a imprimir resultados
		imprimirCalculos(t1);
		imprimirCalculos(t2);
		imprimirCalculos(c1);
		imprimirCalculos(r1);
		imprimirCalculos(ro1);
		imprimirCalculos(rd1);
		imprimirCalculos(tr1);
	}

	public static void imprimirCalculos(FiguraGeometrica figura) {
		System.out.println(figura); // Usa el toString() de cada clase
		System.out.println("+--------------------------------------+");
		System.out.println("| El área de " + figura.getNombre());
		System.out.println("| es " + figura.calcularArea());
		System.out.println("| El perímetro de " + figura.getNombre());
		System.out.println("| es " + figura.calcularPerimetro());
		System.out.println("+--------------------------------------+");
	}
}



//Crear una clase para cada figura geométrica: Cuadrado, Rectángulo, Rombo, Romboide, Trapecio. 
//Cada una de las clases debe tener métodos para calcular el área y el perímetro.
//Debemos crear una interfaz llamada FiguraGeometrica (sustituir donde teniamos la clase Triangulo) y definir los métodos para calcular área y perímetro.
//Todas las clases de figuras deben implementar la interfaz FiguraGeometrica.
//En el método main, hay que crear objetos de todas las figuras, llamar a los métodos de área y perímetro e imprimir los resultados.

