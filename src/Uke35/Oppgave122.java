package Uke35;

public class Oppgave122 {
    public static void main(String[] args) {
        int [] a={1,7,6,5,4,3,2,0};
        System.out.println(min(a,0,8));
        System.out.println(min(a));
    }
    public static int min(int[] a, int fra, int til)
    {
        if (fra < 0 || til > a.length || fra >= til)
        {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;
        int minstverdi = a[fra];
        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] <minstverdi)
            {
                m = i;
                minstverdi = a[m];
            }
        }

        return m;
    }
    public static int min(int [] a){
        return min(a,0,a.length);
    }

}
