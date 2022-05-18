package com.flyyon.ocr;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;

/**
 * @author: Zhuyf
 * @version: 2022/5/18
 **/
@Component
public class OCRDemo {


    @PostConstruct
    public void main() {
        ITesseract instance = new Tesseract();
        // 文件暂时放到桌面，不然会报错
        instance.setDatapath("C:\\Users\\Zhuyf\\Desktop\\tessdata");
        instance.setLanguage("chi_sim");
        try {
        //识别图片
            File imageFile = new File("C:\\Users\\Zhuyf\\Desktop\\aaa.png");
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.toString());//打印图片内容
        }
    }
}
