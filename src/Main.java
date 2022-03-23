public class Main {

    public static void main(String[] args) { System.out.println("Hello");
        System.out.println("Marian");

        int x = 3;
        int z = 4;
        float y = 7;
        System.out.println(x + z);
        System.out.println("Rezultatul adunarii este: " + (x + z));
        System.out.println(y / x);
        System.out.println("Rezultatul impartirii este: "+ (y / x));


        int a = -5;
        int b = 8;
        int c = 6;
        System.out.println(a + (b * c));

        int d = 9;
        int e = 55;
        double result = ((e + d) % d);
        System.out.println((e + d) % d);
        System.out.println(result);

        int l = 20;
        int m = -3;
        int n = 5;
        int o = 8;
        System.out.println(l + ((m * n) / o));
        int resultof = (l + ((m * n) / o));
        System.out.println(resultof);
    }
}
