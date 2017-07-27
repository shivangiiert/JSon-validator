1.The grammer I have used for the process of construction of this code is =>

	<JSON>     ::= <value>
	<value>    ::= <object> | <array> | <boolean> | <string> | <number> | <null>
	<array>    ::= "[" [<value>] {"," <value>}* "]"
	<object>   ::= "{" [<property>] {"," <property>}* "}"
	<property> ::= <string> ":" <value>
	

2. This is just a validator ,it does not point to the error of location nor does it parse.

3. With the help of recursive descent , as soon as "First Of" any rule occurs the control gets transferred to the method with the same name.All the things in angular brackets have been implemented as methods.
	
4. To check the validity of JSon, enter the code in the single line from console.
	 
 