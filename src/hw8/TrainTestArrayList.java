package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class TrainTestArrayList {
	public static void main(String[] args) {

		List<Train> trainList = new ArrayList<Train>();

		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

		trainList.add(t1);
		trainList.add(t2);
		trainList.add(t3);
		trainList.add(t4);
		trainList.add(t5);
		trainList.add(t6);
		trainList.add(t7);
		Collections.sort(trainList);
		Collections.reverse(trainList);
		for (Train train : trainList) {
			System.out.println("班次:" + train.getNumber() + " 車種:" + train.getType() + " 出發地:" + train.getStart()
					+ " 目的地:" + train.getDest() + " 車票價格:" + train.getPrice());
		}
		Iterator<Train> it = trainList.iterator();
		while (it.hasNext()) {
			Train train = it.next();
			System.out.println("班次:" + train.getNumber() + " 車種:" + train.getType() + " 出發地:" + train.getStart()
					+ " 目的地:" + train.getDest() + " 車票價格:" + train.getPrice());
		}
		for (int i = 0; i < trainList.size(); i++) {
			Train train = trainList.get(i);
			System.out.println("班次:" + train.getNumber() + " 車種:" + train.getType() + " 出發地:" + train.getStart()
			+ " 目的地:" + train.getDest() + " 車票價格:" + train.getPrice());
		}
		
		
	}

}
