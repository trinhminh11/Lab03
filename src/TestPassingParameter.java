
public class TestPassingParameter {

	public static class Pair <T>{
		private T o1;
		private T o2;

		public Pair(T o1, T o2){
			this.o1 = o1;
			this.o2 = o2;
		}

		public void swap(){
			T tmp = o1;
			o1 = o2;
			o2 = tmp;
		}

		public T first(){
			return o1;
		}

		public T second(){
			return o2;
		}
	}


	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

		Pair<DigitalVideoDisc> pair = new Pair<DigitalVideoDisc>(jungleDVD, cinderellaDVD);

		pair.swap();

		jungleDVD = pair.first();
		cinderellaDVD = pair.second();
		
		

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


	public static void changeTitle(DigitalVideoDisc dvd, String tile){
		String oldTitle = dvd.getTitle();
		dvd.setTitle(tile);
		dvd = new DigitalVideoDisc(oldTitle);
	}

}
