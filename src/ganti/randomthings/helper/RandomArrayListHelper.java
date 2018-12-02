package ganti.randomthings.helper;

import java.util.ArrayList;

public final class RandomArrayListHelper {

	private RandomArrayListHelper() {
	}

	public static <T> T getOneRandomEntry(ArrayList<T> list) {
		int length = list.size();
		return list.get((int) Math.round(Math.random() * (length - 1)));
	}

	public static <T> ArrayList<T> getManyRandomEntrys(int count, ArrayList<T> list) {
		ArrayList<T> manyT = new ArrayList<T>();
		for (int i = 0; i < count; i++) {
			manyT.add(getOneRandomEntry(list));
		}
		return manyT;
	}
}
