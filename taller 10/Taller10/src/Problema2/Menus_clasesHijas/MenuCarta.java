package Problema2.Menus_clasesHijas;
import Problema2.Menu_Superclase_Y_Cuenta.Menu;

public class MenuCarta extends Menu {
    public double valorporcion;
    public double valorbebida;
    public double porcentajeadicional;

    public MenuCarta() {}
    public MenuCarta(String nombreplato, double valorinicialmenu,double valorporcion, double valorbebida, double porcentajeadicional) {
        super(nombreplato, valorinicialmenu);
        this.valorporcion = valorporcion;
        this.valorbebida = valorbebida;
        this.porcentajeadicional = porcentajeadicional;
    }

    public void ValorInicialMenu(){
        super.valorinicialmenu=super.valorinicialmenu+this.valorporcion+this.valorbebida+(super.valorinicialmenu*(this.porcentajeadicional/100));
    }
    public void CalcularValorMenu(){
        super.valormenu=super.valorinicialmenu;
    }
    public double getValorMenu(){
        return super.valormenu;
    }
    public double getValorporcion() {
        return valorporcion;
    }
    public void setValorporcion(double valorporcion) {
        this.valorporcion = valorporcion;
    }
    public double getValorbebida() {
        return valorbebida;
    }
    public void setValorbebida(double valorbebida) {
        this.valorbebida = valorbebida;
    }
    public double getPorcentajeadicional() {
        return porcentajeadicional;
    }
    public void setPorcentajeadicional(double porcentajeadicional) {
        this.porcentajeadicional = porcentajeadicional;
    }

    @Override
    public String toString() {
        return super.toString()+"MenuCarta{" + "valorporcion=" + valorporcion + ", valorbebida=" + valorbebida + ", porcentajeadicional=" + porcentajeadicional + '}';
    }
}