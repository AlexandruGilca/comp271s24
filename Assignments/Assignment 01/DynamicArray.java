/*
 * To save this assignment, make sure you commit your changes to your GitHub repository,
 * following the instructions in Sakai. IF YOU DO NOT COMMIT THE CHANGES, IT IS POSSIBLE THAT
 * YOUR WORK MAY BE LOST AND YOU MAY HAVE TO START ALL OVER AGAIN.
 */

 
 public class DynamicArray {

   private String[] data;

    /** Currently available position in array data */
   private int position; 

   /*Constant with default size */

   private static final int DEFAULT_SIZE = 10;

   public DynamicArray(int size) {
    this.data = new String[size];
    this.position = 0;
   } // basic constructor

   /*default constructr */
   public DynamicArray() {
    this(DEFAULT_SIZE);
   }// default constructor

   public void add(String string) {
        //make sure there is room in array data
        if(this.position == this.data.length){ 
            resize();
        }
            // Now array has room for more elements.
        this.data[this.position] = string;
        this.position++;    
   } 
   private void resize() {
    String[] temp = new String[data.length*2];
    for(int i=0 ; i<data.length ; i++) {
        temp[i]=data[i];
    }
    data=temp;
};
    public int countOf() {
        int[] countUniqie = new int[data.length];
        for (int r = 0; r < data.length; r++) {
            String current = data[r];
            int count = 0;
            boolean counted = false;
            for (int j = 0; j < r; j++) {
                if (data[j].equals(current)) {
                    counted = true;
                    break;
                }
            }
        if (!counted) {
            for (string str : data) {
                if (str.equals(current)) {
                    count++
                }
            }
        }
        System.out.println("Value: " + current + ", countOf: " + count);
        }
    }

} // class DynamicArray


