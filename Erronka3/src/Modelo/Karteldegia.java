package Modelo;

import java.util.Arrays;

public class Karteldegia {

	Filmak[] filmak;

	public Karteldegia(Filmak[] filmak) {
		this.filmak = filmak;
	}

	public Filmak[] getFilmak() {
		return filmak;
	}

	public void setFilmak(Filmak[] filmak) {
		this.filmak = filmak;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(filmak);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Karteldegia other = (Karteldegia) obj;
		return Arrays.equals(filmak, other.filmak);
	}

	@Override
	public String toString() {
		return "Karteldegia [filmak=" + Arrays.toString(filmak) + "]";
	}

}
