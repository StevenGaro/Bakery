# Bakery

A bakery needed help to view their income and expenses per week, they have a list with pastries and hot drinks which they offer, where the cost of ingredients and the selling price of each pastry and hot drinks are different.  You want to be able to enter the number of pastries and hot drinks sold per month.
The bakery also wants to see salary costs, including employer's fees and contractual insurance. There are fewer employees, of which one over 65 years. The employer's fee is 31.42% of gross salary (before tax), 16.36% for the elderly. Contract insurance is 5.11% of gross salary.
A report on income and expenses should be available.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.
Clone the project and run the main method in the OpenBakery class.


### Installing

A step by step series of examples that tell you have to get a development env running

Clone the project and run the main method in the OpenBakery class and it should look like this.

```
---------------------------
Welcome to Carlo's Bakery!
---------------------------
We offer following pastries:
Cake
CupCake
Bun
---------------------------
How many pastries have we sold this week? 
```


## Running the tests

To run the automated tests for this system you can either run the command mvn test or run each test class seperate. 

### Break down into end to end tests

These tests test each factory and the controller to make sure the logic in our program in correct. A example of this is that we test the correct price to customers and the correct ingredient price for our beverages.

## Deployment

To deploy this on a live system you would have to make this a jar file with maven jar plugin and possibly build a frontend to it since it is just a console interface program at the moment. 

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Authors

* **Alex Arvedahl** - *Lead Developer, Project Manager and UI Designer* 

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Inspiration
	My Inspiration for this project came from Tommy Sedin which had this brilliant idea to help a Bakery be able to view their expenses and their income. 
* Working Process
	I did start this project by making a class diagram and making it with no extra features at all from the beginning. I did the class diagram with a factory method since I was sure I wanted to isolate the constructing of the pastries and let the factory handle the logic to see what pastry it needed to create.
After I had written the tests first and finished the coding that I went back to my class diagram to add another feature, Ingredients and Recipes. Since I wanted interchangeable algorithms(in this case Recipes) I knew the Strategy pattern would be a great choice. After I was finished coding that, I had one week remaining of the project and knew I had to expand it even futher, I realized most stores that sell pastries is Coffee Shops, I understood adding coffee would be a challenging idea. I did visited Espresso House website and saw it existed a lot of variations of coffee. Instead of making one class for each variation I thought Decorator pattern would suit. After finishing coding that I did take a step back to consider my design choices for this project.
* Could the class hierarchy be in a different way?
	I have been thinking about this question quite a lot. However I can not think of any other suitable designs for this project in the way I want it.
* Is there methods that could have been in another type of class?
	The only logic in my model classes is in my factory which is necessary and personally I do not see any gain by moving my parts of my controller logic out to model classes. 
* Alternate solutions or variants to the Design Patterns I used?
	I thought about making a Abstract Factory for a while to Pastry Factory and Beverage Factory since Pastry and Beverage is products that are related to each other. And the technically work in the same way by randomizing a number and making the beverage/pastry out of that. The thing that made not do it that way was the claim "Program to a interface, not a implementation" And since each beverage can have a decorator, and it would not make any sense to have same decorators to pastries. I would have to check in the factories if it is a beverage or a pastry. 
* Things I would do differently
	The thing that bothers me the most is the way I designed my factories, since I used randomizer in 2 of 3 factories and I didn't made this randomizer interchangable which causes my tests to fail sometimes. I tried my very best by using TDD for this project however since my tests can't promise 100% success rate each time because I used randomizer, I would say I failed with TDD for this project and will do better next time.


