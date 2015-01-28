
package agrupcarnaval;


public class AgrupCarnaval {

   
    public static void main(String[] args) {
        //Ejemplo con el metodo constructor
        AgrupacionCarnaval carnaval = new AgrupacionCarnaval("Directos",1,"Selu","Cela",18);
        AgrupacionCarnaval carnaval3 = new AgrupacionCarnaval("Directos",1,"Selu","Cela",18);
        //Ejemplo con el metodo constructor faltando parametros
        AgrupacionCarnaval carnaval2 = new AgrupacionCarnaval("",4,"Miguel","Nora",14);
        //Probar si son correctos(isCorrecto())
        System.out.println("");
        System.out.println("Comprobación de llamada correcta");
        System.out.println(carnaval2.isCorrecto());
        //Usar metodo puntuar/Obtener puntuacion
        System.out.println("");
        System.out.println("Asignación de puntuacion (1)");
        System.out.println(carnaval.puntuar(90));
        System.out.println(carnaval.getPuntuacion());
        //Usar metodo puntuar asignando a cada parte de la actuacion/Obtener puntuacion
        System.out.println("");
        System.out.println("Asignación de puntuacion (2)");
        System.out.println(carnaval3.puntuar(5,15,15,40));
        System.out.println(carnaval3.getPuntuacion());
        //Mostrar resultado
        carnaval.toResultado();
    }
    
}
