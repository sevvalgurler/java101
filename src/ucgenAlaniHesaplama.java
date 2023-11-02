import java.util.Scanner;
public class alanHesaplama {
    public static void main (String []args){
        double a, b, c, u, alan ;
        Scanner girdi =new Scanner(System.in);
        System.out.println("birinci kenari giriniz: ");
        a = girdi.nextDouble();
        System.out.println("ikinci kenari giriniz: ");
        b = girdi.nextDouble();
        System.out.println("üçüncü kenari giriniz: ");
        c = girdi.nextDouble();

        u = (a+b+c)/2;
        alan = u * (u-a) * (u-b) * (u-c);
        System.out.println("ücgenin alanı: " + alan);

    }
}
