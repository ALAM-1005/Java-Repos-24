package rtp;

class Employee {

	void work() {

		System.out.println("Employee is Working");
	}

class Developer extends Employee{


		@Override
		void work() {

			System.out.println("Developer app");
		}
	}

class Tester extends Employee{  //rule1
		@Override  // rule2
		void work() {

			System.out.println("Testing App");
		}
	}

}
