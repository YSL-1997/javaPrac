## do-while loop
Statements within the do block are always executed at least once.

## An example of switch-case control flow:
```
switch (month) {
  case 1: case 3: case 5:
  case 7: case 8: case 10:
  case 12:
    numDays = 31;
    break;
  case 4: case 6:
  case 9: case 11:
    numDays = 30;
    break;
  case 2:
    if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
      numDays = 29;
    else
      numDays = 28;
      break;
  default:
    System.out.println("Invalid month.");
    break;
}
```

## For-loop
### Infinite for-loop
```
for ( ; ; ) {  
  // your code goes here
}
```

### New for-loop
Note that numbers is an array of integers
```for (int item : numbers){...}```

## break

### unlabeled break
An **unlabeled break** statement terminates the **innermost** switch, for, while, or do-while statement. 

### labeled break
A **labeled break** terminates an outer statement.

See **BreakWithLabel.java** for more details.

## continue

### unlabeled continue
An **unlabeled continue** skips to the end of the innermost loop's body and evaluates the boolean expression that controls the loop.

### labeled continue
A **labeled continue** statement skips the current iteration of an outer loop marked with the given label.

See **ContinueWithLabel.java** for more details.

