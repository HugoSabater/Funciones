package Ej3;

public class PuertaGaraje extends ElementoDomotico implements Bloqueable {
    private boolean puerta;

    public PuertaGaraje(String nombre) {
        super(nombre);
        this.puerta = true;
    }

    @Override
    protected void interruptor() {
        puerta = !estado();
    }

    @Override
    protected boolean estado() {
        return puerta;
    }

    @Override
    public void bloquear() {
        puerta = false;
    }

    @Override
    public String toString() {
        return "Puerta de Garaje { " + "nombre = " + super.toString() + " - abierto = " + puerta + '}';
    }
}
