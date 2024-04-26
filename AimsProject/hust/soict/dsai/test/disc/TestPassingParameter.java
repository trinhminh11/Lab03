import hust.soict.dsai.aims.disc.DigitalVideoDisc;


public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

		swap(jungleDVD, cinderellaDVD);
		

		System.out.println("jungle dvd title " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title " + cinderellaDVD.getTitle());

		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title " + jungleDVD.getTitle());
	}

	public static void swap(Object o1, Object o2){
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}

	public static void swap(DigitalVideoDisc d1, DigitalVideoDisc d2){
		DigitalVideoDisc temp = new DigitalVideoDisc("temp");
		temp.deepCopy(d1);
		d1.deepCopy(d2);
		d2.deepCopy(temp);
	}

	public static void changeTitle(DigitalVideoDisc dvd, String tile){
		String oldTitle = dvd.getTitle();
		dvd.setTitle(tile);
		dvd = new DigitalVideoDisc(oldTitle);
	}

}
