package magacin;

import java.util.List;
import java.util.ArrayList;

import magacin.interfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs {

	List<Artikal> artikli = new ArrayList<>();

	@Override
	public void dodajArtikal(Artikal a, int kolicina) {
		if (a != null) {
			artikli.add(a);
			a.setKolicina(a.getKolicina() + kolicina);
		}

	}

	@Override
	public void izbaciArtikal(Artikal a, int kolicina) {
		a.setKolicina(a.getKolicina() - kolicina);
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		for (Artikal a : artikli) {
			if (a.getSifra() == sifra) {
				return a;
			}
		}
		return null;
	}

}
