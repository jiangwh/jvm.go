package jvm.lambda;

public class LambdaTest {
    
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello, World!");
        r.run();
    }
    
}
