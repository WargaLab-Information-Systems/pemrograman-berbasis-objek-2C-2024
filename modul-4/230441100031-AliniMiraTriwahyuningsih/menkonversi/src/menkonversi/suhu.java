
package menkonversi;


class suhu extends Menkonversi {
    public suhu(double masukkannilai){
        super(masukkannilai);
    }

    @Override
    public void konversi() {
        double fahrenheit = masukkannilai * 9/5 + 32;
                double kelvin = 9/5*(fahrenheit-32)+ 273;
                double reamur = 5/4*(kelvin-273);
                
                System.out.println("Hasil konversi suhu dari celcius ke fahrenheit  = "+ fahrenheit);
                System.out.println("Hasil konversi suhu dari fahrenheit ke kelvin  = "+ kelvin);
                System.out.println("Hasil konversi suhu dari kelvin ke reamur  = "+ reamur);
        }
    }