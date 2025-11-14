package lab7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab7 {

    public static void main(String[] args) {
        List<Object> cityData = new ArrayList<>();

        cityData.add("Київ");
        cityData.add(3000000);
        cityData.add("Львів");
        cityData.add(717000);
        cityData.add("Рівне");
        cityData.add(243000);
        cityData.add("Хмельницький");
        cityData.add(274000);
        cityData.add("Чернівці");
        cityData.add(266000);

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n--- Меню 'Населення міст' (Логіка з методички) ---");
                System.out.println("1. Пошук населення за назвою міста");
                System.out.println("2. Додати нове місто");
                System.out.println("3. Видалити місто");
                System.out.println("4. Показати всі міста");
                System.out.println("0. Вихід з програми");
                System.out.print("Оберіть опцію: ");

                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.print("Введіть назву міста для пошуку: ");
                        String cityToFind = scanner.nextLine();
                        
                        int index = cityData.indexOf(cityToFind);

                        if (index != -1 && index % 2 == 0) {
                            Integer population = (Integer) cityData.get(index + 1);
                            System.out.println("Населення міста '" + cityToFind + "': " + population);
                        } else {
                            System.out.println("Місто '" + cityToFind + "' не знайдено.");
                        }
                        break;

                    case "2":
                        System.out.print("Введіть назву нового міста: ");
                        String newCityName = scanner.nextLine();
                        try {
                            System.out.print("Введіть кількість населення: ");
                            int newPopulation = Integer.parseInt(scanner.nextLine());
                            
                            cityData.add(newCityName);
                            cityData.add(newPopulation);
                            System.out.println("Місто '" + newCityName + "' успішно додано.");
                            
                        } catch (NumberFormatException e) {
                            System.out.println("Помилка: Введено не число.");
                        }
                        break;

                    case "3":
                        System.out.print("Введіть назву міста для видалення: ");
                        String cityToRemoveName = scanner.nextLine();
                        
                        int removeIndex = cityData.indexOf(cityToRemoveName);

                        if (removeIndex != -1 && removeIndex % 2 == 0) {
                            cityData.remove(removeIndex);
                            cityData.remove(removeIndex);
                            
                            System.out.println("Місто '" + cityToRemoveName + "' та його дані видалено.");
                        } else {
                            System.out.println("Місто '" + cityToRemoveName + "' не знайдено.");
                        }
                        break;

                    case "4":
                        System.out.println("Поточний список міст та їх населення:");
                        for (int i = 0; i < cityData.size(); i += 2) {
                            if (i + 1 < cityData.size()) {
                                String city = (String) cityData.get(i);
                                Integer pop = (Integer) cityData.get(i + 1);
                                System.out.println(city + " -> " + pop + " людей");
                            }
                        }
                        break;

                    case "0":
                        System.out.println("Вихід з програми...");
                        return;

                    default:
                        System.out.println("Невірна опція. Спробуйте ще раз.");
                }
            }
        }
    }
}