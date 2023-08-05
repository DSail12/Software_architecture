public class Main {
    public static void main(String[] args) {
        UserDTO user = new UserDTO("Alex", "alex@mail.com", 24);
        System.out.println(user);

        // Изменение значения полей
        user.setUsername("Frank");
        user.setEmail("frank@mail.com");
        user.setAge(37);
        System.out.println(user);
    }
}