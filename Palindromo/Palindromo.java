public class Palindromo {

        public static boolean esPalindromo(String texto) {
            // Paso 1: Limpiar el texto
            String textoLimpio = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            // Paso 2: Invertir el texto
            String textoInvertido = new StringBuilder(textoLimpio).reverse().toString();

            // Paso 3: Comparar
            return textoLimpio.equals(textoInvertido);
        }

        public static void main(String[] args) {
            // Ejemplos
            String ejemplo1 = "Anita lava la tina";
            String ejemplo2 = "Hola mundo";

            System.out.println("\"" + ejemplo1 + "\" es palíndromo: " + esPalindromo(ejemplo1));
            System.out.println("\"" + ejemplo2 + "\" es palíndromo: " + esPalindromo(ejemplo2));
        }



}
