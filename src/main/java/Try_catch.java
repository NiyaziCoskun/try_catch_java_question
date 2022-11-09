public class Try_catch {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 0;

        try {

            if (num2 == 0) {
                throw new ArithmeticException();
            }else {
                System.out.println(num1/num2);
            }

        }catch (ArithmeticException e) {
            System.out.println("Hata yakalandi " + e);
        }catch (Exception e) {

        }
        System.out.println(".....");
    }
}
