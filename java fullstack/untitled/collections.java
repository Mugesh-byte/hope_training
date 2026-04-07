import java.util.ArrayList;
import java.util.Arrays;
public class collections{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,2,4,4,6,7,8,9));
        for(int i=1;i<list.size();i++){
            if(list.get(i-1)==list.get(i)){
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println(list);   
    }
}