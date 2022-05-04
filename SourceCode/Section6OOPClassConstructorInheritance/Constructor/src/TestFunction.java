

public class TestFunction {
    public static void main(String[] args) {

        Account bobsAccount = new Account();
//        Account bobsAccount = new Account("123455", 50.0, "Bob Brown",
//                "myemail@bob.com", "(949) 234-2345");
        System.out.println(bobsAccount.getCustomerName());
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setNumber("1234545");
//        bobsAccount.setCustomerEmailAddress("myemail@bob.com");
//        bobsAccount.setCustomerPhoneNumber("(949) 234-2345");

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);


        Account timsAccount = new Account("Tim", "time@email.com",
                "12345");
        System.out.println(timsAccount.getNumber() + " Name is " + timsAccount.getCustomerName());

    }
}
