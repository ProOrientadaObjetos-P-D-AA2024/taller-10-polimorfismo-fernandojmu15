package Problema1.Personajes_clasesHijas;
import Problema1.Personaje_Superclase.Personaje;

public class Mago extends Personaje {
    public int ataqueMago;

    public Mago() {}
    public Mago(int ataqueMago, int puntosvida, int nivelexp) {
        super(puntosvida, nivelexp);
        this.ataqueMago = ataqueMago;
    }
    public void atacar(Personaje personaje){
    if (super.puntosvida>0){
            personaje.defender(ataqueMago);
        }else{
        System.out.println("El personaje está muerto");
    }
    }
    public void defender(int deterioro){
     if (super.puntosvida>0){
            super.puntosvida=super.puntosvida-deterioro;
        }
    }
    public void subirnivel(){
        this.nivelexp=this.nivelexp+1;
    }
    public boolean getvida(){
         if (super.puntosvida>0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Mago{" + super.toString()+"ataqueMago=" + ataqueMago + '}';
    }
}
