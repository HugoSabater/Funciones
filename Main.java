package Ej3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ElementoDomotico> elemento = new ArrayList<>();
        elemento.add(new Ventana("Ventana principal"));
        elemento.add(new Ventana("Ventana de arriba"));
        elemento.add(new Calefaccion("Calefactor de abajo"));
        elemento.add(new Calefaccion("Calefactor de arriba"));
        elemento.add(new PuertaGaraje("Puerta de Garaje"));


        String a = elemento
                .stream()
                .sorted(Comparator.comparing(e -> e.getNombre()))
                .toList()
                .toString()
                .replace("[", " ").replace("]", "").replace(",", "\n");
                // Para separar los elementos (Visual-estético)

        System.out.println(a);
        System.out.println("*".repeat(20));

        // Cambia el estado de abierto para todos los ElementoDomotico
        elemento
                .stream()
                .forEach(ElementoDomotico::interruptor);

        // Vuelvo a evaluar elemento para actualizar abierto
        String b = elemento
                .stream()
                .sorted(Comparator.comparing(e -> e.getNombre()))
                .toList()
                .toString()
                .replace("[", " ").replace("]", "").replace(",", "\n");
        System.out.println(b);
    }
}
