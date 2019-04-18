public class Shopping {

    public static void shop() {

        Account account = Account.getInstance();

        Furniture chair = new Furniture("ODJER", 79);
        Furniture table = new Furniture("EKEDALEN", 129);

        User user = account.getUser();
        user.getFurnitures().add(chair);
        user.getFurnitures().add(table);
    }
}
