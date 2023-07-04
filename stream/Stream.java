
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Arrays;
public class Stream{


    public static List<String> convertListToUpperCase(List<String> list){


        List<String> result = list.stream().map(string->string.toUpperCase()).collect(Collectors.toList());

        return result;
    }


   public static void main(String...strings){

       List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

       List<Integer> even = list.stream().filter(i->i%2==0).collect(Collectors.toList());
       List<Integer> odd = list.stream().filter(o->o%2 !=0).collect(Collectors.toList());
       System.out.println(even);
       System.out.println(odd);


       List<String> names = Arrays.asList("annie","hector","bridget","nic");

       List<String>result = convertListToUpperCase(names);
       System.out.println(result);
   }

}
