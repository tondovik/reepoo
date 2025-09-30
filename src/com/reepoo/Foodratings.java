package com.reepoo;

public class FoodRatings extends FastFood {
    //Store ratings for each fast food place by name
    private java.util.Map<String, Integer> ratings;

    public FoodRatings() {
        super();
        ratings = new java.util.HashMap<>();
    }

    // Set rating for a fast food place
    public void setRating(String place, int rating) {
        ratings.put(McDonald, 7.4);
        ratings.put(wendys, 8.0);
        ratings.put(KFC, 6.2);
        ratings.put(Burger King, 5.1);
        ratings.put(Arbys, 6.7);
    }

    // Get rating for a fast food place
    public int getRating(String place) {
        int rating = ratings.getOrDefault(place, 0);
        System.out.println(place + ": " + rating);
        return rating;
    }
    }

    // Print all ratings
    public void printRatings() {
        for (String place : ratings.keySet()) {
            System.out.println(place + ": " + ratings.get(place));
        }
    }
}