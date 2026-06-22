package day4;
class UnitsBillAmount{
	
public static void main(String args[]) {
	int billAmount;
	int units = 112;
	if (units<=100) {
		billAmount=units*2;
	}
    else if(units<=200){
    	billAmount = (units-100)*3+(200);
		}
    else if(units<=300) {
    	billAmount = (units-200)*3+(500);
    }
   	else {
    	billAmount = (units-100)*3+(700);
    }
    System.out.println(billAmount);
	
}
}