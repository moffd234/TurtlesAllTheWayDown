public class Factorial {
    public static Long factorial(Long num){
        if(num == 0){
            return 1L;
        }
        return num * factorial(num - 1);
    }
}
