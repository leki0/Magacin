package magacin;

import java.util.ArrayList;
import java.util.List;

import magacin.interfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs {

	List<Artikal> artikli = new ArrayList<>();

	@Override
	public void dodajArtikal(Artikal a, int kolicina) {
		artikli.add(a);
	}

	@Override
	public void izbaciArtikal(int kolicina) {
		// TODO Auto-generated method stub

	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}

}
