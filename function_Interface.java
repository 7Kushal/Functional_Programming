import java.util.function.Function;

/**
 * function_Interface
 */
public class function_Interface {

    static class MyMath {
        public static Integer triple(Integer x){
            return x*3;
        }
    } 
    public static void main(String[] args) {
        Function<Integer,Integer> myTriple = t->t*3; // MyMath::triple; // or innner class defenation
        // function interface first Integer is generic type of accepted type and 2nd is return type
        Integer result = myTriple.apply(3);
        System.out.println(result);
    }
}
