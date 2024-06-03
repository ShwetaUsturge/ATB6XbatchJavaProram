package June2024.EX1062024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class lab3 {
    public static void main(String[] args) {
//list of web elementse -remove dplicates
        //how t print duplicates from array
        int[] input= {1,2,3,3,4,5,5};
        Set<Integer> uniqueSet= new LinkedHashSet<>();
        for(int num: input) uniqueSet.add(num);
        System.out.println(uniqueSet);

    }
}
