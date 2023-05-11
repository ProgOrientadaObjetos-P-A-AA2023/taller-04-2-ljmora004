
package problema01;

public class Universidad {
    
    private String nombre;
    private String direccion;

    public Universidad() {
        nombre = "UTPL";
        direccion = "Calle Marcelino Champagnat...";
    }

    public Universidad(String nom, String dir) {
        nombre = nom;
        direccion = dir;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String d) {
        nombre = d;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public void establecerDireccion(String d) {
        direccion = d;
    }
    
    
    
}
