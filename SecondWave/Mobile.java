package SecondWave;


class Main{
    public static void main(String[] args) {
//        Mobile mine=new Mobile();
//        mine.name="oneplus";
//        Mobile yours=new Mobile("oppo",15000);
//        System.out.println(yours.name);
//        Mobile test=new Mobile(mine);
//        System.out.println(test.name);
//        System.out.println(test.ram);
        Mobile defalt=helper();
        display(defalt);


    }
    private static void display(Mobile input){
        System.out.println(input.name);
        System.out.println(input.price);
        System.out.println(input.ram);
        System.out.println(input.rom);
    }
    public static Mobile helper(){
        Mobile rtn=new Mobile();
        rtn.name="oneplus";
        rtn.ram=12;
        rtn.rom=128;
        rtn.price=30000;
        return rtn;
    }
    private static class Mobile {
        String name;
        int price;
        int ram;
        int rom;

        public Mobile() {
            this.name="empty";
            this.price=0;
            this.rom=0;
            this.ram=0;
        }

        Mobile(String name){
            this.name=name;
        }
        Mobile(String name,int kaas){
            this.name=name;
            this.price=kaas;
        }
        Mobile (int storage,int peformance){
            rom=storage;
            ram=peformance;
        }
        Mobile(Mobile old){
            this.name= old.name;
            this.price= old.price;
        }
    }
}

