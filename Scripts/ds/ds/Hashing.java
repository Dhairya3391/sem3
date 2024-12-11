import java.util.*;

class Hash {
  public boolean prime(int a) {
    int flag = 0;
    for (int i = 2; i < a; i++) {
      if (a % i == 0) {
        flag = 1;
      }
    }
    if (flag == 0) {
      return true;
    } else {
      return false;
    }
  }

  public void getdata() {
    int n;
    System.out.println("Enter Array Size ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    while (prime(n) != true) {
      if (prime(n) == false) {
        n++;
      }
    }
    System.out.println(n);

    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i % n] = sc.nextInt();
    }
    System.out.println("Array is");
    for (int j = 0; j < n; j++) {
      System.out.println("Array index" + arr[j] % n + "=" + arr[arr[j] % n]);
    }
  }
}

public class Hashing {
  public static void main(String[] args) {
    Hash h1 = new Hash();
    h1.getdata();
  }

}