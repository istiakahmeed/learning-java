# Primitive types vs Reference types

- Primitive types = Primitive types for storage simple values

## example

`byte x = 1;
    byte y = x;
    x = 2;
    System.out.println(y);
`

- Reference types = Reference types for storage Complex objects

## Example

`Point point1 = new Point(1, 1);
    Point point2 = point1;
    point1.x = 10;
    System.out.println(point2);`
