package Problema2.Menu_Superclase_Y_Cuenta;
import java.util.ArrayList;

public class Cuenta {
    public String nombrecliente;
    public ArrayList<Menu> menus;
    public double valorcancelartotal;
    public double subtotal;
    public double iva;

    public Cuenta() {}
    public Cuenta(String nombrecliente, double iva) {
        this.nombrecliente = nombrecliente;
        this.iva=iva;
    }
    
    public void calcularSubtotal(double subtotal){
        this.subtotal=this.subtotal+subtotal;
    }
    public void calcularValorCancelar(){
        this.valorcancelartotal=this.subtotal+(this.subtotal*(this.iva/100));
    }
    public void setMenus(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nombrecliente=" + nombrecliente + ", menus=" + menus + ", valorcancelartotal=" + valorcancelartotal + ", subtotal=" + subtotal + ", iva=" + iva + '}';
    }
}