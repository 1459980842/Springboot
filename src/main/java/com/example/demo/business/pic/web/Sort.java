package com.example.demo.business.pic.web;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Sort {
    final static String regularString = "@#$&%*!^;,.";

    public static void convertImageToASSIC(BufferedImage bufferedImage) {
        int imageWidth = bufferedImage.getWidth();//得到宽
        int imageHeight = bufferedImage.getHeight();//得到高
        for (int coordinateX = 0; coordinateX < imageHeight; coordinateX += 5) {
            for (int coordinateY = 0; coordinateY < imageWidth; coordinateY += 2) {
                int orientRGB = bufferedImage.getRGB(coordinateY, coordinateX);//得到颜色空间
                int componentR = (orientRGB >> 16) & 0xff;//编译时加上了 GD 库 2.0 或更高的版本并且图像是真彩色图像，
                int componentG = (orientRGB >> 8) & 0xff; // 则本函数以整数返回该点的 RGB 值。用移位加掩码来取得红，绿，蓝各自成分的值.
                int componentB = orientRGB & 0xff;
                int pixelDegree = (int) (componentR * 0.3 + componentG * 0.59 + componentB * 0.11);//得到 image 所指定的图形中指定位置像素的颜色索引值。
                System.out.print(regularString.charAt(pixelDegree / 24));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        File imageFile = new File("E:\\work\\笔记\\21.jpg");
        System.out.println(imageFile.getAbsoluteFile());
        try {
            BufferedImage bufferedImage = ImageIO.read(imageFile);//读取图片
            convertImageToASSIC(bufferedImage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
