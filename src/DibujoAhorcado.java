public class DibujoAhorcado {
    public static void mostrar(int intentosRestantes) {
        int estado = 6 - intentosRestantes;
        System.out.println(" +---+");
        System.out.println(" |   |");

        switch (estado) {
            case 0:
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                break;
            case 1:
                System.out.println(" O   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                break;
            case 2:
                System.out.println(" O   |");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("     |");
                break;
            case 3:
                System.out.println(" O   |");
                System.out.println("/|   |");
                System.out.println("     |");
                System.out.println("     |");
                break;
            case 4:
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("     |");
                System.out.println("     |");
                break;
            case 5:
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/    |");
                System.out.println("     |");
                break;
            case 6:
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/ \\  |");
                System.out.println("     |");
                break;
        }
        System.out.println("     |");
        System.out.println("=========");
    }
}
