public class Basket {

    public static void basket() {

        Account account = Account.getInstance();

        System.out.println("Your basket:");
        User user = account.getUser();
        for (Furniture furniture : user.getFurnitures()) {
            System.out.println(furniture.getName() + ": " + furniture.getPrice());
        }
    }
}
