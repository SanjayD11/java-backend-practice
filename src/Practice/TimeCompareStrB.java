package Practice;

import java.util.Iterator;

public class TimeCompareStrB {

	public static void main(String[] args) {

		String a = "India";

		StringBuilder sb = new StringBuilder(a);
		
		StringBuffer SBuff = new StringBuffer(a);

		long beforeSB = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			sb.append(i);
		}
		long afterSB = System.currentTimeMillis();

		long beforeSBuff = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			SBuff.append(i);
		}
		long afterSBuff = System.currentTimeMillis();
		
		System.out.println("TimeTaken by StringBuilder: "+(afterSB-beforeSB));
		System.out.println("TimeTaken by StringBuffer: "+(afterSBuff-beforeSBuff));
		
	}
}