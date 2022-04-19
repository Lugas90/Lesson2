public class Main {
    public static void main(String[] args) {


        // Задание 1:
        byte cat = 5;
        short dog = 15;
        int pingvin = 18;
        long bird = 158L;
        float sugar = 5.8f;
        double potato = 15.3;
        char znak = '!';
        boolean birdAndDog = bird > dog;
        System.out.println(dog);

        // Задание 2:
        double weightBoxer1 = 94.0;
        double weightBoxer2 = 92.2;
        double weightAllBoxers = weightBoxer1 + weightBoxer2;
        double differenceWeight = weightBoxer1 - weightBoxer2;
        System.out.println("Вес обоих боксеров = " + weightAllBoxers);
        System.out.println("Разница в весе составляет = " + differenceWeight);

        // Задание 3:
        double banana = 80 * 5;
        double milk = 105 * 2;
        double iceCream = 100 * 2;
        double eggs = 70 * 4;
        double weightGr = banana + milk + iceCream + eggs;
        double grPerKg = 1000;
        double weightKg = weightGr / grPerKg;
        System.out.println("Завтрак в кг составляет = " + weightKg);

        // Задание 4:
        int weightLoss = 7000;
        int loss500 = 7000 / 500;
        int loss250 = 7000 / 250;
        int averageLoss = (loss500 + loss250) % weightLoss / 2;
        System.out.println("Среднее кол-во дней на потерю веса = " + averageLoss);

        // Задание 5:
        double salMasha = 67760;
        double promSalMasha = salMasha / 10;
        double newSalMasha = salMasha + promSalMasha;
        double oldSalMashaYear = salMasha * 12;
        double newSalMashaYear = newSalMasha * 12;
        double yearUpMasha = newSalMashaYear - oldSalMashaYear;
        System.out.println("Маша теперь получает: " + newSalMasha + " рублей. " + "Годовой доход вырос на: " + yearUpMasha + " рублей.");

        double salDenis = 83690;
        double promSalDenis = salDenis / 10;
        double newSalDenis = salDenis + promSalDenis;
        double oldSalDenisYear = salDenis * 12;
        double newSalDenisYear = newSalDenis * 12;
        double yearUpDenis = newSalDenisYear - oldSalDenisYear;
        System.out.println("Денис теперь получает: " + newSalDenis + " рублей. " + "Годовой доход вырос на: " + yearUpDenis + " рублей.");

        double salKristina = 76230;
        double promSalKristina = salKristina / 10;
        double newSalKristina = salKristina + promSalKristina;
        double oldSalKristinaYear = salKristina * 12;
        double newSalKristinaYear = newSalKristina * 12;
        double yearUpKristina = newSalKristinaYear - oldSalKristinaYear;
        System.out.println("Кристина теперь получает: " + newSalKristina + " рублей. " + "Годовой доход вырос на: " + yearUpKristina + " рублей.");

    }
}