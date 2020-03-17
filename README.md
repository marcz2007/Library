# Library
An extendable library project allowing users to purchase books by adding them to their basket. The library management are able to add on discounts easily since there are two interfaces - one for individual book discounts and the other for basket discounts. Simply add a new class that implements the appropriate interface to create future discounts.

# Take-Home Test Evaluation
This project tested me on my ability to make a project which fulfils all the SOLIID principles:

1. Singularity principle - this was met by me splitting up the project into separate classes and singular-purposed methods.  
2. Open/Closed principle - achieved by making classes and methods which are easily maintainable and extendable e.g the discount interfaces and classes implementing them.
3. Listov Principle - achieved by the functions of the parent classes being usable by their child classes e.g discount interfaces
4. Interface Segregation - achieved by the specific interfaces used which are small, not broad.
5. Dependency Inversion - met through the interfaces providing all necessary methods for the classes which implement them. 

One problem with the code is that it uses the 'Double' data-type. Floats can be prone to rounding errors so a real world project should use 'BigDecimal' as a way of avoiding this. 