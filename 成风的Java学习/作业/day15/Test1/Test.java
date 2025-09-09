package Test1;

public class Test {
    public static void main(String[] args) {
    /*     分析以下需求用代码实现:
1. 定义形状类:
   功能：求面积，求周长
2. 定义圆形类Round:
   属性：半径，圆周率
   功能：求面积，求周长
3. 定义长方形类Rectangle:
		属性：长和宽
	功能：求面积，求周长			
4. 定义测试类:
		分别创建圆形和长方形对象，为相应的属性赋值
	分别调用求面积和求周长的方法 */

    Round r = new Round();
    r.setRadius(5);
    r.Area();
    r.Perimeter();

    Rectangle r1 = new Rectangle(10,9);
    r1.Area();
    r1.Perimeter();
    
    }
}
