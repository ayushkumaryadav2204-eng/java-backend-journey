# Java Primitive Data Types & Wrapper Classes

## 1. Primitive Data Types

Primitive data types store simple values directly. Java has **8 primitive data types**.

| Type | Size | Example |
|---|---|---|
| `byte` | 8-bit | `byte a = 10;` |
| `short` | 16-bit | `short a = 1000;` |
| `int` | 32-bit | `int a = 100000;` |
| `long` | 64-bit | `long a = 30000000000L;` |
| `float` | 32-bit | `float a = 10.5f;` |
| `double` | 64-bit | `double a = 10.5;` |
| `char` | 16-bit | `char a = 'A';` |
| `boolean` | JVM-dependent storage | `boolean a = true;` |

**Why do we need different types?**

Different types store different kinds of values and have different ranges. For example, use `int` for ordinary whole numbers and `long` for larger whole numbers.

## 2. What Is a Wrapper Class?

A wrapper class represents a primitive value as an object.

| Primitive | Wrapper Class |
|---|---|
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

### Why do we need wrapper classes?

- **Collections:** Java collections such as `ArrayList` store objects, not primitive values directly.
- **Utility methods:** Wrapper classes provide methods for parsing and converting values. Example:  int number = Integer.parseInt(age);
- **Null values:** A wrapper reference can be `null`, while a primitive cannot.
- **Generics:** Generic types such as `List<Integer>` require reference types.

Example:

```java
int age = 20;                  // Primitive
Integer number = 20;           // Wrapper object

ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
```

**Real-world example:** A database field representing a person's age might be missing. An `Integer` can represent that missing value with `null`, whereas an `int` cannot.

Note: Wrapper classes can use more memory than primitives, and you should avoid unnecessary wrapping when working with large amounts of numeric data.

## 3. Why Does `String` Start With Capital S?

```java
String name = "Java";
```

`String` starts with a capital `S` because it is a **class**, not a primitive data type.

Java naming convention:
- Classes: `String`, `Integer`, `Student`
- Variables: `name`, `age`, `total`

`String` represents text and is a class in the `java.lang` package, which Java makes available automatically.

Unlike primitive values, a `String` is an object. Strings are also immutable, meaning their contents cannot be changed after creation.

```java
String name = "Java";
name = name + " Programming";

System.out.println(name); // Java Programming
```

The original string was not modified; the expression created a new string and assigned it to `name`.

## 4. Why Does `long a = 30000000000000` Give an Error?

```java
long a = 30000000000000;  // Compilation error
```

**Reason:** Java treats an integer literal without a suffix as an `int` first. The number above is too large for an `int`, so compilation fails before assignment to `long`.

### Solution: Add `L`

```java
long a = 30000000000000L; // Correct
```

- `L` tells Java that the integer literal is a `long`.
- Prefer uppercase `L` because lowercase `l` can look like the number `1`.

Similarly, floating-point literals use `f` when you want a `float`:

```java
float price = 10.5f;
double amount = 10.5;
```

## 5. Type Casting in Java

Type casting means converting a value from one data type to another.

There are two main types.

### A. Widening Casting (Automatic)

Converts a smaller-range numeric type to a larger-range numeric type.

```java
int number = 100;
double result = number;

System.out.println(result); // 100.0
```

Common widening conversions:

`byte → short → int → long → float → double`

`char` can widen to `int`, `long`, `float`, or `double` as well.

**Why use it?** When a calculation or method needs a wider numeric type.

Note: Widening does not always preserve every digit of precision. For example, converting a very large `long` to `float` can lose precision.

### B. Narrowing Casting (Manual)

Converts a value to a type with a smaller range or less precision. You must explicitly cast it.

```java
double price = 99.99;
int result = (int) price;

System.out.println(result); // 99
```

The decimal part is removed; it is not rounded.

**Important:** Narrowing can lose information or cause overflow.

```java
int number = 130;
byte result = (byte) number;

System.out.println(result); // -126
```

A `byte` can only hold values from `-128` to `127`, so the result wraps around.

### Widening vs Narrowing

| Widening | Narrowing |
|---|---|
| Usually automatic | Requires explicit cast |
| Converts to a wider type | Converts to a narrower type |
| Can still lose precision | Can lose range or precision |
| `int → double` | `double → int` |

## 6. Autoboxing and Unboxing

