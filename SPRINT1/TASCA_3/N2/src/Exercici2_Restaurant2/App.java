package SPRINT1.TASCA_3.N2.Exercici2_Restaurant2;

import java.util.HashSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        HashSet<Restaurant> restaurants = new HashSet<>();

         restaurants.add(new Restaurant("Sushiko", 7));
         restaurants.add(new Restaurant("Sushiko", 7));

         restaurants.add(new Restaurant("Bar Casa Paco", 8));
         restaurants.add(new Restaurant("Bar Casa Paco", 6));

         restaurants.add(new Restaurant("Pizza nonna", 9));
         restaurants.add(new Restaurant("Mesón gallego", 8));
         restaurants.add(new Restaurant("Catalonian pita Kebab", 2));

         TreeSet<Restaurant> restaurantsSorting = new TreeSet<>(restaurants);

         for(Restaurant restaurant : restaurantsSorting){
             System.out.println(restaurant);
         }
    }
}
