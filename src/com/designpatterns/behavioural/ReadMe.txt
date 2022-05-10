Chain Of Responsibility

If you want to have your requests go through many hoops 
ex:
validation
verification
authentication
authorization
cache 
data to be encrypted for safe

Example --> take it from office --> CRS

Handler Interface{
handleRequest();
nextHandlerChain(Handler);
}

You will have multiple handlers implementing this interface.
Handle Request can take object and based on the object, the request w
would be handled by multiple handlers
After the work is complete, the handler will call the next 
handler by calling handler.handleRequest(). So the next handler has to 
be set before we call the method.

Ex child class

ExampleHandler extends Handler{
Handler nextHandler;
void handleRequest(){
	//do something
	//this.nextHandler.handleRequest
}

nextHandlerChain(Handler handler){
this.nextHandler = handler;
}

}

Clients will set a list of handlers and it's subsequent chain







Command Pattern
All the things that's needed is set as an request object and called out
to execute.
If we want to queue the request
undo/redo operations.


Example: Person goes to hotel, sits near window, orders food, 
the waiter writes the order in a paper, goes to the chef and puts 
the paper in the queue. Chef picks it up, makes the food and then
the waiter picks the food up, brings to the customer
 
Important: requests are encapsulated as objects
Receiver
Command
Invoker