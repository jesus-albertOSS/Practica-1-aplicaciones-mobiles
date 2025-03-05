package com.example;

public class Jugador {  // Nombre de clase corregido
    private String nombre;
    private int edad;
    private String posicion;
    private int numeroCamiseta;
    private String equipo;

    // Constructor dentro de la clase
    public Jugador(String nombre, int edad, String posicion, int numeroCamiseta, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
        this.equipo = equipo;
    }
//-----------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//------------------------------------------------------------

    // Corregir el método getEquipo
    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
//------------------------------------------------------------
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
 //-------------------------------------------------------------
 public int getNumerodeCamiseta() {
    return numeroCamiseta;
}

public void setNumerodeCamiseta(int numeroCamiseta) {
    this.numeroCamiseta = numeroCamiseta;
}

//-------------------------------------------------------------

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Posición: " + posicion);
        System.out.println("Número de Camiseta: " + numeroCamiseta);
        System.out.println("Equipo: " + equipo);
    }
}
