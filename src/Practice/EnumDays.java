package Practice;
public class EnumDays {
enum Days{
	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
	 int num;
	Days(int num1){
		this.num = num1;
	}
	 int getNum() {
		return num;
	}
}
public static void main(String[] args) {
Days d1 = Days.SUNDAY;
Days d2 = Days.MONDAY;
Days d3 = Days.TUESDAY;
Days d4 = Days.WEDNESDAY;
Days d5 = Days.THURSDAY;
Days d6 = Days.FRIDAY;
Days d7 = Days.SATURDAY;
EnumDays d = new EnumDays();

switch (d1){
case SUNDAY :
	System.out.println("The day is Sunday and whose number is : "+d1.getNum());
	break;
case MONDAY :
	System.out.println("The day is Monday and whose number is : "+d2.getNum());
	break;
case TUESDAY :
	System.out.println("The day is Tuesday and whose number is : "+d3.getNum());
	break;
case WEDNESDAY:
	System.out.println("The day is Wednesday and whose number is : "+d4.getNum());
	break;
case THURSDAY :
	System.out.println("The day is Thursday and whose number is : "+d5.getNum());
	break;
case FRIDAY :
	System.out.println("The day is Friday and whose number is : "+d6.getNum());
	break;
case SATURDAY:
	System.out.println("The day is Saturday and whose number is : "+d7.getNum());
	break;
default :
	System.out.println("The day is Invalid");
}
}
}
