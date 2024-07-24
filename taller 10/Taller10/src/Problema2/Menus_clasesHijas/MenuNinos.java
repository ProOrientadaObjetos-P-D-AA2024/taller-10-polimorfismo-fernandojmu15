package Problema2.Menus_clasesHijas;
import Problema2.Menu_Superclase_Y_Cuenta.Menu;

public class MenuNinos extends Menu {
    public double porcionhelado;
    public double porcionpastel;

    public MenuNinos() {}
    public MenuNinos(String nombreplato, double valorinicialmenu, double porcionhelado, double porcionpastel) {
        super(nombreplato, valorinicialmenu);
        this.porcionhelado = porcionhelado;
        this.porcionpastel = porcionpastel;
    }
    
    public void ValorInicialMenu(){
        super.valorinicialmenu=this.valorinicialmenu+(this.porcionhelado+this.porcionpastel);
    }
    public void CalcularValorMenu(){
        super.valormenu=super.valorinicialmenu;
    }
    public double getValorMenu(){
        return super.valormenu;
    }
    public double getPorcionhelado() {
        return porcionhelado;
    }
    public void setPorcionhelado(double porcionhelado) {
        this.porcionhelado = porcionhelado;
    }
    public double getPorcionpastel() {
        return porcionpastel;
    }
    public void setPorcionpastel(double porcionpastel) {
        this.porcionpastel = porcionpastel;
    }

    @Override
    public String toString() {
        return super.toString()+"MenuNinos{" + "porcionhelado=" + porcionhelado + ", porcionpastel=" + porcionpastel + '}';
    }
  
}