package collections;

//static inner classes

class Outer2 {
//. . .
static class Inner2 {
//. . .
}
//. . .
//примеры создания объекта класса Inner3 извне класса Outer3.
Outer3.Inner3 obj1 = new Outer3.Inner3(); // явное порождение
Outer3.Inner3 obj2 = Outer3.createInner();// порождение через метод createInner()
}



