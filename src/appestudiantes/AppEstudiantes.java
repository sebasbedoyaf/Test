
package appestudiantes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AppEstudiantes {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double prom = 0;
        double dscto = 0;
        double vtotal = 0;
        int cred = 0;
        int P = 0;
        System.out.println("Ingrese promedio: ");
        prom = Double.parseDouble(br.readLine()); 
        System.out.println("Ingrese 1 para Pregrado y 2 para Posgrado: ");
        P= Integer.parseInt(br.readLine()); 
        Estudiantes v = new Estudiantes (); 
        v.cred = cred;
        v.vcredpre = 50000;
        v.vcredpos = 300000;
        v.prom = prom;
        v.vtotal = vtotal;
        v.P = P;
        v.Pagar();
        if (prom <=2.5)
        {
          System.out.println("No se puede matricular");  
        }
        System.out.println("Los creditos que puede matricular son: " + v.cred);
        System.out.println("El descuento es de: " + v.dscto + "%");
        System.out.println("El total a pagar es: " + v.vtotal);
    }
}
