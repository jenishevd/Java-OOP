/*

Passing this as an Argument
We can use this keyword to pass the current object as an argument to a method.

 */

package This;

public class Argument {
    int x;
    int y;

    Argument(int x, int y){
        this.x = x;
        this.y = y;

        System.out.println("Before passing this to add() method");
        System.out.println("x: " + this.x + ", y:  " + this.y);

        add(this);

        System.out.println("After passing this to add() method");
        System.out.println("x: " + this.x + ", y:  " + this.y);
    }

    void add(Argument arg){
        arg.x += 2;
        arg.y += 2;
    }
    public static void main(String[] args) {
        Argument a = new Argument(5, 3);
    }
}
