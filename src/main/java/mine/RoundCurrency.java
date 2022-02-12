package mine;

/*
Round Currency

time complexity: O(1)

*/

public class RoundCurrency {

    public int round(int x) {
        int last = x % 10;
        int newLast = 0;

        if (last == 5) newLast = 5;
        else if (last > 5) newLast = 9;

        return (x - last) + newLast;
    }

}
