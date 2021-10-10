package com.achang.demo;

import com.achang.utils.ZXingUtil;
import com.google.zxing.WriterException;

import java.io.File;
import java.io.IOException;

/******
 @author 阿昌
 @create 2021-10-10 22:04
 *******
 */
public class ZXingQR_codeTest {
    public static void main(String[] args) throws Exception {
        /**
         * 生成二维码
         * 加密：将文字其他东西放在图片里面
         * 解密：反之
         */
        String imagePath = "D:\\JavaStudy\\java_src\\zxQR_code\\v1\\src\\main\\resources\\out\\achang.jpg";//输出路径
        String logo = "D:\\JavaStudy\\java_src\\zxQR_code\\v1\\src\\main\\resources\\staitc\\logo.png";//中间的log
        String content = "http://achang.cc";//存放的数据
        ZXingUtil.encodeimage(imagePath, "JPEG", content, 500, 500 , logo);


        /**
         * 解密 -->将二维码内部的文字显示出来
         */
//        ZXingUtil.decodeImage(new File(imagePath));
    }
}
