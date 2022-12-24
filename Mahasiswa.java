/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasisawaku;

/**
 *
 * @author Axioo
 */
class Mahasiswa<T0, T1, T2> {

    private T1 NIM;
    private T2 Nama;
    private T3 clas;
    
    public void setNim(T1 NIM){
        this.NIM = NIM;
        
    }
    
    public void setNama(T2 Nama){
        this.Nama = Nama;
    }
    
    public void setClas(T3 clas){
        this.clas = clas;
    }
    
    public T1 getNim(){
        return this.NIM;
    }
    
    public T2 getNama(){
        return this.Nama;
    }
    
    public T3 getClas(){
        return this.clas;
    }

    void setNama(String ferdi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setClas(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class T3 {

        public T3() {
        }
    }
}
