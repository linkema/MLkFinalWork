 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mlkfinalwork.TeaUtils;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

 /**
  * @version 1.0 基于文本IO输入
  * @author 马苓珂
  */
public class UIUtil {
    private UIUtil(){}
    //修改窗体的图标
    public static void setFrameImage(JFrame jf){
    //获取工具对象
    //public static Toolkit getDefaultTooolkit()获取默认工具包
       Toolkit tk=Toolkit.getDefaultToolkit();
       //根据路径获取图片
       Image i=tk.getImage("src\\mlkfinalwork\\resource\\user.jpg");
       //给窗体设置图片
       jf.setIconImage(i);
    }
    //设置窗体居中
    public static void setFrameCenter(JFrame jf){
        /*
            1.获取屏幕宽和高
            2.获取窗体的宽和高
            3.用屏幕的宽减去窗体的宽，用屏幕的高减去窗体的高，再除以2，作为窗体的新坐标
        */
        //获取工具对象
        Toolkit tk=Toolkit.getDefaultToolkit();
        //获取屏幕的宽和高
        double scrHeight=tk.getScreenSize().height;
        double scrWidth=tk.getScreenSize().width;
        //获取窗体的宽和高
        int frameHeight=jf.getHeight();
        int frameWidth=jf.getWidth();
        //得到新坐标
        int height=(int)(scrHeight-frameHeight)/2;
        int width=(int)(scrWidth-frameWidth)/2;
        //设置新窗体坐标
        jf.setLocation(width, height);
        
    }
    
}
