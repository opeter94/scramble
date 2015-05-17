package scramble;

public class Scramble {

	public static String scramble(String sentence) {
		String[] words = sentence.split(" ");
		StringBuilder sb;
		if (words != null) {
			for (int i = 0; i < words.length; ++i) {
				if (words[i].length() > 3) {
					sb = new StringBuilder();
					sb.append(words[i].charAt(0));
					sb.append(new StringBuilder(words[i].substring(1, words[i].length() - 1)).reverse().toString());
					sb.append(words[i].charAt(words[i].length() - 1));
					if (i != words.length - 1) {
						sb.append(" ");
					}
					words[i] = sb.toString();
				} else if (i != words.length - 1) {
					sb = new StringBuilder();
					sb.append(words[i]);
					sb.append(" ");
					words[i] = sb.toString();
				}
			}
		}
		
		StringBuilder builder = new StringBuilder();
		for(String s : words) {
		    builder.append(s);
		}
		return builder.toString();
	}
}
