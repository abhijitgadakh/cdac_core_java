import java.util.*;

class TestCreateBox{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cube box Dimension");

        Box box1;
        box1 = new Box(sc.nextDouble());

        System.out.println(box1.getBoxDemensions());
        System.out.println("Volume: " + box1.getBoxVolume());


        System.out.print("Enter box Dimension");
        Box box2 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());

        System.out.print("Enter the offsets from box2's Dimension");
        Box box3 = box2.createNewBox(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());

        box2.setColor("Red");
        box3.setColor("Blue");
        
        System.out.println("Volume: " + box2.getBoxVolume());
        System.out.println("Volume: " + box3.getBoxVolume());

        String color = (box2.getBoxVolume() > box3.getBoxVolume())	? box2.getColor() : box3.getColor();
        System.out.print(color);
        sc.close();
    }
}