package Loops;
/*
initialization;
dof
(logic that must be repeated)
incrementation/decrementation
*)while(condition);
it is a special loop where irrespective of what the condition loop will run at-least once.
*Sequence of execution in do while loop
1. initialization
2. execution of the logic
3. incrementation/decrementation 
4. condition 
*/

public class Loops3 {

	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println("Global Quest Technologies");
			i++;
		}
		while(i<=5);
	}

}
/*
Step-1 "Global Quest Technologies" i++ →→→ i=i+11=1+1 ->1=2 * i<=5 — 2<5> (condition true)
Step-2 "Global Quest Technologies" i++ i<=5—3<-5-(condition true)
i=i+1 →→→→ i=2+1 →→→1=3
Step-3 "Global Quest Technologies" i++ i=i+1 →→→→ i=3+1 →→→i=4 • i<=5—>4<5 (condition true)
Step-4 "Global
* i<5 →→→ 5<5
Quest Technologies" i++ → i=i+1 →→> i=4+1 −>i=5 (condition true)
Step-5 "Global Quest Technologies" i++-> i=i+1 →→→ i=5+1 →→→→i=6 * i<5 →> 6<5> [condition false) loop terminates
*/