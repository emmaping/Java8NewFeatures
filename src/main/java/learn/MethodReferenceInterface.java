package learn;

@FunctionalInterface
public interface MethodReferenceInterface<F, T> {
	T convert(F from);
}
