package Problema2.Menus_clasesHijas;
import Problema2.Menu_Superclase_Y_Cuenta.Menu;

public class MenuDia extends Menu {
    public double valorpostre;
    public double valorbebida;

    public MenuDia() {}
    public MenuDia(String nombreplato, double valorinicialmenu, double valorpostre, double valorbebida) {
        super(nombreplato, valorinicialmenu);
        this.valorpostre = valorpostre;
        this.valorbebida = valorbebida;
    }
  
    public void ValorInicialMenu(){
        super.valorinicialmenu=this.valorinicialmenu+(this.valorpostre+this.valorbebida);
    }
    public void CalcularValorMenu(){
        super.valormenu=super.valorinicialmenu;
    }
    public double getValorMenu(){
        return super.valormenu;
    }

    public double getValorpostre() {
        return valorpostre;
    }
    public void setValorpostre(double valorpostre) {
        this.valorpostre = valorpostre;
    }
    public double getValorbebida() {
        return valorbebida;
    }
    public void setValorbebida(double valorbebida) {
        this.valorbebida = valorbebida;
    }

    @Override
    public String toString() {
        return super.toString()+"MenuDia{" + "valorpostre=" + valorpostre + ", valorbebida=" + valorbebida + '}';
    }
}
