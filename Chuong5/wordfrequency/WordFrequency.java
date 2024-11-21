package wordfrequency;

import java.util.HashMap;

public class WordFrequency {
	public static void main(String[] args) {
		String[] sentences = { "learn java by example", "guide to advance java", "lưu các đối tượng", "de2",
				"example of distributed in java" };

		HashMap<String, Integer> wordCount = new HashMap<>();

		for (String sentence : sentences) {
			String[] words = sentence.split("\\s+");
			for (String word : words) {
				wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
			}
		}

		for (String word : wordCount.keySet()) {
			System.out.println(word + ": " + wordCount.get(word));
		}

		System.out.println("Total words: " + wordCount.size());
	}
}
