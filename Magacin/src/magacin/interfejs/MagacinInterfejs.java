package magacin.interfejs;

import magacin.Artikal;

public interface MagacinInterfejs {

	public void dodajArtikal(Artikal a, int kolicina);

	public void izbaciArtikal(Artikal a, int kolicina);

	public Artikal pronadjiArtikal(int sifra);
}
