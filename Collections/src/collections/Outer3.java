package collections;

class Outer3 {
String name;
//. . .
static class Inner3 {
//. . .
public void f(Outer3 obj) {
System.out.println(obj.name); // ����� ��� obj ������
}
}
//. . .
public static Inner3 createInner() {
return new Inner3();
}
//. . .
}