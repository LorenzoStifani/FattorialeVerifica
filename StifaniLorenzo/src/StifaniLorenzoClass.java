/**
 * <html>
 * @author <p><b>StifaniLorenzo</b> <u>4AI</u> <i>04/05/2022</i></p>
 * </html>
 * 
 * @version 1.0
 */
import java.security.DomainCombiner;

public class StifaniLorenzoClass {

	public StifaniLorenzoClass() {

	}

	/**
	 * 
	 * @param n numero sul quale trovare il fattoriale
	 * 
	 * @return fattoriale di n
	 */
	public int stifaniMet(int n) {
		int fatt;
		int i;
		fatt = 1;
		for (i = 0; i <= n; i++) {
			fatt = fatt + i;
		}
		return fatt;
	}

	public static void main(String[] args) {
		StifaniLorenzoClass c = new StifaniLorenzoClass();
		System.out.println(c.stifaniMet(6));
	}

}
