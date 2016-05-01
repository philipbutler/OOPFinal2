import java.util.GregorianCalendar;

public class DumpArrayMain {

	public static void main(String[] args) {
		
		Object[] objectArray = {1, "2", new GregorianCalendar()};
		DumpArray tester = new DumpArray();
		
		tester.dumpArray(objectArray);
	}

}
