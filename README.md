# Proyecto: Bosque Oscuro - Juego de Decisiones

## Descripción

**Bosque Oscuro** es un juego de aventura interactivo donde el jugador toma decisiones que afectan el curso de la historia. El jugador se encuentra atrapado en un espeso bosque y debe tomar decisiones que influyen en su riesgo de escape. A lo largo del juego, las decisiones se ramifican, y el jugador debe elegir sabiamente para escapar con el menor riesgo posible.

El juego utiliza estructuras de datos como un árbol binario para representar las decisiones del jugador, con el objetivo de hacer la experiencia más dinámica y desafiante.

- **Lenguaje**: Java 22
- **IDE recomendado**: IntelliJ IDEA

## Requisitos de instalación

1. **Java**: El proyecto está desarrollado en **Java 22**. Asegúrate de tener **Java 22** o superior instalado, y el JDK de la última versión.
   
2. **IDE**: Se puede utilizar cualquier IDE compatible con Java, pero se recomienda **IntelliJ IDEA** para facilitar la ejecución del código.

## Instrucciones de ejecución

1. Clona o descarga el código del proyecto.
2. Abre el código en tu IDE favorito (por ejemplo, IntelliJ IDEA).
3. Ejecuta la clase `BosqueOscuro.java` para comenzar a jugar.

## Funcionalidades

- **Riesgo acumulado**: A medida que el jugador toma decisiones, el riesgo asociado aumenta. Si el riesgo total es muy alto, el jugador podría no sobrevivir.
- **Decisiones ramificadas**: A lo largo del juego, el jugador enfrenta decisiones que lo llevan por diferentes caminos. Dependiendo de las elecciones, el resultado puede variar.
- **Escape del bosque**: El objetivo es escapar del bosque con vida y con el menor riesgo posible. Si el riesgo es demasiado alto, el jugador no logra escapar.

## Ejemplo de Juego

A continuación, se muestra un ejemplo de cómo el jugador interactúa con el juego:

```text
Te encuentras en el borde del bosque. ¿Qué decides hacer?
1. Entras al bosque, siguiendo un sendero claro. (Riesgo: 2)
2. Caminas por el borde del bosque, cerca de la seguridad. (Riesgo: 1)

Decisión: 1

Entras al bosque, siguiendo un sendero claro.
Riesgo acumulado: 2

1. Tomas el camino a la izquierda, oscuro y tenebroso. (Riesgo: 3)
2. Tomas el camino a la derecha, accidentado pero iluminado. (Riesgo: 4)

Decisión: 1

Te adentras más en el bosque y encuentras una bifurcación...

