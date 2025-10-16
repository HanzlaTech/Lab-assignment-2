import java.util.Scanner;
public class demone{

citycinemaone cin[]=new citycinemaone[5];
public demone(){
for(int i=0;i<cin.length;i++){
    cin[i]=new citycinemaone("city " + (i+1));
}
}


public void a(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the city num in which you book seat");
int num=sc.nextInt();

for(int i=0;i<cin.length;i++){
  if(num==i+1){
    cin[i].c();
}
}
}
public void b(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the city num in which you cancel seat");
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
  if(num==i+1){
    cin[i].d();
}
}
}

public String c(){
String type=" ";
System.out.println("enter the city number in which you want to get seat type");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
  for(int i=0;i<cin.length;i++){
    if(num==i+1){
  type= cin[i].e();
}
}
return type;
}
public String getid(){
String id=" ";
System.out.println("enter the city num of which seat you want to get seat id");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
        if(num==i+1){
           id=cin[i].getid();
}
}
return id;
}

public boolean avail(){
boolean avai=true;
System.out.println("enter the city num of which seat you want to check availability");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
        if(num==i+1){
           avai=cin[i].avail();
}
}
return avai;
}

public double getprice(){
double price=0.0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the city num in which you get price of seat");
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
  if(num==i+1){
    price=cin[i].getprice();
}
}
return price;
}
public double setprice(){
double price=0.0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the city num in which you set price of seat");
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
  if(num==i+1){
    price=cin[i].setprice();
}
}
return price;
}
 
public String settype(){
String type=" ";
System.out.println("enter the city num of which seat you want to set seat type");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
        if(num==i+1){
           type=cin[i].settype();
}
}
return type;
}

public void to(){
System.out.println("enter the city num of which seat you want to get seat details");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
        if(num==i+1){
           cin[i].to();
}
}
}

public void row(){
 System.out.println("enter the city num in which you check screen row is valid or not ");
  Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
        if(num==i+1){
           cin[i].row();
}
}
}

public String getname(){
String type=" ";
System.out.println("enter the city num of which seat you want to get screen name");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
        if(num==i+1){
           type=cin[i].getname();
}
}
return type;
}


public int count(){
int coun=0;
System.out.println("enter the city num in which you want to count total available seat in one screen ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
        if(num==i+1){
           coun=cin[i].count();
}
}
return coun;
}
public String rtype(){
String type=" ";
System.out.println("enter the city num in which we check row type ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
        if(num==i+1){
           type=cin[i].rtype();
}
}
return type;
}
public int bound(){
int coun=0;
System.out.println("enter the city num in which you want to count total bounds seat in one screen ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
        if(num==i+1){
           coun=cin[i].bound();
}
}
return coun;
}

public int tcount(){
int coun=0;
System.out.println("enter the city num in which you want to count total seat in one screen ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
        if(num==i+1){
           coun=cin[i].tcount();
}
}
return coun;
}

public int len(){
int coun=0;
System.out.println("enter the city num in which you want to count total length of one row in one screen ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
        if(num==i+1){
           coun=cin[i].len();
}
}
return coun;
}

public void verbose(){
 System.out.println("enter the city num in which we want to display seat details  ");
  Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
        if(num==i+1){
           cin[i].verbose();
}
}
}

public void lis(){
System.out.println("enter the city num in which we want to display details of desired seat types  ");
  Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
        if(num==i+1){
cin[i].lis();
}
}
}

public int rcount(){
int coun=0;
     Scanner sc=new Scanner(System.in);
System.out.println("enter the city num in which we count row length in one screen");
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
  if(num==i+1){
    coun= cin[i].rcount();
}
}
return coun;
}

public void fir(){
    Scanner sc=new Scanner(System.in);
System.out.println("enter the city num in which we found first available seat");
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
  if(num==i+1){
    cin[i].fir();
}
}
}
public void lay(){
  Scanner sc=new Scanner(System.in);
System.out.println("enter the city num in which we display layout of screen");
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
  if(num==i+1){
    cin[i].lay();
}
}
}
  public void idis(){
  Scanner sc=new Scanner(System.in);
System.out.println("enter the city num in which you want to see details of seat by entering id");
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
  if(num==i+1){
    cin[i].idis();
}
}
}
public void rc(){
 Scanner sc=new Scanner(System.in);
System.out.println("enter the city num in which you want to see details of seat by entering row and col num");
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
  if(num==i+1){
    cin[i].rc();
}
}
}
public void cname(){
 System.out.println("enter the city num in which you find cinema details");
 Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
   if(num==i+1){
     cin[i].cname();
}
}
}
public void tc(){
System.out.println("enter the city num in which you find cinema");
 Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
   if(num==i+1){
     cin[i].tc();
}
}
}

public void cc(){
System.out.println("enter the city num of which you want to find city details");
 Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
   if(num==i+1){
     cin[i].cc();
}
}
}
public void add(){
System.out.println("enter the city num in which screen is to be made");
 Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
   if(num==i+1){
     cin[i].add();
}
}
}
public String toString(){
 for(int i=0;i<cin.length;i++){
         System.out.println(cin[i]); 
}
return "";
}

public void pr(){
System.out.println("enter the city num in which you have to calculate price of all booked seats");
 Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
   if(num==i+1){
     cin[i].pr();
}
}
}
public void ran(){
  System.out.println("enter the city num in which you have to book seat randomly");
 Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
   if(num==i+1){
     cin[i].ran();
}
}
}
/* public void uni(){
  System.out.println("enter the city num in which you make union of cinema");
 Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
   if(num==i+1){
     cin[i].uni();
}
}
} */

public void increase(){
System.out.println("enter the city num in which seats price you want to increse");
 Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<cin.length;i++){
   if(num==i+1){
     cin[i].increase();
}
}
}

}