package Problema2.Menus_clasesHijas;
import Problema2.Menu_Superclase_Y_Cuenta.Menu;

public class MenuEconomico extends Menu {
    public double porcentajedescuento;
    
    public MenuEconomico() {}
    public MenuEconomico(String nombreplato, double valorinicialmenu, double porcentajedescuento) {
        super(nombreplato, valorinicialmenu);
        this.porcentajedescuento = porcentajedescuento;
    }
    
    public void ValorInicialMenu(){
        super.valorinicialmenu=super.valorinicialmenu+(super.valorinicialmenu-(super.valorinicialmenu*(this.porcentajedescuento/100)));
    }
    public void CalcularValorMenu(){
        super.valormenu=super.valorinicialmenu;
    }
    public double getValorMenu(){
        return super.valormenu;
    }

    public double getPorcentajedescuento() {
        return porcentajedescuento;
    }
    public void setPorcentajedescuento(double porcentajedescuento) {
        this.porcentajedescuento = porcentajedescuento;
    }

    @Override
    public String toString() {
        return super.toString()+"MenuEconomico{" + "porcentajedescuento=" + porcentajedescuento + '}';
    }
}
