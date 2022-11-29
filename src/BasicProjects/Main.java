package BasicProjects;

public class Main {

	public static void main(String[] args) {
		
		// Is the sayi prime or not? - sayi asal mı değil mi?
		// Yalnız 1 ve kendisine bölünebilen sayilara asal sayi denir.
		// İlk çözüm kendi çözümüm
		int number=2;
		int remainder ;
		int flag=0;		
		
		if(number<1) {
			System.out.println("Invalid number!");
			return;
		}
		
		
		for(int i=1; i<=number; i++) {
			remainder= number % i;
			if(remainder==0)
				flag++;

		}
			
		if(flag==2)
			System.out.println(number + " is PRIME");
		else
			System.out.println(number + " isn't PRIME");
		
		System.out.println(".........");
		
		// Video Çözümü (1'in asallığında bug karşımıza çıkıyor):
		int sayi = 29;
		boolean AsalMi= true;
		
		if(sayi == 1)
			System.out.println(sayi + " ASAL değil");
		
		for(int i=2; i<sayi; i++) {
			if(sayi%i==0)
				AsalMi =false;
		}
		
		if(AsalMi)
			System.out.println(sayi + " ASAL");
		else
			System.out.println(sayi + " ASAL değil");
		
		
		
		
		System.out.println("-----------------------------------------------------------------");
		
		
		// Bir harfin kalın sesli mi ince sesli mi olduğunu bulma:
		
		char harf='a';
		
		switch(harf) {
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
		case 'e':
		case 'i':
		case 'ö':
		case 'ü': 
			System.out.println("Harf ince unludur.");
			break;
		case 'A':
		case 'O':
		case 'U':
		case 'I':
		case 'a':
		case 'o':
		case 'u':
		case 'ı':
			System.out.println("Harf kalin unludur.");
			break;
		default:
				System.out.println("Sessiz harfdir");
		}
		
		
		System.out.println("------------------------------------------------------------------------");
		
		// Bir sayının Mükemmel Sayı olup olmadığını bulma:
		// Mükemmel sayı nedir? Kendisi hariç pozitif tam sayı bölenlerinin toplamı sayının
		// kendisine eşitse mükemmel sayıdır.
		// 6 - 28 - 496 - 8128 - 33550336
		
		// İlk çözüm kendi çözümüm.
		int number2 = 28;
		int total=0;
		
		for(int i=1; i<number2; i++) {
			if(number2%i==0) {
				total=total+i;
			}
		}
		
		if(total==number2) {
			System.out.println("This number is perfect number!");
		}else
			System.out.println("This number isn't perfect number!");
		
		
		
		System.out.println("---------------------------------------------------------------------------");
		
		
		// Arkadaş sayıları bulma :
		
		// İki sayı birbirinin kendisi hariç bölenleri toplamına eşitse bu sayılara arkadaş
		// sayı denir.
		
		// 220 ve 284 , 17296 ve 18416
		
		int numberX =18416;
		int numberY=17296;
		
		int total1=0;
		int total2=0;
		
		for(int i=1; i<numberX;i++) {
			if(numberX%i==0)
				total1+=i;
		}
		for(int j=1; j<numberY; j++) {
			if(numberY%j==0)
				total2+=j;
		}
		
		if(total1 == numberY && total2 == numberX) // iki şartında gerçeklşmesi gerektiği için VE (&&) operatörü kullanıldı
			System.out.println("These numbers are friends number !");
		else
			System.out.println("These number aren't friends numbers !");
		
		
		
		System.out.println("---------------------------------------------------------------------------");

		
		// Aranan sayının dizi içerisinde olup olmadığını bulma:
		
		
		int[] numbers =new int[] {3,5,7,8,9};
		int wanted = 10;
		boolean isThere = false;
		
		for(int x: numbers) {
			if(x==wanted) {
				isThere=true;
				break;
			}
		}
		
		if(isThere)
			System.out.println("Number found.");
		else
			System.out.println("Number not found.");
		
		
	}

}
