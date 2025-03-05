# Respuestas del cuestionario:
```java
public class Jugador {
    private String nombre;
    private int edad;
    private String posicion;
    private int numeroCamiseta;
    private String equipo;
}
```


## ¿Qué representa esta clase? ¿Qué información contiene?
 Representa a un jugador de un equipo deportivo y contiene información básica sobre el jugador, como su nombre, edad, posición en el equipo, número de camiseta y el nombre del equipo al que pertenece
 
 *** 

 ```java

public Jugador(String nombre, int edad, String posicion, int numeroCamiseta, String equipo) {
    this.nombre = nombre;
    this.edad = edad;
    this.posicion = posicion;
    this.numeroCamiseta = numeroCamiseta;
    this.equipo = equipo;
}
```
## ¿Por qué es importante inicializar los atributos al crear un objeto? ¿Qué pasaría si no usáramos un constructor?

Es importante inicializar los atributos de un objeto porque asegura que cada uno de ellos tenga un valor válido cuando el objeto se crea sin el constructor, tendriamos que ir agregando la información del jugador poco a poco después de crearlo.

## ¿Qué otros métodos podrían ser útiles para la clase Jugador?

Algunos métodos útiles para la clase Jugador podrían ser  un método cambiarPosicion para actualizar la posición del jugador,un método transferirEquipo para cambiar de equipo, un método compararEdad para comparar edades con otros jugadores.

## ¿Qué aprendiste al crear y utilizar objetos? ¿Cómo cambia el estado de un objeto cuando usamos métodos set?

Al crear y utilizar objetos, aprendí que los objetos son instancias de una clase, y cada objeto tiene su propio conjunto de atributos y métodos y al estar trabajando con estos objetos, podemos almacenar y modificar datos de manera organizada.

Cuando usamos un método set, cambiamos el valor de un atributo del objeto, lo que actualiza su estado y refleja el nuevo valor.



