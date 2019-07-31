package CommandLineArguments.TwoWheeler;

import CommandLineArguments.Automobile.Vehicle;

class Hero extends Vehicle{
	public int speed(){
		return 72;
	}
	public void radio(){
		System.out.println("radio device");
	}
}
class Honda extends Vehicle{
	public int speed(){
		return 80;
	}
	public int cdplayer(){
		return 65;
	}
}
public class Twowheeler {

	public static void main(String[] args) {
		Honda ha=new Honda();
		Hero ho=new Hero();
		System.out.println(ha.speed());
		System.out.println(ha.cdplayer());
		System.out.println(ha.ModelName());
		System.out.println(ha.registrationNumber());
		System.out.println(ha.ownerName());
		System.out.println(ho.speed());
		ho.radio();

	}

}
