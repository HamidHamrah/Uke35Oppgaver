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
        Student[] s = new Student[5];  // en Studenttabell

        s[0] = new Student("Kari", "Svendsen", Studium.Data);    // Kari Svendsen
        s[1] = new Student("Boris", "Zukanovic", Studium.IT);    // Boris Zukanovic
        s[2] = new Student("Ali", "Kahn", Studium.Anvendt);      // Ali Kahn
        s[3] = new Student("Azra", "Zukanovic", Studium.IT);     // Azra Zukanovic
        s[4] = new Student("Kari", "Pettersen", Studium.Data);   // Kari Pettersen
        Tabell.innsettingssortering(s);                     // Programkode 1.4.2 e)
        for (Student t : s) System.out.println(t);
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
        Elektor("Ingeniørfag - elektronikk og informasjonsteknologi");

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

}
