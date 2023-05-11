
package problema04;

public class Ejecutor {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Luis Javier", "Mora Aguilar", 
                "1102377895");
        Banco banco = new Banco("Banco de Loja", 12);
        
        Cheque cheque01 = new Cheque();
        Cheque cheque02 = new Cheque(cliente, banco, 456486.33);
        
        cheque01.calcularComision();
        cheque02.calcularComision();
        
        System.out.printf("%s\n%s\n", cheque01, cheque02);
    }
    
}