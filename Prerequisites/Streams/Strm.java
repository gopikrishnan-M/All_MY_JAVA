package Prerequisites.Streams;

import java.util.ArrayList;
import java.util.List;
//there are intermediate operations in stream like filter,map,ect which will only be invoked
//when the terminal operation like foreach is used else nothing will come out of stream
//for example even if you pringt someething in the intermediate operation it wont get printed
//INTERMEDIATE- the operations which return a stream are intermediate operations(filter,map,peek)
//TERMINAL - the operations which do not return anything are terminal
//collect method (termina) returns a list
//count method returns a long which is a terminal operation
//terminal operation can only be used once cannot be use again and again eg.count(),foreacch()

public class Strm {
    public static void main(String[] args) {

        getObj()
                .stream()
                .filter(human -> human.id>13)
                .map(getObj -> {
                    return getObj.name;
                })
                .limit(1)//this will limit the input to given numbers and send to next (intermediate operation)
                .forEach(name -> System.out.println(name));






       /* Integer[] arr={1,2,3,4,5,6,7,8,9};
        Stream<Integer> Strmint= Arrays.stream(arr);*/
        /*Stream<Integer> filtered= Strmint.filter(num -> num>5);//here the stream is executed one by one
        filtered.forEach(num -> System.out.println(num));//this for each does not return anything*/

        /*//above set of statements can be concatenated to give
        Strmint.filter(num -> num>5).forEach(num -> System.out.println(num));*/

        //now to illustrate each thing is done one by one but not complete array is prossed
        /*Strmint
                .peek(num ->{
                    System.out.println("the peeked number is :" + num);
                })
                .filter(num->{
                    System.out.println("the filter method is invoked");
                    return num>5;
                })
                .forEach(num->{
                    System.out.println("its greater than 5 : "+ num);
                });//after execution this will not modify the source i.e Strmint its just like traversing and saving it in
                   //another stream*/

    }
    public static List<human> getObj(){
        List<human> ans=new ArrayList<>();
        ans.add(new human(21,"kris"));
        ans.add(new human(13,"gopi"));
        return ans;
    }
}
class human{
    int id;
    String name;
    human(int id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public String toString(){
        return "human id = "+this.id+" name : "+this.name;
    }

}

