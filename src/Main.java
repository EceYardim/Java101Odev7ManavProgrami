import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımlayalım.
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5;
        double akg, ekg, dkg, mkg, pkg;
        //Kullanıcıdan kilo değerlerini alalım.
        Scanner inp=new Scanner(System.in);
        System.out.print( "Armut kilo değerini giriniz:");
        akg=inp.nextDouble();
        System.out.print( "Elma kilo değerini giriniz:");
        ekg=inp.nextDouble();
        System.out.print( "Domates kilo değerini giriniz:");
        dkg=inp.nextDouble();
        System.out.print( "Muz kilo değerini giriniz:");
        mkg=inp.nextDouble();
        System.out.print( "Patlıcan kilo değerini giriniz:");
        pkg=inp.nextDouble();
        double total=(akg*armut)+(ekg*elma)+(dkg*domates)+(mkg*muz)+(pkg*patlican);
        System.out.print( "Genel Toplam:" +total);


    }
}
