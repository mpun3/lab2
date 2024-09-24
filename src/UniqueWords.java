import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  boolean same = false; // checks for repeated word
	  ArrayList<String> unique = new ArrayList<String>();
	  unique.add(list.get(0));
	  
      for (int i = 0; i < list.size(); i++)
      {		
    	  for (int j = 0; j < unique.size(); j++)
		 {
    	  if (list.get(i).equals(unique.get(j)))
    		  same = true;
    	  if (!same && j == unique.size() - 1)
    	  	{
    		  unique.add(list.get(i));
    		  count++;
    	  	}
		 }
      same = false;
      }
	  return count + 1; // counting count + initial word
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
