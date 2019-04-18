public class Main {

    public static void main(String[] args) {

        // sign in
        Account account = Account.getInstance();
        account.signIn("Bobby");

        User user = account.getUser();
        System.out.println("Hello " + user.getName());

        // shop some furniture
        Shopping.shop();

        // show basket content
        Basket.basket();
    }
}
