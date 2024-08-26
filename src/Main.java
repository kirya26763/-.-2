public class Main {
    public static void main(String[] args) {
        byte a = 127;
        short b = 32767;
        int c = 957875;
        long d = 9000000000000L;
        float x = 3.122F;
        double y = 12.27595;
        System.out.println("Значение переменной 'a' с типом byte равно " + a);
        System.out.println("Значение переменной 'b' с типом short равно " + b);
        System.out.println("Значение переменной 'c' с типом int равно " + c);
        System.out.println("Значение переменной 'd' с типом long равно " + d);
        System.out.println("Значение переменной 'x' с типом float равно " + x);
        System.out.println("Значение переменной 'y' с типом double равно " + y);


        float variable1 = 27.12F;
        long variable2 = 987678965549L;
        double variable3 = 2.786;
        short variable4 = 569;
        short variable5 = -159;
        int variable6 = 27897;
        byte variable7 = 67;


        byte classLyudmila = 23;
        byte classAnna = 27;
        byte classCatherine = 30;
        short totalSheets = 480;
        int sheetsStudent = totalSheets / (classLyudmila + classAnna + classCatherine);
        System.out.println("На каждого ученика рассчитано " + sheetsStudent + " листов бумаги");

        byte productivity2Minute = 16;
        int productivityMinute = productivity2Minute / 2;
        int productivity20Minute = productivityMinute * 20;
        int productivity24Hour = productivityMinute * 60 * 24;
        int productivity3Day = productivity24Hour * 3;
        int productivity30Day = productivity24Hour * 30;
        System.out.println("За 20 минут машина произвела " + productivity20Minute + " штук бутылок");
        System.out.println("За сутки машина произвела " + productivity24Hour + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivity3Day + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + productivity30Day + " штук бутылок");


        byte paintsSchool = 120;
        byte whitePaintsClass = 2;
        byte brownPaintsClass = 4;
        int paintsClass = whitePaintsClass + brownPaintsClass;
        int numberClasses = paintsSchool / paintsClass;
        int whitePaint = whitePaintsClass * numberClasses;
        int brownPaint = brownPaintsClass * numberClasses;
        System.out.println("В школе, где " + numberClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        byte weightBananas = 80;
        short weightMilk100ml = 105;
        byte weightPlombir1Briquettes = 100;
        byte weightEgg = 70;
        int weight5Bananas = weightBananas * 5;
        int weightMilk200ml = weightMilk100ml * 2;
        int weightPlombir2Briquettes = weightPlombir1Briquettes * 2;
        int weight4Egg = weightEgg * 4;
        int allWeightGramm = weight4Egg + weight5Bananas + weightPlombir2Briquettes + weightMilk200ml;
        double allWeightKg;
        allWeightKg = allWeightGramm / 1000.00;
        System.out.println(allWeightGramm + " грамм");
        System.out.println(allWeightKg + " кг");

        byte loseWeightKg = 7;
        short weightDayGramm = 250;
        short weightDeyAlternativGramm = 500;
        int loseWeightGramm = loseWeightKg * 1000;
        int dayLoseWeight = loseWeightGramm / weightDayGramm;
        int dayLoseWeightAlternative = loseWeightGramm / weightDeyAlternativGramm;
        System.out.println("для похудения потрбуется от " + dayLoseWeight + " до " + dayLoseWeightAlternative + " дней");

        float salaryMasha = 67760.00f;
        float salaryDenis = 83690.00f;
        float salaryKristina = 76230.00f;
        float newSalaryMasha = salaryMasha / 100 * 10 + salaryMasha;
        float newSalaryDenis = salaryDenis / 100 * 10 + salaryDenis;
        float newSalaryKristina = salaryKristina / 100 * 10 + salaryKristina;
        float annualIncomeMasha = salaryMasha * 12;
        float annualIncomeDenis = salaryDenis * 12;
        float annualIncomeKristina = salaryKristina * 12;
        float newAnnualIncomeMasha = newSalaryMasha * 12;
        float newAnnualIncomeDenis = newSalaryDenis * 12;
        float newAnnualIncomeKristina = newSalaryKristina * 12;
        float annualIncomeGrowthMasha = newAnnualIncomeMasha - annualIncomeMasha;
        float annualIncomeGrowthDenis = newAnnualIncomeDenis - annualIncomeDenis;
        float annualIncomeGrowthKristina = newAnnualIncomeKristina - annualIncomeKristina;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + annualIncomeGrowthMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + annualIncomeGrowthDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + annualIncomeGrowthKristina + " рублей");

    }
}