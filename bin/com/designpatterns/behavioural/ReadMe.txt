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


Mediator
Centralised point of communication for a group of objects
Example: Flight Control room
Things to remember:
1) Colleague
2) Chat Mediator --> Group Chat
One person sends the message --> mediator send it to everyone
and every one should be able to see the message


Iterator Pattern
To iterate through a collection without knowing what sort of collection it is - could be a
array, linkedlist, map, tree etc

Iterator interface --> hasnext and next method
Collection interface --> createIterator method

Concrete collection --> implements collection and load an array or a linkedlist or any collection - dummy dump
In the createIterator method --> create this collectioniterator and pass the collection

Concrete Iterator --> Override all the methods and take the collection in the constructor --> used in the 
createIterator method


Memento
Maintains the state - state in a finite state machine
undo --> notepad
rollback a txn in database
videogame progress --> save progress
playback --> restart again from where left off

Why memento? Record the internal state of the object
without violating the encapsulation

Implementation
Originator --> Basically keep updating the data here
But during save --> comes through caretaker and pass the originator object. Impl will be originator.save
Impl of originator.save --> create a memento object --> replica of the originator and send it. Caretaker will keep
it for reference

Keep making changes --> write method
Now for undo, call undo in caretaker and caretaker has the previous memento object. pass the
memento to the originator and now change the originator member variables (point to memento variables)


Main thing --> Whenever you save, you will create a another object(Memento) and have that ready in CareTaker class
Undo --> use the object to replace the originator