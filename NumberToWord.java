public class NumberToWord {
    public static void numberWord(int digit ){
        switch (digit){
            case 1 -> System.out.println("bir");
            case 2 -> System.out.println("iki");
            case 3 -> System.out.println("uc");
            case 4 -> System.out.println("dord");
            case 5 -> System.out.println("bes");
            case 6 -> System.out.println("alti");
            case 7 -> System.out.println("yeddi");
            case 8 -> System.out.println("sekkiz");
            case 9 -> System.out.println("doqquz");
            default -> System.out.println("1-9 arasi reqem daxil edilmeyib");
        }
    }
}
