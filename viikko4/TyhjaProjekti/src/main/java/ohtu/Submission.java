package ohtu;

import java.util.ArrayList;
import java.util.List;

public class Submission {
    private String student_number;
    private int hours;
    private int week;
    private boolean a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11;
    
    private List<Integer> list=new ArrayList<Integer>();
    private int maara;
  
    
    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }
    
    
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
     public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }
     public void countDone(){
        int maara=0;
        if(a1){maara++;list.add(1);} if(a2){maara++;list.add(2);} if(a3){maara++;list.add(3);} if(a4){maara++;list.add(4);} if(a5){maara++;list.add(5);}
        if(a6){maara++;list.add(6);} if(a7){maara++;list.add(7);} if(a8){maara++;list.add(8);} if(a9){maara++;list.add(9);} if(a10){maara++;list.add(10);}
        if(a11){maara++;list.add(11);}
        
        this.maara=maara;
}
 

    

    
    
 @Override
    public String toString() {
        
        String doneS="";
        for(Integer i:list){
            doneS+=i+" ";
        }
        return "viikko "+week+": "+"tehtyjä tehtäviä yhteensä: "+maara+", aikaa kului "+hours+" tuntia, tehdyt tehtävät: "+doneS;
}

    
}