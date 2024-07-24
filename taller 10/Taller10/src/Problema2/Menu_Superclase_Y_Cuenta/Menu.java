package Problema2.Menu_Superclase_Y_Cuenta;
public abstract class Menu {
    public String nombreplato;
    public double valormenu;
    public double valorinicialmenu;

    public Menu() {}
    public Menu(String nombreplato, double valorinicialmenu) {
        this.nombreplato = nombreplato;
        this.valorinicialmenu=valorinicialmenu;
    }
    public abstract void ValorInicialMenu();
    public abstract void CalcularValorMenu();
    public abstract double getValorMenu();

    @Override
    public String toString() {
        return "Menu{" + "nombreplato=" + nombreplato + ", valormenu=" + valormenu + ", valorinicialmenu=" + valorinicialmenu + '}';
    }
}

