public class StringOps {
    public static void main(String[] args) 
    {
        /* String str = "HHHH";
        char ch = 'H';
        int[] array = allIndexOf(str, ch);
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        } */
    }

    public static String capVowelsLowRest (String string) 
    {
        String str = "";
        char ch;
        for(int i = 0; i < string.length(); i++)
        {
            ch = string.charAt(i);
            if((ch >= 65) && (ch <= 90))
            {
                if(ch!='A' || ch!='E' || ch!='I' || ch!='O' || ch!='U') ch = (char)(ch + 32);
            }
            else
            {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ch = (char)(ch - 32);
            }
            str = str + ch;
        }
        return str;
    }

    public static String camelCase (String string) 
    {
        String str = "";
        char ch;
        int i = 0;
        boolean flag = false;
        while((i < string.length()) && (flag == false))
        {
            ch = string.charAt(i);
            if(ch != 32)
            {
                if((ch >= 65) && (ch <= 90))
                {
                    ch = (char)(ch + 32);
                }
                str = str + ch;
                if((i + 1) < string.length())
                {
                    if((ch != 32) && (string.charAt(i + 1) == 32)) flag = true; //First word has ended.
                }
            }
            i++;
        }
        while(i < string.length())
        {
           ch = string.charAt(i);
           if(ch != 32)
           {
                if(string.charAt(i - 1) == 32) //First letter in new word.
                {
                    if((ch >= 97) && (ch <= 122))
                    {
                        ch = (char)(ch - 32);
                    } 
                }
                else
                {
                    if((ch >= 65) && (ch <= 90))
                    {
                        ch = (char)(ch + 32);
                    }
                }
                str = str + ch;
           }
           i++;
        }
        return str;

    }
    public static int[] allIndexOf (String string, char chr) 
    {
        int count = 0;
        for(int i = 0; i < string.length(); i++)
        {
            if(string.charAt(i) == chr) count++;
        }
        int[] array = new int[count];
        int p = 0;
        for(int j = 0; j < string.length(); j++)
        {
            if(string.charAt(j) == chr)
            {
                array[p] = j;
                p++;
            }
        }
        return array;
    }
}
//////        1.charAt(int index)                    ///////
//////        2.length()                             ///////
//////        3.substring(int start)                 ///////
//////        4.substring(int start,int ends)        ///////
//////        5.indexOf(String str)                  ///////
