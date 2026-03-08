package lab4;
                                                   
public class datetime {
	private int year;
	private int month;
	private int day;
	public datetime(String dt){ 
		String [] value = dt.split("[-./]");
		year = Integer.parseInt(value[0]);
		month = Integer.parseInt(value[1]);
		day = Integer.parseInt(value[2]);
	}
	 private int getyearcode(int year){
		 return (year%100 + (year%100)/4)%7;
	 }
	 private int getmonthcode(int month){
		 switch(month) {
		 case 1: return 0; 
		 case 2: return 3;
		 case 3: return 3;
		 case 4: return 6;
		 case 5: return 1;
		 case 6: return 4;
		 case 7: return 6;
		 case 8: return 2;
		 case 9: return 5;
		 case 10: return 0;
		 case 11: return 3;
		 case 12: return 5;
		 default: return -1;
		 }
	 }
	 private int getcenturycode(int century) {
		 switch(century) {
		 case 17: return 4;
		 case 18: return 2;
		 case 19: return 0;
		 case 20: return 6;
		 case 21: return 4;
		 case 22: return 2;
		 case 23: return 0;
		 default: return -1;
		 }
	 }
	 private int getleapyearcode(int year, int month) {
		 if (year % 4 == 0 && year % 100 != 0 && (month==1 || month==2 )) return 1;
		 return 0;
	 }
	 private int dayofweek() { 
		 return( getyearcode(year) + getmonthcode(month) + getcenturycode(year/100) + day - getleapyearcode(year, month)) % 7;
	 }
	 public void printdayofweek() {
		 switch(dayofweek()) {
		 case 0: System.out.println("Sunday"); break;
		 case 1: System.out.println("Monday"); break;
		 case 2: System.out.println("Tuesday"); break;
		 case 3: System.out.println("Wednesday"); break;
		 case 4: System.out.println("Thursday"); break;
		 case 5: System.out.println("Friday"); break;
		 case 6: System.out.println("Saturday"); break;
		 }
	 } 	
	 	

}
