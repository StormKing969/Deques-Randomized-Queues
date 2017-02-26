import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

// Takes a command-line integer k; reads in a sequence of strings from 
// standard input; and prints out exactly k of them, uniformly at random. 
// Note that each item from the sequence is printed out at most once.
public class Subset {
    public static void main(String[] args) {
        Integer k = Integer.parseInt(args[0]);
        ResizingArrayRandomQueue<String> q = new ResizingArrayRandomQueue<String>();
        for (int x = 0; x <k; x++) {
            q.enqueue(StdIn.readString());
            StdOut.println(q.dequeue());
        }
    }
}
