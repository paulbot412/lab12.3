package temalab12;

public class LogicalOp {
    int checkBiggerNumber(int a, int b){
        if(a>b){
            return a;
        }
        else {
            return b;
        }

    }
    // DO-WHILE
    public void osutanumere(int a){
        int i=a;
        do {
            System.out.println(i);
            i++;
        }while (i<=100);

    }
    public void negativnumar(int a){
        int i=a;
        do {
            System.out.println(i);
            i--;
        }while (i>=-100);

    }
    public void numaratoare(int a, int b){
        int i=a;
        do {
            System.out.println(i);
            i++;
        }while (i<=b);

    }
    public void numaratoare_crescatoare(int a, int b){
        if(a<b) {
            int i = a;
            do {
                System.out.println(i);
                i++;
            } while (i <= b);
        }
        else {
            int i=b;
            do {
                System.out.println(i);
                i++;
            } while (i <= a);
        }

    }
    public void numerepare(){
        int i=0;
        do {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i<=100);
    }
    public void numereimpare(){
        int i=0;
        do{
            if(i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }while (i<=100);
    }

    public void adunarenumere(){
        int rez=0;
        float medie;
        int i=111;
        int j=1;
        do{
            int rezint=rez;
            rez =rezint+j;
            j++;

        }while (j<=8899);
        medie=rez/(8899-111);
        System.out.println("rezultat adunare: "+rez);
        System.out.println("rezultat medie: " +medie);
    }
    public void mediediv7(int a, int b){
        float medie;
        int sum=0;
        int x=0;
        if(b<a){
            a=x;
            b=a;
            b=x;
            int j=a;
            do {
                if(j % 7 == 0){
                    int rezint=sum;
                    sum =rezint+j;
                }
                j++;


            }while(j<=b);
            medie=sum/7;
            System.out.println("Media cifrelor mod 7 este: "+medie);
        }
        else {
            int j=0;
            a=j;
            do {
                if(j % 7 == 0){
                    int rezint=sum;
                    sum =rezint+j;
                }

                j++;
            }while(j<=b);
            medie=sum/j;
            System.out.println("Media cifrelor mod 7 este: "+medie);
        }

    }
    public void fibonacci(int a){
        int n1=0,n2=1,n3;
        int i=2;
        System.out.println("Primele "+a+" numere ale lui Fibonacci sunt: ");
        System.out.print(n1+" "+n2);

        do {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            i++;
        }while(i<=a);
    }
    public void CozaLozaWoza(int a, int b) {

        do {
            if (a % 15 == 0 || a % 3 == 0 && a % 7 == 0 || a % 5 == 0 && a % 7 == 0 || a % 3 == 0 && a % 5 == 0 && a % 7 == 0) {
                if (a % 3 == 0 && a % 7 == 0) {
                    System.out.println("CozaWoza, ");
                }
                if (a % 3 == 0 && a % 5 == 0) {
                    System.out.println("CozaLoza, ");
                }
                if (a % 5 == 0 && a % 7 == 0) {
                    System.out.println("WozaLoza, ");
                }
                if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0) {
                    System.out.println("CozaLozaWoza, ");
                }

            } else {
                if (a % 7 == 0) {
                    System.out.println("Wooza, ");
                }
                else {
                    if (a % 5 == 0) {
                        System.out.println("Loza, ");
                    }
                    else {
                        if (a % 3 == 0) {
                            System.out.println("Coza, ");
                        } else {
                            System.out.println(+a);
                        }
                    }}}


            a++;

        }while (a<=b+1);
    }

    // FOR

    public void fornumaratoaredela_plus100(int a){
        System.out.println("numaratoare de la A pana la A+100 ");
        for(int i=a; i<a+101; i++){
            System.out.println(i);
        }

    }
    public void fornumaratoarenegativa(int a){
        System.out.println("Numaratoare de la A pana la -100");
        for(int i=a; i >= -100; i--){
            System.out.println(i);
        }
    }

    public void fornumaratoaredelaAlaB(int a, int b){
        System.out.println("Numaratoare de la A la B");
        if(a<b){
            for (int i=a; i<b+1;i++){
                System.out.println(i);
            }
        }
        else {
            for(int i=a; i>b-1; i--){
                System.out.println(i);
            }
        }
    }

    public void fornumaratoare(int a, int b){
        System.out.println("Numaratoare de la A la B crescator");
        if(a<b){
            for(int i=a; a<b+1; i++){
                System.out.println(i);
            }
        }
        else {
            for(int i=b; i<=a+1; i++){
                System.out.println(i);
            }
        }

    }
    public void fordela1la100pare(){
        System.out.println("Numere pare pana la 100");
        for(int i=1; i<101; i++){
            if(i%2==0){
                System.out.println( +i);
            }

        }
        System.out.println("Numere impare pana la 100");
        for(int i=1; i<101; i++){
            if(i%2!=0) {
                System.out.println( +i);
            }
        }
    }

    public void forsumapanala100(int a){
        int suma = 0;
        int rez_intermediar=0;
        float media;
        for(int i=a; i<101; i++){
            suma=rez_intermediar;
            rez_intermediar=suma+i;
        }
        media=suma/(100-a);
        System.out.println("Suma numerelor de la " +a+ " pana la 100 este: "+suma);
        System.out.println("Media numerelor de la "+a+" pana la 100 este: "+media);

    }

    // public void fortipar(){
    //    char t='*';
    //    for(int i=7; i>=1; i--){
    //       String rez;
    //        int rezultatint=Character.getNumericValue(t);

//              int rezultatfinal=rezultatint*j;
    //        rez=String.valueOf(rezultatfinal);
    //          System.out.printf("%4d", rez);
    //        }


    //      }

    // am facut primul for pe care l-am testat si merge de la 7 la 1
    // in al 2-lea for nu stiu cum sa inmultesc un char sau un String cu un int si sa imi returneze sirul de * pe care
    // vrem sa il vedem.
    //la fel si la problema  10 din tema WHILE nu am reusit sa afisez pe o linie mai multe valori.
}
