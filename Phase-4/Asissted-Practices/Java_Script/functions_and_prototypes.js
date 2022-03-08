// function constructor 
function Employee(name, designation, yearOfBirth){   
    this.name= name; 
    this.designation= designation; 
    this.yearOfBirth= yearOfBirth; 
} 

// creating calculateAge() method to the Prototype property 
Employee.prototype.calculateAge= function(){  
    console.log('The current age is: '+(2022- this.yearOfBirth)); 
} 
console.log(Employee.prototype); 
  

// creating Objects
let Emp1= new Employee('Pavan', 'Junior Tester', 1999);  
console.log(Emp1) ;
Emp1.calculateAge(); 

let Emp2= new Employee('Murugesh', 'Senior Software Developer', 1993); 
console.log(Emp2) 
Emp2.calculateAge();

let Emp3= new Employee('Harini', 'Junior HR', 1999); 
console.log(Emp3) 
Emp3.calculateAge();
