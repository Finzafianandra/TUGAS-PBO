//Class Abstract (tidak bisa digunakan untuk membuat object)
//Inheritancex (untuk membuat struktur class pada pemrograman yang dimana struktur tersebut terdapat sebuah Parentclass atau Superclass sebagai induk kelas dan Subclass sebagai anak kelas.)
//Encapsulation (Public,Private,Protected, )
//Overriding (pembuatan ulang method dari superclass untuk subclass)
//Overloading ( membuat beberapa method dengan nama yang sama, tapi dibedakan dari jumlah dan/atau tipe parameter.)

abstract class Peminjaman{
    void denda(){}
    void pengembalian(){}
}

class PBO extends Peminjaman{
    @Override
    void denda(){

    }
}

class Parent{
    public int x;

    void print(String tipeAnggota, int bayar) {
        System.out.println("Print Parent");
    }

    void print(String tipeAnggota) {
        System.out.println("Print Parent");
    }
    void print(){
        System.out.println("Print Parent");
    }
}

class A extends Parent{
    @Override
    void print(){
        System.out.println("Print A");
    }
    void test(){
        print();
        x = 5;
    }
}

class B extends A{
    void test2(){
        print();
    }
}

public class App extends Parent {
    public static void main(String[] args) throws Exception {
        Parent parent = new Parent();
        parent.print();
        parent.print("Mahasiswa");

        A a = new A();
        a.print();

    }
}
