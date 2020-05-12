package temalab12;

public class Exer {
    public String b = "FastTrackIT";

    String name(String a) {
        if (a.equals(b)) {
            String rez = "Sunt la fel!";
            return rez;
        } else {
            String rez = "Nu sunt la fel!";
            return rez;
        }
    }

    String masina(int b, String a) {
        if (b <= 3 && a.equals(b)) {
            String rez = a;
            String sp = " ";
            int n= b;
            String total = rez + sp + n;
            return String.valueOf(total);
        }


        else {
            String w = b + "  " + a;
            return String.valueOf(w);

        }


    }
    String zapada(int b) {
        if ( b == 6 || b > 8  ) {
            String rez = "The amount of snow this winter was(cm):";
            String sp = " ";
            int n= b;
            String total = rez + sp + n;
            return String.valueOf(total);
        }


        else {
            String w = "The forecast snow is(cm)";
            int n = b;
            String total = w + " " + b;
            return String.valueOf(total);

        }


    }
    String numere(int b) {


        if (b < 3) {
            String w = "The number is lower than 3";
            return w;
        } else {
            if (b > 3) {
                if (b == 4) {
                    String w = "The number is equal to 4";
                    return w;
                } else {
                    String rez = "The number is greater than 3 and not equal to 4";
                    return rez;
                }
            }

        }
        return null;
    }

    int swcase(int a){
        System.out.println("Numarul introdus este " +a +"!");

        switch (a){
            case 1:
                System.out.println("Numarul este " + 1);
                break;
            case 2:
                System.out.println("Numarul este " + 2);
                break;
            case 3:
                System.out.println("Numarul este " + 3);
                break;
            case 4:
                System.out.println("Numarul este " + 4);
                break;
        }
        return 0;
    }

    boolean adev (int a){
        if( a % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    boolean vot (int a){
        if( a <18){
            System.out.println("Nu are drept de vot! " + a +"de ani!");
            return false;
        }
        else {
            System.out.println("Are drept de vot! " + a + "de ani!");
            return true;

        }

    }
    int bignumber(int a, int b, int c){
        if (c>a && c>b){
            return c;
        }
        else {
            if (a > b && a > c) {
                return a;
            }
            if (b > a && b > c) {
                return b;
            }
        }
        return 0;

    }

}
