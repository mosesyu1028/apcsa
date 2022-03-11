public class CodeWordChecker
{
	private int minLength;
	private int maxLength;
	private String badWord;

//CONSTRUCTORS
public CodeWordChecker(int cwcMinLength, int cwcMaxLength, String cwcBadWord)
{
	minLength = cwcMinLength;
	maxLength = cwcMaxLength;
	badWord = cwcBadWord;
}

public CodeWordChecker(String cwcBadWord)
{
	minLength = 6;
	maxLength = 20;
	badWord = cwcBadWord;
}

//ACCESSORS

//MUTATORS
public void isValid(String cwcCodeWord)
{
	if (cwcCodeWord.length() < minLength) {
		return false;
	}
	else if (cwcCodeWord.length() > maxLength) {
		return false;
	}
	// else if (cwcCodeWord.contains(cwcBadWord)) { // Correct, but:
    else if (cwcCodeWord.indexOf(cwcBadWord) != -1) {
		return false;
	}

    return true;
}

}
