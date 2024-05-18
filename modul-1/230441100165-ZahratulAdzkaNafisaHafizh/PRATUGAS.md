## Catatan Class, Object, Attribute, dan Method
Berikut Penjelasan sederhana saya dari tiap istilah dalam program java:
### Class

Class adalah sebuah rancangan/aturan yang mendefinisikan atribut (data) dan method (fungsi) untuk suatu object.

### Object

object adalah instance atau hasil dari pembuatan class yang memiliki data dan fungsi sendiri. Object memiliki atribut yang mendefinisikan keadaan atau karakteristiknya dan method yang mendefinisikan perilaku atau tindakannya. Dibuat dengan menggunakan keyword “new” yang diikuti dengan nama class.

### Attribute

Attribute adalah data/variabel/informasi yang didefinisikan dalam class dan mewakili keadaan atau karakteristik dari suatu object. Dan tersimpan dalam sebuah class agar memudahkan pengaksesan dan penggunaan data tersebut di dalam program.

### Method

Method adalah fungsi yang didefinisikan dalam class dan digunakan untuk melakukan tindakan atau operasi pada object. Method biasanya digunakan untuk memanipulasi atribut object atau mengembalikan nilai.Sebagai contoh pada objek Hewan, terdapat beberapa method seperti jalan, makan, tidur, dan sebagainya.

### Contoh Implementasi dalam Java

```java
//class
public class Car {
    // Attributes
    String color;
    int speed;

    // Methods
    void accelerate() {
        speed += 10;
    }

    void brake() {
        speed -= 5;
    //object
    public static void main(String[] args){
    Car obj = new Car();
    obj.color="red";
    system.out.println("color of the car:"+obj.color);
    }
}
