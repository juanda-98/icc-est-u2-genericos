import models.Caja;
import models.Par;

public class App {
    public static void main(String[] args) throws Exception {

        Caja<String> cajaS = new Caja<>();
        cajaS.setT("Hola Mundo");

        Caja<Integer> cajaI = new Caja<>();
        cajaI.setT(100);
        
        Caja<Double> cajaD = new Caja<>();
        cajaD.setT(9.75);

        
        Par<Integer, String> par = new Par<>();
        par.setK(1);
        par.setV("Juan Perez");

        Par<String, Integer> par2 = new Par<>();
        par2.setK("Edad");
        par2.setV(20);

        Par<String, Double> par3 = new Par<>();
        par3.setK("Promedio");
        par3.setV(8.75);


        System.out.println("=== Practica de Clases Genericas ===");
        System.out.println("");
        
        System.out.println("--- Uso de Caja<T> ---");
        System.out.println("Caja de texto: " + cajaS.getT());
        System.out.println("Caja de entero: " + cajaI.getT());
        System.out.println("Caja de decimal: " + cajaD.getT());
        System.out.println("La caja de texto esta vacia: " + cajaS.estaVacia());
        System.out.println("");

        System.out.println("--- Uso de Par<K, V> ---");   
        System.out.println("Clave: " + par.getK() + " | Valor: " + par.getV());
        System.out.println("Clave: " + par2.getK() + " | Valor: " + par2.getV());
        System.out.println("Clave: " + par3.getK() + " | Valor: " + par3.getV());
    }
}
