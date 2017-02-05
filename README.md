# make-change
## To download and compile the program:
1. Download **MakeChange** from *GitHub*. This will download the .zip file
2. Unzip the file. This creates a folder **make-change-master**, inside of which there is **src/project/MakeChange.java**
3. In Terminal, navigate to **src** 
4. Compile the program:
```
$ javac project/MakeChange.java
```
## There are two ways to run the program:
- By passing the two parameters, *amount* and *tendered* to main:
```
$ java project/MakeChange 3.96 20.00
Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies
$
```
- By running the program without passing any parameters. In this case the user is prompted to enter the two values:
```
$ java project/MakeChange
Please enter the price of the item: 3.96
How much money was tendered by the customer? 20.00
Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies
$
```
