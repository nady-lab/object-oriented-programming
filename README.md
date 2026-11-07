# <img src="assets/folder.png" width="32" alt=""> oop labs

Java labs from my Object-Oriented Programming module at TU Dublin. new labs get added as the module goes on.

## <img src="assets/breakdown.png" width="24" alt=""> structure

each lab is its own package inside [`src/`](src), and the class with `main` is `Control` (or `HelloWorld` and `C2Java` in lab 1). lab 3 asks for input, so run it from a console that accepts typing.

## <img src="assets/gears.png" width="24" alt=""> running the code

in Eclipse:

1. clone the repo: `git clone https://github.com/nady-lab/OOP.git`
2. **File → Import → Existing Projects into Workspace** and select the folder
3. open the lab's main class and click **Run**

or from the command line, with Java 21 installed:

```bash
javac -d bin $(find src -name "*.java")
java -cp bin lab3.Control
```

change `lab3.Control` to whichever main class you want, like `lab5.Control`.

## <img src="assets/tools.png" width="24" alt=""> tools

Java 21, Eclipse IDE

## <img src="assets/heart.png" width="24" alt=""> credits

feel free to use or learn from any of this code. if you do, a link back to this repo or a mention of [@nady-lab](https://github.com/nady-lab) would be really appreciated 
