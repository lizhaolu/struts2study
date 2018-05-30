package nuc.sw.CertPic;

import com.sun.imageio.plugins.jpeg.JPEG;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * Created by superzhaolu on 2017/9/9.
 */
public class MakeCertPic {
    //验证码图片中可以出现的字符集，可根据需要修改
    private char mapTable[]={'a','b','c','d','e','f','j','h','i','g','k','l','m','n','o','p','q',
    'r','s','t','u','v','w','x','y','z'};
    /**
         * 功能:生成彩色验证码图片
         * 参数width为生成图片的宽度,参数height为生成图片的高度,参数os为页面的输出流
         */
    public String getCertPic(int width, int height, OutputStream os){
        if (width<=0){
            width=60;
        }
        if (height<=0){
            height=20;
        }
        //BufferedImage.TYPE_INT_RGB ： 表示一个图像，该图像具有整数像素的 8 位 RGB 颜色
        BufferedImage image=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        //获取图形上下文，java.awt.Graphics是一个用来绘制2D图像必须导入的java包，提供对图形图像的像素，颜色的绘制。
        Graphics g=image.getGraphics();
        //设定背景颜色
        g.setColor(new Color(0xDCDCDC));
        //画线框围起来的矩形。其中参数x和y指定左上角的位置，参数width和height是矩形的宽和高。
        g.fillRect(0,0,width,height);
        //画边框
        g.setColor(Color.black);
        g.drawRect(0,0,width-1,height-1);
        //产生随机的验证码
        String strEnsure="";
        // 4代表4位验证码,如果要生成更多位的认证码,则加大数值
        for (int i=0;i<4;i++){
            strEnsure+=mapTable[(int)(mapTable.length*Math.random())];
        }
        // 　　将认证码显示到图像中,如果要生成更多位的认证码,增加drawString语句
        //drawString(String str,int x,int y)：在指定的位置显示字符串。
        g.setColor(Color.black);
        g.setFont(new Font("Atlantic Inline",Font.PLAIN,18));
        String str=strEnsure.substring(0,1);
        g.drawString(str,8,17);
        str=strEnsure.substring(1,2);
        g.drawString(str,20,15);
        str=strEnsure.substring(2,3);
        g.drawString(str,35,18);
        str=strEnsure.substring(3,4);
        g.drawString(str,45,15);
        //随机产生十个干扰点
        Random ram=new Random();
        for (int i=0;i<10;i++){
            int x=ram.nextInt(width);
            int y=ram.nextInt(height);
            g.drawOval(x,y,1,1);
        }
        //释放图形上下文
        g.dispose();
        try {
            //输出图像到页面
            ImageIO.write(image, "JPEG",os);
        } catch (IOException e) {
            return "";
        }
        return strEnsure;
    }
}
