package _06_for_loop_gauntlet;

public class floor_gloop_flauntlet {
public static void main(String[] args) {
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}
	for (int j = 100; j > 0;) {
		System.out.println(j);
		j--;
	}
	for (int b = 2; b < 101; ) {
		System.out.println(b);
		b++;
	}
	for (int f = 1; f < 100; ) {
		System.out.println(f);
		f++;
	}
	for (int a = 0; a < 501; a++) {
		if (a%2==0) {
			System.out.println(a + " is even");
		}
		else {
			System.out.println(a+" is odd");
		}
	
	}
	int m = 1;
	for (int l = 7; l < 778;  ) {
	System.out.println(l);
		m++;
		l=7*m;
		
	}
	int e = 0;
	for (int q = 2007; q <2020 ; q++) {
		
		System.out.println(q + " i was " +e +" years old" );
		e++;
	}
	for (int w = 0; w <3 ; w++) {
		for (int t = 0; t < 3; t++) {
			System.out.println(w+ " "+t);
		}
		for (int s = 0; s < 3; s++) {
			for (int h = 1; h < 3; h++) {
				for (int t = 2; t < 3; t++) {
					System.out.println(s + " "+h+" "+t);
				}
			}
		}
	}
}

}
