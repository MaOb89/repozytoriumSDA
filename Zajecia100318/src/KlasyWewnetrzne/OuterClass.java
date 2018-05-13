package KlasyWewnetrzne;

public class OuterClass {
    public class InnerClass {
        public void metodaTestowa() {
            System.out.println(test);
        }

    }

    public InnerClass instantiate() {
        return new InnerClass();
    }

    private String test;
}
