import java.util.*;

class CreateBox{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter box Dimensions (w, d, h): ");

        Box box1;
        box1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println(box1.getBoxDemensions());
        System.out.println("Volume: " + box1.getBoxVolume());

	Box box2 = new Box(4,5,6);
	System.out.println(box2.getBoxDemensions());

	Box box3 = box1;
	System.out.println(box3.getBoxDemensions());

	box1 = box3 = null;
//        System.out.println(box1.getBoxDemensions()); //java.lang.NullPointerException
	
	System.out.println("Main over");


        sc.close();
    }
}