package Test4;

class Outer {
    public static Inter method() {
        return new Inter() {
            @Override
            public void show() {
                System.out.println("hello world");
            }
        };
    }
}