package java.util;

public final class Objects {
  private Objects() {
    throw new AssertionError("Instantiating java.long.Objetcs is not allowed!");
  }

  public static <T> int compare(final T x, final T y, final Comparator<? super T> comparator) {
    if (x == y)
      return 0;
    else
      return comparator.compare(x, y);
  }

  public static boolean deepEquals(final Object x, final Object y) {
    if (x == y)
      return true;
    if (x == null || y == null)
      return false;
    throw new UnsupportedOperationException("deepEquals is not implemented yet.");
  }

  public static boolean equals(final Object x, final Object y) {
    if (x == y)
      return true;
    if (x != null)
      return x.equals(y);
    return false;
  }

  public static int hash(final Object... values) {
    return Arrays.hashCode(values);
  }

  public static int hashCode(final Object value) {
    if (value == null)
      return 0;
    return value.hashCode();
  }

  public static <T> T requireNonNull(final T value) {
    if (value == null)
      throw new NullPointerException();
    else
      return value;
  }

  public static <T> T requireNonNull(final T value, String message) {
    if (value == null)
      throw new NullPointerException(message);
    else
      return value;
  }

  public static String toString(final Object value) {
    return String.valueOf(value);
  }

  public static String toString(final Object value, final String defaultValue) {
    if (value == null)
      return defaultValue;
    return value.toString();
  }
}