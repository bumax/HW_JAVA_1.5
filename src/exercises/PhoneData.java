package exercises;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneData {
    public PhoneData(String initFN, String initLN, String initPN) {
        firstName = initFN;
        lastName = initLN;
        mobilePhone = initPN;
    }

    /**
     * Имя
     */
    public String firstName;
    /**
     * Фамилия
     */
    public String lastName;
    /**
     * Адрес
     */
    public String address;
    /**
     * Номер моб.телефона
     */
    public String mobilePhone;
    /**
     * Номер раб.телефона
     */
    public String workPhone;
    /**
     * Дата рождения
     */
    public Date bDate;
    /**
     * Дополнительные параметры (например, место работы, заметка, номер ICQ или пейджера)
     */
    public Map<String, Objects> customParams = new HashMap<>();

}
