public class Main {

  public static void main(String[] args) {
    System.out.println("Задача №1");
    byte byteVar = 4;
    short shortVar = 20000;
    int intVar = 1000000000;
    long longVar = 40000000000000L;
    float floatVar = 1.5f;
    double doubleVar = 1.123456789;
    System.out.println("Значение переменной byteVar c типом равно" + " " + byteVar);
    System.out.println("Значение переменной shortVar c типом равно" + " " + shortVar);
    System.out.println("Значение переменной intVar c типом равно" + " " + intVar);
    System.out.println("Значение переменной longVar c типом равно" + " " + longVar);
    System.out.println("Значение переменной floatVar c типом равно" + " " + floatVar);
    System.out.println("Значение переменной doubleVar c типом равно" + " " + doubleVar);
    System.out.println();

    System.out.println("Задача №2");
    float floatVar2 = 27.12f;
    long longVar2 = 987678965549L;
    float floatVar3 = 2.786f;
    short shortVar3 = 569;
    short shortVar4 = -159;
    short shortVar5 = 27897;
    byte byteVar2 = 67;
    System.out.println(floatVar2);
    System.out.println(longVar2);
    System.out.println(floatVar3);
    System.out.println(shortVar3);
    System.out.println(shortVar4);
    System.out.println(shortVar5);
    System.out.println(byteVar2);
    System.out.println();

    System.out.println("Задача №3");
    short paperCount = 480;
    byte lpStudents = 23;
    byte asStudents = 27;
    byte eaStudents = 30;
    int paperPerStudent = paperCount / (lpStudents + asStudents + eaStudents);
    System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги.");
    System.out.println();

    System.out.println("Задача №4");
    byte performanceIn2Min = 16;
    int performanceIn1Min = performanceIn2Min / 2;
    System.out.println("Производительность за 2 минуты " + performanceIn2Min + " бутылок.");
    System.out.println("Производительность за 1 минуту " + performanceIn1Min + " бутылок.");
    int performanceIn20min = performanceIn1Min * 20;
    System.out.println("За 20 минут машина произвела " + performanceIn20min + " штук бутылок.");
    byte hour = 60;
    int day = hour * 24;
    int performanceIn1Day = day * performanceIn1Min;
    System.out.println("За сутки машина произвела " + performanceIn1Day + " штук бутылок.");
    int performanceIn3Days = performanceIn1Day * 3;
    System.out.println("За 3 дня машина произвела " + performanceIn3Days + " штук бутылок.");
    int performanceInMonth = performanceIn1Day * 31;
    System.out.println("За 1 месяц машина произвела " + performanceInMonth + " штук бутылок.");
    System.out.println();

    System.out.println("Задача №5");
    byte totalQuantityCan = 120;
    byte whitePerClass = 2;
    byte brownPerClass = 4;
    int whiteBrownPerClass = (brownPerClass + whitePerClass);
    int quantityOfClasses = totalQuantityCan / whiteBrownPerClass;
    int totalWhiteAllClasses = quantityOfClasses * whitePerClass;
    int totalBrownAllClasses = quantityOfClasses * brownPerClass;
    System.out.println(
        "В школе, где " + quantityOfClasses + " классов, нужно " + totalWhiteAllClasses
            + " банок белой краски и " + totalBrownAllClasses + " банок коричневой краски.");
    System.out.println();

    System.out.println("Задача №6");
    byte bananaQuantity = 5;
    short oneBananaWeight = 80;
    int totalBananaWeight = bananaQuantity * oneBananaWeight;
    byte oneHundredMl = 105;
    int twoHundredMlMilk = oneHundredMl * 2;
    int iceCreamWeight = 100 * 2;
    int eggsWeight = 70 * 4;
    int totalBreakfastWeightGr = totalBananaWeight + twoHundredMlMilk + iceCreamWeight + eggsWeight;
    float totalBreakfastWeightKg = totalBreakfastWeightGr / 1000f;
    System.out.println("Вес завтрака в граммах составляет " + totalBreakfastWeightGr + " грамм.");
    System.out.println(
        "Вес завтрака в килограммах составляет " + totalBreakfastWeightKg + " килограмм.");
    System.out.println();

    System.out.println("Задача №7");
    byte weightGoalKg = 7;
    int weightGoalGr = weightGoalKg * 1000;
    int minWeightPerDay = 250;
    int maxWeightPerDay = 500;
    int dayForMinLosing = weightGoalGr / minWeightPerDay;
    int dayForMaxLosing = weightGoalGr / maxWeightPerDay;
    System.out.println(
        "При потере веса 250 грамм в день спортсмен сбросит 7 килограмм за " + dayForMinLosing
            + " дней.");
    System.out.println(
        "При потере веса 500 грамм в день спортсмен сбросит 7 килограмм за " + dayForMaxLosing
            + " дней.");
    int averageDayQuantity = (dayForMinLosing + dayForMaxLosing) / 2;
    System.out.println(
        "Среднее количество дней для похудения составит " + averageDayQuantity + " день.");
    System.out.println();

    System.out.println("Задача №8");
    int mashaSalary = 67760;
    int denisSalary = 83690;
    int kristinaSalary = 76230;
    int yearMashaSalary = mashaSalary * 12;
    int yearDenisSalary = denisSalary * 12;
    int yearKristinaSalary = kristinaSalary * 12;
    float salaryIncrease = 1.1f;
    float newMashaSalary = mashaSalary * salaryIncrease;
    float newDenisSalary = denisSalary * salaryIncrease;
    float newKristinaSalary = kristinaSalary * salaryIncrease;
    float yearNewMashaSalary = newMashaSalary * 12;
    float yearNewDenisSalary = newDenisSalary * 12;
    float yearNewKristinaSalary = newKristinaSalary * 12;
    float yearMashaDifferenceSalary = yearNewMashaSalary - yearMashaSalary;
    float yearDenisDifferenceSalary = yearNewDenisSalary - yearDenisSalary;
    float yearKristinaDifferenceSalary = yearNewKristinaSalary - yearKristinaSalary;
    System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на "
        + yearMashaDifferenceSalary + " рублей.");
    System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на "
        + yearDenisDifferenceSalary + " рублей.");
    System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на "
        + yearKristinaDifferenceSalary + " рублей");
  }
}