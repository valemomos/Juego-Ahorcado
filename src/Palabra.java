public class Palabra {
    private char[] palabra;
    private char[] progreso;

    public Palabra(String palabraSecreta) {
        palabra = palabraSecreta.toUpperCase().toCharArray();
        progreso = new char[palabra.length];
        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';
        }
    }

    public boolean adivinarLetra(char letra) {
        boolean acerto = false;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                progreso[i] = letra;
                acerto = true;
            }
        }
        return acerto;
    }

    public boolean estaCompleta() {
        for (char caracter : progreso) {
            if (caracter == '_') return false;
        }
        return true;
    }

    public void mostrarProgreso() {
        for (char caracter : progreso) {
            System.out.print(caracter + " ");
        }
        System.out.println();
    }

    public String getPalabraOriginal() {
        return new String(palabra);
    }
}
