package Uke35;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;


public class Program {

    public static void main(String ... args)      // hovedprogram
    {
       // int[] a =Tabell.randPerm(10);              // en tilfeldig tabell
       // for (int k : a) System.out.print(k + " ");  // skriver ut a

        //int m = Tabell.maks(a);   // finner posisjonen til største verdi

      //  System.out.println("\nStørste verdi ligger på plass " + m);
       // int[] a = Tabell.randPerm(10);
        //int[] c = null;

      //  Tabell.maks2(a,10,10);

     //   int[] a = Tabell.randPerm(10); // tilfeldig permutasjon av 1 . . 20
     //   int[] b = Tabell.nestMaks3(a);  // metoden returnerer en tabell

       // int m = b[0], nm = b[1];       // m for maks, nm for nestmaks

      //  Tabell.skriv2(a);        // se Oppgave 5 i Avsnitt 1.2.2
       // System.out.print("Størst(" + a[m] + ") har posisjon " + m);
      //  System.out.print(", nest størst(" + a[nm] + ") har posisjon " + nm);
        //for (int i:a){
       //     System.out.print(i+" ");
     //   }
      //  System.out.println();
      //  Tabell.sortering(a);
     //   for (int i:a){
     //       System.out.print(i+" ");
     //   }
    /*    int[] d = {2, 3, 6, 1 ,4 ,5};
        System.out.println(Arrays.toString(d));// permutasjon av tallene fra 1 til 10
        Tabell.nestePermutasjon(d);              // lager neste permutasjon
        System.out.println(Arrays.toString(d));
        Tabell.nestePermutasjon(d);              // lager neste permutasjon
        System.out.println(Arrays.toString(d));
        Tabell.nestePermutasjon(d);              // lager neste permutasjon
        System.out.println(Arrays.toString(d));
        Tabell.nestePermutasjon(d);              // lager neste permutasjon
        System.out.println(Arrays.toString(d));
        Tabell.nestePermutasjon(d);              // lager neste permutasjon
        System.out.println(Arrays.toString(d));
        Tabell.nestePermutasjon(d);              // lager neste permutasjon
        System.out.println(Arrays.toString(d));
        Tabell.nestePermutasjon(d);              // lager neste permutasjon
        System.out.println(Arrays.toString(d));
        Tabell.nestePermutasjon(d);              // lager neste permutasjon
        System.out.println(Arrays.toString(d));
        Tabell.nestePermutasjon(d);              // lager neste permutasjon
        System.out.println(Arrays.toString(d));
        Tabell.nestePermutasjon(d);              // lager neste permutasjon
        System.out.println(Arrays.toString(d));

    }
    */
     //   int[] a = {1, 3, 4, 4, 5, 7, 7, 7, 7, 8, 9, 10, 10, 12, 15, 15, 15};
     //   System.out.println(Tabell.binærsøk3d(a,4));
   /*     int[] a = Tabell.randPerm(100000);
        int[] b = a.clone();
        long tid1 =System.currentTimeMillis();
        Tabell.utvalgssortering(a);
        tid1=System.currentTimeMillis()-tid1;

        long tid2=System.currentTimeMillis();
        Tabell.innsettingssortering(b);
        tid2=System.currentTimeMillis()-tid2;

        System.out.println("Utvalgsortering har brukt: "+tid1);
        System.out.println("InsetningSortering har brukt: "+tid2);



        String[] s = {"Sohil","Per","Thanh","Fatima","Kari","Jasmin"};
        int k = Tabell.maks(s);        // hvilken maks-metode?
        System.out.println(s[k]);      // Utskrift:  Thanh

        String[] s = {"Per","Kari","Ole","Anne","Ali","Eva"};
        Tabell.innsettingssortering(s);
        System.out.println(Arrays.toString(s));  // [Ali, Anne, Eva, Kari, Ole, Per]

        Integer[] a = Tabell.randPermInteger(20);
        System.out.println(Arrays.toString(a));
        // En mulig utskrift: [7, 1, 8, 2, 10, 3, 4, 6, 5, 9]

        Tabell.innsettingssortering(a);
        System.out.println(Arrays.toString(a));
        // Utskrift: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    */
        int[] a = {5,2,7,3,9,1,8,10,4,6};          // en int-tabell
        eksempelKlasser.Heltall[] h = new eksempelKlasser.Heltall[a.length];       // en Heltall-tabell

        for (int i = 0; i < h.length; i++) h[i] = new eksempelKlasser.Heltall(a[i]);
        Tabell.innsettingssortering(h);           // generisk sortering
        System.out.println(Arrays.toString(h));   // utskrift

    }

}
