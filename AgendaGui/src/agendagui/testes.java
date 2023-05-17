/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendagui;


/**
 *
 * @author Emilio
 */
class Point { int x, y; }
class Triple extends Point { int p1, p2, p3; }

public class testes {
public static void main(String[] args) {
    Point p = new Point();
    Triple t = new Triple();
    t.p1 = t.p2 = t.p3 = 1;
    p = (Point) t;
    System.out.printf("%d, %d\n", p.x, p.y);
}
}    
   


