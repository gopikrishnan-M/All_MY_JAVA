package oops_concepts.fruitsProblem;

import java.util.ArrayList;

public class Fruits {
   private  int id;
    private String name;
    private  int price;
    private  int rating;

    public Fruits(int id,String name,int price,int rating){
       this.id=id;
       this.name=name;
       this.price=price;
       this.rating=rating;
    }
    public static Fruits maxRating(Fruits[] arr, int rating){
        ArrayList<Fruits> ratedaList=new ArrayList<>();
        int val=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].rating>rating){
                ratedaList.add(arr[i]);
            }
        }
        Fruits max= ratedaList.get(0);
        for(int j=1;j< ratedaList.size();j++){
            if(ratedaList.get(j).price>max.price){
                max=ratedaList.get(j);
            }
        }
        return max;
    }

    public  int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }
}

