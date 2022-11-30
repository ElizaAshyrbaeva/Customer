import java.time.LocalDate;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer implements Service {
    private String name, email;
    private  Country country;
    private LocalDate age;

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public LocalDate age(){
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public  Customer(String name, String email, Country country, LocalDate age) {
        if(name.length()>1) {
            this.name = name;
        }
        if(email.equals("@")) {
            this.email = email;
        }
        this.country = country;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", country=" + country +
                ", age=" + age +
                '}';
    }

    @Override
    public int Age(Customer  customer)  throws InputMismatchException {
        return LocalDate.now().getYear() - age.getYear();
    }

    @Override
    public Customer[] getStudentsSameCountry(Customer[] customers) throws  RuntimeException {
        String country =new Scanner(System.in).nextLine();
        if (!country.matches("[a-zA-Za-яА-Я]*")){
            throw new RuntimeException("Write the country name! Please!");
        }
        int counter=0;
        for (Customer customer : customers) {
            if(customer.country.name().equals(country.toUpperCase())){
                counter++;
            }
        }
        int index=0;
        Customer []customers1 =new Customer[counter];
        for (Customer customer : customers) {
            if(customer.country.name().equals(country.toUpperCase())){
                customers1[index]=customer;
                index++;
            }

        }
        return customers1;
    }

    @Override
    public Country[] SortCountry(Customer[] customers) {
        Country[] countries = new Country[customers.length];
            int index = 0;
            for (Customer customer : customers) {
                countries[index] = customer.country;
                index++;
            }
            Arrays.sort(countries);
            return countries;
        }


    @Override
    public Customer[] getAll(Customer[] customers) {
        return customers;
    }
}
