package kr.or.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatConvert {

	public static void main(String[] args) {
		Date now = new Date();
		DateFormat sdf = new SimpleDateFormat("yyy년MM월dd일E요일HH시간mm분ss초");
		System.out.println("현재날짜와 시간은" +sdf.format(now) + "입니다.");
	}

}
