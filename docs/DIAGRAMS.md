# Lab 6: Inheritance OOP — UML Class Diagrams

## Part 1: Practice Exercises (1–9)

### 1. Basic Inheritance "Vehicle & Car"
```mermaid
classDiagram
    class Vehicle {
        #String brand
        #int year
        +Vehicle(String brand, int year)
        +start() void
    }
    class Car {
        -int numDoors
        +Car(String brand, int year, int numDoors)
        +honk() void
    }
    Vehicle <|-- Car
```

### 2. Method Overriding "Employee & Manager"
```mermaid
classDiagram
    class Employee {
        #String name
        #double salary
        +Employee(String name, double salary)
        +calculateBonus() double
        +getName() String
    }
    class Manager {
        +Manager(String name, double salary)
        +calculateBonus() double
    }
    class Intern {
        +Intern(String name, double salary)
        +calculateBonus() double
    }
    Employee <|-- Manager
    Employee <|-- Intern
```

### 3. Multi-Level Inheritance "Person → Student → OnlineStudent"
```mermaid
classDiagram
    class Person {
        #String name
        +Person(String name)
    }
    class Student {
        #String studentId
        +Student(String name, String studentId)
    }
    class OnlineStudent {
        -String zoomId
        +OnlineStudent(String name, String studentId, String zoomId)
        +displayDetails() void
    }
    Person <|-- Student
    Student <|-- OnlineStudent
```

### 4. Calling Parent Constructor "Bank Account Types"
```mermaid
classDiagram
    class BankAccount {
        #String accountNumber
        #double balance
        +BankAccount(String accountNumber, double balance)
    }
    class SavingsAccount {
        -double interestRate
        +SavingsAccount(String accountNumber, double balance, double interestRate)
        +printSummary() void
    }
    BankAccount <|-- SavingsAccount
```

### 5. Using Protected Members "Library Resources"
```mermaid
classDiagram
    class LibraryItem {
        #String title
        #String id
        +LibraryItem(String title, String id)
        +displayInfo() void
    }
    class Book {
        -String author
        +Book(String title, String id, String author)
        +displayInfo() void
    }
    LibraryItem <|-- Book
```

### 6. Hierarchical Inheritance "Shape → Circle, Rectangle, Triangle"
```mermaid
classDiagram
    class Shape {
        +area() double
    }
    class Circle {
        -double radius
        +Circle(double radius)
        +area() double
    }
    class Rectangle {
        -double width
        -double height
        +Rectangle(double width, double height)
        +area() double
    }
    class Triangle {
        -double base
        -double height
        +Triangle(double base, double height)
        +area() double
    }
    Shape <|-- Circle
    Shape <|-- Rectangle
    Shape <|-- Triangle
```

### 7. Abstract Classes "Payment Methods"
```mermaid
classDiagram
    class Payment {
        <<abstract>>
        +processPayment(double amount)* void
    }
    class CreditCardPayment {
        +processPayment(double amount) void
    }
    class PayPalPayment {
        +processPayment(double amount) void
    }
    class BankTransferPayment {
        +processPayment(double amount) void
    }
    Payment <|-- CreditCardPayment
    Payment <|-- PayPalPayment
    Payment <|-- BankTransferPayment
```

### 8. E-commerce Product Catalog
```mermaid
classDiagram
    class Product {
        #String name
        #double price
        +Product(String name, double price)
        +getInfo() String
    }
    class Electronics {
        -int warrantyMonths
        +Electronics(String name, double price, int warrantyMonths)
        +getInfo() String
    }
    class Clothing {
        -String size
        +Clothing(String name, double price, String size)
        +getInfo() String
    }
    class Book {
        -String author
        +Book(String name, double price, String author)
        +getInfo() String
    }
    Product <|-- Electronics
    Product <|-- Clothing
    Product <|-- Book
```

### 9. Transportation System with Pricing Rules
```mermaid
classDiagram
    class Transport {
        <<abstract>>
        #double distance
        +Transport(double distance)
        +calculateFare()* double
        +displayFare() void
    }
    class BusTransport {
        +BusTransport(double distance)
        +calculateFare() double
    }
    class MetroTransport {
        +MetroTransport(double distance)
        +calculateFare() double
    }
    class TaxiTransport {
        +TaxiTransport(double distance)
        +calculateFare() double
    }
    Transport <|-- BusTransport
    Transport <|-- MetroTransport
    Transport <|-- TaxiTransport
```

---

## Part 2: Challenges (1–10)

### Challenge 1: Overriding vs Overloading "Insurance Policies"
```mermaid
classDiagram
    class InsurancePolicy {
        +calculatePremium() double
    }
    class HealthInsurance {
        +calculatePremium() double
    }
    class CarInsurance {
        +calculatePremium() double
        +calculatePremium(int ageOfDriver) double
        +calculatePremium(int ageOfDriver, int accidentHistory) double
    }
    InsurancePolicy <|-- HealthInsurance
    InsurancePolicy <|-- CarInsurance
```

### Challenge 2: Using super() in Overriding "Online Store Discounts"
```mermaid
classDiagram
    class Discount {
        +apply(double amount) double
    }
    class SeasonalDiscount {
        +apply(double amount) double
        +applyWithoutSuper(double amount) double
    }
    Discount <|-- SeasonalDiscount
```

