public class Introduction {
    public static void main(String[] args) {
        String ten = "Nguyễn Hữu Trường";
        String msv = "21021445";
        String lop = "K66AE";
        String username = "Truongprovjp123";
        String email = "21021445@vnu.edu.vn";

        System.out.println("Họ tên:\t" + ten);
        System.out.println("Mã sinh viên:\t" + msv);
        System.out.println("Lớp:\t" + lop);
        System.out.println("Username Github:\t" + username);
        System.out.println("Email:\t" + email);

        for (int i = 9; i >= 0; i--) {
            if (i > 0) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down, pass it around,");
            }
            else {
                System.out.println("No more bottles of beer on the wall.");
            }
        }
    }
}