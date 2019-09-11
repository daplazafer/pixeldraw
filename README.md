# PixelDraw

**PixelDraw** is a Java 8 Maven-based graphical application that allows users to draw pixels and lines on a canvas and execute animations via a script. The graphical interface is built using Java Swing, providing tools for drawing and transforming shapes. Users can create animations through a custom script format.

## Requirements

To build and run this project, you need the following:

- **Docker** (to compile the project using Maven)
- **Make** (to simplify the build and run process)
- **Java 8** or higher (to execute the compiled JAR)

## Features

- **Drawing Tools**: Draw points and lines on a pixel canvas.
- **Transformations**: Apply transformations like moving, scaling, and rotating shapes.
- **Animations**: Execute animations based on scripts that define drawing operations and transformations over time.

## Example Animation Script

An example animation script is provided in the file `test_animation.txt`. This script demonstrates how to use commands for drawing and transformations. The application will interpret the script and animate the drawing on the canvas.

## Usage

### 1. Build the Project

To build the project using Docker and Maven, simply run:

```bash
make build
```

This command will compile the project and generate a JAR file in the target directory without running tests.

### 2. Run the Application

After building the project, you can run the application with the following command:

```bash
make run
```

This will execute the compiled JAR file and launch the graphical interface for drawing and animations.

### 3. Build and Run Together

You can also compile and immediately run the application in a single step:

```bash
make run
```

### 4. Clean the Build

To clean the project and remove the target directory, use:

```bash
make clean
```

This will delete the generated JAR file and all other build artifacts.

## How Animations Work

Animations are driven by a simple script format where you can define drawing instructions, transformations, and pauses.

You can use the test_animation.txt file to see an example in action.

## License

This project is licensed under the MIT License.

## Author

Created by Daniel Plaza Fernández.

