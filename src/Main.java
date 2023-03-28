public class Main {

    // metoda konieczna do startu aplikacji w java:
    public static void main(String[] args) {

        // wyświetlanie na konsoli napisu HELLO! :
        System.out.println("HELLO!");

        // TYPY DANYCH:
        System.out.println(10);                 // liczby całkowite (int, byte, short, long)
        System.out.println(4.7);                // liczby zmiennoprzecinkowe (float, double)
        System.out.println("jakiś tekst");      // tekst - String
        System.out.println('%');                // znak - char
        System.out.println(true);               // prawda - boolean
        System.out.println(false);              // fałsz - boolean

        // ZMIENNE:
        int number;    // deklaracja zmiennej (typ_zmiennej nazwa_zmiennej;)
        number = 17290;   // przypisanie wartości do zmiennej, inicjalizacja zmiennej
        System.out.println(number); // wyświetlenie zmiennej

        double doubleNumber = 14.73;     // deklaracja zmiennej z jednoczesnym przypisaniem do niej wartości
        System.out.println(doubleNumber);

        String someText = "Piszemy tekst";   // typ tekstowy - String - pisany z dużej litery
        System.out.println(someText);

        char someChar = '@';    // typ znaku
        System.out.println(someChar);

        boolean trueValue = true;      // typ boolean
        System.out.println(trueValue);

        boolean falseValue = false;
        System.out.println(falseValue);

        // OPERATORY MATEMATYCZNE
        System.out.println(10 + 10);        // dodawanie
        System.out.println(10 - 10);        // odejmowanie
        System.out.println(10 / 10);        // mnożenie
        System.out.println(10.0 / 4.0);    // dzielenie (musimy używać liczb zmiennoprzecinkowych, żeby w wyniku otrzymać
                                            // również liczbę zmiennoprzecinkową

        // OPERATORY PORÓWNANIA
        int a = 1;
        int b = 2;
        System.out.println(a > b);      // a większe od b
        System.out.println(a < b);      // a mniejsze od b
        System.out.println(a == b);     // a jest równe b (podwójny znak =)
        System.out.println(a != b);     // a nie jest równe b
        // w odpowiedzi dostajemy wartość boolean true albo false

        // OPERATORY LOGICZNE
        // || - lub - zwraca true, jeśli którekolwiek ze sprawdzanych wyrażeń ma wartość true
        System.out.println(a > b || a == 1);    // fałsz || prawda -> prawda
        System.out.println(a > b || a != 1);    // fałsz || fałsz -> fałsz
        System.out.println(a < b || a == 1);    // prawda || nie jest sprawdzana -> prawda
        // && - i - zwraca true, jeśli każde ze sprawdzanych wyrażeń ma wartość true
        System.out.println(a < b && a == 1);    // prawda && prawda -> prawda
        System.out.println(a < b && a != 1 );   // prawda && fałsz -> fałsz
        System.out.println(a > b && a == 1);    // fałsz && prawda -> fałsz



    }

}