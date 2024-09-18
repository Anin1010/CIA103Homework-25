package hw8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TrainTestTreeSet {
	public static void main(String[] args) {

		Set<Train> trainTreeSet = new TreeSet<Train>();

		trainTreeSet.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainTreeSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainTreeSet.add(new Train(118, "自強", "高雄", "台北", 500));
		trainTreeSet.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainTreeSet.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainTreeSet.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainTreeSet.add(new Train(1254, "區間", "屏東", "基隆", 700));

		Iterator<Train> it = trainTreeSet.iterator();
		while (it.hasNext()) {
			Train train = it.next();
			System.out.println("班次:" + train.getNumber() + " 車種:" + train.getType() + " 出發地:" + train.getStart()
					+ " 目的地:" + train.getDest() + " 車票價格:" + train.getPrice());

		}

	}
}
