package SPRINT1.TASCA_3.N2.Exercici2_Restaurant2;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int rating;

    public Restaurant(String name, int rating){
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public int getRating() {
        return rating;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Restaurant newRest = (Restaurant) obj;
        return rating == newRest.getRating() && name.equals(newRest.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(name,rating);
    }

    @Override
    public int compareTo(Restaurant otherRest) {
       int i = this.getName().compareTo(otherRest.getName());
        if(i != 0){
            return i;
        }else{
            return Integer.compare(otherRest.getRating(), this.rating);
        }
    }
    @Override
    public String toString(){
        return "Restaurant name: " + this.getName() + ", rating: " + this.getRating() + ".";
    }
}
