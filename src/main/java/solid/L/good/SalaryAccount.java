package solid.L.good;

import java.math.BigDecimal;

public class SalaryAccount extends PaymentAccount{
    @Override
    public BigDecimal balance(String numberAccount){
        //logic
        return new BigDecimal(11.1);
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

//todo Зараз заміна класу PaymentAccount на його клас-спадкоємець SalaryAccount не "поламає" нашу програму, оскільки
// клас SalaryAccount має доступ до всіх методів, що і PaymentAccount. Також все буде добре при заміні класу Account на
// його клас-спадкоємець PaymentAccount.
// Принцип підстановки Барбари Лисков полягає у правильному використанні відносини спадкування. Ми повинні створювати
// спадкоємців будь-якого базового класу тоді і лише тоді, коли вони збираються правильно реалізувати його логіку, не
// викликаючи проблем при заміні батьків на спадкоємців.
