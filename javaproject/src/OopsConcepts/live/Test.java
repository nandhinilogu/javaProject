package OopsConcepts.live;

import OopsConcepts.music.Playable;
import OopsConcepts.music.string.Veena;
import OopsConcepts.music.wind.Sexophone;

public class Test {

	public static void main(String[] args) {
		Veena v=new Veena();
		Sexophone s=new Sexophone();
		Playable pv,ps;
		pv=new Veena();
		ps=new Sexophone();
		v.play();
		s.play();
		pv.play();
		ps.play();
		
	}

}
