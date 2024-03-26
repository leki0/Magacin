package magacin;

import java.util.Date;
import java.util.Objects;

public class KucnaHemija extends Artikal {
	private Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) throws Exception {
		if (rokTrajanja.before(new Date())) {
			throw new Exception("Unijeti rok trajanja ne moze da bude datum u proslosti!");
		}
		this.rokTrajanja = rokTrajanja;
	}

	@Override
	public String toString() {
		return "KucnaHemija [rokTrajanja=" + rokTrajanja + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(rokTrajanja);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		return Objects.equals(rokTrajanja, other.rokTrajanja);
	}

}
