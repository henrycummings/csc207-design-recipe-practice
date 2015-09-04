
public class DesignRecipePractice {

	public static String[] intersperse (String[] arr, String s){
		if (arr == null)
		{
			return null;
		}
		else if (arr.length == 0)
		{
			return null;
		}
		else
		{
			String[] ret = new String[(2 * arr.length - 1)]; 
			for (int i = 0; i < arr.length; i++)
			{
				ret[i * 2] = arr[i];
				ret[i*2 +1] = s; 
			}
			ret[ret.length - 1] = arr[arr.length - 1];
			return ret;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intersperse(new String[] {"a","b","c","d"}, "efg"));

		System.out.println(intersperse(new String[] {"a","b","c","d"}, ""));

		System.out.println(intersperse(new String[] {}, "efg"));
	}

}
