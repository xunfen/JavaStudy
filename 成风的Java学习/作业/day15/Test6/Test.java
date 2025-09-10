/* ### 需求：

​	在测试类Test中创建B的对象b，并调用成员方法methodB

​	自己书写，不要用idea自动生成。

```java
public class Test {
    public static void main(String[] args) {

    }
}

//定义一个接口
interface InterB {
    void showB();	
}

//目标：调用成员方法methodB
class B {
    InterB b;
    public B(InterB b){
        this.b = b;
    }
    public void methodB(){
        b.showB();		
    }
}
``` */
public class Test { 
    public static void main(String[] args) {
        MethodB mb = new MethodB();
        B b = new B(mb);
        b.methodB();
        
    }
}