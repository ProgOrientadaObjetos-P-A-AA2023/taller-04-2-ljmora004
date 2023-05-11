
package problema04;

public class Cheque {

    private Cliente cliente;
    private Banco banco;
    private double valorCheque;
    private double comision;

    public Cheque() {
        cliente = new Cliente();
        banco = new Banco();
        valorCheque = 3600.33;
    }

    public Cheque(Cliente clien, Banco ban, double valC) {
        cliente = clien;
        banco = ban;
        valorCheque = valC;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public void establecerCliente(Cliente c) {
        cliente = c;
    }

    public Banco obtenerBanco() {
        return banco;
    }

    public void establecerBanco(Banco c) {
        banco = c;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public void establecerValorCheque(double c) {
        valorCheque = c;
    }

    public double obtenerComision() {
        return comision;
    }

    public void calcularComision() {
        double valorAdd = (valorCheque * 0.003)/100;
        comision = valorCheque * valorAdd;
    }

    @Override
    public String toString() {
        String m = String.format("""
                                 -------- Cheque ------
                                 Cliente: %s %s
                                 Cédula: %s
                                 
                                 + Banco: %s
                                    Sucursales: %d
                                 ----------------------
                                 + Valor: $%.2f
                                 + Comision: $%.2f
                                 
                                 """,
                cliente.obtenerNombres(),
                cliente.obtenerApellidos(),
                cliente.obtenerCedula(),
                banco.obtenerNombre(),
                banco.obtenerSucursales(),
                valorCheque,
                comision);
        
        return m;
    }
    
    
    
    

}