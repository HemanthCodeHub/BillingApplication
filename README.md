# Billing Calculator Application

This application is used to calculate the total bill and discount based on
total purchase amount and customer type
This application exposes the following REST Endpoint :-
* GET /billing - fetch the <code>Bill</code> object based on inputs

## Running Application
* We can run the application from any IDE after importing the application as maven project.
* There is no special instructions needed to run this application in Intellij/Eclipse, we can simply run the `main` method present in `BillingCalculatorApplication` class.
* Once the application is started, we can access the following endpoints :-
  * http://localhost:8080/billing?customerType=REGULAR&totalPurchaseAmount=8000
  * http://localhost:8080/billing?customerType=PREMIUM&totalPurchaseAmount=8000

## Assumptions
* I have assumed that we don't have to worry about the database as part of this assessment, otherwise the scope would have increased further.
* In interest of time, I have not put any validation to check the input (i.e. if customer type and/or amount is valid or not).