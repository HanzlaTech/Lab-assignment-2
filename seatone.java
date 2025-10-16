import java.util.Scanner;
public class seatone{
String typ;
double price;
String id;
boolean available;


public seatone(String id,boolean available,e type){
this.id=id;
this.available=available;
this.typ=type.name();
if(type.name()=="premium"){
this.price=5000;
}
if(type.name()=="vip"){
this.price=4000;
}
if(type.name()=="recliner"){
this.price=2500;
}

}

public void f(){
  if(this.available){
System.out.println("you book the seat");
this.available=false;
}
 else{
System.out.println("this seat is already book");
}
}


public void g(){
  if(this.available){
System.out.println("this seat is already free");
}
 else{
System.out.println("this seat is cancel");
this.available=true;
}
}

public String h(){
return this.typ;
}
public String getid(){
 return this.id;
}

public boolean avail(){
 return this.available;
}

public double getprice(){
return this.price;
}

public double setprice(){
  Scanner sc=new Scanner(System.in);
System.out.print("enter the new price for seat :");
this.price=sc.nextDouble();
return this.price;
}

public String settype(){
    e arr[]=e.values();
for(int i=0;i<arr.length;i++){
    System.out.println((i+1)+". "+ arr[i].name());
}
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of value that you want to assign to seat");
int num=sc.nextInt();
for(int i=0;i<arr.length;i++){
   if(num==1+i){
     this.typ=arr[i].name();
}
}
return typ;
}
 
public String toString(){
   return "ID :"+this.id+" TYPE :"+this.typ+" PRICE :"+this.price+" AVAILABILITY :"+this.available;
}

public int pr(seatone seats[][]){
int count=0;
           count+=this.price;
  return count;

}
public void dis(){
 System.out.println("ID :"+this.id+" TYPE :"+this.typ+" PRICE :"+this.price+" AVAILABILITY :"+this.available);
}
public void increase(int num){
if(num==1){
     if(this.typ=="premium"){
this.price=price+(10*this.price/100);
}
}
if(num==2){
     if(this.typ=="vip"){
this.price=price+(10*this.price/100);
}
}
if(num==3){
     if(this.typ=="recliner"){
this.price=price+(10*this.price/100);
}
}
if(num==4){
     if(this.typ=="regular"){
this.price=price+(10*this.price/100);
}
}

}
}