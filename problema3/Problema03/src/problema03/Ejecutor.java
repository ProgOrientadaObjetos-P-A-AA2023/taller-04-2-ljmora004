
package problema03;

public class Ejecutor {

    public static void main(String[] args) {
        
        Fabricante fab = new Fabricante("Hyundai", "Seul");
        
        Automotor auto01 = new Automotor();
        Automotor auto02 = new Automotor("89564k01d",
                1989, 23500.2, fab);
        
        auto01.calcularValorMatricula();
        auto02.calcularValorMatricula();
        
        System.out.printf("%s\n%s\n", auto01, auto02);
    }
    
}