System Design Essentials

<image src="https://github.com/s4satishverma/SystemDesign/blob/main/images/hld_lld.png"></image>

High-Level Design (LLD) Resources

1. Key Concepts
   
Scalability – Ability of a system to handle increased load by adding resources.......Done

Availability – Ensuring the system is operational and accessible when needed........Done

CAP Theorem – Trade-off between Consistency, Availability, and Partition Tolerance in distributed systems.......Done

ACID Transactions – Atomicity, Consistency, Isolation, Durability in databases........Done

Consistent Hashing – Distributes data across nodes with minimal re-distribution when nodes are added/removed.......Done

Rate Limiting – Controlling the number of requests a client can make in a given period.

Single Point of Failure (SPOF) – A component whose failure can bring down the system.

Fault Tolerance – Ability to continue functioning despite failures.

Consensus Algorithms – Mechanisms like Raft, Paxos to achieve agreement among distributed nodes.

Gossip Protocol – Decentralized communication for spreading information across nodes.

Service Discovery – Automatically locating services in dynamic environments.

API Design – Structuring APIs for usability, maintainability, and scalability.

Disaster Recovery – Strategies to restore services after catastrophic failures.

Distributed Tracing – Tracking requests across multiple services in a distributed system.


2. Building Blocks
   
APIs – Interface for communication between services.

Content Delivery Network (CDN) – Distributes content closer to users for faster access.

Proxy vs Reverse Proxy – Forwarding client requests vs managing requests to servers.

Domain Name System (DNS) – Resolves domain names to IP addresses.

Caching – Temporary data storage for faster retrieval.

Caching Strategies – Write-through, Write-back, Read-through, Cache-aside.

Distributed Caching – Shared cache accessible by multiple nodes.

API Gateway – Central entry point for managing APIs, routing, and authentication.

Load Balancing – Distributing traffic across multiple servers.

Database Types – SQL (relational) vs NoSQL (non-relational).

Database Indexes – Structures to speed up data retrieval.

Consistency Patterns – Strong, Eventual, Causal consistency.

Heartbeats – Regular signals to check component health.

Circuit Breaker – Prevents cascading failures by stopping repeated failed requests.

Idempotency – Same request executed multiple times gives the same result.

Database Scaling – Vertical (scale-up) vs Horizontal (scale-out).

Data Replication – Copying data across nodes for redundancy.

Data Redundancy – Storing extra copies of data for fault tolerance.

Database Sharding – Splitting a database into smaller, faster parts.

Database Architectures – Master-Slave, Master-Master, Leader-Follower.

Failover – Switching to a backup system when primary fails.

Bloom Filters – Probabilistic data structure to test membership efficiently.

Message Queues – Asynchronous communication between services.

WebSockets – Persistent, bi-directional client-server communication.

Checksums – Data integrity verification.

Microservices Guidelines – Best practices for modular service design.

Distributed Locking – Ensuring only one process accesses shared resource at a time.


3. Trade-offs
   
Vertical vs Horizontal Scaling

Concurrency vs Parallelism

Long Polling vs WebSockets

Batch Processing vs Stream Processing

Stateful vs Stateless Design

Strong Consistency vs Eventual Consistency

Read-Through vs Write-Through Cache

Push vs Pull Architecture

REST vs RPC

Synchronous vs Asynchronous Communication

Latency vs Throughput

Top 15 Common Trade-offs – Balancing performance, cost, complexity, maintainability.


4. Architectural Patterns
   
Client-Server Architecture – Central server serving multiple clients.

Microservices Architecture – Independent services communicating via APIs.

Serverless Architecture – Functions executed on demand without managing servers.

Event-Driven Architecture – Components communicate via events.

Peer-to-Peer (P2P) Architecture – Nodes act as both clients and servers.

---------------------------------------------------------
---------------------------------------------------------

Low-Level Design (LLD) Resources

Fundamental Concepts

Basics of OOP – Encapsulation, Inheritance, Polymorphism, Abstraction.

SOLID Principles

Single Responsibility Principle (SRP):
A class should have only one reason to change, meaning it should have a single responsibility.

Open/Closed Principle (OCP):
Software entities should be open for extension but closed for modification.

Liskov Substitution Principle (LSP):
Subtypes must be substitutable for their base types without altering program correctness.

Interface Segregation Principle (ISP):
Clients should not be forced to depend on interfaces they do not use; prefer many specific interfaces over one general.

Dependency Inversion Principle (DIP):
Depend on abstractions, not concrete implementations, to reduce coupling.

DRY Principle – Don’t Repeat Yourself.

YAGNI Principle – You Aren’t Gonna Need It.

