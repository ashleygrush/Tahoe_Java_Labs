package part_06;

public class DMD {
    public static void main(String[] args) {
        {
            A_Class objA = new A_Class();
            B_Class objB = new B_Class();

            objB.sameMethod();
            objA.sameMethod();

//            A_Class = a;
//            B_Class = objB;


            objA.sameMethod();
            objB.sameMethod();
        }
    }
}

class A_Class {

    public void sameMethod(){
        System.out.println("I'm in A_Class.");
    }
}

class B_Class {
    public void sameMethod(){
        System.out.println("I'm in B_Class.");
    }
}

