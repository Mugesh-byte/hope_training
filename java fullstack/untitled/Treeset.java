import java.util.*;
//import java.lang.Math;
class Treeset{
    public static void main(String[] args){
        TreeSet<Integer> Tset=new TreeSet<>();
        int[] arr={15,3,9,1,7,2};
        for(int i:arr){
            Tset.add(i);
        }
        int target=7;
        int n=target-Tset.lower(target);
        int m=Tset.higher(target)-target;
        int k=(n<=m)?Tset.lower(target):Tset.higher(target);
        System.out.println(k);

    }
}
