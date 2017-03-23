package sample;


public class HashAndEqualOverride {

	String name;
	public HashAndEqualOverride(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public static void main(String[] args) {
		HashAndEqualOverride obj1 = new HashAndEqualOverride("abc");
		HashAndEqualOverride obj2 = new HashAndEqualOverride("abc");
		
		System.out.println(obj1.equals(obj2)); //returns true when equals and hashcode are over-ridden
		//else return false;
		
	}
	/**
	 * Three rules for equals over-riding.
	 * 1. compare the object with itself.
	 * 2. check if the object is an instance of the class.
	 * 3. typecast the object with the class name and do the comparison
	 */
	@Override
    public boolean equals(Object o) {
		if(this==o) return true;
		if(!(o instanceof HashAndEqualOverride)) return false;
		
		HashAndEqualOverride obj = (HashAndEqualOverride)o;
		if(name != obj.name)
		return false;
		
		return true;
        
    }
	
	/**
	 * 1.Take a prime hash e.g. 5, 7, 17 or 31 (prime number as hash, results in distinct hashcode for distinct object)
	 * 2.Take another prime as multiplier different than hash is good.
	 * 
	 */
	 @Override
	    public int hashCode() {
	        int result = 7;
	        result = 31 * result + name.hashCode();
			return result;
	        
	    }
}
