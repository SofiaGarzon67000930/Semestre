/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

import java.util.Scanner;

/**
 *
 * @author Araceli
 */
public class Estudiantes {
    private String name;
    private int code;

    Estudiantes(String name,int code){
    Scanner sc = new Scanner(System.in);
        System.out.println("Digite el nombre, el codigo del estudiante");
        code = sc.nextInt();
        name= sc.next();
    }
    
}
