/**
 * Created by DELL on 2/15/2021.
 */
public class tryop {
    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3,1,};

        System.out.println("the repeated elements in  array : ");

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}



