package basic.solid.L.bad;

import java.math.BigDecimal;

//todo L - Liskov substitution Principle - принцип підстановки Барбари Лисков. Має бути можливість замість базового
// (батьківського) типу (класу) підставити будь-який його підтип (клас-спадкоємець), у своїй робота програми має змінитися.
public class Account {
    public BigDecimal balance(String numberAccount){
        //logic
        return new BigDecimal(10.2);
    }

    public void refill(String numberAccount, BigDecimal sum){
        //logic
    }
    public void payment(String numberAccount, BigDecimal sum){
        //logic
    }

}