public class Check {
    public static void checkNumber(int num){
        if(num < 0 ){
            System.out.println("Number is negative");
        }
        else if(num > 0){
            System.out.println("Number is positive");
        }
        else if(num == 0){
            System.out.println("Number is equal to 0");
        }
    }
}
