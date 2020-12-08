package Questions;
/*
 * find relative speed
 * condition:-
 * if direction=0; relative speed=speed1+speed2
 * if direction=1; relative speed=speed1-speed2
 * Assume:- speed1>=speed2
 */
public class RelativeSpeed {
public static int relativeSpeed(int direction,int distance1,int time1,int distance2,int time2){
	if(direction==0) {
		return (distance1/time1)+(distance2/time2);
	}
	else {
		return (distance1/time1)-(distance2/time2);
	}
}
public static void main(String[] args) {
	System.out.println(relativeSpeed(1,50,2,60,3));
}
}
