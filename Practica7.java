import java.util.*;

public class Practica7 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int ceros=0, pares=0, impares=0, porcentajePares=0, porcentajeImpares=0, porcentajeCeros=0;
    int num;
    for (int i=1;i<=15;i++){
        num=((int)(Math.random()*37));
        System.out.println("El numero Aleatorio es "+num);
        if (num==0){
            ceros+=1;   
        }else{
            if (num%2==0){
                pares+=1;
            }else{
                impares+=1;
            }
        }
    }
    porcentajePares=(pares*100)/15;
    porcentajeImpares=(impares*100)/15;
    porcentajeCeros=(ceros*100)/15;
    System.out.println("El porcentaje de números pares es "+porcentajePares+"%");
    System.out.println("El porcentaje de números impares es "+porcentajeImpares+"%");
    System.out.println("El porcentaje de ceros es "+porcentajeCeros+"%");
}
}