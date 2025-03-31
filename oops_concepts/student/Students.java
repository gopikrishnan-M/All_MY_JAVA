package oops_concepts.student;

public class Students {

    public String brand;
    String name;
    int roll;
    String department;
    float cgpa;
    float attendance;
    public Students(String Name,int Roll,String Department,float CGPA,float Attendance){
       this.name=Name;
       this.roll=Roll;
       this.department=Department;
       this.cgpa=CGPA;
       this.attendance=Attendance;
    }
    public static Students[]sort (Students[]arr ){
        for(int i=0;i<arr.length;i++){
            for (int j = 0; j < arr.length-1; j++) {
             if(arr[j].roll>arr[j+1].roll) {
                 Students temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }

            }
        }
        return arr;
    }
    public static Students topper(Students[]arr){
        Students max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i].cgpa>max.cgpa)
                max=arr[i];
        }
        return max;

    }
}
