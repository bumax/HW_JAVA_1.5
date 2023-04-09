package exercises;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    // Саму структуру PhoneData описал в отдельном файле
    public Map<String, PhoneData> phoneDataBase = new HashMap<>();

    /**
     * Метод для добавления записи в телефонную книгу
     * @param pd Данные со всеми записями по данному человеку
     */
    public void AddRecord(PhoneData pd){
        // Приводим ключ к нижнему регистру, пробелы убираем за ненадобностью, т.к. все данные хранятся в классе PhoneData
        phoneDataBase.putIfAbsent(pd.firstName.toLowerCase() + pd.lastName.toLowerCase(), pd);
    }

    /**
     * Метод возвращает данные человека по Фамилии и Имени
     * @param fName Имя
     * @param lName Фамилия
     * @return
     */
    public PhoneData GetRecord(String fName, String lName){
        if (phoneDataBase.containsKey(fName.toLowerCase() + lName.toLowerCase()))
            return phoneDataBase.get(fName.toLowerCase() + lName.toLowerCase());
        else
            throw new RuntimeException("Запись не найдени!");
    }
}
