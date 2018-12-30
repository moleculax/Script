/*
* Copyright 2003 Sun Microsystems, Inc. ALL RIGHTS RESERVED 
* Use of this software is authorized pursuant to the terms 
* of the license found at 
* http://developer.java.sun.com/berkeley_license.html. 
*/

//Represents a record of a dive
package divelog;
import java.io.*;
import java.io.Serializable;



public class DiveRecord implements Serializable
  {
  
    //Instance variables
    private String date, type, cts;
    private int depth, start, end, used, time, count, vis;
    
    public DiveRecord ()
     {
       setDive();
     }
     
    public void setDive()
     {
       
       type = "";
       date = "00/00/00";
       depth = 000;
       start = 0000;
       end = 0000;
       used = 0000;
       time = 00;
       count = 000;
       vis = 00;
       cts = "";
     }
     
    public void setDive (String t, String d, int dth, int s, int e, int u, int bt, 
                                       int c, int v, String cts)
        {
          this.type = t;
          this.date = d;
          this.depth = dth;
          this.start = s;
          this.end = e;
          this.used = u;
          this.time = bt;
          this.count = c;
          this.vis = v;
          this.cts = cts;
                   }
    public String toString()
     {
       return type + date + depth + start + end + used + time + count + vis + cts;
       }
    public String getDte()
      {
        return date;
      }     
     
     public String getType ()
     {
       return type;
      }
      
    public int getDepth ()
      {
        return depth;
      }
       
    

      
    public int getStart ()
      {
        return start;
       }
       
    public int getEnd ()
      {
        return end;
       }
       
     public int getUsed ()
       {
         return used;
        }
        
     public int getTime()
       {
         return time;
       }
       
     public int getCount ()
       {
         return count;
        }
        
     public int getVis()
       {
          return vis;
        }
        
     public String getComments()
      {
         return cts;
       }
       

   }//closes class     
      
       