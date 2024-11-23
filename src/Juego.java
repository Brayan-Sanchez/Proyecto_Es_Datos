import java.util.Scanner;

public class Juego {
    static int riesgoTotal = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Te encuentras en el borde de un espeso bosque. ¿Qué decides hacer?");
        System.out.println("Riesgo asociado: 0");

        primeraDecision(scanner);
    }

    public static void primeraDecision(Scanner scanner) {
        System.out.println("1. Entras en el bosque, siguiendo un sendero que parece claro.");
        System.out.println("2. Vuelves y decides caminar por el borde del bosque, manteniéndote cerca de la seguridad.");
        int decision = scanner.nextInt();

        if (decision == 1) {
            riesgoTotal += 2;
            segundaDecision(scanner);
        } else {
            riesgoTotal += 1;
            bordeDelBosque(scanner);
        }
    }


    public static void bordeDelBosque(Scanner scanner) {
        System.out.println("Sigues caminando por el borde del bosque, pero te encuentras con un río.");
        System.out.println("Riesgo asociado: " + riesgoTotal);
        System.out.println("1. Decides cruzar el río.");
        System.out.println("2. Sigues buscando un lugar seguro para cruzar.");
        int decision = scanner.nextInt();

        if (decision == 1) {
            riesgoTotal += 3;
            cruzarRío(scanner);
        } else {
            riesgoTotal += 2;
            buscarOtroCamino(scanner);
        }
    }


    public static void segundaDecision(Scanner scanner) {
        System.out.println("Te adentras más en el bosque y encuentras una bifurcación.");
        System.out.println("Riesgo asociado: " + riesgoTotal);
        System.out.println("1. Tomas el camino hacia la izquierda, que parece más oscuro.");
        System.out.println("2. Tomas el camino hacia la derecha, donde el terreno parece más accidentado.");
        int decision = scanner.nextInt();

        if (decision == 1) {
            riesgoTotal += 3;
            caminoIzquierdo(scanner);
        } else {
            riesgoTotal += 4;
            caminoDerecho(scanner);
        }
    }


    public static void caminoIzquierdo(Scanner scanner) {
        System.out.println("El camino a la izquierda te lleva a una zona de arbustos densos.");
        System.out.println("Riesgo asociado: " + riesgoTotal);
        System.out.println("1. Tratas de atravesar los arbustos.");
        System.out.println("2. Decides retroceder y tomar el otro camino.");
        int decision = scanner.nextInt();

        if (decision == 1) {
            riesgoTotal += 2;
            zonaArbustos(scanner);
        } else {
            riesgoTotal += 1;
            segundaDecision(scanner);
        }
    }

    public static void caminoDerecho(Scanner scanner) {
        System.out.println("El terreno más accidentado te hace tropezar, pero logras avanzar.");
        System.out.println("Riesgo asociado: " + riesgoTotal);
        System.out.println("1. Sigues adelante a través de un sendero rocoso.");
        System.out.println("2. Decides descansar y esperar un momento.");
        int decision = scanner.nextInt();

        if (decision == 1) {
            riesgoTotal += 3;
            senderoRocoso(scanner);
        } else {
            riesgoTotal += 1;
            descanso(scanner);
        }
    }


    public static void zonaArbustos(Scanner scanner) {
        System.out.println("Logras atravesar los arbustos, pero te cortas con algunas ramas.");
        System.out.println("Riesgo asociado: " + riesgoTotal);
        System.out.println("1. Sigues caminando, pero el terreno es aún más denso.");
        System.out.println("2. Te detienes a curarte las heridas.");
        int decision = scanner.nextInt();

        if (decision == 1) {
            riesgoTotal += 3;
            zonaDensa(scanner);
        } else {
            riesgoTotal += 1;
            descanso(scanner);
        }
    }


    public static void senderoRocoso(Scanner scanner) {
        System.out.println("El sendero rocoso se hace cada vez más difícil. Caíste y te lastimaste.");
        System.out.println("Riesgo asociado: " + riesgoTotal);
        System.out.println("1. Sigues adelante a pesar de las heridas.");
        System.out.println("2. Decides volver atrás y buscar otro camino.");
        int decision = scanner.nextInt();

        if (decision == 1) {
            riesgoTotal += 4;
            zonaRoca(scanner);
        } else {
            riesgoTotal += 1;
            segundaDecision(scanner);
        }
    }


    public static void zonaRoca(Scanner scanner) {
        System.out.println("La zona rocosa está llena de grietas, pero sigues avanzando.");
        System.out.println("Riesgo asociado: " + riesgoTotal);
        System.out.println("1. Decides saltar por las grietas.");
        System.out.println("2. Te detienes a descansar en una cueva cercana.");
        int decision = scanner.nextInt();

        if (decision == 1) {
            riesgoTotal += 4;
            salida(scanner);
        } else {
            riesgoTotal += 2;
            descanso(scanner);
        }
    }


    public static void zonaDensa(Scanner scanner) {
        System.out.println("La zona se vuelve aún más densa, pero logras seguir adelante.");
        System.out.println("Riesgo asociado: " + riesgoTotal);
        System.out.println("1. Encuentras una salida parcial, pero es difícil cruzarla.");
        System.out.println("2. Sigues buscando una salida más segura.");
        int decision = scanner.nextInt();

        if (decision == 1) {
            riesgoTotal += 5;
            salida(scanner);
        } else {
            riesgoTotal += 2;
            salidaSegura(scanner);
        }
    }


    public static void salidaSegura(Scanner scanner) {
        System.out.println("Has encontrado una salida más fácil gracias a tus decisiones inteligentes.");
        System.out.println("Riesgo asociado: " + riesgoTotal);
        System.out.println("¡Puedes salir con bajo riesgo!");
        evaluarRiesgoFinal();
    }


    public static void salida(Scanner scanner) {
        System.out.println("¡Has llegado a una salida, pero es peligrosa de cruzar!");
        System.out.println("Riesgo asociado: " + riesgoTotal);
        System.out.println("¡Advertencia! El riesgo de cruzar la salida es alto.");
        System.out.println("1. Decides seguir adelante, a pesar del alto riesgo.");
        System.out.println("2. Decides regresar y buscar otro camino.");
        int decision = scanner.nextInt();

        if (decision == 1) {

            if (riesgoTotal < 10) {
                System.out.println("¡Gracias a tus decisiones inteligentes, logras salir sin mucho riesgo!");
                evaluarRiesgoFinal();
            } else {
                riesgoTotal += 5;
                evaluarRiesgoFinal();
            }
        } else {
            riesgoTotal += 2;
            zonaDensa(scanner);
        }
    }


    public static void descanso(Scanner scanner) {
        System.out.println("Te tomas un descanso y recuperas algo de energía.");
        System.out.println("Riesgo asociado: " + riesgoTotal);
        System.out.println("¡Tu riesgo se ha reducido un poco al descansar!");
        riesgoTotal -= 2;  // Reducción del riesgo en 2 unidades
        if (riesgoTotal < 0) riesgoTotal = 0;  // No permitir que el riesgo sea negativo
        System.out.println("1. Continúas buscando la salida.");
        System.out.println("2. Decides regresar al inicio.");
        int decision = scanner.nextInt();

        if (decision == 1) {
            zonaDensa(scanner);
        } else {
            primeraDecision(scanner);
        }
    }

    public static void cruzarRío(Scanner scanner) {
        System.out.println("Logras cruzar el río, pero te mojas completamente.");
        System.out.println("Riesgo asociado: " + riesgoTotal);
        System.out.println("1. Sigues adelante, pero te sientes exhausto.");
        System.out.println("2. Decides regresar y buscar otro camino.");
        int decision = scanner.nextInt();

        if (decision == 1) {
            riesgoTotal += 3;
            zonaRoca(scanner);
        } else {
            riesgoTotal += 2;
            bordeDelBosque(scanner);
        }
    }


    public static void buscarOtroCamino(Scanner scanner) {
        System.out.println("Te alejas del borde y buscas un camino más seguro.");
        System.out.println("Riesgo asociado: " + riesgoTotal);
        primeraDecision(scanner);
    }

    // Función para evaluar el riesgo final
    public static void evaluarRiesgoFinal() {
        if (riesgoTotal <= 15) {
            System.out.println("¡Éxito! Has logrado escapar del bosque con vida y bajo riesgo.");
            System.exit(0);
        } else if (riesgoTotal <= 18) {
            System.out.println("¡Éxito! Has logrado escapar del bosque, aunque con algo de riesgo.");
            System.exit(0);
        } else {
            System.out.println("Fracaso: El riesgo acumulado fue demasiado alto, no logras escapar del bosque.");
            System.exit(0);
        }
    }
}