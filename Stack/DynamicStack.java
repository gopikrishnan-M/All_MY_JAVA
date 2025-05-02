package Stack;

public class DynamicStack extends CustomStack {


    public DynamicStack(int size){
        super(size);
    }

    public DynamicStack(){
        super();
    }
    @Override
    public boolean push(int num){
        if(isFull()){
            //double the size of the array
            int []temp= new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }
        // add the item
        return super.push(num);
    }
}
