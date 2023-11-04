import java.util.Scanner;
import java.util.Vector;


public class vector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            v.add(num);
        }
        while (true) {


            System.out.println("Element you are Searching for : ");
            int element = sc.nextInt();
            int count = 0;
            for (int i = 0; i < v.size(); i++) {
                if (v.elementAt(i) == element) {
                    System.out.println("At index : " + v.indexOf(element, i));
                    v.remove(i);
                    for (int j = 0; j < v.size(); j++) {
                        System.out.print(v.elementAt(j) + " ");
                    }
                    System.out.println();
                } else {
                    count++;
                }
            }
            if (count == v.size()) {
                System.out.println("Elements Not Exists !!");
                v.add(element);


                for (int i = 0; i < v.size(); i++) {
                    System.out.print(v.elementAt(i) + " ");
                }
            }
            System.out.println("Do you want to countinue ? (Y/N) : ");
            String a = sc.next();
            if (a.equals("N")) {
                return;
            }
        }
    }
}