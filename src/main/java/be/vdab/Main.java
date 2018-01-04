package be.vdab;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {

	public static void main(String[] args) {
//		List<Persoon> personen = new ArrayList<>();
//		personen.add(new Persoon(1,"Jan","Janssens",5));
//		personen.add(new Persoon(2,"Piet","Pieters",2));
//		personen.add(new Persoon(3,"Joris","Jorissen",0));
//		personen.add(new Persoon(4,"Korneel", "Korneelis",4));
		
		try(ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("container.xml")) {
			context.getBean(PersoonViewer.class).afbeelden();
		} catch (BeansException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
