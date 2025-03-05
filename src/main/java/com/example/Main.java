package com.example;

import com.example.Jugador;

public class Main {
    public static void main(String[] args) {
    Jugador jugador1 = new Jugador("Juan Pérez", 25, "Delantero", 10, "Rojos FC");
    Jugador jugador2 = new Jugador("Ana Gómez", 22, "Portero", 1, "Azules SC");

    jugador1.mostrarInformacion();
    jugador2.mostrarInformacion();

    jugador1.setEdad(26);
    jugador2.setEquipo("Verdes United");
    jugador2.setNombre("María Guillen");


    jugador1.mostrarInformacion();
    jugador2.mostrarInformacion();


    
    }
    
}