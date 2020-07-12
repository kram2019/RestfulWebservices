
public class TestHash {
	private int a1=10;
	
	public TestHash(int a1) {
			this.a1 = a1;
	}


	//Hashcode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a1;
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
		TestHash other = (TestHash) obj;
		if (a1 != other.a1)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TestHash [a1=" + a1 + "]";
	}
	
	
	
	

}
