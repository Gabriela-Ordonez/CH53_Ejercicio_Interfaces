
public class Rombo implements FiguraGeometrica {
	private String nombre;
	private double diagonalMayor;
	private double diagonalMenor;
	private double lado;

	public Rombo(String nombre, double diagonalMayor, double diagonalMenor, double lado) {
		super();
		this.nombre = nombre;
		this.diagonalMayor = diagonalMayor;
		this.diagonalMenor = diagonalMenor;
		this.lado = lado;
	}//constructor

	public double calcularArea() {
		return (getDiagonalMayor() * getDiagonalMenor()) / 2;
	}//calcularArea

	public double calcularPerimetro() {
		return getLado() * 4;
	}//calcularPerimetro

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDiagonalMayor() {
		return diagonalMayor;
	}

	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}

	public double getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", diagonalMayor=" + diagonalMayor + ", diagonalMenor=" + diagonalMenor + ", lado=" + lado + "]";
	}
}//class Rombo
