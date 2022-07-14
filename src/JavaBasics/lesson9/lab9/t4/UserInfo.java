package JavaBasics.lesson9.lab9.t4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInfo {

    static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static Integer checkPoints(Map<User, Integer> map) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя ");
        String s = scanner.nextLine();

        for (Map.Entry<User, Integer> userIntegerEntry : map.entrySet()) {
            if (userIntegerEntry.getKey().getName().equalsIgnoreCase(s)) {
                return userIntegerEntry.getValue();
            }
        }
        System.out.println("Игрок с таким именем не зарегистрирован в системе");
        return i;
    }

    public static void main(String[] args) {
        Map<User, Integer> map = new HashMap<>();

        map.put(new User("Alex"), 120);
        map.put(new User("John"), 100);
        map.put(new User("Kattie"), 110);
        map.put(new User("Vera"), 130);

        System.out.println(checkPoints(map));
    }

}
