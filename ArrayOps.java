public class ArrayOps {
    public static void main(String[] args) 
    {
        int[] Wow = {7, 5, 4, 3, -12};
        boolean check = isSorted(Wow);
        System.out.println(check);
    }
    
    public static int findMissingInt (int [] array)//returns the missing Integer.
    {
        int missing = -1; 
        boolean flag = false;
        for(int i = 0; i < (array.length + 1); i++)
        {
            flag = false;
            for(int j = 0; j < array.length; j++)
            {
                if(i == array[j])
                {
                    flag = true;
                    break;
                }
            }
            if(flag == false)
            {
                missing = i;
                break;
            }
        }
        return missing;

        

    }
    public static int secondMaxValue(int [] array)//returns the second biggest number in the array.
    {
        int[] sec = maxSort(array);
        return sec[1];
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2)//If both arrays have the same integers returns True.
    {
        boolean contain = true;
        boolean flag = false;
        for(int i = 0; i < array1.length; i++)
        {
            flag = false;
            for(int j = 0; j < array2.length; j++)
            {
                if(array1[i] == array2[j]) flag = true;
            }
            if(flag == false) contain = false;
        }
        for(int i = 0; i < array2.length; i++)
        {
            flag = false;
            for(int j = 0; j < array1.length; j++)
            {
                if(array1[j] == array2[i]) flag = true;
            }
            if(flag == false) contain = false;
        }
        return contain;
    }

    public static boolean isSorted(int[] array) 
    {
        boolean flag = true;
        int[] sec = array;
        sec = maxSort(sec);
        int max = sec[0];
        if(array[0] == max)//checks if the first value in array is the max value.
        {
            for(int i = 0; i < (array.length - 1); i++)
            {
                if(array[i] < array[(i+1)])
                {
                    flag = false;
                }  
            }
        }
        else
        {
            for(int j = 0; j < (array.length - 1); j++)
            {
                if(array[j] > array[(j+1)])
                {
                    flag = false;
                }  
            }
        }
        return flag;
    }
    public static int[] maxSort(int[] arrayoriginal) //Gets an array and returns the same array sorted from max to min. Self use.
    {
        int temp = 0;
        int[] array = new int[arrayoriginal.length];
        for(int i = 0; i < array.length; i++) //Buils new array to not hurt the original array in memory.
        {
            array[i] = arrayoriginal[i];
        }
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i + 1; j < array.length; j++)
            {
                temp = 0;
                if(array[i] < array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    } 

}
