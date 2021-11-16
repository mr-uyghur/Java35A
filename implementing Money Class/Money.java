public class Money {
    // attributes
    private int dollars;
    private int cents;

    // default constructor
    public Money() {
        // set dollars and cents to 0
        dollars = 0;
        cents = 0;
    }

    // parameterized constructor
    public Money(int dollars, int cents) {
        // set dollars ans cents to the arguments passed
        this.dollars = dollars;
        this.cents = cents;
    }

    // setters
    // method that sets dollars
    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    // method that sets cents
    public void setCents(int cents) {
        this.cents = cents;
    }

    // getters
    // method that returns dollars
    public int getDollars() {
        return dollars;
    }

    // method that returns cents
    public int getCents() {
        return cents;
    }

    // method that adds money
    public Money add(Money m) {
        // create a new money object
        Money newM = new Money();
        // set the dollars
        newM.setDollars(getDollars() + m.getDollars());
        // set the cents
        newM.setCents(getCents() + m.getCents());
        // normalize dollars and cents
        newM.normalize();
        // return money
        return newM;
    }

    // method that subtracts money
    public Money subtract(Money m) {
        // create a new money object
        Money newM = new Money();
        // set the dollars
        newM.setDollars(getDollars() - m.getDollars());
        // set the cents
        newM.setCents(getCents() - m.getCents());
        // normalize dollars and cents
        newM.normalize();
        // return money
        return newM;
    }

    // method that multiplies money
    public Money multiply(int m) {
        // create a new money object
        Money newM = new Money();
        // set the dollars
        newM.setDollars(getDollars() * m);
        // set the cents
        newM.setCents(getCents() * m);
        // normalize dollars and cents
        newM.normalize();
        // return money
        return newM;
    }

    // method that multiplies array of money
    public static Money[] multiply(Money[] moneys, int amt) {
        // create an array of Money objects
        Money[] newMoneys = new Money[moneys.length];
        for (int i = 0; i < moneys.length; i++) {
            // instantiate the new object
            newMoneys[i] = new Money();
            // set the dollars
            newMoneys[i].setDollars(moneys[i].getDollars() * amt);
            // set the cents
            newMoneys[i].setCents(moneys[i].getCents() * amt);
            // normalize dollars and cents
            newMoneys[i].normalize();
        }
        // return the moneys array
        return newMoneys;
    }

    // method that check if money is equal
    public boolean equals(Money money) {
        // normalize the money objects
        money.normalize();
        this.normalize();
        // compare the dollars and cents and return true if equal
        if (this.getDollars() == money.getDollars() && this.getCents() == money.getCents())
            return true;
        else
            return false;
    }

    // method that returns the string representation of the money object
    public String toString() {
        return getDollars() + " dollar(s) " + getCents() + " cents(s)";
    }

    // method that normalizes dollars and cents
    private void normalize() {
        // convert cents to dollars
        int d = getCents() / 100;
        int c = getCents() % 100;

        // set the dollars and cents
        setDollars(getDollars() + d);
        setCents(c);
    }

}