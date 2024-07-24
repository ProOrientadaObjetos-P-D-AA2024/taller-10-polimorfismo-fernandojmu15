package Problema2.Ejecutor;

import Problema2.Menu_Superclase_Y_Cuenta.Cuenta;
import Problema2.Menu_Superclase_Y_Cuenta.Menu;
import Problema2.Menus_clasesHijas.MenuCarta;
import Problema2.Menus_clasesHijas.MenuDia;
import Problema2.Menus_clasesHijas.MenuNinos;
import Problema2.Menus_clasesHijas.MenuEconomico;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor001 {
    public static void main(String[] args) {
        ArrayList<Menu> menus= new ArrayList<>();
        Scanner entrada = new Scanner (System.in);
        System.out.println("Menú Para Niños");
        System.out.println("Ingrese: Nombre Primer Plato, Valor Menú, Valor Porción Helado, Porción Pastel");
        menus.add(new MenuNinos(entrada.next(),entrada.nextDouble(),entrada.nextDouble(),entrada.nextDouble()));
        System.out.println("Ingrese: Nombre Segundo Plato, Valor Menú, Valor Porción Helado, Porción Pastel");
        menus.add(new MenuNinos(entrada.next(),entrada.nextDouble(),entrada.nextDouble(),entrada.nextDouble()));
        System.out.println("Menú Económico");
        System.out.println("Ingrese: Nombre Plato, Valor Menú, Porcentaje Descuento");
        menus.add(new MenuEconomico(entrada.next(), entrada.nextDouble(),entrada.nextDouble()));
        System.out.println("Menú del Día");
        System.out.println("Ingrese: Nombre Plato, Valor Menú, Valor Postre, Valor Bebida");
        menus.add(new MenuDia(entrada.next(),entrada.nextDouble(),entrada.nextDouble(),entrada.nextDouble()));
        System.out.println("Menú Carta");
        System.out.println("Ingrese: Nombre Plato, Valor Menú, Valor Porción, Valor Bebida, Porcentaje adicional");
        menus.add(new MenuCarta(entrada.next(),entrada.nextDouble(),entrada.nextDouble(),entrada.nextDouble(),entrada.nextDouble()));
        for (Menu valormenu:menus) {
            valormenu.ValorInicialMenu();
            valormenu.CalcularValorMenu();
        }
        Cuenta cuenta= new Cuenta("Iván González",8);
        for(Menu valormenu: menus){
            cuenta.calcularSubtotal(valormenu.getValorMenu());
        }
        cuenta.calcularValorCancelar();
        cuenta.setMenus(menus);
        System.out.println(cuenta);
    }
}