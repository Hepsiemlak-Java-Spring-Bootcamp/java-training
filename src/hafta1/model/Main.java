package hafta1.model;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Kullanici kullanici1 = new Kullanici("Bireysel", "Cem", "cemdrman@gmailc.om");
		kullanici1.mesajKutusu = prepareMesajKutusu();

		Kullanici kullanici2 = new Kullanici("Bireysel", "Kadir", "cilgin.kadir@gmail.com");
		kullanici2.mesajKutusu = prepareMesajKutusu();

		Kullanici kullanici3 = new Kullanici("Bireysel", "Hatice", "hatice.dev@gmail.com");
		kullanici3.mesajKutusu = prepareMesajKutusu();

		List<Kullanici> kullaniciList = new ArrayList<>();
		kullaniciList.add(kullanici1);
		kullaniciList.add(kullanici2);

		List<Ilan> ilanListesi = new ArrayList<>();
		ilanListesi.add(prepareIlan("Sahibinden Acil Satılık", kullanici1));
		ilanListesi.add(prepareIlan("Dosta GİDERRR ACİLLL!!!", kullanici2));
		ilanListesi.add(prepareIlan("Metroya Koşarak 5 dk", kullanici3));
		ilanListesi.add(prepareIlan("Öğrenciye ve Bekar uygun", kullanici3));

	}

	private static List<Mesaj> prepareMesajKutusu() {
		List<Mesaj> mesajKutusu = new ArrayList<>();
		mesajKutusu.add(new Mesaj("baslik1"));
		mesajKutusu.add(new Mesaj("deneme"));
		mesajKutusu.add(new Mesaj("selam"));
		return mesajKutusu;
	}

	private static Ilan prepareIlan(String baslik, Kullanici kullanici) {
		Ilan ilan = new Ilan();
		ilan.setBaslik(baslik);
		ilan.setGayrimenkul(makeGayrimenkul());

		// kullanici.mesajKutusu.add(new Mesaj("acil dönüş")); // NPE

		ilan.setKullanici(kullanici);

		ilan.setAktifMi(true);

		ilan.setResimList(makeResimList());

		for (Mesaj mesaj : kullanici.mesajKutusu) {
			System.out.println(mesaj.baslik);
		}

		return ilan;
	}

	private static String[] makeResimList() {
		String[] resimList = new String[5];
		resimList[0] = "https://hecdnw01.hemlak.com/ds01/4/4/9/0/2/3/8/3/81d2e088-a551-485d-b2e9-664cc9200cdc.jpg";
		resimList[1] = "https://hecdnw01.hemlak.com/ds01/4/4/9/0/2/3/8/3/81d2e088-a551-485d-b2e9-664cc9200cdc.jpg";
		return resimList;
	}

	private static Gayrimenkul makeGayrimenkul() {
		return new Gayrimenkul();
	}

}
