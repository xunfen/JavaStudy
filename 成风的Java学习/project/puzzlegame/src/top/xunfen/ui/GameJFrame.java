package top.xunfen.ui;

import java.util.Random;

import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//表示游戏主界面，跟游戏相关的所有逻辑都放在这个类
public class GameJFrame extends JFrame implements KeyListener,ActionListener {
    //一定要继承JFrame，因为JFrame是窗体，你要继承他才能够是窗体

    int[][] data = new int[4][4];

    //记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;

    //定义一个变量，记录当时展示图片的路径
    String path = "..\\puzzlegame\\image\\animal\\animal3\\";

    //定义二维数组以存储正确的数据
    int[][] win = {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,0}
    };

    //定义记步变量
    int step = 0;

    // 创建选项下的条目
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("官网");

    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");
    //把他们放在成员位置，因为如果放在一个方法内其他的方法读不到

    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据
        initData();

        //初始化图片
        initImage();


        this.setVisible(true);//显示界面（建议写在最后）
    
    }

    
    private void initData() {
        
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random r = new Random();
        int temp;
        for (int i = arr.length - 1; i > 0; i--) {
            int index = r.nextInt(i + 1);
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        /* for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        } */

       //以四个一组的方式添加到二维数组中
       //int[][] data = new int[4][4];
       //法一:遍历一维数组然后附给二维数组
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == 0) {
               x = i / 4;
               y = i % 4;
           }
           data[i / 4][i % 4] = arr[i];// 这方法妙啊，太妙了

       }

       //遍历检查一下
       /* for (int i = 0; i < data.length; i++) {
        for (int j = 0; j < data[i].length; j++) {
            System.out.print(data[i][j] + " ");
        }
        System.out.println();
       } */

       //法二：遍历二维数组，然后给他赋值
       /* int index = 0;
       for (int i = 0; i < data.length; i++) {
        for (int j = 0; j < data[i].length; j++) {
            data[i][j] = arr[index];
            index++;
        }
       } */

       //遍历检查一下
       /* for (int i = 0; i < data.length; i++) {
        for (int j = 0; j < data[i].length; j++) {
            System.out.print(data[i][j] + " ");
        }
        System.out.println();
       } */
    }

    private void initImage() {
        //清空原本所有图片
        this.getContentPane().removeAll();

        //判断是否获胜
        if (victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon("..\\puzzlegame\\image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepCount = new JLabel("步数：" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);



        /*
         * ImageIcon icon = new ImageIcon(
         * "C:\\Users\\xunfen\\Desktop\\成风的Java学习\\project\\puzzlegame\\image\\animal\\animal3\\1.jpg"
         * );
         * JLabel jlabel = new JLabel(icon);
         * //this.add(jlabel);
         * jlabel.setBounds(0,0,105,105);
         * this.getContentPane().add(jlabel);
         */

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // 获取要加载图片的序号
                int num = data[i][j];
                ImageIcon icon = new ImageIcon(
                        path + num
                                + ".jpg");
                JLabel jlabel = new JLabel(icon);
                // this.add(jlabel);
                jlabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);

                //给图片添加边框
                jlabel.setBorder(new BevelBorder(0));


                this.getContentPane().add(jlabel);
            }
        }

         //添加背景图片
            ImageIcon bg = new ImageIcon(
                    "..\\puzzlegame\\image\\background.png");
            JLabel background = new JLabel(bg);
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);

        /*
         * for (int i = 0; i < 4; i++) {
         * ImageIcon icon = new ImageIcon(
         * "C:\\Users\\xunfen\\Desktop\\成风的Java学习\\project\\puzzlegame\\image\\animal\\animal3\\1.jpg"
         * );
         * JLabel jlabel = new JLabel(icon);
         * // this.add(jlabel);
         * jlabel.setBounds(105 * i, 0, 105, 105);
         * this.getContentPane().add(jlabel);
         * }
         * 
         * for (int i = 0; i < 4; i++) {
         * ImageIcon icon = new ImageIcon(
         * "C:\\Users\\xunfen\\Desktop\\成风的Java学习\\project\\puzzlegame\\image\\animal\\animal3\\1.jpg"
         * );
         * JLabel jlabel = new JLabel(icon);
         * // this.add(jlabel);
         * jlabel.setBounds(105 * i, 105, 105, 105);
         * this.getContentPane().add(jlabel);
         * }
         * 
         * for (int i = 0; i < 4; i++) {
         * ImageIcon icon = new ImageIcon(
         * "C:\\Users\\xunfen\\Desktop\\成风的Java学习\\project\\puzzlegame\\image\\animal\\animal3\\1.jpg"
         * );
         * JLabel jlabel = new JLabel(icon);
         * // this.add(jlabel);
         * jlabel.setBounds(105 * i, 210, 105, 105);
         * this.getContentPane().add(jlabel);
         * }
         * 
         * for (int i = 0; i < 4; i++) {
         * ImageIcon icon = new ImageIcon(
         * "C:\\Users\\xunfen\\Desktop\\成风的Java学习\\project\\puzzlegame\\image\\animal\\animal3\\1.jpg"
         * );
         * JLabel jlabel = new JLabel(icon);
         * // this.add(jlabel);
         * jlabel.setBounds(105 * i, 315, 105, 105);
         * this.getContentPane().add(jlabel);
         * }
         */

         //刷新界面
         this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        //创建菜单对象
        JMenuBar JMenuBar = new JMenuBar();

        //创建菜单上俩个选项
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //创建更换图片
        JMenu changeImage = new JMenu("更换图片");

        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);
        functionJMenu.add(changeImage);

        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);


        /* //创建选项下的条目
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号"); */

        //将每一个选项下面的条目添加到选项中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        //将菜单中俩个选项添加到菜单中
        JMenuBar.add(functionJMenu);
        JMenuBar.add(aboutJMenu);

        //给整个页面设置菜单
        this.setJMenuBar(JMenuBar);
    }

    private void initJFrame() {
        this.setSize(603,680);//设置宽高
        this.setTitle("拼图游戏V1.0");//设置标题
        this.setAlwaysOnTop(true);//设置置顶
        this.setLocationRelativeTo(null);//设置居中
        this.setDefaultCloseOperation(3);//设置关闭模式
        this.setLayout(null);//取消默认居中方式，只有取消了才会按照XY轴的坐标进行显示
        this.addKeyListener(this);//给整个界面添加监听事件
    }


    // 实现KeyListener接口方法（如不需要可留空）
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            //添加背景图片
            ImageIcon bg = new ImageIcon(
                    "..\\puzzlegame\\image\\background.png");
            JLabel background = new JLabel(bg);
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利，胜利则直接结束此方法
        if (victory()) {
            return;
        }


        //上：38 下：40 左：37 右：39
        int code = e.getKeyCode();
        //System.out.println(code);
        if (code == 37) {
            System.out.println("向左");
            if(y == 3) {
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            //刷新界面
            initImage();
        } else if (code == 38) {
            System.out.println("向上");
            if (x == 3) {
                //空白方块已经在最下方
                return;
            }
            //移动：把空白方块下方的数字向上移动
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            //刷新界面
            initImage();
        } else if (code == 39) {
            System.out.println("向右");
            if (y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
            //刷新界面
            initImage();
        } else if (code == 40) {
            System.out.println("向下");
            if (x == 0) {
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            //刷新界面
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {//作弊码
            data = new int[][] { 
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 0 }
            };
            initImage();
        }
    }

    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取当前被点击的菜单项
        Object obj = e.getSource();
        Random r = new Random();
        int index;
        // 判断
        if (obj == replayItem) {
            System.out.println("重新游戏");
            step = 0;// 要先清零在加载图片
            initData();
            initImage();
        } else if (obj == reLoginItem) {
            System.out.println("重新登录");
            this.setVisible(false);
            new LoginJFrame();
        } else if (obj == closeItem) {
            System.out.println("关闭游戏");
            System.exit(0);
        } else if (obj == accountItem) {
            System.out.println("官网");
            try {
                java.awt.Desktop.getDesktop().browse(new java.net.URI("https://www.594sb.top"));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (obj == girl) {
            index = r.nextInt(13) + 1;
            path = "..\\puzzlegame\\image\\girl\\girl" + index + "\\" ;
            step = 0;
            initData();
            initImage();
        } else if (obj == animal) {
            index = r.nextInt(8) + 1;
            path = "..\\puzzlegame\\image\\animal\\animal" + index + "\\";
            step = 0;
            initData();
            initImage();
        } else if (obj == sport) {
            index = r.nextInt(10) + 1;
            path = "..\\puzzlegame\\image\\sport\\sport" + index + "\\";
            step = 0;
            initData();
            initImage();
        }

    }

}