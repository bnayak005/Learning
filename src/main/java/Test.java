import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test {
    public static void testFindAny() {
        String present = "abc";
        List<String> names = new ArrayList<>();
        names.add("def");
        names.add("xyz");
        names.add("abc");
        names.add("def");
        names.add("ijk");
        String randomString = names.stream().findAny().get();
        System.out.println(randomString);
        try{
            int num = 5/0;
            System.out.println(num);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }


    public static void main(String args[]){
        testFindAny();
    }

}
