package Backtracking_Ej9;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/**
 * Ejercicio 9. Dado un tablero de 4 x 4, en cuyas casillas se encuentran
 * desordenados los n�meros enteros del 1 al 15 y una casilla desocupada en una
 * posici�n inicial dada, determinar una secuencia de pasos tal intercambiando
 * n�meros contiguos (en horizontal y en vertical) con la casilla desocupada,
 * los n�meros en el tablero queden ordenados (como muestra la figura) y la
 * casilla desocupada quede en la posici�n 4,4.
 * 
 * @author Gentil Ricardo
 *
 */
public class Main {

	public static void main(String[] args) {
		int N = 4;
		Integer[][] matriz = new Integer[N][N];
		List<Integer> numeros = new ArrayList<>();

		// Llenar la lista con los n�meros del 1 al 15
		for (int i = 1; i <= 15; i++) {
			numeros.add(i);
		}

		// Mezclar los n�meros de forma aleatoria
		Collections.shuffle(numeros);

		// Llenar la matriz con los n�meros desordenados
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!numeros.isEmpty()) {
					if (i == 1 && j == 2) {
						matriz[i][j] = null;
					} else {
						matriz[i][j] = numeros.remove(0);
					}
				}
			}
		}

		// Imprimir la matriz
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (matriz[i][j] != null) {
					System.out.print(matriz[i][j] + "\t");
				} else {
					System.out.print(" \t");
				}
			}
			System.out.println();
		}

		Backtracking backtracking = new Backtracking(matriz, N);

		matriz = backtracking.ordenarMatriz();

	}

}
