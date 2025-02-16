package Ej3;

public abstract class ElementoDomotico {
    private String nombre;

    public ElementoDomotico(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    protected abstract void interruptor();
    protected abstract boolean estado();

    @Override
    public String toString() {
        return nombre;
    }
}
