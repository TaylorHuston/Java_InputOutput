/*
Just a quickie program to get familiar with the libraries in
http://introcs.cs.princeton.edu/java/15inout/
 */



public class InputOutput {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        StdOut.println("You passed in "+N+" as an arguement");
        
        //Reading in a string
        String name;
        StdOut.println("What is your name?");
        name = StdIn.readString();
        StdOut.println("Hello "+name);
        
        //Reading in individual integers
        int sum = 0;
        StdOut.println("Enter a number");
        sum += StdIn.readInt();
        StdOut.println("Enter another number");
        sum += StdIn.readInt();
        StdOut.println("Your sum is "+sum);
        
        //Formatted ouput
        StdOut.println("The first 10 digits of PI");
        StdOut.printf("%.9f", Math.PI);
        StdOut.println();

        //Computer the average of several numbers
        double toAverage = 0;
        int count = 0;
        
        //Read in several values
        StdOut.println("Input 5 numbers");
        for (int i = 0; i < 5; i++) {
            double value = StdIn.readDouble();
            toAverage += value;
            count++;
        }

        double average = computeAverage(toAverage, count);
        StdOut.println("Average is " + average);
        
        
        //Draw a some stuff
        StdDraw.line(0.0,0.0, 0.5,1.0);
        StdDraw.line(0.5,1.0, 1.0,0.0);
        StdDraw.line(0.0,0.0, 1.0,0.0);
        StdDraw.point(0.5,0.5);
        
        StdIn.readString(); //To pause
        
        StdDraw.square(0.5, 0.5, 0.3);
        
        StdIn.readString(); //To pause
        
        StdDraw.picture(.5, .5, "Link.png");
        
        //Play a sound
        StdAudio.play("secret.wav");
    }
    
    public static double computeAverage(double toAverage, int count) {
        return (toAverage / count);
    }
    
}
