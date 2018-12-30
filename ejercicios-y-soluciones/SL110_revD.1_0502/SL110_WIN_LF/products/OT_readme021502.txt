ObjectTool Nov 30, 2001 - Supported Features
--------------------------------------------

- Variable declarations
  Supports single variable declaration and initialization:
  int x;
  double d = 2.0;    // declaration and initialization
  String s;
  java.awt Frame f;
 
  Does not support multiple variable declarations per line:
  int x, y, z;


---------------------------------------------------------------------------------    
 - Literals
  Suports:
  int x = 2;	      // intger literal
  long y1 = 2l;       // long literal
  long y2 = 2L;       // long literal
  float f1 = 2.0f;    // float literal
  float f2 = 2.0F;    // float literal
  double d1 = 2.0;    // double literal;
  double d2 = 2.0d;   // double literal;
  double d3 = 2.0D;   // double literal;
  String s = "hello"; // string literal

  Does not support:
  Hexadecimal representation of integer literals
  Octal representation of integer literals


---------------------------------------------------------------------------------    
 - Array declarations and operations:
  Supports:
  int a[];    // one dimensional array declaration
  int aa[][]; // two dimensional array declaration
  int ab[][];
  Account accts[]; // object array declaration

  a = new int[4];      // array creation
  aa = new int[5][6]; 
  ab = new int[5][];
  ab[0] = new int[4];
  accts = new Account[10];

  a[2] = 25;    // array operation
  aa[2][3] = 25;
  accts[2] = new Account("jo");

  Does not support:
  int[] yy;
  int[][] xx;


---------------------------------------------------------------------------------    
 - Operations on reference variables:
  Supports:
  String s = new String("Sun Microsystems");
  String s2 = s.toUpperCase();     // method invocation

  OTAccount a = new OTAccount("joseph");
  double money = a.amount;        // accessing attribute
  a.deposit(300.0);               // method invocation
  OTAccount.minBalance = 150.0;     // static attribute 
  OTAccount.setMinBalance(100.0);   // static method invocation

  Does not support:
  s.toUpperCase().substring(2,5);   // chained method invocations


---------------------------------------------------------------------------------    
 - Binary Operators:
  Supports:

  //on boolean
  boolean b1;
  boolean b2 = false;
  boolean b3 = true;
  b1 = b2 | b3;
  b1 = b2 & b3;
  b1 = b2 ^ b3;
  b1 = b2 && b3;
  b1 = b2 || b3;
  b1 = b2 == b3;
  b1 = b2 != b3;
  
  // on int primitive types
  int x;
  x = 2+4;  
  x = 2-4;
  x = 2*4;
  x = 2/4;
  x = 2%4;

  int x = 12;
  int y = 20;
  int z = x | y;
      z = x & y'
      z = x ^ y;
      z = x >> 2;
      z = x >>> 2;
      z = x << 2;

  boolean b;
  b = x == y;
  b = x != y;
  b = x <= y;
  b = x >= y;
  b = x < y;
  b = x > y;
  
  // Note support for long primitive types similar to int primitive type
  // Note support for char primitive types similar to int primitive type

  // on float primitive type 
  float c =2.0f;
  float d =4.9f;
  float a;
  boolean b;

  a = c + d;
  a = c - d;
  a = c * d;
  a = c / d;
  a = c % d;

  b = c == d;
  b = c != d;
  b = c <= d;
  b = c >= d;
  b = c < d;
  b = c > d;

 // Note support for double primitive types similar to float primitive type

---------------------------------------------------------------------------------    
 - Unary operators
  // supports

  // on boolean primitive types
  boolean c = true;
  boolean b = !c;

  // on int primitive types 
  int x = 24;
  int y;
  y = ~x;
  y = -x;
  y = +x;

  // Note support for long primitive types similar to int primitive type
  
  // on float primitive types 
  float a = 24.0f;
  float d;
  d = -a;
  d = +a;

 // Note support for double primitive types similar to float primitive type

---------------------------------------------------------------------------------    
- Operators not supported
  += -= *= /= %=
  ++  --
  instanceof
  ?:
  use of parenthesis to control precedence

- statements not supported
  if statement
  switch statement
  for loop
  while loop
  do while loop
  class statement
  
 


