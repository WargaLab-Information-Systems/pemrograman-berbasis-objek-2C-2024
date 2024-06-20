/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3_1;

public class Kendaraan {
    String type;
    String brand;
    String model;
    String status;
    int year;

    Kendaraan(String type, String brand, String model, String status, int year) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.status = status;
        this.year = year;
    }

    String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    String getStatus() {
        return status;
    }

    void setStatus(String status) {
        this.status = status;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jenis: ").append(type).append("\n");
        sb.append("Merek: ").append(brand).append("\n");
        sb.append("Model: ").append(model).append("\n");
        sb.append("Status: ").append(status).append("\n");
        sb.append("Tahun: ").append(year).append("\n");
        return sb.toString();
    }
    
}
