/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestreams;

/**
 *
 * @author nitro5
 */
public class Lab1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle ractangle = new Rectangle();
        RedShapeDecorator redCircle = new RedShapeDecorator (circle);
        RedShapeDecorator redRectangle = new RedShapeDecorator (ractangle);
        redCircle.draw();
        redRectangle.draw();
    }
    
}
