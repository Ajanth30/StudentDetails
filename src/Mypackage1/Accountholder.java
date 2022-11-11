package Mypackage1;

public class Accountholder extends Bank{
    public void show(){
        System.out.println("Child");
    }
    void method(){
        System.out.println("Childmethod");
    }


    public static void main(String[] args) {
        Bank obj= new Accountholder();
        System.out.println(obj instanceof Accountholder);



    }
}
