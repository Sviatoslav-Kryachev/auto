package operators;

public class Operators {
    public static void main(String[] args) {
//        + - / * %
        double a = 10;
        double b = 3;

        double c = a + b;
        double d = a - b;

        double e = a * b;
        double f = a / b;

        double g = a % b;

        double n = 7;
        double m = 7;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        a += 5;
        System.out.println("New a = " + a);

//        == !=  <> <=  >=  && || ?:

        int x = 3;
        int y = 5;
        int z = 8;

        boolean boolVal = n >= m;
        System.out.printf("boolVal = " + boolVal);


        boolean boolVal2 = y > z;

        boolean resultBoolean = boolVal || boolVal2;

        System.out.println("resultBoolean = " + resultBoolean);

        int res = (x> y) && (z<y) ? x:y;

        System.out.println("Ternary res = " + res);


    }
}
