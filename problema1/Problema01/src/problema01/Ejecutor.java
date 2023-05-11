package problema01;

public class Ejecutor {

    public static void main(String[] args) {
        
        Universidad universidad01 = 
                new Universidad("Universidad Nacional de Loja",
                        "Calle 95..");
        
        Estudiante estudiante01 = new Estudiante();
        Estudiante estudiante02 = new Estudiante("Luis", 10, 9.5,
                7, universidad01);
        
        estudiante01.calcularPromedio();
        estudiante02.calcularPromedio();
        
        System.out.printf("%s\n%s\n", estudiante01, estudiante02);
    }
    
}