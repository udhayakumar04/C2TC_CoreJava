package interfaceexample;

public class Trainer implements Coder  {
	@Override
	public void rules() {
		System.out.println("Morning wakeup at "+ wakeup);
		System.out.println("And check the students progress");
	}
}
