import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Eliza", "eliza@gmail", Country.KYRGYZSTAN, LocalDate.of(2003, 11, 12));
        Customer customer2 = new Customer("Nuriza", "nuriza@gmail", Country.TURKEY, LocalDate.of(2002, 10, 23));
        Customer customer3 = new Customer("Kuban", "kuban@gmail", Country.USA, LocalDate.of(2000, 12, 30));
        Customer customer4 = new Customer("Alibek", "alibek@gmail.com", Country.KYRGYZSTAN, LocalDate.of(1995, 10, 20));
        Customer customer = new Customer();
        Customer[] customers = {customer1, customer2, customer3, customer4};
        while (true) {
            int number = new Scanner(System.in).nextInt();
            switch (number) {
                case 1:
                    for (Customer customer5 : customers) {
                        System.out.println(customer5.Age(customer) + " " + customer5.getName());
                    }
                    break;
                case 2:
                    System.out.println(Arrays.toString(customer.getStudentsSameCountry(customers)));
                    break;
                case 3:
                    System.out.println(Arrays.toString(customer.SortCountry(customers)));
                    break;
                case 4:
                    System.out.println(Arrays.toString(customer.getAll(customers)));
                    break;
                default:
                    System.out.println("");

            }
        }
    }
}
