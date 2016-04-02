package reflections;

import java.lang.reflect.*;
import java.util.LinkedList;

public class HelloWorld {

	public static void main(String[] args) throws ClassNotFoundException,
	NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		(new HelloWorld()).printName();

		HelloWorld x = new HelloWorld();
		x.printName();

		Class class1 = x.getClass();
		Class class2 = HelloWorld.class;
		Class class3 = Integer.class;
		Class c = Class.forName("com.mysql.jdbc.Driver");
		Class d = x.getClass();
		String s = c.getName();
		System.out.println(c);
// ---------- class access modifier investigation ------------
		Class e = x.getClass();
		int mods = c.getModifiers();
		if (Modifier.isPublic(mods)) {
			System.out.println("public");
		}
		if (Modifier.isAbstract(mods)) {
			System.out.println("abstract");
		}
		if (Modifier.isFinal(mods)) {
			System.out.println("final");
		}
// -------- get the name of superClasse and/or classes recursively----------------------
		Class superClass = d.getSuperclass();
		System.out.println(superClass);
		
		Class f = LinkedList.class;
		Class[] interfaces = f.getInterfaces();
		for(Class cInterface : interfaces) {
		System.out.println( cInterface.getName() );
		}
// ------------ get the list of interfaces used ----------------
		Class g = x.getClass();
		Field[] publicFields = g.getFields();
		for (Field field : publicFields) {
		Class fieldType = field.getType();
		System.out.println("Èìÿ: " + field.getName());
		System.out.println("Òèï: " + fieldType.getName());
		}	
//----------------- class Field(s)/declared field(s) -----------------

		Class j = x.getClass();
		Field nameField = j.getField("name");
		
		Class h = x.getClass();
		Field field = h.getField("name");
		String nameValue = (String) field.get(x);
//-----------------------------------------
		Class i = x.getClass();
		Field field2 = c.getField("name");
		field.set(x, "New name");
//--------------------------------------
		

	}

	public void printName() {
		System.out.println(this.getClass().getName());
	}
}