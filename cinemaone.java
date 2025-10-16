import java.util.Scanner;
public class cinemaone{

String name;
screenone scr[]=new screenone[3];




public cinemaone(String name){
this.name=name;
for(int i=0;i<scr.length;i++){
scr[i]=new screenone("screen " + (i+1));

}

}

public void d(){

Scanner sc=new Scanner(System.in);
System.out.println("enter the screen num in which you book seat");
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
if(num==i+1){
    scr[i].e();
}
}
}
public void e(){

Scanner sc=new Scanner(System.in);
System.out.println("enter the screen num in which you cancel seat");
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
if(num==i+1){
    scr[i].f();
}
}
}
public String f(){
String type=" "; 
Scanner sc=new Scanner(System.in);
 System.out.println("enter the screen num in which you want to get seat type");
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
 if(num==i+1){
   type=scr[i].g();
}
}
return type;
}
public String getid(){
String id=" ";
  Scanner sc=new Scanner(System.in);
    System.out.println("enter the screeen num in which you want to get seat id");
   int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
   if(num==i+1){
       id=scr[i].getid();
}
}
return id;
}

public boolean avail(){
boolean avai=true; 
 Scanner sc=new Scanner(System.in);
    System.out.println("enter the screen num in which you want to check seat availability");
   int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
   if(num==i+1){
       avai=scr[i].avail();
}
}
return avai;
}
public double getprice(){
double price=0.0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the screen num in which you get price of seat");
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
  if(num==i+1){
    price=scr[i].getprice();
}
}
return price;
}

public double setprice(){
double price=0.0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the screen num in which you set price of seat");
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
  if(num==i+1){
    price=scr[i].setprice();
}
}
return price;
}

public String settype(){
String type=" ";
System.out.println("enter the screen num of which seat you want to set seat type");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
        if(num==i+1){
           type=scr[i].settype();
}
}
return type;
}
public void to(){
System.out.println("enter the screen num of which seat you want to get seat details ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
        if(num==i+1){
          scr[i].to();
}
}
}

public void row(){
boolean flag=false;
System.out.println("enter the screen num in which you check wethere the row num of screen is valid or not ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
        if(num==i+1){
             scr[i].row(scr);
}
}
}  



public String getname(){
String type=" ";
System.out.println("enter the screen num of which seat you want to get screen name");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
        if(num==i+1){
           type=scr[i].getname();
}
}
return type;
}


public int count(){
int coun=0;
System.out.println("enter the screen num in which you count total available seats ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
        if(num==i+1){
           coun=scr[i].count();
}
}
return coun;

}
public String rtype(){
String type=" ";
System.out.println("enter the screen num in which we check row type");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
        if(num==i+1){
           type=scr[i].rtype();
}
}
return type;
}
public int bound(){
int coun=0;
System.out.println("enter the screen num in which you count total bounds seats ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
        if(num==i+1){
           coun=scr[i].bound();
}
}
return coun;

}

public int tcount(){
int coun=0;
System.out.println("enter the screen num in which you count total seats ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
        if(num==i+1){
           coun=scr[i].tcount();
}
}
return coun;

}
public int len(){
int coun=0;
System.out.println("enter the screen num in which you want to count length of row ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
        if(num==i+1){
           coun=scr[i].len(scr);
}
}
return coun;
}

public void verbose(){
System.out.println("enter the screen num in which you display seat details  ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
        if(num==i+1){
             scr[i].verbose();
}
}
}  

public void lis(){
System.out.println("enter the screen num in which you want to display details of desired seat types  ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
        if(num==i+1){
             scr[i].lis();
}
}
}
public int rcount(){
int coun=0;
System.out.println("enter the screen num in which you want to count row numbers in one screen  ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
        if(num==i+1){
           coun=scr[i].rcount();
}
}
return coun;
}

public void fir(){
 Scanner sc=new Scanner(System.in); 
 System.out.println("enter the screen num in which you find the first seat available");
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
       if(num==i+1){
       scr[i].fir();
}
}
}

public void lay(){
Scanner sc=new Scanner(System.in); 
 System.out.println("enter the screen num in which we display layout of screen");
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
       if(num==i+1){
       scr[i].lay();
}
}
}
public void idis(){
Scanner sc=new Scanner(System.in); 
 System.out.println("enter the screen num in which you want to see seat details on basis of id");
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
       if(num==i+1){
       scr[i].idis();
}
}
}
public void rc(){
 System.out.println("enter the screen num of which you want to see seat details");
 Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
 if(num==i+1){
  scr[i].rc();
}
}
}

public void cname(int i){
System.out.println("cinema "+(i+1)+" total screens :"+scr[0].sc(scr)+"total seats :"+scr[0].tot(scr)+" total available :"+scr[0].av(scr)); 
}
public void tc(){
 for(int i=0;i<scr.length;i++){
        System.out.println("Screen "+(i+1));
        scr[i].details();
}
}
public void add(){
 screenone sc[]=new screenone[scr.length+1];
 for(int i=0;i<scr.length;i++){
  sc[i]=scr[i];  
}
sc[sc.length-1]=new screenone("screen "+sc.length);
    scr=sc;
}

public String toString(){
  System.out.println(this.name+":");
   for(int i=0;i<scr.length;i++){
         System.out.println(scr[i]);
}
return "";
}
public void pr(){
System.out.println("enter the screen num of which price you want to see");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
   if(num==i+1){
     scr[i].pr();
}
}
}

public void ran(){
System.out.println("enter the screen num of which you book seat randomly");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
   if(num==i+1){
     scr[i].ran();
}
}
}
/*public void uni(cinemaone cn[],cinemaone c[]){
        cinemaone cnn[]=new cinemaone[cn.length+c.length];
          for(int i=0;i<cn.length;i++){
               cnn[i]=cn[i];
}
for(int i=0;i<c.length;i++){
    cnn[cn.length+i]=c[i];
}

return cnn;
}*/

public void increase(){
System.out.println("enter the screen num of which seats price you want to increase");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<scr.length;i++){
   if(num==i+1){
     scr[i].increase();
}
}
}

}