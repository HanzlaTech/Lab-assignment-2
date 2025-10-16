import java.util.Scanner;
import java.util.Random;
public class screenone{
double pre;
double recliner;
double vip;
double regular;
String name;
int rows;
int count=1;
seatone seats[][]=new seatone[3][5];


                     // screen constructer

public screenone(String name){
this.name=name;
                    //array bcm obj

for(int i=0;i<seats.length;i++){
  for(int j=0;j<seats[i].length;j++){
if(i==0){
         seats[i][j]=new seatone(""+count++,true,e.premium);
}
else if(i<seats.length-1){
         seats[i][j]=new seatone(""+count++,true,e.vip);
}
else if(i==seats.length-1){
    seats[i][j]=new seatone(""+count++,true,e.recliner);
     }
}
}
}
public void e(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the row num in which you book seat");
int row=sc.nextInt();
System.out.println("enter the col num in which you book seat");
int col=sc.nextInt();
for(int i=0;i<seats.length;i++){
  for(int j=0;j<seats[i].length;j++){
  
if(row==i+1 && col==j+1){
    seats[i][j].f();
}
}
}
}
public void f(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the row num in which you cancel seat");
int row=sc.nextInt();
System.out.println("enter the col num in which you cancel seat");
int col=sc.nextInt();
for(int i=0;i<seats.length;i++){
  for(int j=0;j<seats[i].length;j++){
  
if(row==i+1 && col==j+1){
    seats[i][j].g();
}
}
}
}




public String g(){
  String type=" "; 
 Scanner sc=new Scanner(System.in);
System.out.println("enter the row number of which you want to get seat type");
int row=sc.nextInt();
System.out.println("enter the col number of which you want to get seat type");
int col=sc.nextInt();
for(int i=0;i<seats.length;i++){
 for(int j=0;j<seats[i].length;j++){
    if(row==i+1 && col==j+1){
    type=seats[i][j].h(); 
}
}
}
return type;
}

public String getid(){
String id=" ";
  Scanner sc=new Scanner(System.in);
    System.out.println("enter the row num in which you want to get seat id");
   int row=sc.nextInt();
 System.out.println("enter the col num in which you want to get seat id");
   int col=sc.nextInt();

for(int i=0;i<seats.length;i++){
    for(int j=0;j<seats[i].length;j++){
  if (row==i+1 && col==j+1){
       id=seats[i][j].getid();
}
}
}
return id;
}

public boolean avail(){
boolean avai=true;;
  Scanner sc=new Scanner(System.in);
    System.out.println("enter the row num in which you want to check seat availability");
   int row=sc.nextInt();
 System.out.println("enter the col num in which you want to check seat availability");
   int col=sc.nextInt();

for(int i=0;i<seats.length;i++){
    for(int j=0;j<seats[i].length;j++){
  if (row==i+1 && col==j+1){
       avai=seats[i][j].avail();
}
}
}
return avai;
}

public double getprice(){
double price=0.0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the row num in which you get to price of seat");
int row=sc.nextInt();
System.out.println("enter the col num in which you to get price of seat");
int col=sc.nextInt();
for(int i=0;i<seats.length;i++){
  for(int j=0;j<seats[i].length;j++){
  
if(row==i+1 && col==j+1){
    price=seats[i][j].getprice();
}
}
}
return price;
}

public double setprice(){
double price=0.0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the row num in which you set to price of seat");
int row=sc.nextInt();
System.out.println("enter the col num in which you to set price of seat");
int col=sc.nextInt();
for(int i=0;i<seats.length;i++){
  for(int j=0;j<seats[i].length;j++){
  
if(row==i+1 && col==j+1){
    price=seats[i][j].setprice();
}
}
}
return price;
}

public String settype(){
String type=" ";
  Scanner sc=new Scanner(System.in);
    System.out.println("enter the row num in which you want to set seat type");
   int row=sc.nextInt();
 System.out.println("enter the col num in which you want to set seat type");
   int col=sc.nextInt();

for(int i=0;i<seats.length;i++){
    for(int j=0;j<seats[i].length;j++){
  if (row==i+1 && col==j+1){
       type=seats[i][j].settype();
}
}
}
return type;
}


public void to(){
 Scanner sc=new Scanner(System.in);
System.out.println("enter the row number of seat that you want to see details");
int row=sc.nextInt();
System.out.println("enter the col number of seat that you want to see details");
int col=sc.nextInt();
 for(int i=0;i<seats.length;i++){
   for(int j=0;j<seats[i].length;j++){
      if(row==i+1 && col==j+1){
            System.out.println(seats[i][j]);
}
}
}
}

public void row(screenone scr[]){
boolean flag=false;
Scanner sc=new Scanner(System.in);
System.out.println("enter the row to check wether it is correct or not");
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
 if(num==i+1){
  flag=true;
}
}
if(flag){
System.out.println("the row num  is valid ");
}
else{
System.out.println("the row num is not  valid ");

}
}




