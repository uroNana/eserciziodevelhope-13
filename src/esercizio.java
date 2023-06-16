//The bot is going through a financial catastrophe! It's holding 10,000 great british pounds.*
//It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
//It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
//On days where it sells, it can only sell 1000 pounds for euros.
//Write a while loop
//Use the calculation for exchange rate below
//1 + (Math.random() * 0.2);
//To recalculate our rate every day (once per loop)
//Print the number of days it takes for our bot to sell its pounds


public class esercizio {
    public static void main(String[] args) {

        int dayToSell = 0;
        int remainingPoundsToSell = 10000;
        int maxPoundsToSellPerDay = 1000;

        while (remainingPoundsToSell > 0) {
            double poundToEuroExchangeRate =  1 + (Math.random() * 0.2);
            dayToSell++;

            if (poundToEuroExchangeRate > 1.15) {
                remainingPoundsToSell -= maxPoundsToSellPerDay;
            }
            System.out.println("Day " + dayToSell + "; Remaining pounds to sell : " + remainingPoundsToSell);

        }
        System.out.print("It took " + dayToSell + " to exit cursed economy");


    }
}
