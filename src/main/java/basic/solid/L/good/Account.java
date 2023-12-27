package basic.solid.L.good;

import java.math.BigDecimal;

//todo Для того щоб дотримуватися принципу підстановки Барбари Лисков необхідно до базового (батьківського) класу
// виносити лише загальну логіку, характерну для класів спадкоємців, які її реалізовуватимуть і, відповідно, можна буде
// базовий клас без проблем замінити на його клас-спадкоємець.

public class Account {
    public BigDecimal balance(String numberAccount){
        //logic
        return new BigDecimal(10.2);
    }

    public void refill(String numberAccount, BigDecimal sum){
        //logic
    }
}