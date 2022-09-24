package Uke35;

import java.util.Arrays;
import java.util.Objects;

public class eksempelKlasser {
    public static void main(String[] args) {
       /* Person[] p = new Person[5];                   // en persontabell

        p[0] = new Person("Kari","Svendsen");         // Kari Svendsen
        p[1] = new Person("Boris","Zukanovic");       // Boris Zukanovic
        p[2] = new Person("Ali","Kahn");              // Ali Kahn
        p[3] = new Person("Azra","Zukanovic");        // Azra Zukanovic
        p[4] = new Person("Kari","Pettersen");        // Kari Pettersen

        int m = Tabell.maks(p);                       // posisjonen til den største
        System.out.println(p[m] + " er størst");      // skriver ut den største

        Tabell.innsettingssortering(p);               // generisk sortering
        System.out.println(Arrays.toString(p));       // skriver ut sortert


        for (Studium s : Studium.values())
        {
            System.out.println(s.toString() + " (" + s.name() + ")");
        }
        for (Måned m : Måned.høst())
        {
            System.out.println(m.toString() + " (" + m.name() + ") " + m.mndnr());
        }
        */
        Person[] p = new Person[5];                       // en persontabell
        p[0] = new Person("Kari", "Svendsen");            // Kari Svendsen
        p[1] = new Person("Boris", "Zukanovic");          // Boris Zukanovic
        p[2] = new Person("Ali", "Kahn");                 // Ali Kahn
        p[3] = new Person("Azra", "Zukanovic");           // Azra Zukanovic
        p[4] = new Person("Kari", "Pettersen");           // Kari Pettersen

        class FornavnKomparator implements Komparator<Person>
        {
            public int compare(Person p1, Person p2)        // to personer
            {
                return p1.fornavn().compareTo(p2.fornavn());  // sammenligner fornavn
            }
        }

        Komparator<Person> c = new FornavnKomparator();   // en instans av klassen
      //  Tabell.innsettingssortering(p, c);                // se Programkode 1.4.6 b)

     //   System.out.println(Arrays.toString(p));           // Utskrift av tabellen p
        // [Ali Kahn, Azra Zukanovic, Boris Zukanovic, Kari Svendsen, Kari Pettersen]

     //   Tabell.innsettingssortering(p, (p1,p2) -> p1.fornavn().compareTo(p2.fornavn()));
     //   System.out.println(Arrays.toString(p));
    
    }
    public static final class Heltall implements Comparable<Heltall>
    {
        private final int verdi;    // et heltall som instansvariabel

        public Heltall(int verdi) { this.verdi = verdi; }   // konstruktør

        public int intVerdi() { return verdi; }             // aksessor

        public int compareTo(Heltall h)        // Heltall som parameter
        {
            return verdi < h.verdi ? -1 : (verdi == h.verdi ? 0 : 1);
        }

        public boolean equals(Object o)
        {
            if (o == this) return true;   // sammenligner med seg selv
            if (!(o instanceof Heltall)) return false;  // feil datatype
            return verdi == ((Heltall)o).verdi;
        }

        public boolean equals(Heltall h) { return verdi == h.verdi; }

        public int hashCode() { return 31 + verdi; }

        public String toString() { return Integer.toString(verdi); }

    } // class Heltall
    public static class Person implements Comparable<Person>
    {
        private final String fornavn;         // personens fornavn
        private final String etternavn;       // personens etternavn

        public Person(String fornavn, String etternavn)   // konstruktør
        {
            Objects.requireNonNull(fornavn, "fornavn er null");
            Objects.requireNonNull(etternavn, "etternavn er null");
            this.fornavn = fornavn;
            this.etternavn = etternavn;
        }

        public String fornavn() { return fornavn; }       // aksessor
        public String etternavn() { return etternavn; }   // aksessor

        public int compareTo(Person p)    // pga. Comparable<Person>
        {
            int cmp = etternavn.compareTo(p.etternavn);     // etternavn
            if (cmp != 0) return cmp;             // er etternavnene ulike?
            return fornavn.compareTo(p.fornavn);  // sammenligner fornavn
        }

        public boolean equals(Object o)      // vår versjon av equals
        {
            if (o == this) return true;
            if (!(o instanceof Person)) return false;
            return compareTo((Person)o) == 0;
        }

        public int hashCode() { return Objects.hash(etternavn, fornavn); }

