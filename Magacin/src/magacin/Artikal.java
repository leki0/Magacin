package magacin;

import java.util.Objects;

public abstract class Artikal {

	private String naziv;
	private long sifra;
	private String opis;
	private int kolicina;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) throws Exception {
		if (naziv == null || naziv.equals("")) {
			throw new Exception("Ne mozete da unesete naziv koji je null ili prazan string!");
		}
		this.naziv = naziv;
	}

	public long getSifra() {
		return sifra;
	}

	public void setSifra(long sifra) throws Exception {
		if (sifra < 0) {
			throw new Exception("Ne mozete da unesete sifru koja je negativan cio broj!");
		}
		this.sifra = sifra;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) throws Exception {
		if (opis == null || opis.equals("")) {
			throw new Exception("Ne mozete da unesete opis koji je null ili prazan string!");
		}
		this.opis = opis;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) throws Exception {
		if (kolicina < 0) {
			throw new Exception("Unijeta kolicina ne smije da bude negativan cio broj!");
		}
		this.kolicina = kolicina;
	}

	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina=" + kolicina + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(kolicina, naziv, opis, sifra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		return kolicina == other.kolicina && Objects.equals(naziv, other.naziv) && Objects.equals(opis, other.opis)
				&& sifra == other.sifra;
	}

}
