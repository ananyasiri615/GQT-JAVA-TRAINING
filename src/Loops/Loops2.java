package Loops;

/* ---> while loop * syntax:
*
* initialization;
* while(condition)
*{
*
*
(logic that must be repeated)
* 
* incrementation/decrementation
*} 
*Sequence of execution in for loop
* 1. initialization
* 2. condition
* 3. execution of the logic
* 4. incrementation/decrementation
**/

public class Loops2 {

	public static void main(String[] args) {
		System.out.println("Global Quest Technologies");
		int i=1;
		while(i<=5) {
		System.out.println("Global Quest Technologies");
		i++;
		}
	}
}
/*
﻿/* i=1
Step-1 1-1 1-5 -> 1<5 (condition true) "Global Quest Techno 
• i++ --> i=i+1 →→→ 11+1 →→→→
Step-2 1-2 i5 →→→ 25 (condition true) "Global Quest Techno 
• i++ →→→ i=i+11=2+113
- Step-3 1-3 i<=5 -> 3<=5 (condition true) "Global Quest Techno
PT <I+E=T<-- T+T#T <~ ++T *
Step-4 1-4 i<«5 →→>4<«5 (condition true) "Global Quest Techno 
* i++ →→→ i=i+1 →→→→→ i=4+1 →→→→→→ i=5
Step-5 1-5 i<5 →→→→→→ 5<5 (condition true) "Global Quest Techno 
* i++− j=i+1-1-5+1 -> 16
Step-6 1-1 i<=5 →→→→ 6<5 (condition false) loop terminates
*/
