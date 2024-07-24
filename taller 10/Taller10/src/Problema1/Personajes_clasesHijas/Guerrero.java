package Problema1.Personajes_clasesHijas;
import Problema1.Personaje_Superclase.Personaje;

public class Guerrero extends Personaje{
    public int ataqueGuerrero;

    public Guerrero() {}
    public Guerrero(int ataqueGuerrero, int puntosvida, int nivelexp) {
        super(puntosvida, nivelexp);
        this.ataqueGuerrero = ataqueGuerrero;
    }
    public void atacar(Personaje personaje){
    if (super.puntosvida>0){
            personaje.defender(ataqueGuerrero);
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
        return "Guerrero{" +super.toString()+ "ataqueGuerrero=" + ataqueGuerrero + '}';
    }
}
