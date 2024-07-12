import entities.Company;
import entities.Individual;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer # " + i + "data");

            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, annualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                list.add(new Company(name, annualIncome, employees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double total = 0.0;

        for (Person person : list) {
            System.out.println(person.getName() + ": $ " + String.format("%.2f", person.taxes()));
            total += person.taxes();
        }

        System.out.print("TOTAL: " + total);
        sc.close();
    }
}