Java can automatically convert between primitives and their wrapper classes.

**Autoboxing:** Primitive to wrapper.

```java
int a = 10;
Integer b = a;
```

**Unboxing:** Wrapper to primitive.

```java
Integer a = 10;
int b = a;
```

Be careful: unboxing a `null` wrapper causes a `NullPointerException`.

```java
Integer value = null;
// int number = value; // NullPointerException
```

## 7. Quick Revision

- Java has 8 primitive data types.
- Wrapper classes represent primitive values as objects.
- `String` is a class, not a primitive type.
- Use `L` for large `long` integer literals.
- Use `f` for `float` literals.
- Widening casting is usually automatic.
- Narrowing casting requires an explicit cast and may lose information.
- Autoboxing converts primitives to wrappers.
- Unboxing converts wrappers to primitives.
- Use primitives for simple calculations and wrappers when objects, generics, or `null` values are needed.

## 8. Simple Example

```java
public class Main {
    public static void main(String[] args) {
        int age = 20;
        Integer wrapperAge = age; // Autoboxing

        long population = 30000000000L;

        double price = 99.99;
        int wholePrice = (int) price; // Narrowing

        String language = "Java";

        System.out.println(wrapperAge);  //20
        System.out.println(population); //30000000000
        System.out.println(wholePrice); //99
        System.out.println(language);  //Java
    }
}
```

### 10. Integer Caching in Java

Java caches `Integer` objects for values from **-128 to 127** by default. When these values are autoboxed, Java reuses cached objects.

**Example 1: Small Integer Values**

```java
Integer a = 100;
Integer b = 100;

System.out.println(a == b);      // true
System.out.println(a.equals(b)); // true
```

**Why?** Both references point to the same cached `Integer` object.

**Example 2: Values Outside the Cache Range**

```java
Integer a = 200;
Integer b = 200;

System.out.println(a == b);      // false (typically)
System.out.println(a.equals(b)); // true
```

**Why?** These values typically refer to different objects because `200` is outside the default cache range.

### Important Points

- The default guaranteed cache range is `-128` to `127`.
- `==` checks whether two references point to the same object.
- `.equals()` checks whether the integer values are equal.
- Outside the guaranteed cache range, object reuse is not guaranteed.
- Always use `.equals()` to compare `Integer` values.

**Remember:**

```java
int x = 100;
int y = 100;
System.out.println(x == y); // true: primitive values

Integer p = 100;
Integer q = 100;
System.out.println(p == q);      // true: cached objects
System.out.println(p.equals(q)); // true: equal values
```

### Quick Comparison: Primitive vs Wrapper

| Feature | Primitive | Wrapper |
|---|---|---|
| Example | `int a = 10;` | `Integer a = 10;` |
| Stores | A value | Object reference |
| `==` comparison | Compares values | Compares references |
| Value comparison | `==` | `.equals()` |
| Can be `null` | No | Yes |
| Works with Generics | No | Yes |
| Conversion | — | Autoboxing and unboxing |

**Best practice:** Use primitives for ordinary calculations and `.equals()` for comparing wrapper object values.

## Important Points About `null` in Java

- `null` means a reference does not point to any object.
- Primitive types (`int`, `double`, `boolean`, etc.) cannot store `null`.
- Wrapper classes (`Integer`, `Double`, `Boolean`, etc.) can store `null`.
- Using a `null` reference to access a field or call a method causes a `NullPointerException`.
- Unboxing a `null` wrapper into a primitive also causes a `NullPointerException`.
- You can check for `null` using `== null` or `!= null`.
- Java's `String` is a reference type, so a `String` variable can also be `null`.

### Example

```java
Integer age = null;
String name = null;

// Check before using
if (age != null) {
    System.out.println(age);
}

if (name != null) {
    System.out.println(name.length());
}
```

### Common Mistake

```java
Integer number = null;
int value = number; // NullPointerException
```

**Why?** Java tries to unbox `number` from `Integer` to `int`, but there is no value to unbox.

### Quick Comparison

| Primitive | Wrapper |
|---|---|
| `int a = 0;` | `Integer a = null;` |
| Cannot be `null` | Can be `null` |
| Always holds a primitive value once initialized | May refer to an object or be `null` |

**Best practice:** Always check whether a wrapper or object reference is `null` before using it when null is a possible value.