KISS Principle – Keep It Simple, Stupid.


Design Patterns 

Creational Patterns
Focus: Object creation mechanisms.

1. Singleton
Definition: Ensures only one instance of a class exists and provides a global access point.

Use Case: Database connections, logging, configuration.

Example: Logger.getInstance() returns the same object every time.

2. Factory Method
Definition: Defines an interface for creating objects but lets subclasses decide which class to instantiate.

Use Case: Creating objects without specifying their exact class.

Example: ShapeFactory.createShape("circle") returns a Circle object.

3. Abstract Factory
Definition: Produces families of related objects without specifying their concrete classes.

Use Case: UI toolkits for multiple OS themes.

Example: GUIFactory creates Button and Checkbox for Windows or Mac.

4. Builder
Definition: Constructs complex objects step-by-step.

Use Case: Creating objects with many optional fields.

Example: PizzaBuilder.setCheese().setPepperoni().build().

5. Prototype
Definition: Creates objects by cloning an existing object (prototype).

Use Case: Avoid costly object creation from scratch.

Example: car.clone() creates a copy with the same properties.


2.Structural Patterns
Focus: Object composition and structure.

1. Adapter
Definition: Converts one interface into another the client expects.

Use Case: Integrating legacy code with new systems.

Example: Adapter that makes OldPaymentSystem work with NewPaymentGateway.

2. Bridge
Definition: Separates abstraction from implementation so they can change independently.

Use Case: Decouple UI abstraction from platform-specific rendering.

Example: RemoteControl works with both SonyTV and SamsungTV.

3. Composite
Definition: Treats individual objects and compositions of objects uniformly.

Use Case: File system hierarchy (files & folders).

Example: Folder.add(File) allows nesting.

4. Decorator
Definition: Adds new functionality to an object without altering its structure.

Use Case: Adding encryption to data streams.

Example: new EncryptedStream(new FileStream()).

5. Facade
Definition: Provides a simplified interface to a complex subsystem.

Use Case: Hiding complex library logic behind one API.

Example: VideoConverter.convert("file.mp4").

6. Flyweight
Definition: Reduces memory usage by sharing common parts of objects.

Use Case: Rendering thousands of similar objects (e.g., game trees).

Example: Share TreeType data for many tree instances.

7. Proxy
Definition: Acts as a placeholder to control access to another object.

Use Case: Lazy initialization, access control, logging.

Example: ImageProxy loads the image only when needed.


3. Behavioral Patterns
Focus: Object interaction & responsibility distribution.

1. Iterator
Definition: Provides a way to sequentially access elements without exposing internal structure.

Use Case: Looping over collections.

Example: while(iterator.hasNext()) { ... }

2. Observer
Definition: Allows multiple objects (observers) to be notified of changes in another object (subject).

Use Case: Event systems, UI updates.

Example: Stock price change notifies all subscribed clients.

3. Strategy
Definition: Defines a family of algorithms and makes them interchangeable.

Use Case: Payment method selection at runtime.

Example: PaymentContext.setStrategy(new PayPal()).

4. Command
Definition: Encapsulates a request as an object.

Use Case: Undo/redo functionality.

Example: Command.execute() for “Copy”, “Paste”.

5. State
Definition: Allows an object to change its behavior when its internal state changes.

Use Case: Traffic light system.

Example: Context.setState(new GreenLight()).

6. Template Method
Definition: Defines the program skeleton in a method, allowing subclasses to redefine certain steps.

Use Case: Data processing pipelines.

Example: DataParser.parse() where parsing steps are overridden.

7. Visitor
Definition: Separates algorithms from object structures they operate on.

Use Case: Applying new operations to a set of objects without modifying them.

Example: TaxVisitor applied to different Product objects.

8. Mediator
Definition: Central object that coordinates interactions between other objects.

Use Case: Chatroom managing messages between users.

Example: ChatRoom.sendMessage(user, msg).

9. Memento
Definition: Captures and restores an object’s state without exposing its internals.

Use Case: Save game checkpoints, undo operations.

Example: Editor.saveState() and Editor.restoreState().

10. Chain of Responsibility
Definition: Passes requests along a chain of handlers until one processes it.

Use Case: Logging, request validation.

Example: AuthHandler → DataHandler → ResponseHandler.


UML Diagrams
Class Diagram – Represents classes, attributes, methods, and relationships.

Use Case Diagram – Shows system functionality from the user’s perspective.

Sequence Diagram – Depicts interaction between components over time.

Activity Diagram – Models workflow and actions in a process.

State Machine Diagram – Describes states and transitions of a system/component.

