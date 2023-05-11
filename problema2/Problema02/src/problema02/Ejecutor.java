
package problema02;

public class Ejecutor {

    public static void main(String[] args) {
        
        Provincia provincia01 = new Provincia("Azuay", 1000000);
        
        Maestro maestro01 = new Maestro();
        Maestro maestro02 = new Maestro("Oliver", "Saraguro",
                145.33, "1104687", provincia01);
        
        maestro01.calcularSueldoTotal();
        maestro02.calcularSueldoTotal();
        
        System.out.printf("%s\n%s\n", maestro01, maestro02);
    }
    
}