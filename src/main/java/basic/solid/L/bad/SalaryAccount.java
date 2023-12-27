package basic.solid.L.bad;

import java.math.BigDecimal;

public class SalaryAccount extends Account{
    @Override
    public BigDecimal balance(String numberAccount){
        //logic
        return new BigDecimal(10.2);
    }

    @Override
    public void refill(String numberAccount, BigDecimal sum){
        //logic
    }
    @Override
    public void payment(String numberAccount, BigDecimal sum){
        //logic
    }
}