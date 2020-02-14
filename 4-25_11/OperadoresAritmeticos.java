public class OperadoresAritmeticos{

	public static void main(String[] args){

		Integer precedencia01 = 1 + 1; //2
		System.out.println("precedencia01: " + precedencia01);

		Integer precedencia02 = 1 - 1; //0
		System.out.println("precedencia02: " + precedencia02);

		Integer precedencia03 = 2 * 2; //4
		System.out.println("precedencia03: " + precedencia03);

		Integer precedencia04 = 5 % 4; //1
		System.out.println("precedencia04: " + precedencia04);

		Integer precedencia05 = 2 * ((5 + 5) +  5)  ; //30
		System.out.println("precedencia05: " + precedencia05);

		Integer dois = 2;
		Integer cinco = 5;
		Integer preferencia06 = dois * ((cinco + cinco) + cinco); 
		System.out.println("preferencia06: " + preferencia06);

	}

}