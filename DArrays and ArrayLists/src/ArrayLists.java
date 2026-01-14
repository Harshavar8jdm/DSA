import java.util.ArrayList;

public class ArrayLists {
    static void main(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(30);
        list.add(40);
        list.add(90);
        list.add(8230);
        list.add(3280);

        list.set(0 , 890);
        //0th index set to 20
        list.remove(3);
        // remove index


        System.out.println(list.toString());
        System.out.println(list.contains(90));



    }
}
