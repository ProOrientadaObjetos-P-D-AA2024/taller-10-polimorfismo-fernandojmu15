package Problema1.Personajes_clasesHijas;
import Problema1.Personaje_Superclase.Personaje;

public class Arquero extends Personaje{
    public int ataqueArquero;

    public Arquero() {}
    public Arquero(int ataqueArquero, int puntosvida, int nivelexp) {
        super(puntosvida, nivelexp);
        this.ataqueArquero = ataqueArquero;
    }
    public void atacar(Personaje personaje){
    if (super.puntosvida>0){
            personaje.defender(ataqueArquero);
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
        return "Arquero{" + super.toString()+"ataqueArquero=" + ataqueArquero + '}';
    }
}


