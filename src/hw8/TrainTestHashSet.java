package hw8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TrainTestHashSet {
	public static void main(String[] args) {

		Set<Train> trainSet = new HashSet<Train>();
		trainSet.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainSet.add(new Train(118, "自強", "高雄", "台北", 500));
		trainSet.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainSet.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainSet.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700));

		Iterator<Train> it = trainSet.iterator();
		while (it.hasNext()) {
			Train train = it.next();
			System.out.println("班次:" + train.getNumber() + " 車種:" + train.getType() + " 出發地:" + train.getStart()
					+ " 目的地:" + train.getDest() + " 車票價格:" + train.getPrice());
		}

	}

}
