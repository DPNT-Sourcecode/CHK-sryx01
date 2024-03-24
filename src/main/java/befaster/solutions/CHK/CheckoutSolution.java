package befaster.solutions.CHK;

import org.eclipse.jgit.diff.ContentSource;

import java.util.HashMap;
import java.util.Set;

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

    private HashMap<Character, Integer> prices = new HashMap<>();
    private HashMap<Character, Integer> productCount  = new HashMap<>();
    private HashMap<Character, >

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

        for (Character c : productCount.keySet()) {
            checkoutBasketSum -= (counterA / 3 * 20);
            checkoutBasketSum -= (counterB / 2 * 15);
        }
        return checkoutBasketSum;
    }
}