public String getname(){
   return this.name;
}

public int count(){
int coun=0;
for(int i=0;i<seats.length;i++){
 for(int j=0;j<seats[i].length;j++){
     if(seats[i][j].available==true){
        coun++;
}
}
}
return coun;
}

public String rtype(){
String type=" ";
  Scanner sc=new Scanner(System.in);
    System.out.println("enter the row num ");
   int row=sc.nextInt();

for(int i=0;i<seats.length;i++){
    for(int j=0;j<1;j++){
  if(row==i+1){
     if(seats[i][j].typ=="premium"){
         type="the row type is premium";
}
    if(seats[i][j].typ=="vip"){
         type="the row type is vip";
}
    if(seats[i][j].typ=="regular"){
         type="the row type is regular";
}
    if(seats[i][j].typ=="recliner"){
         type="the row type is recliner";
}
}
}
}
return type;
}
public int bound(){
int coun=0;
for(int i=0;i<seats.length;i++){
 for(int j=0;j<seats[i].length;j++){
     if(seats[i][j].available==false){
        coun++;
}
}
}
return coun;
}	

public int tcount(){
int coun=0;
for(int i=0;i<seats.length;i++){
 for(int j=0;j<seats[i].length;j++){
     
        coun++;

}
}
return coun;
}	



