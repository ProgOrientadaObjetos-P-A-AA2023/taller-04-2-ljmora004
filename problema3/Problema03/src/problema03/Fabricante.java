
package problema03;

public class Fabricante {
    private String nombre;
    private String ciudad;

    public Fabricante() {
        nombre = "Toyota";
        ciudad = "Tokyo";
    }

    
    public Fabricante(String nom, String city) {
        nombre = nom;
        ciudad = city;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String g) {
        nombre = g;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public void setCiudad(String g) {
        ciudad = g;
    }
    
    
    
    
}
