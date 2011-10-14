Camel Router Project
====================

To run this router either embed the jar inside Spring
or to run the route from within maven try

    mvn camel:run

For more help see the Apache Camel documentation

    http://camel.apache.org/
    
    To test the project, run your Camel route and then hit the following URL on your web browser:
    
    http://localhost:8888/myBookService?bookid=91942
    
    The result should be a message being logged in Camel with the bookid and also a response to the 
    web browser client similar to:
    
    Book 91942 is Camel in Action