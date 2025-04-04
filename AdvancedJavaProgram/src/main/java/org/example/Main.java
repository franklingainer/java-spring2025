package org.example;
/*Franklin Gainer
* 04-04-2025
* CIS-171-100
* Professor Lawrence*/

class multiThread//multithreading object to make a multithread instance
{
    public void runThread()//runthread method which will run the threads in the parameter
    {
        try{//try-catch block to handle exceptions in the thread
            System.out.println("current thread running" + Thread.currentThread().threadId());//thread will be printed using the id
        }
        catch (Exception e){System.out.println("Error in thread" + e.getMessage());}//error message that gets printed out if expeption is caught
    }

}


public class Main {

    public static void selectionSort(int[] arr) {//sorting method that will sort numbers in a array in numerical order
        int n = arr.length;//integer used for array length

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }//for-loop that repositions the numbers based on the values and conditions

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;//repositioning of the numbers
        }
    }

    public static void main(String[] args)
    {
        int[] commandArr;//integer array used for command lines
        int [] intArr = {5,3,8,2,9};//integer array to showcase multithread, sorting, and number sum
        if(args.length < 5)
        {
            System.out.println("place down five numbers to be taken as command line arguments");
            int arg1 = Integer.parseInt(args[0]);
            int arg2 = Integer.parseInt(args[1]);
            int arg3 = Integer.parseInt(args[2]);
            int arg4 = Integer.parseInt(args[3]);
            int arg5 = Integer.parseInt(args[4]);

            commandArr = new int[] {arg1, arg2, arg3, arg4, arg5};

            for(int arg6 : commandArr)
            {System.out.println("Command: " + arg6);}
        }//if statement that will parse the numbers inputed from the command promot, and add the numbers into the command prompt array
        else
        {
            System.out.println("No command line arguments!");
        }

        for(int num : intArr)
        {System.out.println(num);}//number array gets printed out normally

        selectionSort(intArr);//number array gets sorted

        System.out.println("numbers sorted:");
        for(int num : intArr){System.out.println(num);}//number array gets printed out after sorted out

        int n = 10;
        for(int i = 0; i < n; i++)
        {
            multiThread obj = new multiThread();
            obj.runThread();
        }//for-loop that makes an instance of a multhread object and prints each thread

        System.out.println("sum of numbers: " + intArr[0] + intArr[1] + intArr[2] + intArr[3] + intArr[4]);//number array gets added up and printed out
    }
}