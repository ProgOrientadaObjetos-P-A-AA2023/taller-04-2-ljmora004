
package problema03;

public class Automotor {

    private String cedPropietario;
    private int anioFab;
    private double valor;
    private double valorMatricula;
    private Fabricante fabricante;

    public Automotor() {
        cedPropietario = "456ab789";
        anioFab = 2022;
        valor = 123000.56;
        fabricante = new Fabricante();
    }

    public Automotor(String cedulaP, int anioF, double val,
            Fabricante fab) {

        cedPropietario = cedulaP;
        anioFab = anioF;
        valor = val;
        fabricante = fab;
    }

    public String obtenerCedPropietario() {
        return cedPropietario;
    }

    public void establecerCedPropietario(String a) {
        cedPropietario = a;
    }

    public int obtenerAnioFab() {
        return anioFab;
    }

    public void establecerAnioFab(int a) {
        anioFab = a;
    }

    public double obtenerValor() {
        return valor;
    }

    public void establecerValor(double a) {
        valor = a;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    public void calcularValorMatricula() {
        double valorAdd = (valor * 0.002) / 100;
        int antiguedad = 2023 - anioFab;
        
        valorMatricula = valorAdd * antiguedad;
    }

    public Fabricante obtenerFabricante() {
        return fabricante;
    }

    public void establecerFabricante(Fabricante a) {
        fabricante = a;
    }
    
    

    @Override
    public String toString() {
        String m = String.format("""
                                 Vehiculo:
                                 Fabricante: %s\nCon ciudad de origen: %s
                                 *------------------------------------*
                                 | Cedula Propietario: %s
                                 | Año Fabricacion: %d
                                 | Valor: $%.2f
                                 | Valor Matricula: $%.2f
                                 *------------------------------------*
                                 """,
                fabricante.obtenerNombre(),
                fabricante.obtenerCiudad(),
                cedPropietario,
                anioFab,
                valor,
                valorMatricula);
        
        return m;
    }
    
    

}