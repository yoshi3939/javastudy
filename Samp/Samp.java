package jp.learning.javastudy;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Samp {

	public static void main(String[] args) throws IOException {
		String[] luckArray = {"最高","スッキリ","最悪"};
		int index = (int)(Math.random()*3);
		String luck = luckArray[index];
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M月dd日");
		String today = sdf.format(date);
		System.out.println("占い");
		System.out.println("今日の運勢♪" + today + "の運勢は「" + luck + "」です");
	}
}