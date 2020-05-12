package temalab12;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        LogicalOp op = new LogicalOp();
        Exer FastTRackIT = new Exer();
        int biggest = op.checkBiggerNumber(5,9);
        System.out.println("Suma este: " +calc.adunare(3,4));
        System.out.println("Diferenta este: " +calc.scadere(3,4));
        System.out.println("Produsul este: " +calc.inmultire(3,4));
        System.out.println("Catul este: " +calc.impartire(8,4));
        System.out.println("Numarul mai mare este : "+biggest);
        System.out. println("comparare nume: "+FastTRackIT.name("fasttrackit"));
        System.out.println("Afisare text si numar  " +FastTRackIT.masina(5 , "FastTrackIT"));
        System.out.println("Afisare text si numar  " +FastTRackIT.masina(2 , "FastTrackIT"));
        System.out.println("Afisare text si numar zapada " +FastTRackIT.zapada(2 ));
        System.out.println("Afisare text si numar zapada " +FastTRackIT.zapada(10 ));
        System.out.println("Afisare nr " +FastTRackIT.numere(5 ));
        System.out.println("Afisare nr " +FastTRackIT.numere(4 ));
        System.out.println("Afisare nr " +FastTRackIT.numere(2 ));
        FastTRackIT.swcase(4);
        System.out.println("Numarul este: " + FastTRackIT.adev(6));
        System.out.println("Drept de vot: " + FastTRackIT.vot(44));
        System.out.println("Numarul mai mare este: " + FastTRackIT.bignumber(5 , 8, 1));

        System.out.println("Tema DO-WHILE");

        op.osutanumere(90);
        op.negativnumar(-90);
        op.numaratoare(5 , 15);
        op.numaratoare_crescatoare(6, 3);
        op.numerepare();
        op.numereimpare();
        op.adunarenumere();
        op.mediediv7(15,2); //ceva nu e ok
        op.fibonacci(20);
        op.CozaLozaWoza(1,110);
        //FOR
        System.out.println("Tema FOR  ");

        op.fornumaratoaredela_plus100(90);
        op.fornumaratoarenegativa(90);
        op.fornumaratoaredelaAlaB(20,15);
        op.fornumaratoare(32,20);
        op.fordela1la100pare();
        op.forsumapanala100(90);
        //  op.fortipar();

    }

}
