package com.by.imooc.service;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrimaryGenerater {

    private static final String SERIAL_NUMBER = "XXXX"; // 流水号格式
    private static PrimaryGenerater primaryGenerater = null;

    private PrimaryGenerater() {
    }

    /**
     * 取得PrimaryGenerater的单例实现
     *
     * @return
     */
    public static PrimaryGenerater getInstance() {
        if (primaryGenerater == null) {
            synchronized (PrimaryGenerater.class) {
                if (primaryGenerater == null) {
                    primaryGenerater = new PrimaryGenerater();
                }
            }
        }
        return primaryGenerater;
    }

    /**
     * 生成下一个编号
     */
    public synchronized String generaterNextNumber(String kehCode,String sno) {

        String tjdTitle = "Khtjd";

        String id = null;
        LocalDate localDate = LocalDate.now();
        String strDate1 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(tjdTitle).append(strDate1).append(kehCode);
        System.out.println(stringBuffer.toString());
        if (sno == null) {
            id = stringBuffer.append("0001").toString();
        } else {
            int count = SERIAL_NUMBER.length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < count; i++) {
                sb.append("0");
            }
            DecimalFormat df = new DecimalFormat(sb.toString());
            id = df.format(1 + Integer.parseInt(sno.substring(sno.length()-4)));
        }
        stringBuffer.append(id);
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        PrimaryGenerater primaryGenerater = new PrimaryGenerater();
        String id = primaryGenerater.generaterNextNumber("10001","Khtjd20180428100010046");
        System.out.println(id);
    }

}
