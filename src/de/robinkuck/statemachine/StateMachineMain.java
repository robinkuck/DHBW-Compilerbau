package de.robinkuck.statemachine;

public class StateMachineMain {

	public static void main(String[] args) throws Exception {
		System.err.println("BEGIN");
		StateMachineTest test = new StateMachineTest("StateMachine.txt");
		test.testRun();
		System.err.println("END");
	}

}
