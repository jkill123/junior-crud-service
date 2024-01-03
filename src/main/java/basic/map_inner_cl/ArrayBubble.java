package basic.map_inner_cl;

class ArrayBubble {
    private long[] a;
    private int elems;

    public ArrayBubble(int max) {
        a = new long[max];
        elems = 0;
    }

    public void into(long value) {
        a[elems] = value;
        elems++;
    }

    public void printer() {
        for (int i = 0; i < elems; i++) {
            System.out.print(a[i] + " ");
            System.out.println("");
        }
        System.out.println("----Закінчення виведення масиву----");
    }

    private void toSwap(int first, int second) { //метод змінює місцями пару чисел масиву
        long dummy = a[first];                  //у тимчасову змінну поміщаємо перший елемент
        a[first] = a[second];                   //на місце першого ставимо другий елемент
        a[second] = dummy;                      //замість другого елемента пишемо перший із тимчасової пам'яті
    }

    public void bubbleSorter() {                        //МЕТОД BUBBLE SORT
        for (int out = elems - 1; out >= 1; out--) {    //Зовнішній цикл
            for (int in = 0; in < out; in++) {          //Внутрішній цикл
                if (a[in] > a[in + 1])                  //Якщо порядок елементів порушено
                    toSwap(in, in + 1);                 //викликати метод, що змінює місцями
            }
        }
    }


    //todo Тут слід звернути увагу на два лічильники: зовнішній out, та внутрішній in.
    // Зовнішній лічильник out починає перебір значень з кінця масиву та поступово зменшується з кожним новим проходом на одиницю.
    // Змінна out з кожним новим проходом зміщується все лівіше, щоб не торкатися значень, вже відсортованих у праву частину масиву.


    // todo Внутрішній лічильник in починає перебір значень початку масиву і поступово збільшується на одиницю кожному новому проході.
    //  Збільшення in відбувається до тих пір, поки він не досягне out (останнього аналізованого елемента в поточному проході).
    //  Внутрішній цикл in робить порівняння двох сусідніх осередків in та in+1.
    //  Якщо in зберігається більше, ніж in +1, то викликається метод toSwap, який змінює місцями ці два числа.
}