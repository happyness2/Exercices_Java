public enum SingletonEnum {
   ² public void someMethod(){
        // ...
    }
}

public class TestSingleton {
    public static void main(String[] args){
        SingletonEnum s1;
        SingletonEnum s2;
        s1 = SingletonEnum.SingletonEnum;
        s2 = SingletonEnum.SingletonEnum;
        if (s1 == s2){
            System.out.println("References to same
                    Singleton object");
        }
    }
}