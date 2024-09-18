package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionWithNoNumber {
//	    請建立一個Collection物件並將以下資料加入:
//		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//		Object物件、“Snoopy”、BigInteger(“1000”)
//		印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//		• 移除不是java.lang.Number相關的物件
//		• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short((short) 100));
		list.add(new String("Kitty"));
		list.add(new Object());
		list.add(new String("Snoopy"));
		list.add(new BigInteger("1000")); // import BigInteger,記得輸入的資料要以字串類別輸入

		System.out.println("toString()=" + list);
		System.out.println("元素個數=" + list.size());
		System.out.println("====迭代器====");
		Iterator<Object> itor = list.iterator();
		while (itor.hasNext()) {
			System.out.println(itor.next());
		}
		System.out.println("====傳統迴圈====");
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		System.out.println("====foreach====");
		for (Object each : list) {
			System.out.println(each);
			System.out.println();
		}
		System.out.println("====移除Number====");
		
		Iterator<Object> itor1 = list.iterator();
		
		while (itor1.hasNext()) {
			Object obj = itor1.next();
			if(obj instanceof Number) {
				itor1.remove();
			}
		}
		System.out.println(list);

	}
}
