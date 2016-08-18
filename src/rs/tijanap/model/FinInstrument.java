package rs.tijanap.model;

public class FinInstrument {
	String isin;
	String cfi;
	int emtID;
	public FinInstrument() {		
	}
	public FinInstrument(String isin, String cfi, int emtID) {	
		this.isin = isin;
		this.cfi = cfi;
		this.emtID = emtID;
	}
	public String getIsin() {
		return isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	public String getCfi() {
		return cfi;
	}
	public void setCfi(String cfi) {
		this.cfi = cfi;
	}
	public int getEmtID() {
		return emtID;
	}
	public void setEmtID(int emtID) {
		this.emtID = emtID;
	}
	@Override
	public String toString() {
		return "FinInstrument [isin=" + isin + ", cfi=" + cfi + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cfi == null) ? 0 : cfi.hashCode());
		result = prime * result + ((isin == null) ? 0 : isin.hashCode());
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
		FinInstrument other = (FinInstrument) obj;
		if (cfi == null) {
			if (other.cfi != null)
				return false;
		} else if (!cfi.equals(other.cfi))
			return false;
		if (isin == null) {
			if (other.isin != null)
				return false;
		} else if (!isin.equals(other.isin))
			return false;
		return true;
	}
	
	
	
	
	

}
