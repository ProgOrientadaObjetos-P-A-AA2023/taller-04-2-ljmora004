
package problema04;

public class Cliente {
    private String nombres;
    private String apellidos;
    private String cedula;

    public Cliente() {
        nombres = "Jose Roberto";
        apellidos = "Bustamente Flores";
        cedula = "110562380";
    }
    
    public Cliente(String noms, String apes, String ced) {
        nombres = noms;
        apellidos = apes;
        cedula = ced;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public void establecerNombres(String h) {
        nombres = h;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public void establecerApellidos(String h) {
        apellidos = h;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerCedula(String h) {
       cedula = h;
    }
    
    
    
    
}
