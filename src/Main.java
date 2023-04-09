import exercises.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер задания: ");
        int ex = scan.nextInt();
        switch (ex) {
            case 1:
                //Ex1.RunRev(20);
                Ex1 phoneDB = new Ex1();
                // Добавляем запись
                phoneDB.AddRecord(new PhoneData("Вася","Пупкин", "8-800-555-3535"));
                // Смотрим, как она хранится в БД
                System.out.println(phoneDB.phoneDataBase);
                // Ищем запись и печатаем телефон:
                System.out.println(phoneDB.GetRecord("Вася", "Пупкин").mobilePhone);
                break;
            case 2:
                Ex2.Run();
                break;
            case 3:
                Ex3.Run();
                break;
            case 4:
                Ex4.Run();
                break;
        }
    }
}