        public String toString() { return fornavn + " " + etternavn; }

    }
    public enum Studium  // legges under package eksempelklasser
    {
        Data ("Ingeniørfag - data"),         // enumkonstanten Data
        IT ("Informasjonsteknologi"),        // enumkonstanten IT
        Anvendt ("Anvendt datateknologi"),   // enumkonstanten Anvendt
        Enkeltemne ("Enkeltemnestudent"),    // enumkonstanten Enkeltemne
        Elektro("Ingeniørfag - elektronikk og informasjonsteknologi");

        private final String fulltnavn;      // instansvariabel
        private Studium(String fulltnavn) { this.fulltnavn = fulltnavn; }

        public String toString() { return fulltnavn; }
    }
    public enum Måned
    {
        JAN (1, "januar"),
        FEB (2, "februar"),
        MAR (3, "mars"),
        APR (4, "april"),
        MAI (5, "mai"),
        JUN (6, "juni"),
        JUL (7, "juli"),
        AUG (8, "august"),
        SEP (9, "september"),
        OKT (10, "oktober"),
        NOV (11, "november"),
        DES (12, "desember");

        private final int mndnr;
        private final String fulltnavn;

        private Måned(int mndnr, String fulltnavn)
        {
            this.mndnr = mndnr;
            this.fulltnavn = fulltnavn;
        }

        public int mndnr() { return mndnr; }

        @Override public String toString() { return fulltnavn; }

        public static String toString(int mnd)
        {
            if (mnd < 1 || mnd > 12) throw
                    new IllegalArgumentException("Ulovlig måndesnummer!");

            return values()[mnd - 1].toString();
        }

        public static Måned[] vår()
        {
            return Arrays.copyOfRange(values(),3,5);
        }

        public static Måned[] sommer()
        {
            return Arrays.copyOfRange(values(),5,8);
        }

        public static Måned[] høst()
        {
            return Arrays.copyOfRange(values(),8,10);
        }

        public static Måned[] vinter()
        {
            return new Måned[] { NOV, DES, JAN, FEB, MAR };
        }
    }
    public static class Student extends Person   // Student blir subklasse til Person
    {
        private final Studium studium;      // studentens studium

        public Student(String fornavn, String etternavn, Studium studium)
        {
            super(fornavn, etternavn);
            this.studium = studium;
        }

        public String toString() { return super.toString() + " " + studium.name();}

        public Studium studium() { return studium; }

    }  // class Student
    // Komparator
    public interface Funksjon<T,R>    // T for argumenttype, R for returtype
    {
        R anvend(T t);
    }
    public interface Komparator<T>      // et funksjonsgrensesnitt
    {
        // Den abstrakte metoden:

        int compare(T o1, T o2);

        // Statiske metoder:

        public static <T extends Comparable<? super T>> Komparator<T> naturligOrden()
        {
            return (x,y) -> x.compareTo(y);
        }

        public static <T extends Comparable<? super T>> Komparator<T> omvendtOrden()
        {
            return (x, y) -> y.compareTo(x);
        }

        public static <T, R extends Comparable<? super R>>
        Komparator<T> orden(Funksjon<? super T, ? extends R> velger)
        {
            return (x, y) -> velger.anvend(x).compareTo(velger.anvend(y));
        }

        public static <T, R> Komparator<T> orden
                (Funksjon<? super T, ? extends R> velger, Komparator<? super R> c)
        {
            return (x, y) -> c.compare(velger.anvend(x), velger.anvend(y));
        }

        // Default metoder

        default Komparator<T> deretter(Komparator<? super T> c)
        {
            return (x, y) ->
            {
                int k = compare(x, y);
                return k != 0 ? k : c.compare(x, y);
            };
        }

        default <R extends Comparable<? super R>>
        Komparator<T> deretter(Funksjon<? super T, ? extends R> velger)
        {
            return (x, y) ->
            {
                int k = compare(x, y);
                return k != 0 ? k : velger.anvend(x).compareTo(velger.anvend(y));
            };
        }

        default <R> Komparator<T>
        deretter(Funksjon<? super T, ? extends R> velger, Komparator<? super R> c)
        {
            return (x, y) ->
            {
                int k = compare(x, y);
                return k != 0 ? k : c.compare(velger.anvend(x), velger.anvend(y));
            };
        }

        default Komparator<T> omvendt()
        {
            return (x, y) -> compare(y, x);  // bytter x og y
        }

    } // Komparator

}
