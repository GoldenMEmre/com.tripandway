# com.tripandway

## Git
**SADECE MAIN BRANCH'INDE `git pull` ISLEMI YAPILIR. 
(BURADA UZAK REPODAN KENDI LOCAL PC'IMIZE EN GUNCEL VERSIYONU ALIYORUZ)**
**MAIN BRANCH'INDA BASKA HIC BIR ISLEM YAPILMAYACAK**

1. Main branch'ine projemizin en guncel hali pull edildikten sonra herkes kendi adina birer branch olusturur.

    `git branch <isim>`
    
    Orn: `git branch burkay`
    Orn: `git branch filik`
    
2.  Branch olusturma islemi bittikten sonra `git checkout <girilenbranchismi>` ile  olusturulan branch'e gecilir.

		Orn: `git checkout burkay`
		Orn: `git checkout filik`
		
3. Güvenlik amaciyla hangi branch'te oldugumuz `git branch` komutu ile kontrol edilir. 

4. Olusturulan yeni branch'e gecildigine emin olunduktan sonra bu branch'imize projemizin en guncel halini eklemek icin `git merge main` komutu kullanilir.

5. Daha sonra yapilacak guncellemeler olusturdugumuz branch icinde yapilir. Olusturulan branch icerisinde guncellemelerimiz bittikten sonra

* git add (degisiklik yapilan yerin  dosya yolu yani "pat from content root" u) kullanilarak uzerinde calistigimiz class yerel repository'e eklenir. Burada tavsiye edilen sadece sizin yaptiginiz degisikliklerin eklenmesidir. 

*git add .  **kesinlikle  kullanilMAMAli'**

	Orn: git add `Pages/AmazonPage.java`

6. Yapilan degisiklikler `git commit -m "US01TC01MMDD/V1"` seklinde adlandirilir.

	Orn: 
	Tarih: 02.06.2023
	User Story : US_10
	Test Case : TC_04
	Version : 3
	
	`git commit -m "US10TC040602/V3"`
    
7. Daha sonra git push komutu ile yaptigimiz guncellemeler gonderilir. Terminal'de gelen linke tiklanarak projenin gitHub'daki sayfasina gecilir. main ile tags arasinda bulunan `branches`'a tiklanir.

8.  **Your branches** veya **Active branches** kismindaki guncellenen branch'in kendi branch'imiz olduguna emin olduktan sonra`New pull request`'a tiklanir. 

9. Cikan ekrandaki `Create pull request` butonuna tiklanir ve request olusturulur.

10. Merge request islemi team lead tarafindan gerceklestirilir.


### Isimlendirmelerde dikkat edilecekler
***
1. camelCase kullanilacak
 Orn: adminLoginButton
 Orn: adminPasswordBox
 Orn: configuration.properties >> tripUrl
 Orn: Orn: configuration.properties >> adminUrl

2. Locate'lerde ve diger isimlendirmelerde Ingilizce dili kullanilmalidir.

| Element Türü   | Variable name|
|----------------|--------------|
| Button         | signInButton |    
| Logo           | logoX        |
| icon           | iconX        |
| Sadece text    | labelX       |
| Drop down      | dropDownX    |
| Radio Button   | radioButtonX |
| Check box      | checkBoxX    |
| Tablo Sütünu   | columnX      |
| Tablo Satiri   | rowX         |
| Kisi Resimleri | imageProfileX|
| ürün resimleri | imageProductX|
| Linkler        | linkX        |
| Aranacak kelime | xSearchWord | 
| Beklenen Icerik | xExpectedContent | 
| Gercek Icerik | xActualContent | 
| Beklenen Yazi | xExpectedText |
| Gercek Yazi | xActualText |
| Beklenen Baslik | xExpectedTitle|
| Gercek Baslik | xActualTitle|


