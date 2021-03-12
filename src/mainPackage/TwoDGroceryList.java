package mainPackage;

public class TwoDGroceryList {

	public static void main(String[] args) {
		String[][] foodList={
			{"Tomato","Broccoli","Cabbage"},
			{"Strawberry","Grapes","Watermelon","Blueberries"},
			{"Milk","Cheese","Yogurt","Cream"},
			{"Snickers","Brownies","Cubcakes","Cake"}
		};
		
		for(int r=0;r<foodList.length;r++) {
			for(int c=0;c<foodList[r].length;c++) {
				System.out.print(foodList[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println("---------other way-----------------");

		for(String[] foods:foodList) {
			for(String food:foods) {
				System.out.print(food+" ");
			}
			System.out.println();

		}

	}

}