public int len(screenone arr[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the row num whose length is to find");
int num=sc.nextInt();
int coun=0;
for(int i=0;i<seats.length;i++){
 for(int j=0;j<seats[i].length;j++){
     if(num==i+1){
        coun++;

}
}
}
return coun;
}

public void verbose(){
System.out.println("the details of seats are following ");
          for(int i=0;i<seats.length;i++){
             for(int j=0;j<seats[i].length;j++){
                System.out.println("ID :"+seats[i][j].id+" TYPE :"+seats[i][j].typ+" Available :"+seats[i][j].available+" PRICE :"+seats[i][j].price);
}
} 
}

public void lis(){
e arr[]=e.values();
for(int i=0;i<arr.length;i++){
   System.out.println((i+1)+". "+arr[i].name());
}
 System.out.println("Enter the num of which type you want to display details ");
  Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
   for(int i=0;i<seats.length;i++){
       for(int j=0;j<seats[i].length;j++){
          if(arr[num-1].name()==seats[i][j].typ){
       System.out.println("ID :"+seats[i][j].id+" TYPE :"+seats[i][j].typ+" Available :"+seats[i][j].available+" PRICE :"+seats[i][j].price);
}
}
}     
}


public int rcount(){
int coun=0;
for(int i=0;i<this.seats.length;i++){
coun++;
      
}
return coun;
}

public void fir(){
int count=0;
int coun=0;
int cou=0;
      for(int i=0;i<seats.length;i++){
             for(int j=0;j<seats[i].length;j++){
                if(seats[i][j].available==true){
                      if(seats[i][j].typ.equals("premium")){

                               if(count==0){
System.out.println("ID :"+seats[i][j].id+" TYPE :"+seats[i][j].typ+" Available :"+seats[i][j].available+" PRICE :"+seats[i][j].price);
count++;
}
}
            if(seats[i][j].typ.equals("vip")){
                     if(coun==0){
             System.out.println("ID :"+seats[i][j].id+" TYPE :"+seats[i][j].typ+" Available :"+seats[i][j].available+" PRICE :"+seats[i][j].price); 
coun++;
}
    }
        if(seats[i][j].typ.equals("recliner")){
                   if(cou==0){
 System.out.println("ID :"+seats[i][j].id+" TYPE :"+seats[i][j].typ+" Available :"+seats[i][j].available+" PRICE :"+seats[i][j].price);
cou++;
}
}
}
}
}
}

public void lay(){
 for(int i=0;i<seats.length;i++){
 System.out.print("ROW :"+(i+1));
    for(int j=0;j<seats[i].length;j++){
        System.out.print("["+seats[i][j].available+"]");
        System.out.print(" ");
}
System.out.print("\n");
}
}

public void idis(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id of seat whose detail you want to see");
           int num=sc.nextInt();
for(int i=0;i<seats.length;i++){
    for(int j=0;j<seats[i].length;j++){
       if(Integer.parseInt(seats[i][j].id)==num){
            System.out.println("ID :"+seats[i][j].id+" TYPE :"+seats[i][j].typ+" Available :"+seats[i][j].available+" PRICE :"+seats[i][j].price);

}
}
}
}
public void rc(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the row num");
int row=sc.nextInt();
System.out.println("enter the col num");
int col=sc.nextInt();
 for(int i=0;i<seats.length;i++){
   for(int j=0;j<seats[i].length;j++){
       if(row==i+1 && col==j+1){
      System.out.println("ID :"+seats[i][j].id+" TYPE :"+seats[i][j].typ+" Available :"+seats[i][j].available+" PRICE :"+seats[i][j].price);

}
}
}
}
public int tot(screenone arr[]){
int coun=0;
for(int k=0;k<arr.length;k++){
for(int i=0;i<seats.length;i++){
 for(int j=0;j<seats[i].length;j++){
     
        coun++;

}
}
}
return coun;
}	
public int sc(screenone arr[]){
 int count=0;
for(int i=0;i<arr.length;i++){
 count++;
}
return count;
}

public int av(screenone scr[]){
int coun=0;
int sum=0;
for(int k=0;k<scr.length;k++){
for(int i=0;i<scr[i].seats.length;i++){
 for(int j=0;j<scr[i].seats[i].length;j++){
     if(scr[i].seats[i][j].available==true){
        coun++;
}
}
}
}
return coun;
}
public void details (){
 for(int i=0;i<seats.length;i++){
 for(int j=0;j<seats[i].length;j++){
System.out.println("ID :"+seats[i][j].id+" TYPE :"+seats[i][j].typ+" Available :"+seats[i][j].available+" PRICE :"+seats[i][j].price);
}
}
}
public String toString(){
  System.out.println(this.name+":");
for(int i=0;i<seats.length;i++){
  for(int j=0;j<seats[i].length;j++){
  System.out.println("ID :"+seats[i][j].id+" TYPE :"+seats[i][j].typ+" Available :"+seats[i][j].available+" PRICE :"+seats[i][j].price);
} 
}
return "";
}
public void pr(){
int count=0;
for(int i=0;i<seats.length;i++){
   for(int j=0;j<seats[i].length;j++){
        if(seats[i][j].available==false){
            count+=seats[i][j].pr(seats);
}
}
}
System.out.println("the price of all booked seats is "+count);
}

public void ran(){
Random ra=new Random();
int num=ra.nextInt(16);
for(int i=0;i<seats.length;i++){
    for(int j=0;j<seats[i].length;j++){
           if((""+num).equals(seats[i][j].id) && seats[i][j].available==true){
                     seats[i][j].available=false;
       System.out.println("you booked the seat");                
        seats[i][j].dis();
}
          else if((""+num).equals(seats[i][j].id) && seats[i][j].available==false){
                 System.out.println("this seat is already booked");
}
}
}
}
public void increase(){
System.out.println("enter the num of type of which you want to increase price");
System.out.println("1.premium");
System.out.println("2.vip");
System.out.println("3.recliner");
System.out.println("4.regular");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();

 for(int i=0;i<seats.length;i++){
    for(int j=0;j<seats[i].length;j++){
          seats[i][j].increase(num);
}
}
}

}