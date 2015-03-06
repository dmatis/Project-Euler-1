package problems30to39;

//Question -----------------------------------------------------------------------------------------------------------------------
// The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to simplify it may incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling the 9s.
//
// We shall consider fractions like, 30/50 = 3/5, to be trivial examples.
//
// There are exactly four non-trivial examples of this type of fraction, less than one in value, and containing two digits in the numerator and denominator.
//
// If the product of these four fractions is given in its lowest common terms, find the value of the denominator.
//---------- -----------------------------------------------------------------------------------------------------------------------
// Solution correct

// The only thing to note about this problem/solution (excerpt found online):
// 		You can prove that the numbers need to be of the form A:X/X:B, by eliminating the other forms (notation: 4:5 = 45). 
// 		For example, if A:X/B:X = A/B then (10*A + X)/(10*B + X) = A/B, or X*B = X*A. 
// 		Now the problem stipulates that X can't be zero (i.e. the trivial example), so B = A, which would imply that A:X/B:X = 1, 
// 		but the problem also states that the fraction needs to be less than 1, so this form is eliminated.
// 		Proceed similarly with the other forms, and you're left with just one form: A:X/X:B.
public class Problem33 {

	public static void main(String[] args) {
		double currentNumeratorProduct = 1;			// holds the numerator product 
	    double currentDenominatorProduct = 1;		// holds the denominator product

	    // Use classic round-robin loops to go through all the 2-digit possibilities. Denom always starts bigger than numer because the 
	    // fraction must be less than 1. 
		for(int numer = 10; numer < 100; numer++) {
			for(int denom =numer+1; denom < 100; denom++) {
 				double numerator = numer; 						// set numerator 
				double denominator = denom; 					// set denominator 
				double fraction = numerator / denominator;		// get actual value of fraction as double
				
				if(fraction == cancelDigitSecond(numer,denom)) {
					System.out.println(numer + "/" + denom);	// print out fraction out of curiosity
					currentNumeratorProduct *= numerator; 		// update currentNumeratorProduct
					currentDenominatorProduct *= denominator; 	// update currentDenominatorProduct
				}					
			}
		}
		// print out the answer (in decimal form)
		System.out.println(currentNumeratorProduct / currentDenominatorProduct);

	}
	// Private Function 
	// Returns: -1 if this fraction is not a fraction which has digits that can be cancelled, otherwise returns 
	// the fraction of the remaining uncanceled digits. This function only attempts to remove the second  
	// digit in the numerator with the first digit in the denominator.
	private static double cancelDigitSecond(int a, int b) {
		// If the second digit in the numerator is the same as the first digit in the denominator, does a check 
		// to make sure the uncanceled digit in the denominator is not zero because you can't divide by zero 
		if(String.valueOf(a).charAt(1) == String.valueOf(b).charAt(0) && String.valueOf(b).charAt(1) != '0') {
			return (double)(a/10)/(double)(b%10);
		} else {
			return -1; 
		}		
	}
}
