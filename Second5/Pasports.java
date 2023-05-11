// Создать структуру для хранения номеров паспортов и фамилий сотрудников организации. Вывести данные по сотрудникам по фамилии Иванов
package Second5;

import java.util.HashMap;
import java.util.Map;

public class Pasports {
    public static void main(String[] args) {
        Map<Integer, String> passportToLastName = new HashMap<>();
        passportToLastName.put(123456, "Иванов");
        passportToLastName.put(321456, "Васильев");
        passportToLastName.put(234561, "Петрова");
        passportToLastName.put(234432, "Иванов");
        passportToLastName.put(654321, "Петрова");
        passportToLastName.put(345678, "Иванов");

        System.out.println(passportToLastName);

        for (Map.Entry<Integer, String> pair : passportToLastName.entrySet()) {
            // System.out.println(pair);
            if (pair.getValue().equals("Иванов"))
                System.out.println(pair);
        }
    }
}
