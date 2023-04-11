public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();
    }
    public static void task1 () {
        System.out.println("Задача1");
        int a = 2;
        byte b = 113;
        short c = 154;
        long d = 523158L;
        float f = 3.5f;
        double g = 12.5;
        System.out.println("Значение переменной a с типом int равно"  + a);
        System.out.println("Значение переменной b с типом byte равно"  + b);
        System.out.println("Значение переменной c с типом short равно"  + c);
        System.out.println("Значение переменной d с типом long равно"  + d);
        System.out.println("Значение переменной f с типом float равно"  + f);
        System.out.println("Значение переменной g с типом double равно"  + g);
    }
    public static void task2 () {
        System.out.println("Задача2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        int f = -159;
        short g = 27897;
        byte h = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
    public static void task3 () {
        System.out.println("Задача3");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        int students = teacher1 + teacher2 + teacher3;
        short AllSheets = 480;
        long SheetsStudents = AllSheets / students;
        System.out.println("На каждого ученика расчитано" + SheetsStudents + "листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача4");
        byte minutes2 = 16;
        short bottles1 = 20 / 2;
        int minutes20Bottles = minutes2 * bottles1;
        System.out.println("За 20 минут машина произвела" + minutes20Bottles + "штук бутылок");
        short minutesDay = 24 * 60;
        int DayBottles = minutesDay / 2;
        System.out.println("За сутки машина произвела" + DayBottles + "штук бутылок");
        int minutes3Day = minutesDay * 3;
        int Day3Bottles = minutes3Day / 2;
        System.out.println("За трое суток машина произвела" + Day3Bottles + "штук бутылок");
        int minutes31Day = minutesDay * 31;
        long Day31Bottles = minutes31Day / 2;
        System.out.println("За месяц машина произвела" + Day31Bottles + "штук бутылок");
    }
    public static void  task5 () {
        System.out.println("Задача5");
        byte AllPots = 120;
        byte WhitePots = 2;
        byte BrownPots = 4;
        int ClassPots1 = WhitePots + BrownPots;
        int AllClass = AllPots / ClassPots1;
        long AllWhite = AllClass * WhitePots;
        long AllBrown = AllClass * BrownPots;
        System.out.println("В школе, где" + AllClass + "классов, нужно" + AllWhite + "банок белой краски и" + AllBrown + "банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача6");
        byte bananas = 5;
        int GramsBananas = bananas * 80;
        byte milk100 = 105;
        int Milk200 = milk100 * 2;
        byte IceCream = 2;
        int GramsIceCream = IceCream * 100;
        byte eggs = 4;
        int GramsEggs = eggs * 70;
        int BreakfastGrams = GramsBananas + Milk200 + GramsIceCream + GramsEggs;
        float Kilograms = BreakfastGrams / 1000f;
        System.out.println("Вес завтрака" + BreakfastGrams + "граммов или" + Kilograms + "килограмм");
    }
    public static void task7 () {
        System.out.println("Задача7");
        byte kiloGrams = 7;
        int grams = kiloGrams * 1000;
        int days1 = 250;
        int days2 = 500;
        int time1 = grams / days1;
        int time2 = grams / days2;
        long middle = (time1 + time2) / 2L;
        System.out.println("Терять по" + days1 + "грамм - уйдёт" + time1 + "дней, а терять по" + days2 + "уйдёт" + time2);
        System.out.println("В среднем потребуется" + middle + "дней");
    }
    public static void task8 () {
        System.out.println("Задача8");
        int cashMasha = 67760;
        int cashDenis = 83690;
        int cashKristina = 76230;
        int yearCash1 = cashMasha * 12;
        int yearCash2 = cashDenis * 12;
        int yearCash3 = cashKristina * 12;
        int percent1 = cashMasha * 10 / 100;
        int NewCash1 = cashMasha + percent1;
        int salaryMasha = NewCash1 * 12;
        int differenceMasha = salaryMasha - yearCash1;
        System.out.println("Маша теперь получает" + NewCash1 + "рублей. Годовой доход вырос на" + differenceMasha + "рублей" );
        int percent2 = cashDenis * 10 / 100;
        int NewCash2 = cashDenis + percent2;
        int salaryDenis = NewCash2 * 12;
        int differenceDenis = salaryDenis - yearCash2;
        System.out.println("Денис теперь получает" + NewCash2 + "рублей. Годовой доход вырос на" + differenceDenis + "рублей");
        int percent3 = cashKristina * 10 / 100;
        int NewCash3 = cashKristina + percent3;
        int salaryKristina = NewCash3 * 12;
        int differenceKristinas = salaryKristina - yearCash3;
        System.out.println("Кристина теперь получает" + NewCash3 + "рублей. Годовой доход вырос на" + differenceKristinas + "рублей");
    }
}
