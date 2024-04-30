/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package konfersi;
////tipe parameter interface untuk satuan konversi
interface convertible{
    double convert(double value);
}
// Kelas abstrak untuk satuan
abstract class Konfersi implements convertible {
    String name;

//   konstruktor 
    public Konfersi(String name) {
        this.name = name;
    }  
//method getter
    public String getName() {
        return name;
    }
    
}

