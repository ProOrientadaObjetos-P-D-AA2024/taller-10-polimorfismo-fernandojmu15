package Problema1.Ejecutor;
//Fernando Muñoz 
//Max Ontaneda

import java.util.ArrayList;
import java.util.Scanner;

import Problema1.Personaje_Superclase.Personaje;
import Problema1.Personajes_clasesHijas.Guerrero;
import Problema1.Personajes_clasesHijas.Arquero;
import Problema1.Personajes_clasesHijas.Mago;

public class Ejecutor {
    public static void main(String[] args) {
        ArrayList<Personaje>personajes=new ArrayList<>();
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese los Datos del GUERRERO");
        System.out.println("Ingrese: Ataque, Puntos de Vida, Nivel de Experiencia");
        personajes.add(new Guerrero(entrada.nextInt(),entrada.nextInt(),entrada.nextInt()));
        System.out.println("Ingrese los Datos del ARQUERO");
        System.out.println("Ingrese: Ataque, Puntos de Vida, Nivel de Experiencia");
        personajes.add(new Arquero(entrada.nextInt(),entrada.nextInt(),entrada.nextInt()));
        System.out.println("Ingrese los Datos del Mago");
        System.out.println("Ingrese: Ataque, Puntos de Vida, Nivel de Experiencia");
        personajes.add(new Mago(entrada.nextInt(),entrada.nextInt(),entrada.nextInt()));
        System.out.println("-----COMIENZA LA MATANZA-----");
        boolean interruptor=true;
        int contador=1;
        /**
         * Presentamos los Personajes con sus Valores Iniciales
         */
        for(Personaje personaje: personajes){
            System.out.println("Personaje "+contador);
            System.out.println(personaje);
            contador++;
        }
        /**
         * Guerrero vs Arquero
         */
        boolean guerra= true;
        int ganador=-1;
        String sobreviviente="null";
        while(guerra){
            System.out.println("El Guerrero ATACARÁ al Arquero ");
            personajes.get(0).atacar(personajes.get(1));
            if (!personajes.get(1).getvida()){
                System.out.println("El Guerrero ganó");
                ganador=0;
                sobreviviente="Guerrero";
                break;
            }
            System.out.println("EL Arquero ATACARÁ al Guerrero");
            personajes.get(1).atacar(personajes.get(0));

            if(!personajes.get(0).getvida()){
                System.out.println("El Arquero ganó");
                ganador=1;
                sobreviviente="Arquero";
                break;
            }
        }
        /**
         * El sobreviviente vs el Mago
         */
        System.out.println("El "+ sobreviviente +" se enfrentará al Mago");
        while(guerra){
            System.out.println(sobreviviente+ " Atacará al Mago");
            personajes.get(ganador).atacar(personajes.get(2));
            if (!personajes.get(2).getvida()){
                System.out.println("El "+sobreviviente+ "ganó");
                break;
            }
            System.out.println( "El Mago Atacará al "+sobreviviente);
            personajes.get(2).atacar(personajes.get(ganador));
            if(!personajes.get(ganador).getvida()){
                System.out.println("El Mago ganó");
                ganador=2;
                sobreviviente="Mago";
                break;
            }
        }
        /**
         *Subimos de Nivel al Ganador
         */
        personajes.get(ganador).subirnivel();
        System.out.println("El Ganador es "+sobreviviente+" Y subió al nivel"+personajes.get(ganador).nivelexp);
        /**
         * Los valores de Cada Personaje Después de la Batalla
         */
        System.out.println("Después de la Batalla los Personajes presentan los siguientes Datos");
        contador=1;
        for(Personaje presentar:personajes){
            System.out.println("Personaje "+contador);
            System.out.println(presentar);
            contador++;
        }
    }
}
