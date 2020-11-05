import java.io.*; 

// MyClass class
public class Maria {
    //class attributes
    int x;  
    String default_;

    //class constructor for the MariaKolyvaki class
    public Maria(int x) {
        this.x = x;  // Set the initial value for the class attribute x
        this.default_ = "I am default String field";
    }

    public void printDefault() {
        System.out.println(this.default_);
    }

    public void dummySetter(String default_) {
        this.default_ = default_;
    }

  }