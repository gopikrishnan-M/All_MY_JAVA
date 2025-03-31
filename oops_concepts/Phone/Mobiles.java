package oops_concepts.Phone;

public class Mobiles {
    String brand;
    String name;
    int model;
    int price;
    String os;
//    float life;

    public Mobiles(String brand,String name,int model,int price,String os){
        this.brand=brand;
        this.name=name;
        this.model=model;
        this.price=price;
        this.os=os;
//        this.life=life;
    }
    public static void priceAndBrand(Mobiles[] arr,String brand,int low){
        System.out.println("mobiles under this budjet with the specified brand are:");
        for(int i=0;i<arr.length;i++){
            if(arr[i].price<=low && brand.equalsIgnoreCase(arr[i].brand))
            {
                System.out.println(arr[i].brand);
                System.out.println(arr[i].name);
                System.out.println(arr[i].model);
                System.out.println(arr[i].price);
                System.out.println(arr[i].os);
                System.out.println("**************end of this model**************");
            }
        }

    }
    public static void pricefilter(Mobiles[] arr,int low){
        System.out.println("mobiles under this budjet are:");
        for(int i=0;i<arr.length;i++){
         if(arr[i].price<=low){
             System.out.println(arr[i].brand);
             System.out.println(arr[i].name);
             System.out.println(arr[i].model);
             System.out.println(arr[i].price);
             System.out.println(arr[i].os);
             System.out.println("**************end of this model**************");
         }
        }

    }
    public  static void showbrand(Mobiles[] arr, String brand){
        System.out.println("the requested phones are as follow");
        for(int i=0;i<arr.length;i++){
            if(brand.equalsIgnoreCase(arr[i].brand)){
                System.out.println(arr[i].brand);
                System.out.println(arr[i].name);
                System.out.println(arr[i].model);
                System.out.println(arr[i].price);
                System.out.println(arr[i].os);
                System.out.println("**************end of this model**************");
            }
        }
    }

}
