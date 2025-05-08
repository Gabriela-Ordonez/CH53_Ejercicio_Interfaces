# Interfaces
## Ejercicio de interfaces con Java

Este proyecto es una aplicación en Java que calcula el área y el perímetro de diversas figuras geométricas utilizando **interfaces** y **clases**. Esto permite una estructura flexible, reutilizable y extensible para manejar diferentes tipos de figuras.

## Figuras Geométricas

Las figuras geométricas implementadas en este proyecto son las siguientes:

1. **Triángulo**
2. **Cuadrado**
3. **Rectángulo**
4. **Rombo**
5. **Romboide**
6. **Trapecio**

Cada una de estas clases implementa la interfaz `FiguraGeometrica`, la cual define los métodos `calcularArea()`, `calcularPerimetro()` y `getNombre()`. Esto permite que todas las figuras compartan una estructura común y puedan ser manipuladas de forma genérica en el programa. Gracias a esto, el método `imprimirCalculos` en la clase `Main` puede recibir cualquier figura y mostrar sus resultados sin importar su tipo específico.
