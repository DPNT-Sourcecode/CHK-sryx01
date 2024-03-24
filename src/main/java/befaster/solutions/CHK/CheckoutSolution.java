package befaster.solutions.CHK;

import com.sun.corba.se.impl.naming.cosnaming.BindingIteratorImpl;

import java.util.HashMap;

//+------+-------+------------------------+
//| Item | Price | Special offers         |
//+------+-------+------------------------+
//| A    | 50    | 3A for 130, 5A for 200 |
//| B    | 30    | 2B for 45              |
//| C    | 20    |                        |
//| D    | 15    |                        |
//| E    | 40    | 2E get one B free      |
//+------+-------+------------------------+
public class CheckoutSolution {
    private Integer checkoutBasketSum = 0;

    private static HashMap<Character, Integer> prices = new HashMap<>();
    private HashMap<Character, Integer> productCount  = new HashMap<>();

    private static void initProducts(){
        prices.put('A',50);
        prices.put('B',30);
        prices.put('C',20);
        prices.put('D',15);
    }

    public Integer checkout(String skus) {
        initProducts();

        for (char c : skus.toCharArray()){
            if (!prices.containsKey(c)) {
                return -1;
            }
            else {
                productCount.put(c, productCount.get(c) + 1);
            }
            checkoutBasketSum += prices.get(c);
        }

        checkoutBasketSum -= (counterA/3 * 20);
        checkoutBasketSum -= (counterB/2 * 15);
        return checkoutBasketSum;
    }
}

