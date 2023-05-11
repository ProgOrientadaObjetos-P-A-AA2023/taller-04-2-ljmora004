
package problema04;

public class Banco {
    private String nombre;
    private int sucursales;

    public Banco() {
        nombre = "Bolivariano";
        sucursales = 20;
    }
    
    public Banco(String nom, int suc) {
        nombre = nom;
        sucursales = suc;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String q) {
        nombre = q;
    }

    public int obtenerSucursales() {
        return sucursales;
    }

    public void establecerSucursales(int q) {
        sucursales = q;
    }
    
    
}
