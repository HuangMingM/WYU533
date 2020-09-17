package ibm.three.test;

import java.util.List;
import java.util.ArrayList;

public class Forlist_test {
	public static void main(String[] args) {
		List flist = new ArrayList<>();
		flist.add("一");
		flist.add("二");
		flist.add("三");
		
		System.out.println("List集合的for循环测试：");
		
		for (int i = 0; i < flist.size(); i++) {
			System.err.println(flist.get(i));
		}
	}
}
