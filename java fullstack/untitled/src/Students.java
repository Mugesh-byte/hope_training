import java.util.*;
class Students{
    public static void main(String[] args){
        String s="learning java programming";
        String[] arr=s.split(" ");
        int a=0;
        for(String e:arr){
            a+=1;
        }
        System.out.println(a);
    }
}