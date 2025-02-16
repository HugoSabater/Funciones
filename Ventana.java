package Ej3;

public class Ventana extends ElementoDomotico implements Bloqueable{
    private boolean abrir;

    public Ventana(String nombre) {
        super(nombre);
        abrir = true;
    }

    @Override
    protected void interruptor() {
        abrir = !estado();
    }

    @Override
    protected boolean estado() {
        return abrir;
    }

    @Override
    public void bloquear() {
        abrir = false;
    }

    @Override
    public String toString() {
        return "Ventana { " + "nombre = " + super.toString() + " - abierto = " + abrir + '}';
    }
}
