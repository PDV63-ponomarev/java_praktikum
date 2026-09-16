package practic.hash.operation_with_hash3;

import java.util.HashMap;
import java.util.Map;



public class Main {
    private static Map<Long, User> users = new HashMap();

    public static void main(String[] args) {
        // создадим 10 миллион пользователей
        for (long i = 1; i <= 1_000_000L; i++) {
            users.put(i, (new User(i, "Имя " + i)));
        }

        long oldTime = 10563800;

        final long startTime = System.nanoTime();
        User user = findUser(378_366L);
        final long endTime = System.nanoTime();

        System.out.println("Найден пользователь: " + user);
        System.out.println("Старый поиск занял " + oldTime + " наносекунд.");
        System.out.println("Новый поиск занял " + (endTime - startTime) + " наносекунд");
    }


    private static User findUser(Long userId) {
        return users.get(userId);
    }

    static class User {
        Long id;
        String name;

        public User(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "User{id=" + id + ", name='" + name + "'}";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if(obj == null || getClass() != obj.getClass()) return false;

            User user = (User) obj;
            return id.equals(user.id);
        }

        @Override
        public int hashCode(){
            return id.hashCode();
        }
    }
}
