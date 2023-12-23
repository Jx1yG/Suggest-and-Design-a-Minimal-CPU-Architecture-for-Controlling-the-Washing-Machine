# Washing Machine CPU Control System

This project focuses on designing and implementing a minimal CPU architecture for controlling a washing machine. The system is capable of handling various tasks, including water level detection, temperature control, motor speed regulation, timer management, and more.

## Table of Contents
- [Abstract](#abstract)
- [Objective](#objective)
- [Design](#design)
- [Software Implementation](#software-implementation)
- [Debugging-Test-Run](#debugging-test-run)
- [Results Analysis](#results-analysis)
- [Future Improvement](#future-improvement)
- [Conclusion](#conclusion)
- [How to Use](#how-to-use)
- [Files and Directory Structure](#files-and-directory-structure)
- [Dependencies](#dependencies)
- [Contributing](#contributing)
- [Acknowledgments](#acknowledgments)

## Abstract

This project proposes a minimal CPU structure using a microcontroller model and Java-based software to efficiently control a washing machine. The design encompasses CPU architecture, memory allocation, I/O port configuration, and the implementation of control algorithms for various washing machine functionalities.

## Objective

The primary objective is to create an efficient and reliable control system for a washing machine, allowing it to handle tasks such as water level detection, temperature control, motor speed regulation, timer management, and more.

## Design

The microcontroller-based CPU architecture includes components such as the microcontroller unit, memory allocation, I/O ports, control algorithms, user interface, and multitasking capabilities.

### Microcontroller Unit:
- Core processing unit with features and capabilities.
### Memory Allocation:
- Program memory for storing control algorithms.
- Data memory for variables and settings.
### I/O Ports:
- Input and output ports for interfacing with external components.
### Control Algorithms:
- Representing the flow of algorithms for water level detection, temperature control, motor speed, timer, etc.
### User Interface:
- Display screen and input interface for user settings.
### Multitasking Capabilities:
- Handling multiple tasks simultaneously.

## Software Implementation

Java is chosen as the programming language for its portability and compatibility. The `WashingMachineController1` class orchestrates distinct sections of the washing cycle, implementing sequential steps such as water intake, wash, rinse, spin dry, and stop processes.

## Debugging-Test-Run

Test cases are provided in the main class to assess different scenarios, including temperature settings and energy efficiency modes.

## Results Analysis

The washing machine operates with minimal energy consumption under normal scenarios. Error handling prevents the initiation of the water intake process for invalid temperature settings.

## Future Improvement

- Design different washing models to meet various needs.
- Include additional functions such as dry level choice and detergent settings.
- Implement application control for remote manipulation.

## Conclusion

This project enhances our understanding of minimal CPU architectures for washing machines, contributing to the broader field of computer systems and concepts.

## How to Use

Provide instructions on how to run or test the code.

## Files and Directory Structure

- Describe the organization of code files and important directories.

## Dependencies

Specify any dependencies or tools required to run the project.

## Contributing

Guidelines for contributing to the project.


## Acknowledgments

- Mention any external libraries, frameworks, or resources used in the project.
