public class LengthLongestPath {
	public int lengthLongestPath(String input) {
        String[] names = input.split("\n");
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int max = 0;
        for (String name: names){
            // Count the level by counting number of tabs
            int level = 0;
            while (name.startsWith("\t")){
                name = name.substring(1);
                level++;
            }
            
            // Exit to the current level
            while (stack.size() - 1 > level){
                stack.pop();
            }
            
            if (name.contains(".")){
                // Is a file
                max = Math.max(max, stack.peek() + name.length());
                
            } else{
                // Is a directory
                stack.push(stack.peek() + name.length() + 1);
            }
        }
        return max;
    }
}