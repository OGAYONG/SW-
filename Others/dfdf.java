package Others;
class Board {
	int no;
	String title;
	public void hawi(int n){
		System.out.println("A");
	};
	
}
class Board2 extends Board{
	public void hawi(int a) {
		System.out.println("B");
	}
}
public class dfdf {
	public static void main(String[] args) {
		Board[] arr = new Board[2];
		arr[0] = new Board();
		arr[0].no = 1;
		arr[0].title = "A";
		System.out.println(arr[0].no + " ");
		System.out.println(arr[0].title + " ");
		Board b = new Board2();
		b.hawi(1);
	}

}
