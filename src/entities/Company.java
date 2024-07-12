package entities;

public class Company extends Person {
    private Integer employees;

    public Company() {
        super();
    }

    public Company(String name, Double annualIncome, Integer employees) {
        super(name, annualIncome);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public Double taxes() {
        double taxe = 0.0;

        if (employees > 10) {
            taxe = annualIncome * 0.14;
        } else {
            taxe = annualIncome * 0.16;
        }

        return taxe;
    }
}
