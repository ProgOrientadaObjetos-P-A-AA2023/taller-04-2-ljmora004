
package problema02;

public class Maestro {
    
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    private Provincia provincia;

    public Maestro(){   
        nombre = "Roberto";
        apellido = "Bustamante";
        sueldoBasico = 460.33;
        cedula = "110335689";
        provincia = new Provincia();
    
    }
    
    public Maestro(String nom, String ap, double sueldoB, String ced,
            Provincia prov) {
        nombre = nom;
        apellido = ap;
        sueldoBasico = sueldoB;
        cedula = ced;
        provincia = prov;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerApellido(String n) {
        apellido = n;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public void establecerSueldoBasico(double n) {
        sueldoBasico = n;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public void calcularSueldoTotal() {
        double valorAdd = (sueldoBasico * 20)/100;
        sueldoTotal = sueldoBasico + valorAdd;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public Provincia obtenerProvincia() {
        return provincia;
    }

    public void establecerProvincia(Provincia n) {
        provincia = n;
    }
    
    

    @Override
    public String toString() {
        String m = String.format("\n\t---Maestro: %s %s---\n"
                + "\tProvincia: %s\n\tCon número de habitantes: %d\n\n"
                + "\tNro. Cedula: %s\n"
                + "\tSueldo Basico: $%.2f\n"
                + "\tSueldo total: $%.2f\n",
                nombre,
                apellido,
                provincia.obtenerNombre(),
                provincia.obtenerNroHabitantes(),
                cedula,
                sueldoBasico,
                sueldoTotal);
        
        return m;
    }
    
    
    
    
}