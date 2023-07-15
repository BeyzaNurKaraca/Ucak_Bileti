package ucakBileti;

import java.util.Scanner;

public class ucakBileti {

	public static void main(String[] args) {
		/*
		 
		  Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. 
		  Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
		   Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve
		    sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

	Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, 
	yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" 
	şeklinde bir uyarı verilmelidir.
	Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
	Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
	Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
	Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
		  
		  */
		
		
		
		int mesafe,yas,yTip;
		double ucret,total,biletFiyat;
		Scanner input=new Scanner(System.in);
		System.out.print("Mesafeyi KM cinsinden giriniz: ");
		mesafe=input.nextInt();
		System.out.print("Yasinizi giriniz: ");
		yas=input.nextInt();
		System.out.print("Yolculuk gidis-donus ise '1' tek yon ise '2' ye basiniz: ");
		yTip=input.nextInt();
		ucret=mesafe*0.10;
		if (mesafe>0&&yas>0&&(yTip==1||yTip==2)) {
			
			switch (yTip ){
			case 1: {
				if (yas<12) {
					total=ucret-(ucret*0.50);
					biletFiyat=total-(total*0.20);
					System.out.print("Bilet ucretiniz: "+biletFiyat);
				}
				else if (yas>=12&&yas<24) {
					total=ucret-(ucret*0.10);
					biletFiyat=total-(total*0.20);
					System.out.print("Bilet ucretiniz: "+biletFiyat);
				}
				else if (yas>65) {
					total=ucret-(ucret*0.30);
					biletFiyat=total-(total*0.20);
					System.out.print("Bilet ucretiniz: "+biletFiyat);
				}
				else {
					biletFiyat=ucret-(ucret*0.20);
					System.out.print("Bilet ucretiniz: "+biletFiyat);
				}

				break;
			}
			case 2:{
				
				if (yas<12) {
					total=ucret-(ucret*0.50);
				
					System.out.print("Bilet ucretiniz: "+total);
				}
				else if (yas>=12&&yas<24) {
					total=ucret-(ucret*0.10);
					
					System.out.print("Bilet ucretiniz: "+total);
				}
				else if (yas>65) {
					total=ucret-(ucret*0.30);
					
					System.out.print("Bilet ucretiniz: "+total);
				}
				else {
					
					System.out.print("Bilet ucretiniz: "+ucret);
				}

				
				break;
			}
			default:
				
			}
			
		}
		else {
			System.out.println("Hatali veri girdiniz!!");
		}
		
		 
	}
	
}
