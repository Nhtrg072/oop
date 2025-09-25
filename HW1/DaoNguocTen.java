public class DaoNguocTen {
    public static void main(String[] args) {
        if (args.length != 3) {
            return;
        }

        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];

        System.out.println("Xin chào " + name3 + ", " + name2 + " và " + name1 + ".");
    }
}