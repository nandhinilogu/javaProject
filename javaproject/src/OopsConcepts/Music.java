package OopsConcepts;
abstract class Instrument{
	abstract public void play();
}
class Piano extends Instrument{

	@Override
	public void play() {
		System.out.println("“Piano is playing tan tan tan tan ");
		
	}
	
}
class Flute extends Instrument{

	@Override
	public void play() {
		System.out.println("Flute is playing toot toot toot toot");
		
	}
	
}
class Guitar extends Instrument{

	@Override
	public void play() {
		System.out.println("Guitar is playing tin tin tin ");
		
	}
	
}
public class Music {

	public static void main(String[] args) {
		int i;
		Instrument ins[]=new Instrument[10];
     for(i=0;i<10;i++){
    	 if(i==1||i==3||i==5){
    		 ins[i]=new Piano();
    	 }
    	 else if(i==2||i==8||i==6){
    		 ins[i]=new Flute();
    	 }else{
    		 ins[i]=new Guitar();
    	 }
    	 ins[i].play();
    	 if(ins[i]instanceof Piano){
    		 System.out.println("Instance Of Piano");
    	 }
    	 else if(ins[i]instanceof Flute){
    		 System.out.println("Instance Of Flute");
    	 }
    	 else{
    		 System.out.println("Instance Of Guitar");
    	 }
     }
	}

}
