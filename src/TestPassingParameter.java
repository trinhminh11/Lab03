public class TestPassingParameter {


	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");


		TrueSwap(jungleDVD, cinderellaDVD);
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

	public static void TrueSwap(DigitalVideoDisc d1, DigitalVideoDisc d2){
		DigitalVideoDisc tmp = d1;
		d1.DeepCopy(d2);
		d2.DeepCopy(tmp);
	}

	public static void changeTitle(DigitalVideoDisc dvd, String tile){
		String oldTitle = dvd.getTitle();
		dvd.setTitle(tile);
		dvd = new DigitalVideoDisc(oldTitle);
	}

}
