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

    public static void main(String[] args) {
        DynamicArray animals1 = new DynamicArray(3);
        animals1.add("dog");
        animals1.add("cat");
        animals1.add("dog");
        animals1.countOf("dog");
    }

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
}
    public void countOf(String word) {
        int counter = 0;
        for (String str : data) {
            if (word.equals(str)) {
                counter +=1;
            }
        }
        System.out.println("The string: " + word + ", is present: " + counter + " times.");
    }



        

    //String searchString = "value";
   
    public boolean duplicateChecker(String searchString) {

        Boolean duplicate = false;
        for (String str : data) { // look for every string in the data array
            if (str.equals(searchString)) { // if the string equals to the one you are searching, return true, otherwise false
                duplicate = true;
            }
        }
        System.out.println("String " + searchString + " exists in the array: " + duplicate);
        return duplicate;
    }

} // class DynamicArray



// create main method, then instantiate two dynamic array objs, put elements in, then apply methods,make sure to have duplicates - apply duplicate checker on object - nameOfObject.method


