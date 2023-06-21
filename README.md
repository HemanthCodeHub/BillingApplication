# Billing Application

This application is used to calculate the total bill and discounted amount based on
customer id and transaction made by the customers.

I have created 2 default customers with id=1 and id=2. We can easily extend this to
add restful endpoint to create customers dynamically.

I have also created one controller to POST transactions for a customer and another controller to
calculate and return billing and discount related information along with customer details.

This application exposes the following REST Endpoint :-
* POST /transactions - Add transaction for a customer.
* GET /transactions/customer/{customerId} - Get all transactions for a customer.
* GET /billing/{customerId} - Get full consolidated billing information with discount and customer information.

## Running Application
* We can run the application from any IDE after importing the application as maven project.
* There is no special instructions needed to run this application in Intellij/Eclipse, 
we can simply run the `main` method present in `BillingCalculatorApplication` class.
* Once the application is started, we can access the following endpoints :-
  * POST http://localhost:8080/transactions - Use Postman to post transaction data in the following format :-
  ````
    {
    "customerId": 1,
    "transactionAmount": 232
    }
  ````
  * GET http://localhost:8080/transactions/customer/{customerId} - Get all transactions for given customer id :-
  ````
  [
    {
        "id": 47164195,
        "customerId": 1,
        "transactionAmount": 23456.0
    },
    {
        "id": 17816418,
        "customerId": 1,
        "transactionAmount": 123.0
    }
  ]
  ````
  * GET http://localhost:8080/billing/{customerId} - You will get the response in the following format :-
  ````
  {
    "customer": {
        "id": 1,
        "name": "Tom",
        "customerType": "REGULAR"
    },
    "totalPurchaseAmount": 23579.0,
    "totalBillAfterDiscount": 20363.2,
    "totalDiscount": 3215.8
  }
  ````

## Assumptions
* I have assumed that we don't have to worry about the database as part of this assessment, otherwise the scope would have increased further.
* In interest of time, I have not put any validation to check the input (i.e. if customer type and/or amount is valid or not).
