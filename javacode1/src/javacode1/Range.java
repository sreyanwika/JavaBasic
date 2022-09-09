package javacode1;

public enum Range {
	fast(99),
	slow(11),
	medium(59),
	midslow(39),
	midfast(79);
	private int count;
	private Range(int count) {
		this.count=count;
	}
    public int get() {
    	return this.count;
    	
    	
    }
    public void set(int count) {
    	this.count=count;
    }
}
