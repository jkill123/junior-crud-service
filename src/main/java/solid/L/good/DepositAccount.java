package solid.L.good;

import solid.L.bad.Account;

import java.math.BigDecimal;

public class DepositAccount extends Account {
    @Override
    public BigDecimal balance(String numberAccount){
        //logic
        return new BigDecimal(10.2);
    }
    @Override
    public void refill(String numberAccount, BigDecimal sum){
        //logic
    }
}
