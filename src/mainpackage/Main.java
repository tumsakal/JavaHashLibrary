package mainpackage;

import ant.util.security.Hash;

import java.util.Scanner;

public class Main {
    private static final Scanner _input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Text = ");
        String text = _input.nextLine();
        System.out.println("Hash using MD5 is " + Hash.computeBase64MD5(text));
        System.out.println("Hash using SH-1 is " + Hash.computeBase64SHA1(text));
        System.out.println("Hash using SH-256 is " + Hash.computeBase64SHA256(text));
    }
}
