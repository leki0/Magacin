package magacin.interfejs;

import magacin.Artikal;

public interface MagacinInterfejs {

	public void dodajArtikal(Artikal artikal, int kolicinaArtikala);

	public void izbaciArtikal(int kolicinaArtikala);

	public Artikal pronadjiArtikal(long sifra);
}
