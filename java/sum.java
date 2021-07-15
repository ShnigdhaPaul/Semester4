


		class A{
		 int n;
			public A() { int n = 0; }
		
		
		public A(int a) { int n = a; }
		public void f() { int n; }
		public void g() { f();  n = 2 * n; f(); 
		}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a = new A();
		A b = new A();
		A c = b;
		A d = new A();
		a.f();
		b.g();
		c.f();
		d.g();
		//d.k();
		A e = new A();
		 b.g();
		c.f();}}


