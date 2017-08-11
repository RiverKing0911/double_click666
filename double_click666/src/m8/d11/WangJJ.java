package m8.d11;

import javax.swing.*;
import java.awt.*;

/**
 * 创建一个JFrame窗口
 * Created by 王江 on 2017/8/11.
 */
public class WangJJ {

    public static void main(String[] args) {
        createWindow();
    }

    private static void createWindow() {
        //创建一个新的JFrame对象
        JFrame frame = new JFrame("标题");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置默认的关闭操作

        //创建一个新的JLabel对象
        JLabel textLabel = new JLabel("这就是一个java窗口", SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));

        //已经创建JLabel，它需要添加到JFrame中
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);//居中

        frame.setLocationRelativeTo(null);//设置位置参照物
        frame.pack();//包
        frame.setVisible(true);//设置可见
    }

}
