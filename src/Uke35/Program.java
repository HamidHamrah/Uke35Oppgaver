package Uke35;

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
        int[] d = {2, 3, 6, 1 ,4 ,5};
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

}
