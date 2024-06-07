
public class Permutacion{


        public static int contador=0;//usa el conteo para generar la cantidad de posiciones
        public Permutacion() {
        }


        public static void permutar(String[] elements, int n) {
            if (n == elements.length - 1) {

                printArray(elements);
            } else {
                for (int i = n; i < elements.length; i++) {
                    cambiar(elements, n, i);
                    permutar(elements, n + 1);
                    cambiar(elements, n, i);
                }
            }
        }

        private static void cambiar(String[] elements, int i, int j) {
            String temp = elements[i];
            elements[i] = elements[j];
            elements[j] = temp;
        }

        private static void printArray(String[] elements) {
            //hace la impresion de las permutaciones que se hacen
            contador++;
            System.out.print(contador+") ");
            for (String element : elements) {

                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
