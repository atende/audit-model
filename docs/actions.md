A action represents what happens in the event, it should be standardized

The action is a string in the formart: **concern_action_verb**

For example: **ldap_password_change** or **ldap_enable**

The underline should be used to separate the concerns. In the exemplo above *ldap_enable* separates the actual action **enable** for a more specific
action *ldap*. That means the user has enable in some ldap respository, not that the user has enabled in the application itself.

Other examples:

* database_insert - An insert in the database
* database_update - An update in the database
* database_delete - A delete in the database
* database_select - A select in the database
* database_insert_or_update - A insert or update operation in database
* user_login - The user has login
* user_logout - The user has logout
* user_enable - The user has been enabled
* ldap_create - The ldap object has been created
* ldap_read - The ldap object has been readed
* ldap_change_password - The ldap password of the object has been changed

The Package **brc.pucminas.icei.audition.actions** contains standard actions for every application.
Each standard action in this package is a Java Enum. When using the Enum you should pass the toString() method as
to the event. The to string method created the prefix format that you see above

Example: 
    
    Resource person = new Resource("person", "1234");
    AuditEvent event = new AuditEvent("application","fooUser", DatabaseAction.DELETE, person, LocalDateTime.now(), "10.10.4.3", SecurityLevel.NORMAL);