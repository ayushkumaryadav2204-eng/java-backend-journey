 ### 1. Java Rules to Remember                                                                                                                                                   
                                                                                                                                                                                  
  • Interfaces are Contracts:                                                                                                                                                     
      • Every method in an interface is automatically public abstract.                                                                                                            
      • When you implement an interface method in a class, you must explicitly declare it public (you cannot reduce visibility).                                                  
  • Class Structure:                                                                                                                                                              
      • Fields (private Engine engine;), constructors (public Car(...)), and methods (public void drive(), main()) belong directly to the class body.                             
      • Never define a constructor or a field inside a method like main().                                                                                                        
  • Encapsulation:                                                                                                                                                                
      • Make fields private so outside code cannot tamper with them.                                                                                                              
      • Expose behavior through methods (e.g., car.drive() instead of car.engine.start()).                                                                                        
                                                                                                                                                                                  
  ──────                                                                                                                                                                          
  ### 2. Architecture & Design Principles (The "Spring Mindset")                                                                                                                  
                                                                                                                                                                                  
  • Program to Interfaces, not Implementations:                                                                                                                                   
      • Always write:                                                                                                                                                             
        private Engine engine; // Dependent on the interface                                                                                                                      
                                                                                                                                                                                  
      • Avoid:                                                                                                                                                                    
        private ElectricEngine engine; // Tightly coupled to one specific engine                                                                                                  
                                                                                                                                                                                  
      • Why? By depending on the interface Engine, your Car can work with any engine (Electric, Petrol, Hybrid, Hydrogen) without changing a single line of Car code.             
  • Composition ("HAS-A"):                                                                                                                                                        
      • A Car HAS-A Engine.                                                                                                                                                       
      • The Car holds a reference to Engine as a field variable.                                                                                                                  
  • Inversion of Control (IoC):                                                                                                                                                   
      • Instead of Car using new PetrolEngine() inside its constructor, the responsibility of creating the engine is taken away from Car.                                         
      • Car says: "I don't care how you make the engine. Just give it to me when you create me."                                                                                  
  • Dependency Injection (DI):                                                                                                                                                    
      • The act of passing the required object into the class (here, via the constructor public Car(Engine engine)).                                                              
      • This is called Constructor Injection — and it is the #1 industry standard in modern Spring and Spring Boot.                                                               
                                                                                                                                                                                  
  ──────                                                                                                                                                                          
  ### 3. The Bridge to Spring Framework                                                                                                                                           
                                                                                                                                                                                  
   What we just did manually:                                                          │ What Spring will do for you:
  ─────────────────────────────────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────────────────────────────────────
   new ElectricEngine()                                                                │ Spring creates and manages the bean automatically.
   new Car(myEngine)                                                                   │ Spring automatically detects the constructor and injects the dependency (IoC Container).
   You had to manage all the new calls in main()                                       │ The Spring Container handles the entire application lifecycle.
