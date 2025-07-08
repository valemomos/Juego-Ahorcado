import java.util.Scanner;

public class JuegoAhorcado {
    private Palabra palabra;
    private int intentos;
    private char[] letrasUsadas;
    private int cantidadUsadas;

    public JuegoAhorcado() {
        String palabraElegida = CategoriaPalabra.palabraPorCategoria();
        palabra = new Palabra(palabraElegida);
        intentos = 6;
        letrasUsadas = new char[26];
        cantidadUsadas = 0;
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== Bienvenido a mi Juego del Ahorcado :D ===");

        while (intentos > 0 && !palabra.estaCompleta()) {
            DibujoAhorcado.mostrar(intentos);
            palabra.mostrarProgreso();
            System.out.println("Te quedan: " + intentos + " intentos.");
            System.out.print("Ingresa una letra: ");

            String entrada = sc.nextLine().toUpperCase();
            if (!entrada.matches("[A-Z]")) {
                System.out.println("Solo son válidas las letras del abecedario.");
                continue;
            }

            char letra = entrada.charAt(0);

            if (letraYaUsada(letra)) {
                System.out.println("Ya hemos intentado con la letra '" + letra + "'. Prueba con otra nueva.");
                continue;
            }

            guardarLetra(letra);

            if (palabra.adivinarLetra(letra)) {
                System.out.println("Yeyyy, la letra '" + letra + "' está en la palabra.");
            } else {
                intentos--;
                System.out.println("Naooo, la letra '" + letra + "' no está en la palabra.");
            }
        }

        DibujoAhorcado.mostrar(intentos);
        if (palabra.estaCompleta()) {
            System.out.println("\nBien hecho, adivinaste la palabra:");
        } else {
            System.out.println("\nNo lo lograste, la palabra era:");
        }
        System.out.println(palabra.getPalabraOriginal());
        System.out.println("=== Fin del juego ===");
    }

    private boolean letraYaUsada(char letra) {
        for (int i = 0; i < cantidadUsadas; i++) {
            if (letrasUsadas[i] == letra) {
                return true;
            }
        }
        return false;
    }

    private void guardarLetra(char letra) {
        letrasUsadas[cantidadUsadas] = letra;
        cantidadUsadas++;
    }
}
