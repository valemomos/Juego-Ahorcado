import java.util.Scanner;

public class CategoriaPalabra {
    public static String palabraPorCategoria() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Selección de la categoría ===");
        System.out.println("Ingresa un número para escoger una categoría");
        System.out.println("1. Animales");
        System.out.println("2. Países");
        System.out.println("3. Comida");
        System.out.println("4. Colores");
        System.out.println("5. Frutas");
        System.out.println("6. Personajes de LoL");
        System.out.print("Opción elegida: ");

        String opcion = scanner.next();
        scanner.nextLine();

        String[] animales = {"JIRAFA", "GATO", "PERRO", "VACA", "ELEFANTE", "TIBURON", "TIGRE", "DELFIN", "CARPINCHO", "COCODRILO"};
        String[] paises = {"BOLIVIA", "PERU", "COLOMBIA", "BRASIL", "JAPON", "ARGENTINA", "RUSIA", "CUBA", "PARAGUAY", "CHILE"};
        String[] comida = {"SILPANCHO", "MAJADITO", "SALTEÑA", "SONSO", "LOCRO", "KEPERI", "PIQUEMACHO", "SALCHIPAPA", "MILANESA", "CHURRASCO"};
        String[] colores = {"ROJO", "AMARILLO", "VERDE", "ROSA", "CELESTE", "BLANCO", "NEGRO", "GRIS", "AZUL", "CAFE"};
        String[] frutas = {"MANDARINA", "PAPAYA", "SANDIA", "GUAYABA", "MANZANA", "FRUTILLA", "DURAZNO", "TOMATE", "KIWI", "UVA"};
        String[] lolsito = {"LUX", "NOCTURNE", "MALPHITE", "JHIN", "XAYAH", "PYKE", "KAYN", "GWEN", "VIEGO", "CAITLYN", "EZREAL"};

        String categoriaEscogida;
        switch (opcion) {
            case "1":
                categoriaEscogida = animales[(int)(Math.random() * animales.length)];
                break;
            case "2":
                categoriaEscogida = paises[(int)(Math.random() * paises.length)];
                break;
            case "3":
                categoriaEscogida = comida[(int)(Math.random() * comida.length)];
                break;
            case "4":
                categoriaEscogida = colores[(int)(Math.random() * colores.length)];
                break;
            case "5":
                categoriaEscogida = frutas[(int)(Math.random() * frutas.length)];
                break;
            case "6":
                categoriaEscogida = lolsito[(int)(Math.random() * lolsito.length)];
                break;
            default:
                System.out.println("La opción no es válida. Se escogerá un animal por defecto.");
                categoriaEscogida = animales[(int)(Math.random() * animales.length)];
        }
        return categoriaEscogida;
    }
}
