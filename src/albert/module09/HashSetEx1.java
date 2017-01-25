package albert.module09;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 
public class HashSetEx1 {
 
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
 
        set.add("Java");
        set.add("JDBC");
        set.add("JTBC");
        set.add("Java");
        set.add("iBATIS");
 
        int size = set.size();
        System.out.println("총 객체 수: " + size);
 
        Iterator<String> iterator = set.iterator();
 
        while (iterator.hasNext()) {
            String elem = iterator.next();
 
            System.out.println("\t" + elem);
        }
 
        set.remove("JDBC");
        set.remove("JTBC");
 
        System.out.println("총 객체 수: " + set.size());
 
        iterator = set.iterator();
 
        while (iterator.hasNext()) {
            String elem = iterator.next();
 
            System.out.println("\t" + elem);
        }
 
        set.clear();
 
        if (set.isEmpty())
            System.out.println("HashSet 비어있음");
    }
 
}