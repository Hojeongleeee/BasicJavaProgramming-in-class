class CharacterTest1 {
	public static void main(String args[]) {
		char a[] = {'a', ' ', '?', 'C', '5', 'A'};
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] 번째 요소 = " + a[i]);
		if(Character.isDigit(a[i]))
			System.out.println(" 숫자입니다.");
		if(Character.isLetter(a[i]))
			System.out.println(" 문자입니다.");
		if(Character.isSpace(a[i]))
			System.out.println(" 공백문자입니다.");
		if(Character.isUpperCase(a[i]))
			System.out.println(" 대문자입니다.");
		if(Character.isLowerCase(a[i]))
			System.out.println(" 소문자입니다.");
		}
		if(Character.isDefined(a[0]))
		{
			System.out.println("a[0] 번째 요소 = " + a[0]);
			System.out.println(" 유니코드입니다.");
		}
	}
}