# OMD

* SOLID: 

**Single Responsibility principle** Each class only has one responsibility. 
As the name suggests, this principle states that each class should have one responsibility, one single purpose. This means that a class will do only one job, which leads us to conclude it should have only one reason to change. We don’t want objects that know too much and have unrelated behavior. These classes are harder to maintain. For example, if we have a class that we change a lot, and for different reasons, then this class should be broken down into more classes, each handling a single concern. Surely, if an error occurs, it will be easier to find.


**Open Closed Principle** As the name suggests, this principle states that software entities should be open for extension, but closed for modification. As a result, when the business requirements change then the entity can be extended, but not modified.

**Liskov Substitution principle** To understand the Liskov Substitution Principle, we must first understand the Open/Closed Principle (the “O” from SOLID). The goal of the Open/Closed principle encourages us to design our software so we add new features only by adding new code. When this is possible, we have loosely coupled, and thus easily maintainable applications.