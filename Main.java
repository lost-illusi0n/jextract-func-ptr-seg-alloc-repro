import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;

public class Main {
	public static void main(String[] args) {
		var foo = repro_h.foo$SEGMENT();
		var bar = Foo.bar(foo, ResourceScope.globalScope()).apply();
	}
}
