package befaster.solutions.CHK;

import java.util.HashMap;

//+------+-------+----------------+
//| Item | Price | Special offers |
//+------+-------+----------------+
//| A    | 50    | 3A for 130     |
//| B    | 30    | 2B for 45      |
//| C    | 20    |                |
//| D    | 15    |                |
//+------+-------+----------------+
public class CheckoutSolution {

    public Integer checkout(String skus) {
        Integer checkoutBasketSum = 0;
        Integer counterA = 0;
        Integer counterB = 0;
        HashMap<Character, Integer> prices = new HashMap<>();

        prices.put('A',50);
        prices.put('B',30);
        prices.put('C',20);
        prices.put('D',15);

        for (char c : skus.toCharArray()){
            if (!prices.containsKey(c)) {
                return -1;
            }
            checkoutBasketSum += prices.get(c);

            if (c == 'A') {
                counterA++;
            }
            else if (c == 'B') {
                counterB++;
            }
        }

        checkoutBasketSum -= (counterA/3 * 20);
        checkoutBasketSum -= (counterB/2 * 15);
        return checkoutBasketSum;
    }
}
