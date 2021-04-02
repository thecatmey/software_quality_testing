package ro.ase.csie.cts.homework1;

import ro.ase.csie.cts.homework1.exceptions.InvalidValueException;
import ro.ase.csie.cts.homework1.interfaces.AccountInterface;

public class Account implements AccountInterface {
    private double loanValue, interestRate;
    private int	daysActive = 0;
    private AccountType accountType;
    private static double brokerInterestRate = 0.0125;

    public Account(double loanValue, double interestRate, AccountType accountType) throws InvalidValueException {
        if(loanValue < 0) {
            throw new InvalidValueException();
        } else {
            this.loanValue = loanValue;
        }
        this.interestRate = interestRate;
        this.accountType = accountType;
    }

    public double getLoanValue() {
        System.out.println("The loan value is " + this.loanValue);
        return this.loanValue;
    }

    public double getInterestRate() {
        System.out.println("The rate is " + this.interestRate);
        return this.interestRate;
    }

    @Override
    public double getMonthlyRate() {
        return this.loanValue * this.interestRate;
    }

    public void setLoanValue(double value) throws InvalidValueException {
        if(value < 0) {
            throw new InvalidValueException();
        } else {
            this.loanValue = value;
        }
    }

    public void setDaysActive(int daysActive) throws InvalidValueException {
        if(daysActive < 0) {
            throw new InvalidValueException();
        } else {
            this.daysActive = daysActive;
        }
    }

    public static void setBrokerInterestRate(double brokerInterestRate) {
        Account.brokerInterestRate = brokerInterestRate;
    }

    public String toString() {
        return "Loan: " + this.loanValue + "; rate: " + this.interestRate + "; days active:" + this.daysActive +
                "; Type: " + this.accountType + ";";
    }

    public double calculateInterestFee() {
        return this.loanValue * Math.pow(this.interestRate, (this.daysActive / 365)) - this.loanValue;
    }

    public double calculateBrokerFee() {
        return Account.brokerInterestRate * calculateInterestFee();
    }

    public static double calculateTotalFee(Account[] accounts) {
        double totalFee = 0.0;
        Account	account;
        for	(int i = 0; i < accounts.length; i++) {
            account = accounts[i];
            if(account.accountType == AccountType.PREMIUM || account.accountType == AccountType.SUPER_PREMIUM){
               totalFee += account.calculateBrokerFee();
            }
        }
        return totalFee;
    }

}