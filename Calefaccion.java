package Ej3;

public class Calefaccion extends ElementoDomotico {
    private double temperatura;
    private boolean abierto;

    public Calefaccion(String nombre) {
        super(nombre);
        this.temperatura = 28;
        this.abierto = true;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    protected void interruptor() {
        abierto = !estado();
    }

    @Override
    protected boolean estado() {
        return abierto;
    }

    @Override
    public String toString() {
        return "Calefacción {" + " nombre = " + super.toString() + " - temperatura = " + temperatura + " - abierto = " + abierto + '}';
    }
}
