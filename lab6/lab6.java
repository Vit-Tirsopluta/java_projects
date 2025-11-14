package lab6;

import java.util.*;


public class lab6 {
    public static void main(String[] args) {
        Map<String, Integer> CityPopulation = new HashMap<>();
        
        CityPopulation.put("Київ", 3000000);
        CityPopulation.put("Львів", 717000);
        CityPopulation.put("Рівне", 243000);
        CityPopulation.put("Хмельницький", 274000);
        CityPopulation.put("Чернівці", 266000);
        CityPopulation.put("Чернігів", 282000);
        CityPopulation.put("Харків", 1000000);
        CityPopulation.put("Одеса", 1015000);
        CityPopulation.put("Житомир", 125000);
        CityPopulation.put("Суми", 285000);

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n--- Меню 'Населення міст України' ---");
                System.out.println("1. Пошук населення за назвою міста");
                System.out.println("2. Додати/оновити дані про місто");
                System.out.println("3. Видалити місто з довідника");
                System.out.println("4. Показати всі міста та населення");
                System.out.println("0. Вихід з програми");
                System.out.print("Оберіть опцію: ");

                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.print("Введіть назву міста для пошуку: ");
                        String cityToFind = scanner.nextLine();
                        
                        if (CityPopulation.containsKey(cityToFind)) {
                            int population = CityPopulation.get(cityToFind);
                            System.out.println("Населення міста '" + cityToFind + "': " + population + " людей");
                        } else {
                            System.out.println("Вибачте, такого міста у довіднику немає.");
                        }
                        break;

                    case "2":
                        System.out.print("Введіть назву міста: ");
                        String newCity = scanner.nextLine();
                        
                        try {
                            System.out.print("Введіть кількість населення (тільки цифри): ");
                            int newPopulation = Integer.parseInt(scanner.nextLine());
                            
                            CityPopulation.put(newCity, newPopulation);
                            System.out.println("Дані для міста '" + newCity + "' успішно додано/оновлено.");
                        } catch (NumberFormatException e) {
                            System.out.println("Помилка: Введено не число. Спробуйте ще раз.");
                        }
                        break;

                    case "3":
                        System.out.print("Введіть назву міста для видалення: ");
                        String cityToRemove = scanner.nextLine();
                        
                        if (CityPopulation.remove(cityToRemove) != null) {
                            System.out.println("Місто '" + cityToRemove + "' видалено.");
                        } else {
                            System.out.println("Такого міста не знайдено, видалення неможливе.");
                        }
                        break;

                    case "4":
                        System.out.println("Поточний список міст та їх населення:");
                        for (Map.Entry<String, Integer> entry : CityPopulation.entrySet()) {
                            System.out.println(entry.getKey() + " -> " + entry.getValue() + " людей");
                        }
                        break;
                        
                    case "0":
                        System.out.println("Вихід з програми...");
                        return;

                    default:
                        System.out.println("Невірна опція. Будь ласка, спробуйте ще раз.");
                }
            }
        }
    }
}