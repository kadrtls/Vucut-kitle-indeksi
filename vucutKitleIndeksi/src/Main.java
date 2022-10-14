import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy,vcd;
        Scanner scanner=new Scanner(System.in);
        System.out.println("kilonuzu giriniz");
        kilo= scanner.nextInt();
        System.out.println("boyunuzu m cinsinden giriniz");
        boy= scanner.nextDouble();

        vcd=kilo/(boy*boy);
        if (vcd<=18.4){
            System.out.println("vücut kitle indeksi"+vcd+"   ZAYIF");
        }else if(18.5<vcd && vcd<=24.9) {
            System.out.println("vücut kitle indeksi"+vcd+"   NORMAL");
        }else if (25<vcd && vcd<=29.9) {
            System.out.println("vücut kitle indeksi"+vcd+"   FAZLA KİLOLU");
        }else if (30<vcd && vcd<=34.9) {
            System.out.println("vücut kitle indeksi"+vcd+"   1.derece OBEZ");
        }else if (35<vcd && vcd<=44.9) {
            System.out.println("vücut kitle indeksi"+vcd+"   2.derece OBEZF");
        }else if (45<vcd) {
            System.out.println("vücut kitle indeksi"+vcd+"   3.derece OBEZ");
        }
    }
}