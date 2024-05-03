/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konfersi;

// Kelas abstrak untuk satuan
    abstract class Konfersi {
        String name;

    public Konfersi(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

