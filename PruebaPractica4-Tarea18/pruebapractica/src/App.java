import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        Scanner salida = new Scanner(System.in);
        Scanner lectura0 = new Scanner(System.in);
        
        System.out.println("Introduce la cantidad de Euros que quieres convertir: ");
        int b = lectura0.nextInt();

        do{
       
        System.out.println();

        System.out.println("Por favor, seleccione las divisas que quiere convertir introduciendo el número correspondiente");
            System.out.println("1- De euros a Dólares");
            System.out.println("2- De euros a Libras");
            System.out.println("3- De euros a Yenes");
            System.out.println("4- De euros a Todas las monedas");
        System.out.println();

             System.out.println( "Introduce el Ejercicio al que quieres ir");
             numero = lectura0.nextInt();
        
             System.out.println();

        switch (numero){


        case 1:
            
        System.out.println("Tus Euros en dólares son: ");
        System.out.println(App.convertirMonedas(b)[0]);
        break;


        case 2:

        System.out.println("Tus Euros en libras son: ");
        System.out.println(App.convertirMonedas(b)[1]);
        break;


    case 3:
        System.out.println("Tus Euros en Yenes son: ");
        System.out.println(App.convertirMonedas(b)[2]);
        break;

    case 4:
        System.out.println("Los euros convertidos son: " + App.convertirMonedas(b)[0] + " Dólares," + " "+ App.convertirMonedas(b)[1] + " Libras" + " " + App.convertirMonedas(b)[2] + " Yenes" );
        break;


    default:
        System.out.println("Ese caso no existe, introduce uno de los indicados");

        } 
        System.out.println(); 
        System.out.println("Has acabado, si introduces 0 el programa acabará y si introduces cualquier otro número volverás a hacer el ejercicio");
        numero = salida.nextInt();
    
    }while(numero != 0);
    

    
    lectura0.close();
    salida.close();
    
    }public static double[] convertirMonedas(double x){
        double[] resultado=new double[3];
        resultado[0]=(x*0.98);
        resultado[1]=(x*0.87);
        resultado[2]=(x*144.73);
        return resultado;
        }
   
}