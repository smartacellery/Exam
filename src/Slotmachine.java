
public class Slotmachine {
    private Integer Payoutcycle;
    private Integer Payoutamount;
    private Integer Timetillnextpay;
    public Slotmachine(Integer poc,Integer pa,Integer ttnp){
     Payoutcycle=poc;
     Payoutamount=pa;
     Timetillnextpay=ttnp;  
}
    
    public Integer getPayoutcycle(){
    return Payoutcycle;
}
    public Integer getPayoutamount(){
    return Payoutamount;
}
    
    public Integer getTimetillnextpay(){
    return Timetillnextpay;
}
    public void setPayoutcycle(Integer p){
    Payoutcycle =p;
}
    public void setPayoutamount(Integer p){
    Payoutamount =p;
}
    public void setTimetillnextpay(Integer p){
    Timetillnextpay =p;
}
    public int playmachine(int n){
        int s=0;
    if(Timetillnextpay>0){
        
        n--;
        Timetillnextpay--;   
    }
    else{n=n+Payoutamount;
         Timetillnextpay=Payoutcycle;
    }
    s=n;
    return s;
        
    }

}
