package lab3;

public class SavingS {
	private String ner;
	private String valyut;
	private double jiliin_huu;
	private int sar;
	private double uldegdel;
	public SavingS (String ner, String valyut, double jiliin_huu, int sar, double uldegdel) {
		this.ner = ner;
		this.valyut = valyut;
		this.jiliin_huu = jiliin_huu;
		this.sar = sar;
		this.uldegdel = uldegdel;
	}
	private double savingscalcaccrued() {
		return (uldegdel * jiliin_huu/12 * sar)/100;
	}
	private double savingscalc() {
		return savingscalcaccrued() + uldegdel;
	}
	public void SavingReport() {
		System.out.printf("ur dun: %f", savingscalc());
	}
	public static void main(String[] args) {
		SavingS saving = new SavingS("Bat", "MNT", 20, 12, 20000);
		saving.SavingReport();
	}
}