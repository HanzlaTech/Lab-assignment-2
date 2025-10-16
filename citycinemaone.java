import java.util.Scanner;
public class citycinemaone {
String name;
cinemaone cn[]=new cinemaone[3];
cinemaone c[]=new cinemaone[2];

public citycinemaone(String name){
this.name=name;
for(int i=0;i<cn.length;i++){
     cn[i]=new cinemaone("cinema "+(i+1));
}
for(int i=0;i<c.length;i++){
           c[i]=new cinemaone("cinema "+cn.length+1);
}

}


public void c(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the cinema num in which you book seat");
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
if(num==i+1){
    cn[i].d();
}
}
}


public void d(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the cinema num in which you cancel seat");
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
if(num==i+1){
    cn[i].e();
}
}
}
public String e(){
String type=" "; 
Scanner sc=new Scanner(System.in);
System.out.println("enter the cinema num in which you want to get seat type");
     int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
  if(num==i+1){
   type= cn[i].f();
}
}
return type;
}
public String getid(){
String id=" ";
  Scanner sc=new Scanner(System.in);
    System.out.println("enter the cinema num in which you want to get seat id");
   int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
   if(num==i+1){
       id=cn[i].getid();
}
}
return id;
}

public boolean avail(){
boolean avai=true; 
 Scanner sc=new Scanner(System.in);
    System.out.println("enter the cinema num in which you want to check seat availability");
   int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
   if(num==i+1){
      avai=cn[i].avail();
}
}
return avai;
}

public double getprice(){
double price=0.0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the cinema num in which you get price of seat");
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
  if(num==i+1){
    price=cn[i].getprice();
}
}
return price;
}
public double setprice(){
double price=0.0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the cinema num in which you set price of seat");
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
  if(num==i+1){
    price=cn[i].setprice();
}
}
return price;
}

public String settype(){
String type=" ";
System.out.println("enter the cinema num of which seat you want to set seat type");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
        if(num==i+1){
           type=cn[i].settype();
}
}
return type;
}

public void to(){

System.out.println("enter the cinema num of which seat you want to get seat details");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
        if(num==i+1){
           cn[i].to();
}
}
}

public void row (){
System.out.println("enter the cinema num in which you want to check that screen row is valid or not ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
        if(num==i+1){
           cn[i].row();
}
}
}

public String getname(){
String type=" ";
System.out.println("enter the cinema num of which seat you want to get screen name");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
        if(num==i+1){
           type=cn[i].getname();
}
}
return type;
}

public int count(){
int coun=0;
  System.out.println("enter the cinema num in which you want to count total available seats in one screen ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
        if(num==i+1){
          coun=cn[i].count();
}
}
return coun; 
}

public String rtype(){
String type=" ";
System.out.println("enter the cinema num in which we check row type");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
        if(num==i+1){
           type=cn[i].rtype();
}
}
return type;
}
public int bound(){
int coun=0;
  System.out.println("enter the cinema num in which you want to count total bounds seats in one screen ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
        if(num==i+1){
          coun=cn[i].bound();
}
}
return coun; 
}

public int tcount(){
int coun=0;
  System.out.println("enter the cinema num in which you want to count total seats in one screen ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
        if(num==i+1){
          coun=cn[i].tcount();
}
}
return coun; 
}

public int len(){
int coun=0;
  System.out.println("enter the cinema num in which you want to count length of one row in one screen ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
        if(num==i+1){
          coun=cn[i].len();
}
}
return coun; 
}
public void verbose (){
System.out.println("enter the cinema num in which you want to display seats details ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
        if(num==i+1){
           cn[i].verbose();
}
}
}
public void lis(){
    
System.out.println("enter the cinema num in which you want to display details of desired type seats ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
        if(num==i+1){
           cn[i].lis();
}
}
}
public int rcount(){
int coun=0;
  System.out.println("enter the cinema num in which you want to count row number in one screen ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
        if(num==i+1){
          coun=cn[i].rcount();
}
}
return coun; 
}

public void fir(){
Scanner sc=new Scanner(System.in);
 System.out.println("enter the cinema num in which you want to found first available seat ");
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
        if(num==i+1){
          cn[i].fir();
}
}
}
public void lay(){
   Scanner sc=new Scanner(System.in);
 System.out.println("enter the cinema num in which we display layout of screen ");
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
        if(num==i+1){
          cn[i].lay();
}
}
}
public void idis(){
  Scanner sc=new Scanner(System.in);
 System.out.println("enter the cinema num in which you want to see seat details on basis of id  ");
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
        if(num==i+1){
          cn[i].idis();
}
}
}

 public void rc(){
  Scanner sc=new Scanner(System.in);
 System.out.println("enter the cinema num in which you want to see seat details on basis of row and col  ");
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
        if(num==i+1){
          cn[i].rc();
}
}
}

public void cname(){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the cinema num in which you want to see cinema details  ");
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
      if(i==num-1){
          cn[i].cname(i);
}
}
}
public void tc(){
Scanner sc=new Scanner(System.in);
 System.out.println("enter the cinema name in which you want to see cinema details  ");
String name=sc.nextLine();
for(int i=0;i<cn.length;i++){
      if(name.equals(cn[i].name)){
          cn[i].tc();
}
}
}

public void cc(){
 for(int i=0;i<cn.length;i++){
       System.out.println("Cinema :"+(i+1));
     cn[i].tc();


}
}
public void add(){
Scanner sc=new Scanner(System.in);
 System.out.println("enter the cinema name in which screen is to be add  ");
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
      if(num==i+1){
          cn[i].add();
}
}
}
public String toString(){
  System.out.println("----------------"+this.name+"----------------");
   for(int i=0;i<cn.length;i++){
         System.out.println(cn[i]);
}
return "";
}
public void pr(){
Scanner sc=new Scanner(System.in);
 System.out.println("enter the cinema num in which you want to calculate price of all booked seats  ");
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
      if(num==i+1){
          cn[i].pr();
}
}
}

public void ran(){
Scanner sc=new Scanner(System.in);
 System.out.println("enter the cinema num in which you want to book seat randomly ");
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
      if(num==i+1){
          cn[i].ran();
}
}
}
/*public void uni(){
 cn=cn[i].uni(cn,c);


}*/
public void increase(){
Scanner sc=new Scanner(System.in);
 System.out.println("enter the cinema num in of whcih screen seats price you want to increase  ");
int num=sc.nextInt();
for(int i=0;i<cn.length;i++){
      if(i==num-1){
          cn[i].increase();
}
}
}

}