package entities;

public class Individual extends Person {
    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double taxes() {
        double taxe = 0.0;

        if (annualIncome < 20000) {
            taxe = annualIncome * 0.15;
        } else {
            taxe = annualIncome * 0.25;
        }

        if (healthExpenditures > 0) {
            taxe -= healthExpenditures * 0.5;
        }

        return taxe;
    }
}
