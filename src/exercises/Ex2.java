package exercises;

import java.util.*;

// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
public class Ex2 {
    private static String[] names = new String[]{
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Иван Иванов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Иван Иванов",
            "Мария Рыкова",
            "Анна Крутова",
            "Марина Лугова",
            "Анна Владимирова",
            "Петр Лыков",
            "Иван Мечников",
            "Петр Петин",
            "Петр Лыков",
            "Иван Ежов"
    };

    public static void Run() {
        Map<String, Integer> nameTop = new HashMap<>();
        for (String nameFull : names) {
            // Выбираем имя из строки и приводим всё к нижнему регистру
            String lastName = nameFull.split(" ")[0].toLowerCase();
            // Считаем, сколько раз выстретилось данное имя:
            nameTop.put(lastName, nameTop.get(lastName) == null ? 1 : nameTop.get(lastName) + 1);
        }
        // создаём список со значениями количества повторов
        List<Integer> ratingOfNames = new ArrayList<>(nameTop.values());
        // отсеиваем единицы
        ratingOfNames.removeIf(x -> x <= 1);
        // Сортируем по убыванию
        Collections.sort(ratingOfNames, Collections.reverseOrder());
        // Проходимся по списку
        for (int rating : ratingOfNames) {
            for (var name : nameTop.entrySet()) {
                // Выводим на печать имена  с заданным количеством совпадений
                if (name.getValue() == rating)
                    // Печатаем первый символ имени с большой буквы для красоты :-)
                    System.out.println(name.getKey().substring(0,1).toUpperCase() + name.getKey().substring(1) + " встречается " + name.getValue() + " раз(а)");
            }
        }


    }
}
