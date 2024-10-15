import Interfaces.Exe;

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.mostenire();

        Test t2 = new SubTest();
        t2.mostenire();

        Exe e1 = new Test();
        e1.executa();

        Exe e2 = new SubTest();
        e2.executa();
    }
}


