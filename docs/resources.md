The resource represents, what or who has been affected by the action. Is composed of **resourceType** and **resourceId**

**Resource type** is the class of resources. Example: person

The **resource id** represents the unity that has been affected by the action. Example: 123 Multiple values uses ; to separate. Example 123;456  

Code Example:

    Resource resource = new Resource("person","1234");
    Resource resource2 = new Resource("person", "1234","567");
    Resource resource3 = new Resource("person");
    resource3.setResourceIds("1234","567");
    resource2.setResourceId("12345");
    
Sometimes the ID in not applicable. For example, when the  resources represent the entire block of class. In that cases
the resource id should be the string *NOT_APPLICABLE*. The Resource class set this if no resourceId is added