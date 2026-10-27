# oop labs

Java labs from my Object-Oriented Programming module at TU Dublin. new labs get added as the module goes on.

## what each lab covers

| lab | what's in it |
|-----|--------------|
| `lab1` | hello world, and translating a bit of C (an `if` and a `for` loop) into Java |
| `lab2` | writing my first classes: `Book` and `LibraryMember`, with several constructors, a `displayDetails()` method and some `String` methods. `Book` and `Control` started from the lab sheet's example code |
| `lab3` | encapsulation with a `Podcast` class: private fields, getters and setters that validate their input, `toString()`, and reading a podcast from the keyboard with `Scanner` |
| `lab4` | `WashingMachine` and `Dryer` as two separate classes, each with its own private fields and a brand that can't be set to null or empty |
| `lab4_appliance` | the same two classes again, but refactored with inheritance: both now `extend` a shared `Appliance` class and call `super(...)` |

each lab is its own package inside [`src/`](src), and the class with `main` is `Control` (or `HelloWorld` and `C2Java` in lab 1). lab 3 asks for input, so run it from a console that accepts typing.

## running the code

in Eclipse:

1. clone the repo: `git clone https://github.com/nady-lab/OOP.git`
2. **File → Import → Existing Projects into Workspace** and select the folder
3. open the lab's main class and click **Run**

or from the command line, with Java 21 installed:

```bash
javac -d bin $(find src -name "*.java")
java -cp bin lab3.Control
```

change `lab3.Control` to whichever main class you want, like `lab4_appliance.Control`.

## tools

Java 21, Eclipse IDE