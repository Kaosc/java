# Java Quick Reference Guide

## Package Rules

### Package Declaration
- **MUST** be the first line in your Java file (except comments)
- **MUST** match the folder structure
- Use dot notation to separate folders

```java
// File location: e:\dev\java\uygulamalar\calculator\Calculator.java
package uygulamalar.calculator;  // Package matches folder path
```

### Why Packages Are Needed
1. **Organization** - Groups related classes together
2. **Avoid Name Conflicts** - Two classes can have the same name if in different packages
3. **Java Requirement** - Java uses packages to locate files during compilation
4. **Access Control** - Controls which classes can see each other

---

## Naming Conventions

| Element | Convention | Example |
|---------|-----------|---------|
| **Class Names** | PascalCase (uppercase first letter) | `Calculator`, `Operations` |
| **File Names** | MUST match class name exactly | `Calculator.java` |
| **Package Names** | all lowercase, no underscores | `calculator`, `arrays` |
| **Folder Names** | Should match package names (lowercase) | `calculator/`, `arrays/` |

---

## Compiling and Running Java

### ✅ Correct Way

**Always work from the project root** where your packages start:

```powershell
# 1. Navigate to project root
cd e:\dev\java

# 2. Compile using FILE PATH with .java extension
javac algoritma/arrays/Array.java

# 3. Run using PACKAGE.CLASSNAME (NO .java extension!)
java algoritma.arrays.Array
```

### ❌ Common Mistakes

```powershell
# DON'T compile from inside the package folder
cd algoritma\arrays
javac Array.java  ❌ Can't find other packages!

# DON'T use file path with java command
java .\algoritma\arrays\Array.java  ❌ Wrong!

# DON'T use .java extension with java command
java algoritma.arrays.Array.java  ❌ Wrong!
```

### Quick Command Reference

| Command | Syntax | Example |
|---------|--------|---------|
| **Compile** | `javac` + file path + `.java` | `javac algoritma/arrays/Array.java` |
| **Run** | `java` + package.ClassName | `java algoritma.arrays.Array` |

---

## Import Rules

### When You Need Imports

✅ **DO need imports for:**
- Classes from **different packages** in your project
- Classes from Java libraries (e.g., `java.util.Scanner`, `java.io.File`)

❌ **DON'T need imports for:**
- Classes in the **same package** (they see each other automatically)
- `java.lang` classes (e.g., `String`, `System`, `Math`)

### Import Example

```java
package algoritma.arrays;

// Import from different package
import uygulamalar.calculator.Operations;
// Import from Java library
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Operations ops = new Operations();  // Can use because we imported it
        Scanner sc = new Scanner(System.in);  // Can use because we imported it
    }
}
```

### Same Package Example

```java
// File: uygulamalar/calculator/Calculator.java
package uygulamalar.calculator;

public class Calculator {
    public static void main(String[] args) {
        // NO import needed - Operations is in same package!
        int result = Operations.add(5, 3);
    }
}
```

---

## Project Structure Example

```
e:\dev\java\                    ← Always compile/run from here!
├── algoritma\
│   └── arrays\
│       └── Array.java          → package algoritma.arrays;
├── uygulamalar\
│   ├── calculator\
│   │   ├── Calculator.java     → package uygulamalar.calculator;
│   │   └── Operations.java     → package uygulamalar.calculator;
│   └── mergearrays\
│       └── Main.java           → package uygulamalar.mergearrays;
└── oop\
    └── recursivemethods\
        └── RecursiveMethods.java → package oop.recursivemethods;
```

---

## Common Errors and Solutions

### Error: "package does not exist"
```
arrays.java:3: error: package uygulamalar.calculator does not exist
```
**Solution:** You're compiling from the wrong directory. Go to project root (`e:\dev\java`)

### Error: "declared package does not match expected package"
```
The declared package "Arrays" does not match the expected package "algoritma.Arrays"
```
**Solution:** Fix your package declaration to match the folder structure

### Error: "could not find or load main class"
```
Error: Could not find or load main class Array
```
**Solution:** Use the full package name: `java algoritma.arrays.Array` (not just `Array`)

---

## Tips

- **File location** = Folder path must match package structure
- **Compile** from root using file paths
- **Run** from root using package.ClassName notation
- Classes in the same package don't need imports
- Package names = lowercase folder names (convention)
- Class names = PascalCase, must match file name exactly