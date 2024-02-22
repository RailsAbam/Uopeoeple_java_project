package Stock;
import java.util.ArrayList;

//StockAnalyzer class
public class StockAnalyzer {
    public static float calculateAveragePrice(float[] stockPrices){
        float sum = 0;
        for(float price : stockPrices){
            sum += price;
        }
        return sum / stockPrices.length;
    }



//Method to find the  stock maximum prices
public static float findMaximumPrice(float [] stockPrices){
    float maxPrice = Float.MIN_VALUE ;
    for(float price : stockPrices){
        if(price > maxPrice){
            maxPrice = price;
        }
    }
    return maxPrice;
}


public static int countOccurrencesOfPrices(float [] stockPrices, float targetcurrentPrice){
    int count = 0;
    for(float price : stockPrices){
        if(price == targetcurrentPrice){
            count ++;
        }
    }
    return count;
}



public static ArrayList<Float> computeCumulativeSum(float[] stockPricesArray){
ArrayList<Float> cumulativeSum = new ArrayList<>();
float sum = 0;
for(float price : stockPricesArray){
    sum += price;
    cumulativeSum .add(sum);
}
return cumulativeSum;
}

public static void main(String[] args) {
float[] stockPricesArray = {30.5F, 10.4f,23.0f, 32.1f, 21.9f, 80.3f, 20.4f, 30.5f};
ArrayList<Float>stockPriceList = new ArrayList<>();
for(float price: stockPricesArray){
    stockPriceList.add(price);
        }
        //calculating the prices average stock price.
    float averagePrices = calculateAveragePrice(stockPricesArray);
        System.out.println("The Average stock price: " + averagePrices);
    float maxPrice = findMaximumPrice(stockPricesArray);
    System.out.println("Maximum current stock prices: "+  maxPrice);
    float targetcurrentPrice = 30.5f;
    int numOfOccurrences = countOccurrencesOfPrices(stockPricesArray, targetcurrentPrice);
    System.out.println("The number of Occurrences is:" + targetcurrentPrice + " : " + numOfOccurrences);
    //Computing all the cumulative sum of stock prices
    ArrayList<Float> cumlativesum= computeCumulativeSum(stockPricesArray);
    System.out.println("The cumulative Sum of the stock prices: " + cumlativesum);
        }
}
