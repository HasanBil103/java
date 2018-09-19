package dogmgunu2;

import java.util.Scanner;

public class dogumgunu2 {
	
	

	
		public static void main(String[] args) {
			
			String set1 = "1  3  5  7\n" + "9  11 13 15\n" + "17 19 21 23\n" + "25 27 29 31\n";
			String set2 = "2  3  6  7 \n" + "10 11 14 15\n" + "18 19 22 23\n" + "26 27 30 31\n";
			String set3 = "4  5  6  7\n" + "12 13 14 15\n" + "20 21 22 23\n" + "28 29 30 31\n";
			String set4 = "8  9  10 11\n" + "12 13 14 15\n" + "24 25 26 27\n" + "28 29 30 31\n";
			String set5 ="16 17 18 19\n" + "20 21 22 23\n" + "24 25 26 27\n" + "28 29 30 31\n";
			
			String set6 = "1  3  5\n" + "7  9  11\n";
			String set7 = "2  3  6\n" + "7  10 11\n";
			String set8 = "4  5\n" + "6  7  12\n";
			String set9 = "8  9\n" + "10 11 12\n";
			
			String set10= "1 3 5 7 9\n";
			String set11= "2 3 6 7\n";
			String set12= "4 5 6 7\n";
			String set13= "8 9\n";
		
			
			int top = 0, sayi = 0 , ay=0, y1=1, y2=0, y3=0, y4=0;
			
			System.out.println(set1);
			Scanner scanner = new Scanner(System.in);
			System.out.println("Doğum gününüz bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			
			sayi = scanner.nextInt();
			
			if(sayi == 1 ) {
			
				top += 1;
			}
			
			System.out.println(set2);
			System.out.println("Doğum gününüz bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi1 = scanner.nextInt();
			
			if(sayi1 == 1 ) {
			
				top += 2;
			}
			
			
			System.out.println(set3);
			System.out.println("Doğum gününüz bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi2 = scanner.nextInt();
			
			if(sayi2 == 1 ) {
			
				top += 4;
			}
			
			System.out.println(set4);
			System.out.println("Doğum gününüz bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi3 = scanner.nextInt();
			
			if(sayi3 == 1 ) {
			
				top += 8;
			}
			
			System.out.println(set5);
			System.out.println("Doğum gününüz bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi4 = scanner.nextInt();
			
			if(sayi4 == 1 ) {
			
				top += 16;
			}
			
			
			
			System.out.println(set6);
			System.out.println("Doğum ayınız bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi5 = scanner.nextInt();
			
			if(sayi5 == 1 ) {
			
				ay += 1;
			}
			
			

			System.out.println(set7);
			System.out.println("Doğum ayınız bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi6 = scanner.nextInt();
			
			if(sayi6 == 1 ) {
			
				ay += 2;
			}
		

			System.out.println(set8);
			System.out.println("Doğum ayınız bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi7 = scanner.nextInt();
			
			if(sayi7 == 1 ) {
			
				ay += 4;
			}
			

			System.out.println(set9);
			System.out.println("Doğum ayınız bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi8 = scanner.nextInt();
			
			if(sayi8 == 1 ) {
			
				ay += 8;
			}
			
			
			System.out.println("Doğum yılınızı rakam rakam inceleyeceğiz!");
			
			System.out.println(set10);
			System.out.println("Doğum yılınızın ikinci basamağı bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi9 = scanner.nextInt();
			
			if(sayi9 == 1 ) {
			
				y2 += 1;
			}
			System.out.println(set11);
			System.out.println("Doğum yılınızın ikinci basamağı bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi10 = scanner.nextInt();
			
			if(sayi10 == 1 ) {
			
				y2 += 2;
			}
			System.out.println(set12);
			System.out.println("Doğum yılınızın ikinci basamağı bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi11 = scanner.nextInt();
			
			if(sayi11 == 1 ) {
			
				y2 += 4;
			}
			System.out.println(set13);
			System.out.println("Doğum yılınızın ikinci basamağı bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi12 = scanner.nextInt();
			
			if(sayi12 == 1 ) {
			
				y2 += 8;
			}
			
			System.out.println("Doğum yılınızın 3. basamağı 0 ise 0'a bas değilse 1'e bas");
			int sayi13 = scanner.nextInt();
			if(sayi13 ==0) {
				
				y3 +=0;
			}
			else
				System.out.println("Doğum yılınızı rakam rakam inceleyeceğiz!");
			
			System.out.println(set10);
			System.out.println("Doğum yılınızın ücüncü basamağı bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi14 = scanner.nextInt();
			
			if(sayi14 == 1 ) {
			
				y3 += 1;
			}
			System.out.println(set11);
			System.out.println("Doğum yılınızın ücüncü basamağı bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi15 = scanner.nextInt();
			
			if(sayi15 == 1 ) {
			
				y3 += 2;
			}
			System.out.println(set12);
			System.out.println("Doğum yılınızın ücüncü basamağı bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi16 = scanner.nextInt();
			
			if(sayi16 == 1 ) {
			
				y3 += 4;
			}
			System.out.println(set13);
			System.out.println("Doğum yılınızın üçüncü basamağı bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi17 = scanner.nextInt();
			
			if(sayi17 == 1 ) {
			
				y3 += 8;
			} 
			
			
				
				
			
		
		System.out.println("Doğum yılınızın 4. basamağı 0 ise 0'a bas değilse 1'e bas");
		int sayi18 = scanner.nextInt();
		if(sayi18 ==0) {
			
			y4 +=0;
			
		}
		
		else {
			System.out.println("Doğum yılınızı rakam rakam inceleyeceğiz!");
		
		System.out.println(set10);
		System.out.println("Doğum yılınızın dördüncü basamağı bunlardan biri mi?" );
		System.out.println("Evet için 1'e Hayır için 0'a basınız.");
		int sayi19 = scanner.nextInt();
		
		if(sayi19 == 1 ) {
		
			y4 += 1;
		}
		System.out.println(set11);
		System.out.println("Doğum yılınızın dördüncü basamağı bunlardan biri mi?" );
		System.out.println("Evet için 1'e Hayır için 0'a basınız.");
		int sayi20 = scanner.nextInt();
		
		if(sayi20 == 1 ) {
		
			y4 += 2;
		}
		System.out.println(set12);
		System.out.println("Doğum yılınızın dördüncü basamağı bunlardan biri mi?" );
		System.out.println("Evet için 1'e Hayır için 0'a basınız.");
		int sayi21 = scanner.nextInt();
		
		if(sayi21 == 1 ) {
		
			y4 += 4;
		}
		System.out.println(set13);
		System.out.println("Doğum yılınızın dördüncü basamağı bunlardan biri mi?" );
		System.out.println("Evet için 1'e Hayır için 0'a basınız.");
		int sayi22 = scanner.nextInt();
		
		if(sayi22 == 1 ) {
		
			y4 += 8;
		} 
		
		}
			System.out.println("Doğum gününüz : " +top+"."+ay+"."+y1+y2+y3+y4);
			
			if(((top>=22||top<=31)&&ay==1)||(top<=19&&ay==2)) {
			System.out.println("Kova burcusunuz: ");	
			System.out.println("Hayal güçleri sınırsız olmakla birlikte, düşünceleri bulundukları anın ötesinde, akılcı "
					+ "\nve sezgiseldir. Kova 'lar dik kafalıdırlar. Kendilerini dinleyenlerin ne demek istediklerini "
					+ "\nanlamadıklarını sanırlar. Kovaları tanımlayan sözcük 'Biliyorum' dur. Kova burcu insanları sevecen"
					+ " \ntavırları ile tanınırlar. Bu kişiler bencil değildirler. Irk, cinsiyet ve sosyal durumuna "
					+ "\nbakmaksızın, herkesin ayni olanaklara sahip olmasını isterler. Modern görünüşlerine karşın, inatçı"
					+ "\nve sabit fikirli olurlar. Onlara yaklaşmak çok zordur, çünkü ne kadar dostça davranırlarsa "
					+ "\ndavransınlar, arada her zaman bir mesafe bırakırlar. Kişisel özgürlükleri onlar için o denli"
					+ "\nönemlidir ki, bu yüzden en yakın ilişkilerini kesip atabileceği gibi, yine özgürlükleri adına her"
					+ "\ntürlü özveride bulunurlar. Bu yüzden Kovalara aile yaşamı biraz zor gelir. Çoğu zaman yeni bir "
					+ "\nşeyler keşfetmek için uğraşıda bulunurlar. Belli ilkeleri sonuna dek savunmaları onları hiç "
					+ "\\nrahatsız etmez.");
			
			}
			
			if(((top>=20||top<=31)&&ay==2)||(top<=20&&ay==3)) {
				System.out.println("Balık burcusunuz : ");
				System.out.println("Sabır, eli açıklık ve duyarlılık bu burçta doğan kişilerin en önemli nitelikleridir."
						+ "\nBüyük bir inandırma yetenekleri vardır. Dürüst, vicdan sahibi, sadık ve uysaldırlar. Her "
						+ "\nçevreye kolayca uyabilirler. Genellikle hayal dünyasında yaşarlar. Yaşam görüşleri ciddi "
						+ "\nfakat gerçekçi değildirler. Balık burcu, diğer burçlar arasında dış etkenlerden en çok "
						+ "\netkilenen kişilerdir. Düş dünyasında, öylesine mutludur ki, bazen onun aptal olduğunu bile "
						+ "\ndüşünebilirsiniz. Ama, zannettiğinizden daha akıllı ve kurnazdır. Sinirli yapısını gizli bir "
						+ "\nsakinlikle örterken, herkesin seçtiği özel bir kişi olmanın hayallerini kurarlar. Yaşam onun "
						+ "\niçin ürkütücü ve korkunçtur..Balık burcu insanını dışarıdan gözlemleyenler; duygusal yapısının"
						+ "\nbir aşk acısına dayanamayacağını zannederler ve kötü haberi hemen vermek istemezler. Aslında,"
						+ "\nkırılgan görüntüsünün altında güçlü bir kişilik yatar. Göz yaşlarını kısa sürede kurutur ve"
						+ "\nmendillerini bir kenara atarak, yeni bir yaşamın içinde kendini bulur. Onları teselli edecek"
						+ "\no kadar kişi bulunur ki; yeni bir aşk acısı kapısını çalıncaya kadar, hayatını istediği gibi"
						+ "\nyaşar. Duygusal kırıklıklar pes etmelerine yetmez ve bir sürü yarım kalmış aşkıyla birlikte "
						+ "\nbir dolu anlatılacak anılarıyla yaşamını tamamlar.");
			}
			if(((top>=21||top<=31)&&ay==3)||(top<=20&&ay==4)) {
				System.out.println("Koç burcusunuz : ");	
				System.out.println("Koç, Burçlar kuşağının ilk burcudur. Hareketli ve enerjik oluşları ile tanınırlar. Ben "
						+ "\negoları çok fazla gelişmiştir. BEN, onların aynası olmuştur adeta. Bu burçta doğanlar çok pratiktir"
						+ "\nler. Olaylar karşısında coşkularını gizleyemezler. Yaşam yolunda canlılıklarını ve atılganlıklarını"
						+ "\nyitirmeden heyecanla ilerlerler. Merak ettikleri konularda olabildiğince yaratıcılardır. Amaçları"
						+ "\ndoğrultusunda ilerlerken, kendilerini eylemleri ile kanıtlamak isterler. Eğer Koç'lar girişimde "
						+ "\nbulunacakları zaman izleyecekleri rotayı ayrıntıları ile planlarsa, enerjik yapılarının da yardımı"
						+ "\nile daha da üretken olabilirler. Bencilliklerinden kaynaklanan sabırsızlıkları ve söz dinlemez"
						+ "\nyaratılışları yüzünden zaman zaman güç durumlara düştükleri de olur. Böyle anlarda başladıkları"
						+ "\nişlerini sonuçlandırmadan bırakırlar. Konuşmaları abartılıdır, bazen gerçekleri değiştirerek "
						+ "\nanlatırlar. Kavrama yetenekleri fazla olan Koç'lar yaşam sahnesinin başrolünde olmayı tercih "
						+ "\nederler. Aşırı kıskanç ve bağımsızlıklarına düşkün olurlar.");
			}
			if(((top>=21||top<=31)&&ay==4)||(top<=21&&ay==5)) {
				System.out.println("Boğa burcusunuz : ");
				System.out.println("Boğa'lar hedefleri doğrultusunda ilerlerken, tüm dikkatlerini toplayabilme yetenekleri"
						+ "\nnin yanında maddecilikleri ile tanınırlar. SAHİP olma onların yaşam gerçekleridir. Bireysel"
						+ "\nilişkiler konusunda son derece güvenilir olan Boğa'lar, insanlara yardım etmekten hoşlanırlar."
						+ "\nYaşamları boyunca güven ararlar ve bu yüzden kendilerini riske atmazlar. Amaçladıkları işler"
						+ "\nkonusunda gösterdikleri sabır, bazen diğer kişileri çatlatacak boyutlarda olabilir. Bütün"
						+ "\nbunlara rağmen çevresi tarafından aranılan, sıcakkanlı insanlardır. Sürekli somut konularla "
						+ "\nuğraşmayı severler, doğada bulunan olaylardan örneklemelerle işlerini başarılı bir şekilde "
						+ "\nyürütürler. Bu yüzden ruhsal olarak da doyumlu kişilerdir. Olayları organize ederlerken "
						+ "\nrahatlıklarını gözetirler ve kendilerinin zevklerine uygun olmasına önem verirler. Yaşamdaki "
						+ "\nisteklerini elde ettikleri zaman, hiçbir koşul onları başka yönlere çekemez. Parayı rahata "
						+ "\nulaşmak için bir araç olarak görürler. Mal ve mülk edinme konusunda beceriklidirler. Finans ve"
						+ "\nyatırım konuları ilgilerini çeker.");
			}
			if(((top>=22||top<=31)&&ay==5)||(top<=22&&ay==6)) {
				System.out.println("İkizler burcusunuz : ");
				System.out.println("kizler burcu insanları hızlı düşüncelerine uygun çabuk hareket ederler. Ayni anda "
						+ "\nbirkaç işi birden yapabilirler. Onların adapte olamayacakları iş yoktur. Bu yüzden değişik "
						+ "\nkarakterli olmaları ile tanınırlar. Bu yapılarını her zaman görebilmek mümkündür. Son derece "
						+ "\nneşeli ve mutlu oldukları bir anda, aniden mutsuz olabilirler. Çevreleri tarafından sürekli "
						+ "\nyanlış anlaşılabilirler. Herhangi bir konuda bilgileri az bile olsa, bunu çok iyi gizlemeyi"
						+ "\nbaşarırlar. Aksine; kulaktan dolma duydukları bilgileri öyle ustaca anlatırlar ki, "
						+ "\ndinleyenler onları o işin uzmanı sanırlar. Pratik zekalarıyla, çekici ve akıllıdırlar. Bu "
						+ "\nnedenle onları tanımlayan sözcük 'Düşünüyorum' dur. Fakat, bu düşünceleri hep yeni arayışlara"
						+ "\ndoğru yönelmiştir. Bu yüzden uzun soluklu çalışmalar onları yorar. Kendilerini iyi eğitmiş "
						+ "\nikizler hoş ve zariflikleri ile yaşamı zevkli kılarlarken, eğitimsiz olanlar da yaşamı o kadar"
						+ "\nçekilmez hale getirirler. Kendi paralarına karşı tutumlu davranmalarına karşın, başkalarının"
						+ "\nparalarını kolayca harcayabilirler.");
			}
			if(((top>=23||top<=31)&&ay==6)||(top<=22&&ay==7)) {
				System.out.println("Yengeç burcusunuz : ");
				System.out.println("Yaşamlarındaki her konuda aşırı bir şekilde hassas, alıngan ve kuruntulu olan Yengeç'leri "
						+ "\ntanımlayan sözcük 'Hissederim' dir. Sorumluluk duyguları çok gelişmiştir. Her işte olağanüstü olan "
						+ "\nayrıntıcılıkları, işlerinde mükemmeliyetçiliği getirir. Ayni sorumlulukları karşılarındakilerden de"
						+ "\nbeklerler. Yengeç'ler duygusallıkları ve duyarlılıkları ile tanınırlar. Çevresindeki her insandan da"
						+ "\nayni hassasiyeti bekledikleri için, kolay geçinilir tipler değildir. İyi günlerinde neşeli, iyi "
						+ "\nkalpli, yardımsever, düşünceli ve anlayışlıdırlar. Fakat herhangi belirgin bir neden olmadan somurtkan"
						+ "\nve alıngan olabilirler. Yakınlarını ve arkadaşlarını çok sevmelerine karşın, bunu pek belli etmezler."
						+ "\nKendilerini herhangi bir şekilde inciten kişileri zor bağışlarlar ve yapılan hareketi asla unutmazlar."
						+ "\nYengeç'ler müziğe ve dinsel konulara karşı ilgilidirler. Sabırlı olan Yengeç'ler tartışmalardan "
						+ "\nkesinlikle hoşlanmazlar. Duygularını sessiz bir şekilde saklarlar.");
				}
				
				if(((top>=23||top<=31)&&ay==7)||(top<=22&&ay==8)) {
					System.out.println("Aslan burcusunuz : ");
					System.out.println("Aslan kraldır, önderdir. Başkalarının yaşantılarını da onlar adına düzenlemek "
							+ "\nisterler. Her şeye karışırlar, kibirlidirler. Bu nedenle onları tanımlayan sözcük "
							+ "\nYönetirim' dir. Yaşam sahnesinde her zaman parlayarak, odak noktası olmak isterler. "
							+ "\nOrganizasyon güçleri çok fazladır. İsteklerini başkalarına kabul ettirmek, onlar için "
							+ "\nyaşamlarının 'olmazsa olmaz' şartıdır. İyi zamanlarında etkileyici, güler yüzlü, "
							+ "\nbaşkalarına yardım etmeyi seven ve bunu kendine görev sayan Aslan'lar sevimli ve iyimser "
							+ "\nkişilerdir. Ona karşı hatalı davransanız bile, size olgun bir şekilde tepki verir. Fakat;"
							+ "\nSabrı taştıktan sonra, dürüst ve mert, gerektiğinde sert bir şekilde tavır gösterir. Zor"
							+ "\ngünlerinde şansları onlara her zaman yardım eder. Yönetici gezegenleri Güneş onları en "
							+ "\nkaranlık günlerinde aydınlığa çıkarır. Eğitimsiz ve gelişmemiş Aslan tipleri çekilmez "
							+ "\nolurlar. Her konuda sahip olduklarından daha fazlası varmış gibi davranırlar.");
				
			}
			
				if(((top>=23||top<=31)&&ay==8)||(top<=22&&ay==9)) {
					System.out.println("Başak burcusunuz : ");
				System.out.println("Yönetici gezegeninizden dolayı hep bilgiyi ararlar. Zekalarını kendilerine yardımcı"
						+ "\nolan bir hizmetçi gibi görürler. Bu nedenle Başak burcunu tanımlayan sözcük 'İncelerim “ dir."
						+ "\nBaşak'lar çalışkan ve pratik insanlar olup, yaşamlarındaki en önemli konu İş' tir. "
						+ "\nGüvendikleri kişilere yardım etmeyi sevmelerine rağmen, inanmadıkları ve tembel olduklarını "
						+ "\nbildikleri kişilere karşı soğuk davranırlar. Yaşamları boyunca dinlenmeden çalışırlar. "
						+ "\nOnların dinlenme biçimi bile başkalarına yorucu gelebilir. Başak'ların yaşamda ayrıntılar "
						+ "\narasında boğulma riskleri hep vardır. Böyle anlarda bile, kendi yöntemleri ile yaptıkları "
						+ "\nişlerde gelişigüzel şeyler bulunabileceğini kabul etmezler. Başaklar, genellikle kendilerini "
						+ "\nhiç kimseye kullandırtmazlar, sınırlarını belirleyerek 'hayır' demesini bilirler. "
						+ "\nTutumlulukları bazen pintilik derecesindedir. İçli-dışlı olmayı sevmedikleri için, soğuk ve "
						+ "\nmesafeli bir görünüşleri vardır.");
					
		}
				
				if(((top>=23||top<=31)&&ay==9)||(top<=22&&ay==10)) {
					System.out.println("Terazi burcusunuz : ");
			System.out.println("Kararsızlıkları ile ünlü cazibe sembolü karşınızda duruyor. Nedenini bilmediğiniz bir "
					+ "\nçekim gücü etkisi altına girdiğinizi fark ettiğinizde iş işten çoktan geçmiş olacaktır. Onların "
					+ "\nbüyülü bir havası vardır. Ritmik hareketleri ile dans eder gibi bir yaşam sürer. Onun yanında "
					+ "\nkızgınlıklarınız yok olur. En sinirli anınızda bile sizi regüle etme yeteneğine sahiptir. Üstelik,"
					+ "\ntartışmayı sevmesine rağmen; bu kadar ustalıkla konulara hakim olup, sonrada sesini hiç "
					+ "\nyükseltmeden zaferini ilen eden çok az kişi vardır. Bir Terazi bunu başarır. Sizin kılıç "
					+ "\nalladığınız ortamlarda, o; gülücüklerini, zarafetini ve öpücüklerini gönderecektir. Kafasında "
					+ "\nmüthiş bir denge vardır. Onun ne düşündüğünü bilemezsiniz. Uyumlu ve sevecen yapısının altında"
					+ "\ngizli bir güç vardır. Bulunduğu ortamları çok çabuk inceler ve gizli detayların nerede saklı "
					+ "\nolduğunu bulmaya çalışır. Konuya hakim olmak için deliler gibi çalışmak ve kendini harap etmek "
					+ "\nyerine, keskin görüşlerini ve doğru mantığını kullanacağı ortamları seçer. Başarılı olmak için "
					+ "\nimkansızlığı değil, kendini yüceltecek elle tutulur konular üzerinde uyumlu bir sessizlikle "
					+ "\nçalışır. Yaptığı işlerin doğruluğuna inandığı halde, onay beklemekten de kendini alamaz. Onu "
					+ "\ntenkit etme gibi bir şansınız asla olamaz. Böyle bir şeye kalkıştığınız taktirde; size tüm "
					+ "\nzarafetiyle gülümseyecek, önerilerinizi can kulağıyla dinleyecek ve sonunda kibarca teşekkür "
					+ "\nederek sizden uzaklaşacaktır. Fakat bir daha asla sizin fikrinizi sormayacaktır. Gülümseyen "
					+ "\nçehresinin altında müthiş bir ego gizlidir, aşk ve sanat onun yaşam öğeleridir. Dünyada her "
					+ "\nşeyden vazgeçebilir, fakat kişiliğini besleyen ve duygusallığını yansıtan soyut kavramlarından "
					+ "\nvazgeçemez. Akıl, mantık, aşk işte karşınızda her şeyiyle özel bir kişi duruyor. Onun "
					+ "\nterazilerinin kefesinde yer almak istiyorsanız, belli standart ölçülerin çok üstünde olmanız "
					+ "\ngerekir. Kolay bir insan olmadığını şimdiden hatırlatırız.");
					
			}
				if(((top>=23||top<=31)&&ay==10)||(top<=21&&ay==11)) {
					System.out.println("Akrep burcusunuz : ");
					System.out.println("Akrepler kadar yaşamda tutkuyla yaşayan az insan vardır. Bu nedenle onları"
							+ " \nsimgeleyen sözcük 'Arzuluyorum' dur. Hiçbir şeyi yarım bırakmazlar. Akreplerin güçleri"
							+ "\ngözlerinden okunur. Mimiklerini kontrol altında tutsalar bile, bakışları ile sevgilerini"
							+ "\nya da nefretlerini aktarabilirler. Duygularına kapılırlarsa, tehlikeli olabilirler. "
							+ "\nAkrep'ler ukala ve kendini beğenmiş insanları sevmezler, onları aşağılayarak hadlerini"
							+ "\nbildirirler. Kendi bildiklerini okuyarak, uzlaşmaya yanaşmazlar. Aşırı bir şekilde "
							+ "\nkuşkuculardır, kolay inanmazlar ama inandıkları bir konuyu da sonuna kadar inatla "
							+ "\nsavunurlar. Çalışmalarında sabır ve özenle çalışırlarken, gösterişten uzak bir şekilde "
							+ "\nişlerini yaparlar. Kendilerini yetiştirmemiş Akrep'ler, yaşamın basitliklerine "
							+ "\nyatkınlıkları ile kendi kendilerinin yok oluşlarına neden olurlar. Cinsellik yaşamlarında"
							+ "\nönemli bir yer tutar. Ölümü yeni bir başlangıç olarak kabul ettiklerinden, ölümden "
							+ "\nkorkmazlar..");
				}
				if(((top>=22||top<=31)&&ay==11)||(top<=21&&ay==12)) {
					System.out.println("Yay burcusunuz : ");
		System.out.println("Kavrama yetenekleri gelişmiş olduğundan becerikliliklerinin de katkısı ile ele aldıkları "
				+ "\nher işte, özellikle ciddi işlerde ve felsefe konularında başarılı olurlar. Bu nedenle Yay Burcunu"
				+ "\ntanımlayan sözcük 'Görüyorum' dur. Yay burcu insanları içtenlikleri ve iyimser yaşam görüşleri ile"
				+ "\ntanınırlar. Gençliklerinde dikkatsiz, heyecanlı ve geleneklere aykırı davranışlar içinde olsalar da,"
				+ "\ngeçmiş yanılgılarından en çok ders alan kişiler bu burçtan çıkar. Özgürlüklerine aşırı düşkün, "
				+ "\npatavatsızlık derecesinde pratik insanlardır. Yay'ların yaşam çerçeveleri herhangi bir şekilde "
				+ "\nkısıtlandığı zaman, içsel bir biçimde alt üst olurlar. Akılsızca risklere atılırlar. Yayların hayatı "
				+ "\nyeniliklere olan merakları ile karakterize edilebilir. Bilmedikleri şeyleri araştırıp, keşfetmeyi "
				+ "\nseverler. Yaylar çok yönlü ve ayni anda ilgilenebilecekleri birkaç konu olduğunda mutlu olan "
				+ "\nkişilerdir. Kendilerini yorgun hissediyorlarsa, o konudan sıkılmış demektir.");
				}
				if(((top>=22||top<=31)&&ay==12)||(top<=21&&ay==1)) {
					System.out.println("Oğlak burcusunuz : ");
					System.out.println("Geleceği ayrıntılı biçimde planlamaya çalışan Oğlak'lar bu özellikleri nedeniyle"
							+ "\nsık sık kuruntulara kapılarak, depresyona girerler. İşleri ile aşırı meşgul olduklarından,"
							+ "\ninsanlarla zor ilişki kurarlar. Fakat, hiçbir zaman kendilerini yalnız hissetmezler. "
							+ "\nBu nedenle onları tanımlayan sözcük 'Kullanırım' dır. Oğlaklar ciddilikleri, tutuculukları"
							+ "\nve güçlü iradeleri ile tanımlanırlar. Çalışkanlıkları ile kolaylıkla başkalarının"
							+ "\nsaygısını kazanırlar. Gerçek bir Oğlak'ın iki temel özelliği vardır. Güvenilirlik ve "
							+ "\ndürüstlük. Çok gelişmiş bir görev duyguları vardır. Bazen başkalarının başarısızlıklarını abartırlar."
							+ "\nOğlaklar arkadaşları ile ilgili çok iyi sırdaş olurlar, para konusunda dikkatli olmalarına rağmen,"
							+ "\neli açık insanlardır. Geleneklere bağlı kişiler olduklarından, duygusal özgürlüğü anlamakta güçlük "
							+ "\nçekerler. Bu nedenle kendilerinden yaşça küçük kişilerle bazen sürtüşmeleri olur. Sürekli somut"
							+ "\nkonularla uğraşmayı severler, doğada bulunan olaylardan örneklemelerle işlerini başarılı bir şekilde"
							+ "\nyürütürler. Bu yüzden ruhsal olarak da doyumlu kişilerdir. Olayları organize ederlerken "
							+ "\nrahatlıklarını gözetirler ve kendilerinin zevklerine uygun olmasına önem verirler. Bu özellikleri"
							+ "\nevlerine de yansır.");
							
				}

	}
	}

