public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1. Переменные. Часть 2");
        byte currentAge = 35;
        short salaryPerWeek = 8000;
        int hairsAmount = 356987;
        long bodyCellsAmount = 654589654745654L;

        float hight = 56.5f;
        double size = 0.3665;

        System.out.println("Значение переменной currentAge с типом byte равно " + currentAge);
        System.out.println("Значение переменной salaryPerWeek с типом short равно " + salaryPerWeek);
        System.out.println("Значение переменной hairsAmount с типом int равно " + hairsAmount);
        System.out.println("Значение переменной bodyCellsAmount с типом long равно " + bodyCellsAmount);
        System.out.println("Значение переменной hight с типом float равно " + hight);
        System.out.println("Значение переменной size с типом double равно " + size);

        // System.out.println("Задача №2. Переменные. Часть 2");
        double distance = 27.12;
        long routDistance = 987678965549L;
        double boatLength = 2.786;
        boolean homeWorkAnswer = false;
        char initials = 569;
        short discount = -159;
        int price = 27897;
        byte fathersAge = 67;

        System.out.println("Задача №2. Переменные. Часть 3");
        short paperAmount = 480;
        byte studentAmountTeacher1 = 23;
        byte studentAmountTeacher2 = 27;
        byte studentAmountTeacher3 = 30;
        int studentsTotal = studentAmountTeacher1 + studentAmountTeacher2 + studentAmountTeacher3;
        int paperPerStudent = paperAmount / studentsTotal;
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        System.out.println("Задача №4");
        int bottleCapacity = 16;
        byte workTime = 2;
        System.out.println("За " + workTime + " минуты машины произвели " + bottleCapacity + " бутылок");

        int bottlePerMinute = bottleCapacity / workTime;

        int setOfTime = 20;
        int bottlesIn20Minutes = bottlePerMinute * setOfTime;
        System.out.println("За " + setOfTime + " минут машины произвели " + bottlesIn20Minutes + " бутылок");

        setOfTime = 24 * 60;
        int bottlePer24Hours = bottlePerMinute * setOfTime;
        System.out.println("За " + setOfTime + " минут машины произвели " + bottlePer24Hours + " бутылок");

        setOfTime = 3;
        int bottlesPer3Days = bottlePer24Hours * setOfTime;
        System.out.println("За " + setOfTime + " дня машины произвели " + bottlesPer3Days + " бутылок");

        setOfTime = 30;
        int bottlesPerMonth = bottlePer24Hours * setOfTime;
        System.out.println("За месяц машины произвели бутылок " + bottlesPerMonth + " штук");

        System.out.println("Здача №5");
        int canTotal = 120;
        byte whitePaintPerRoom = 2;
        byte brownPaintPerRoom = 4;

        int cansPerRoom = brownPaintPerRoom + whitePaintPerRoom;
        int roomsAmount = canTotal / cansPerRoom;
        int whiteCansAmount = roomsAmount * whitePaintPerRoom;
        int brownCansAmount = roomsAmount * brownPaintPerRoom;
        System.out.println("В школе где " + roomsAmount + " классов нужно " + whiteCansAmount + " банок белой краски и " + brownCansAmount + " банок коричневой краски");

        System.out.println("Задача №6");
        byte banana = 5;
        short milk = 200;
        byte iceCream = 2;
        byte eggs = 4;
        short bananaWeight = 80;
        float milkWeight = 105/100f;
        short iceCreamWeight = 100;
        byte eggWeight = 70;
        float foodWeight = banana * bananaWeight + milk * milkWeight + iceCream * iceCreamWeight + eggs * eggWeight;
        float foodWeightKg = foodWeight / 100;
        System.out.println(foodWeightKg);

        System.out.println("Задача №7");
        int weightLossKg = 7;
        int WeightLossG = weightLossKg * 1000;
        short weightLossPerDay = 250;
        int daysNeededBy250grams = WeightLossG / weightLossPerDay;
        System.out.println("При потере в весе " + weightLossPerDay + " грамм в день. Потребуется " + daysNeededBy250grams + " дней");

        weightLossPerDay = 500;
        int daysNeededBy500grams = WeightLossG / weightLossPerDay;
        System.out.println("При потере в весе " + weightLossPerDay + " грамм в день. Потребуется " + daysNeededBy500grams + " дней");

        int daysAverage = (daysNeededBy250grams + daysNeededBy500grams) / 2;
        System.out.println("В среднем потребуется " + daysAverage + " день");

        System.out.println("Задача №8");
        int mashaSalary =  67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        byte rise = 10;
        byte months = 12;
        int mashaSalaryRaised = mashaSalary + mashaSalary / 100 * rise;
        int denisSalaryRaised = denisSalary + denisSalary / 100 * rise;
        int kristinaSalaryRaised = kristinaSalary + kristinaSalary / 100 * rise;
        int mashaDefSalaryPerYear = mashaSalaryRaised * months - mashaSalary * months;
        int denisDefSalaryPerYear = denisSalaryRaised * months - denisSalary * months;
        int kristinaDefSalaryPerYear = kristinaSalaryRaised * months - kristinaSalary * months;
        System.out.println( "Маша теперь получает " + mashaSalaryRaised +" рублей в месяц. Годовой доход вырос на " + mashaDefSalaryPerYear +" рублей");
        System.out.println( "Денис теперь получает " + denisSalaryRaised +" рублей в месяц. Годовой доход вырос на " + denisDefSalaryPerYear +" рублей");
        System.out.println( "Кристина теперь получает " + kristinaSalaryRaised +" рублей в месяц. Годовой доход вырос на " + kristinaDefSalaryPerYear +" рублей");




    }
}