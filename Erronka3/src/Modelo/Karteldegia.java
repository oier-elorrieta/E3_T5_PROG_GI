package Modelo;

import java.util.Arrays;

public class Karteldegia {

	Pelikula[] pelikulaList = new Pelikula[5];

	public Karteldegia(Pelikula[] pelikulaList) {
		this.pelikulaList = pelikulaList;
	}

	public Pelikula[] getPelikulaList() {
		return pelikulaList;
	}

	public void setPelikulaList(Pelikula[] pelikulaList) {
		this.pelikulaList = pelikulaList;
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
		return Arrays.equals(pelikulaList, other.pelikulaList);
	}

    @Override
    public String toString() {
        return "Karteldegia [pelikulaList=" + Arrays.toString(pelikulaList) + "]";

    }

	
	
	
}
