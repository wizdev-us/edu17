package albert.kang.module02.list;


import java.util.Arrays;
import java.util.List;
 
public class ArrayAslistEx {
 
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Jackie", "Andy", "Park");
 
        for (String name : strList) {
            System.out.println(name);
        }
 
        System.out.println();
 
        List<Integer> intList = Arrays.asList(1, 2, 5, 7);
 
        for (int num : intList) {
            System.out.println(num);
        }
    }
}
