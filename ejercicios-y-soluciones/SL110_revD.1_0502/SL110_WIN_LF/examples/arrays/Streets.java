public class Streets
{
    int i;
    int [] streets = new int [112];
    public void nameStreets()
    {
        for (i = 0; i < streets.length; i++)
        streets [i] = i+1;
    }
    
    public void printInfo()
    {
        System.out.println ("First street number is " + streets[0]);
        System.out.println ("Last street number is " +
	    streets[streets.length-1]);
    }
}
