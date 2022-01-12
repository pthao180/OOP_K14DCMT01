package oo;

public class account {
    // data
    int sotk = 12345;
    int sodu = 0;

    // function
    void show() {
        System.out.println("thong tin tai khoan:");
        System.out.println("account number:" + sotk);
        System.out.println("account balance:" + sodu);
    }

    void withdraw(int withdrawAmount) {
        sodu -= withdrawAmount;
    }

    void deposit(int depositAmount) {
        sodu += depositAmount;
    }
}