package Problema1.Personaje_Superclase;

public abstract class Personaje {
    public int puntosvida;
    public int nivelexp;

    public Personaje() {}
    public Personaje(int puntosvida, int nivelexp) {
        this.puntosvida = puntosvida;
        this.nivelexp = nivelexp;

    }
    public abstract void atacar(Personaje personaje);
    public abstract void defender(int deterioro);
    public abstract void subirnivel();
    public abstract boolean getvida();

    @Override
    public String toString() {
        return "Personaje{" + "puntosvida=" + puntosvida + ", nivelexp=" + nivelexp + '}';
    }
}

