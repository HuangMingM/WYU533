package ibm.three.test;

import java.util.List;
import java.util.ArrayList;

public class Forlist_test {
	public static void main(String[] args) {
		List flist = new ArrayList<>();
		flist.add("һ");
		flist.add("��");
		flist.add("��");
		
		System.out.println("List���ϵ�forѭ�����ԣ�");
		
		for (int i = 0; i < flist.size(); i++) {
			System.err.println(flist.get(i));
		}
	}
}
