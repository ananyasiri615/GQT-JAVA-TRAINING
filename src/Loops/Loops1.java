/*
* Loop : It is a mechanism where a particular set of logics are executed * multiple times.
*
* In java we have 4 different types of loops
* 1. for loop
* 2. while loop
* 3. do while loop
* 4. for each loop
*
*---> for loop
* syntax:
*
* for(initialization; condition; incrementation/decrementation)
* {
*
(logic that must be repeated)
*
* Sequence of execution in for loop
* 1. initialization
* 2. condition
* 3. execution of the logic
* 4. incrementation/decrementation */

package Loops;

public class Loops1 {
public static void main(String[] args) {
for (int i = 1; i <= 5; i++) {
System.out.println("Global Quest Technologies");
		}
	}
}

/*
* Step-1 i=1 i<=5 ---> 1<=5 (condition true) "Global Quest Technologies" * i++ --> i=i+1 ---> i=1+1 ---> i=2
*
* Step-2 i=2 i<=5 ---> 2<=5 (condition true) "Global Quest Technologies" * i++ --> i=i+1 ---> i=2+1 −−−> i=3
*
* Step-3 i=3 i<=5 ---> 3<=5 (condition true) "Global Quest Technologies" * i++ --> i=i+1 ---> i=3+1 ---> i=4
*
* Step-4 i=4 i<=5 ---> 4<=5 (condition true) "Global Quest Technologies" * i++ --> i=i+1 ---> i=4+1 ---> i=5
*
* Step-5 i=5 i<=5 ---> 5<=5 (condition true) "Global Quest Technologies" * i++ --> i=i+1 ---> i=5+1 ---> i=6
*
5
* Step-6 i=6 i<=5 --->6<=5 (condition false) loop terminates */

