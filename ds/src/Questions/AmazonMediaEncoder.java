package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

public class AmazonMediaEncoder {
	public static int mergeFilesApproach1(List<Integer> filesizes) {
		if (filesizes.size() <= 1) {
			return filesizes.size()==0?0:filesizes.get(0);
		} else if (filesizes.size() == 2) {
			return filesizes.get(0) + filesizes.get(1);
		}
			Collections.sort(filesizes);
			int i = 1;
			int finalMergeTime = 0;
			Stack<Integer> stack = new Stack<>();
			List<Integer> mergeTimes = new ArrayList<>();
			int merge = 0;
			stack.add(filesizes.get(0));
			while (!stack.empty() && i < filesizes.size()) {
				int prev = stack.pop();
				int curr = filesizes.get(i);
				i++;
				merge = prev + curr;
				mergeTimes.add(merge);
				stack.add(merge);
			}
			Optional<Integer> totmergeTimes = mergeTimes.stream().reduce((a, b) -> a + b);
			if (totmergeTimes.isPresent()) {
				finalMergeTime = totmergeTimes.get();
			}
		
		return finalMergeTime;
	}

	public static int mergeFilesApproach2(List<Integer> filesizes) {

		List<Integer> sumSeries = new ArrayList<>();
		int len = filesizes.size();
		int count = 1;
		int result = 0;
		if (filesizes.size() ==1) {
			return filesizes.get(0);
		}
		if (filesizes.size() == 2) {
			return filesizes.get(0) + filesizes.get(1);
		}
		skip: while (count < len) {
			Collections.sort(filesizes);
			int sum = filesizes.get(0) + filesizes.get(1);
			sumSeries.add(sum);
			if (filesizes.size() == 2)
				break skip;
			filesizes.remove(0);
			filesizes.remove(0);
			filesizes.add(sum);
			count++;
		}
		for (int i : sumSeries)
			result += i;
		return result;

	}

	public static void main(String[] args) {
		List<Integer> input = new ArrayList<>();
	input.add(4);
	input.add(8);
	input.add(6);
	input.add(12);
	input.add(15);
		System.out.println(mergeFilesApproach1(input));
	}
}
