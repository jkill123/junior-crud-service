package basic.solid.L.bad;

import java.math.BigDecimal;

public class DepositAccount extends Account{
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
        throw new UnsupportedOperationException("Operation not supported");
    }
}

//todo Якщо зараз у коді програми скрізь, де ми використовували клас Account замінити на його клас-спадкоємець
// (підтип) SalaryAccount, то програма продовжить працювати, оскільки в класі SalaryAccount доступні всі
// операції, які є і в класі Account.