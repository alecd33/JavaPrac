package objectsAndClasses;

public class TypeOfDogs {

	public static void main(String[] args) {
		Dogs BullDog=new Dogs();
		
		BullDog.size="Large";
		BullDog.breed="Bulldog";
		BullDog.color="light Gray";
		BullDog.age=5;
		BullDog.bark();
		BullDog.sleep();
		BullDog.eat();
		BullDog.look();
		
		
		Dogs Beegle=new Dogs();
		
		Beegle.size="Large";
		Beegle.breed="Beegle";
		Beegle.color="Orange";
		Beegle.age=6;
		
		Dogs GermanShephard=new Dogs();
		
		GermanShephard.size="large";
		GermanShephard.breed="German Shephard";
		GermanShephard.color="White and Orange";
		GermanShephard.age=6;
		
		

	}

}
