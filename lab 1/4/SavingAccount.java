class SavingAccount extends Account{
           private double defaultInterestRate=2.5;
            private double InterestRate=1.5;
             public double setdefaultInterestRate(){
                 double interestRate=this.InterestRate;
                  return InterestRate;
        }
       public double applyMonthlyInterest(){
           double Interest=super.balance()+InterestRate;
              return Interest;
}
}