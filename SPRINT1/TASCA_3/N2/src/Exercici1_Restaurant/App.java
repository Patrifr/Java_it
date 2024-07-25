package SPRINT1.TASCA_3.N2.Exercici1_Restaurant;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        //ArrayList<Restaurant> Restaurants = new ArrayList<>();
        HashSet<Restaurant> restaurants = new HashSet<>();

         restaurants.add(new Restaurant("Sushiko", 7));
         restaurants.add(new Restaurant("Sushiko", 7));

         restaurants.add(new Restaurant("Bar Casa Paco", 8));
         restaurants.add(new Restaurant("Bar Casa Paco", 6));

         restaurants.add(new Restaurant("Pizza nonna", 9));
         restaurants.add(new Restaurant("Mesón gallego", 8));
         restaurants.add(new Restaurant("Catalonian pita Kebab", 2));

    for(Restaurant restaurant : restaurants){
        System.out.println(restaurant.toString());
         }
    }
}
