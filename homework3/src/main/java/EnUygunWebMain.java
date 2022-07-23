public class EnUygunWebMain {

    public static void main(String[] args) {
        try {
            LoginPageTest loginPageTest = new LoginPageTest();
            loginPageTest.checkOpenWebV2();
            loginPageTest.checkOpenLogin();
        } catch (IllegalStateException e) {
            System.out.println("Gerekli Driver Eksik.\nLütfen src/main/resources içine aktarınız.\n" + e.getMessage());
        }
    }

}
