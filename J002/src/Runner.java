
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Parent("Jhon");
		parent.whoAmI();
		Child child = new Child("Tom");
		child.whoAmI();
		Parent anotherChild = new Child("An");
		anotherChild.whoAmI();
	}

}
