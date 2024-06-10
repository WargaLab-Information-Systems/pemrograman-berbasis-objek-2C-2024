                            
package tugas6;



public abstract class gadget {
    private String merk;
    private String model;
    
    public gadget(String merk, String model){
        this.merk = merk;
        this.model = model;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public String getModel(){
        return model;
    }
    
    public abstract void tampilkanSpesifikasi();

    void Display() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
