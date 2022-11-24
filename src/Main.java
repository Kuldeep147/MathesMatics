public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 63;
        double c = Math.pow(2,63);
        double d = Math.sqrt(Math.pow(2,64));
        double e = Math.pow(2,32);
        double f = Math.ceil(56.4);
        double g = Math.ceil(56.6);
        System.out.println("2 exp 63 is : "+c);
        System.out.println("sqrt of 2 exp 64 is : "+d);
        System.out.println("e : "+e);
        System.out.println("f : "+f);
        System.out.println("g : "+g);
        do {
            double k = (Math.round(Math.random()))%2;
            System.out.println(k);
            a++;
        }while (a<9);
    }
}