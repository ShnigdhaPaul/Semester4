class A{ 
public A() { n = 0; }
public A(int a) { n = a; }
public void f() { n++; }
public void g() { f(); n = 2 * n; f(); }
public int h() { return n; }
public void k() { System.out.println(n); }
private int n;

public static void main(String[] args) {
A a = new A();
A b = new A(2);
A c = b;
A d = new A(3);
a.f();
b.g();
c.f();
d.g();
d.k();
A e = new A(a.h()+ b.h()+ c.h());
}
}