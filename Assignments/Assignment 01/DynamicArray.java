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
        if(this.position == this.data.lenght){ 
            resize();
        }
            // Now array has room for more elements.
        this.data[this.position] = string;
        this.position++;    
   }  // method add

} // class DynamicArray