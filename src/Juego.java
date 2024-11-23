import java.util.Scanner;

public class Juego {
    static int riesgoTotal = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Te encuentras en el borde del bosque. ¿Qué decides hacer?");
        System.out.println("Riesgo acumulado: " + riesgoTotal);
        System.out.println("1. Entras al bosque, siguiendo un sendero claro. (Riesgo: 2)");
        System.out.println("2. Caminas por el borde del bosque, cerca de la seguridad. (Riesgo: 1)");

        int decision = scanner.nextInt();

        if (decision == 1) {
            riesgoTotal += 2;
            adentrarseBosque(scanner);
        } else if (decision == 2) {
            riesgoTotal += 1;
            bordeBosque(scanner);
        } else {
            System.out.println("Opción no válida. El juego ha terminado.");
        }
    }

    public static void adentrarseBosque(Scanner scanner) {
        System.out.println("Entras al bosque, siguiendo un sendero claro.");
        System.out.println("Riesgo acumulado: " + riesgoTotal);
        System.out.println("1. Tomas el camino a la izquierda, oscuro y tenebroso. (Riesgo: 3)");
        System.out.println("2. Tomas el camino a la derecha, accidentado pero iluminado. (Riesgo: 4)");

        int decision = scanner.nextInt();

        if (decision == 1) {
            riesgoTotal += 3;
            caminoIzquierdo(scanner);
        } else if (decision == 2) {
            riesgoTotal += 4;
            caminoDerecho(scanner);
        } else {
            System.out.println("Opción no válida. El juego ha terminado.");
        }
    }

    public static void bordeBosque(Scanner scanner) {
        System.out.println("Caminas por el borde del bosque y te encuentras con un río.");
        System.out.println("Riesgo acumulado: " + riesgoTotal);
        System.out.println("1. Cruzar el río, aunque parece peligroso. (Riesgo: 3)");
        System.out.println("2. Buscar un lugar más seguro para cruzar. (Riesgo: 2)");

        int decision = scanner.nextInt();

        if (decision == 1) {
            riesgoTotal += 3;
            cruzarRio(scanner);
        } else if (decision == 2) {
            riesgoTotal += 2;
            buscarPasoSeguro(scanner);
        } else {
            System.out.println("Opción no válida. El juego ha terminado.");
        }
    }

    public static void cruzarRio(Scanner scanner) {
        System.out.println("Logras cruzar el río, aunque quedas agotado.");
        System.out.println("Riesgo acumulado: " + riesgoTotal);
        System.out.println("1. Continuar avanzando hacia una colina lejana. (Riesgo: 3)");
        System.out.println("2. Buscar refugio para descansar. (Riesgo: 1)");

        int decision = scanner.nextInt();

        if (decision == 1) {
            riesgoTotal += 3;
            colina(scanner);
        } else if (decision == 2) {
            riesgoTotal += 1;
            refugio(scanner);
        } else {
            System.out.println("Opción no válida. El juego ha terminado.");
        }
    }

    public static void buscarPasoSeguro(Scanner scanner) {
        System.out.println("Encuentras un paso más seguro y cruzas el río con menos dificultad.");
        System.out.println("Riesgo acumulado: " + riesgoTotal);
        colina(scanner);
    }

    public static void caminoIzquierdo(Scanner scanner) {
        System.out.println("El camino izquierdo te lleva a una zona de arbustos densos.");
        System.out.println("Riesgo acumulado: " + riesgoTotal);
        System.out.println("1. Intentar atravesar los arbustos. (Riesgo: 2)");
        System.out.println("2. Volver al sendero principal. (Riesgo: 1)");

        int decision = scanner.nextInt();

        if (decision == 1) {
            riesgoTotal += 2;
            arbustos(scanner);
        } else if (decision == 2) {
            riesgoTotal += 1;
            adentrarseBosque(scanner);
        } else {
            System.out.println("Opción no válida. El juego ha terminado.");
        }
    }

    public static void caminoDerecho(Scanner scanner) {
        System.out.println("El camino derecho se vuelve más difícil de recorrer.");
        System.out.println("Riesgo acumulado: " + riesgoTotal);
        System.out.println("1. Continuar avanzando a pesar de las dificultades. (Riesgo: 4)");
        System.out.println("2. Buscar otro sendero menos complicado. (Riesgo: 2)");

        int decision = scanner.nextInt();

        if (decision == 1) {
            riesgoTotal += 4;
            colina(scanner);
        } else if (decision == 2) {
            riesgoTotal += 2;
            adentrarseBosque(scanner);
        } else {
            System.out.println("Opción no válida. El juego ha terminado.");
        }
    }

    public static void arbustos(Scanner scanner) {
        System.out.println("Logras atravesar los arbustos, pero quedas con heridas leves.");
        System.out.println("Riesgo acumulado: " + riesgoTotal);
        colina(scanner);
    }

    public static void refugio(Scanner scanner) {
        System.out.println("Encuentras refugio y descansas, reduciendo tu riesgo.");
        riesgoTotal -= 2;
        if (riesgoTotal < 0) riesgoTotal = 0;
        System.out.println("Riesgo acumulado: " + riesgoTotal);
        colina(scanner);
    }

    public static void colina(Scanner scanner) {
        System.out.println("Llegas a una colina con vista al bosque. Ves una salida cercana.");
        System.out.println("Riesgo acumulado: " + riesgoTotal);
        System.out.println("1. Correr hacia la salida sin preocuparte por los obstáculos. (Riesgo: 4)");
        System.out.println("2. Planificar tu ruta para minimizar el riesgo. (Riesgo: 2)");

        int decision = scanner.nextInt();

        if (decision == 1) {
            riesgoTotal += 4;
            decisionFinal(scanner);
        } else if (decision == 2) {
            riesgoTotal += 2;
            decisionFinal(scanner);
        } else {
            System.out.println("Opción no válida. El juego ha terminado.");
        }
    }
    public static void decisionFinal(Scanner scanner) {
        System.out.println("Mientras avanzas hacia la salida, el terreno se vuelve más irregular.");
        System.out.println("Riesgo acumulado: " + riesgoTotal);
        System.out.println("1. Saltar por una grieta para continuar avanzando. (Riesgo: 3)");
        System.out.println("2. Tomar un camino más largo pero seguro. (Riesgo: 1)");

        int decision = scanner.nextInt();

        if (decision == 1) {
            riesgoTotal += 3;
            salida(scanner);
        } else if (decision == 2) {
            riesgoTotal += 1;
            salida(scanner);
        } else {
            System.out.println("Opción no válida. El juego ha terminado.");
        }
    }

    public static void salida(Scanner scanner) {
        System.out.println("¡Finalmente llegas a la salida!");
        System.out.println("Riesgo acumulado: " + riesgoTotal);
        evaluarRiesgoFinal();
    }

    public static void evaluarRiesgoFinal() {
        if (riesgoTotal <= 10) {
            System.out.println("¡Éxito! Escapaste del bosque con bajo riesgo.");
        } else if (riesgoTotal <= 15) {
            System.out.println("¡Éxito! Escapaste del bosque con riesgo moderado.");
        } else {
            System.out.println("Fracaso: El riesgo acumulado fue demasiado alto, no logras escapar del bosque.");
        }
        System.exit(0);
    }
}
