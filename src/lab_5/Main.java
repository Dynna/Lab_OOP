package lab_5;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        ArrayList<A> alphabetList = new ArrayList<>() {
            {
                add(new A());
                add(new B());
                add(new C());
                add(new D());
                add(new E());
                add(new F());
                add(new G());
                add(new H());
                add(new I());
                add(new J());
            }
        };
        System.out.println(alphabetList);
    }
}
