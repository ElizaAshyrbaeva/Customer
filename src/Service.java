import java.util.InputMismatchException;

public interface Service {
    int Age(Customer  customer)throws InputMismatchException;

    Customer[] getStudentsSameCountry(Customer [] customers)throws RuntimeException;
    Country[] SortCountry(Customer [] customers);
    Customer [] getAll(Customer [] customers);

}
