This project is used to reference and learn about Design Patterns using Java.

# CREATIONAL
## Abstract Factory
Provides an interface for creating families of related or dependent objects without specifying their concrete classes

<b>When to Use Abstract Factory Pattern:</b>

* The client is independent of how we create and compose the objects in the system
* The system consists of multiple families of objects, and these families are designed to be used together
* We need a run-time value to construct a particular dependency



## Builder
Separate the construction of a complex object from its representation so that the same construction process can create different representations.

<b>When to Use Builder Pattern:</b>

* <b>Complex constructor</b> - Multiple constructor having combinations of multiple parameter with nested objects
* <b>Large number of parameters</b> - having large number of field parameter is also the key point to consider.
* <b>Immutability</b> - You can force the immutability to the object once you are done with creation of object.

## Factory Method
It is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

<b>When to Use Factory Method Pattern:</b>

* Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.
* Use the Factory Method when you want to provide users of your library or framework with a way to extend its internal components.
* Use the Factory Method when you want to save system resources by reusing existing objects instead of rebuilding them each time.

## Object Pool
Avoid expensive acquisition and release of resources by recycling objects that are no longer in use
## Prototype
A fully initialized instance to be copied or cloned
## Singleton
Restricts the instantiation of a class to one "single" instance, and provide a global point of access to it. Encapsulated "just-in-time initialization" or "initialization on first use".

<b>When to Use Singleton Pattern:</b>

* Ownership of the single instance cannot be reasonably assigned
* Lazy initialization is desirable
* Global access is not otherwise provided for

# Structural
## Adapter
Match interfaces of different classes
## Bridge
Separates an object’s interface from its implementation
## Composite
A tree structure of simple and composite objects
## Decorator
Add responsibilities to objects dynamically
## Facade
A single class that represents an entire subsystem
## Flyweight
A fine-grained instance used for efficient sharing
## Private Class Data
Restricts accessor/mutator access
## Proxy
An object representing another object

# Behavioral
## Chain of responsibility
A way of passing a request between a chain of objects
## Command
Encapsulate a command request as an object
## Interpreter
A way to include language elements in a program
## Iterator
Sequentially access the elements of a collection
## Mediator
Defines simplified communication between classes
## Memento
Capture and restore an object's internal state
## Null Object
Designed to act as a default value of an object
## Observer
A way of notifying change to a number of classes
## State
Alter an object's behavior when its state changes
## Strategy
Encapsulates an algorithm inside a class
## Template method
Defer the exact steps of an algorithm to a subclass
## Visitor
Defines a new operation to a class without change