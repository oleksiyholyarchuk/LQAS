package collections;

//static inner classes

class Outer2 {
//. . .
static class Inner2 {
//. . .
}
//. . .
//������� �������� ������� ������ Inner3 ����� ������ Outer3.
Outer3.Inner3 obj1 = new Outer3.Inner3(); // ����� ����������
Outer3.Inner3 obj2 = Outer3.createInner();// ���������� ����� ����� createInner()
}