### Challenge 3: Abstract Classes + Interface Mix "Logistics Services"
```mermaid
classDiagram
    class Trackable {
        <<interface>>
        +track() void
    }
    class DeliveryService {
        <<abstract>>
        +calculateETA()* double
    }
    class CourierService {
        +track() void
        +calculateETA() double
    }
    class DroneDelivery {
        +track() void
        +calculateETA() double
    }
    class CargoTruck {
        +track() void
        +calculateETA() double
    }
    Trackable <|.. DeliveryService
    DeliveryService <|-- CourierService
    DeliveryService <|-- DroneDelivery
    DeliveryService <|-- CargoTruck
```

### Challenge 4: Inheriting Exceptions "Bank Transactions"
```mermaid
classDiagram
    class Exception
    class BankError {
        +BankError(String message)
    }
    class InsufficientFundsError {
        +InsufficientFundsError(String message)
    }
    class AccountNotFoundError {
        +AccountNotFoundError(String message)
    }
    class CurrencyMismatchError {
        +CurrencyMismatchError(String message)
    }
    Exception <|-- BankError
    BankError <|-- InsufficientFundsError
    BankError <|-- AccountNotFoundError
    BankError <|-- CurrencyMismatchError
```

### Challenge 5: Protected vs Private "Hospital Patient Records"
```mermaid
classDiagram
    class PatientRecord {
        -String ssn
        #String medicalHistory
        +PatientRecord(String ssn, String medicalHistory)
        +getMaskedSsn() String
    }
    class OutpatientRecord {
        -String appointmentDate
        +OutpatientRecord(String ssn, String medicalHistory, String appointmentDate)
        +showRecord() void
    }
    class InpatientRecord {
        -int roomNumber
        +InpatientRecord(String ssn, String medicalHistory, int roomNumber)
        +showRecord() void
    }
    PatientRecord <|-- OutpatientRecord
    PatientRecord <|-- InpatientRecord
```

### Challenge 6: Inheritance + Composition "Game Characters"
```mermaid
classDiagram
    class Character {
        <<abstract>>
        #String name
        +Character(String name)
        +attack()* void
    }
    class Warrior {
        -Weapon weapon
        +Warrior(String name, Weapon weapon)
        +attack() void
    }
    class Wizard {
        -Spell spell
        +Wizard(String name, Spell spell)
        +attack() void
    }
    class Weapon {
        -String name
        -int damage
        +Weapon(String name, int damage)
        +strike() void
    }
    class Spell {
        -String name
        -int manaCost
        +Spell(String name, int manaCost)
        +cast() void
    }
    Character <|-- Warrior
    Character <|-- Wizard
    Warrior *-- Weapon : contains
    Wizard *-- Spell : contains
```

### Challenge 7: Template Method Pattern "Document Generation"
```mermaid
classDiagram
    class Document {
        <<abstract>>
        +generate() void
        #writeHeader()* void
        #writeBody()* void
        #writeFooter()* void
    }
    class InvoiceDocument {
        #writeHeader() void
        #writeBody() void
        #writeFooter() void
    }
    class ResumeDocument {
        #writeHeader() void
        #writeBody() void
        #writeFooter() void
    }
    class ReportDocument {
        #writeHeader() void
        #writeBody() void
        #writeFooter() void
    }
    Document <|-- InvoiceDocument
    Document <|-- ResumeDocument
    Document <|-- ReportDocument
```

### Challenge 8: Polymorphic Data Storage "Rental System"
```mermaid
classDiagram
    class RentalItem {
        <<abstract>>
        #String itemName
        +RentalItem(String itemName)
        +calculateCost(int days)* double
        +getItemName() String
    }
    class CarRental {
        +CarRental(String itemName)
        +calculateCost(int days) double
    }
    class BikeRental {
        +BikeRental(String itemName)
        +calculateCost(int days) double
    }
    class ToolRental {
        +ToolRental(String itemName)
        +calculateCost(int days) double
    }
    class CameraRental {
        +CameraRental(String itemName)
        +calculateCost(int days) double
    }
    RentalItem <|-- CarRental
    RentalItem <|-- BikeRental
    RentalItem <|-- ToolRental
    RentalItem <|-- CameraRental
```

### Challenge 9: Multiple Levels + Overriding + Abstract "Academic Roles"
```mermaid
classDiagram
    class Person {
        #String name
        +Person(String name)
        +work() void
    }
    class Employee {
        +Employee(String name)
        +work() void
    }
    class Teacher {
        <<abstract>>
        +Teacher(String name)
        +getRole()* String
    }
    class MathTeacher {
        +MathTeacher(String name)
        +work() void
        +getRole() String
    }
    class ScienceTeacher {
        +ScienceTeacher(String name)
        +work() void
        +getRole() String
    }
    Person <|-- Employee
    Employee <|-- Teacher
    Teacher <|-- MathTeacher
    Teacher <|-- ScienceTeacher
```

### Challenge 10: Mixin Inheritance "E-Commerce Analytics"
```mermaid
classDiagram
    class TrackViewsMixin {
        <<interface>>
        +trackView(String productName) void
    }
    class DiscountMixin {
        <<interface>>
        +applyDiscount(double price, double percent) double
    }
    class Product {
        #String name
        #double price
        +Product(String name, double price)
    }
    class DigitalProduct {
        +DigitalProduct(String name, double price)
        +displayPromoOffer() void
    }
    Product <|-- DigitalProduct
    TrackViewsMixin <|.. DigitalProduct
    DiscountMixin <|.. DigitalProduct
```
