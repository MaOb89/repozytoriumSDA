package KlasyWewnetrzne;

public class Demo {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass instance1 = oc.instantiate();
        OuterClass.InnerClass instance2 = oc.new InnerClass();
//        obie metody wyżej są poprawne
    }

    public static void AnonymousInterfaceTest() {
        Greetings pl = new Greetings() {
            @Override
            public void sayHello() {
                System.out.println("Witaj");
            }
        };
        Greetings en = new Greetings() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };
        en.sayHello();

    }
}
