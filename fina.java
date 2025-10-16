import java.util.Scanner;
public class fina{
public static void main(String arr[]){
demone dem=new demone();
while(true){
System.out.println("------------------~~~~~~~MENU~~~~~~---------------");
System.out.println("----------------SEATS FUNCTION--------------");
System.out.println("1.book seat");
System.out.println("2.cancel seat");
System.out.println("3.get seat type");
System.out.println("4.get id of seat");
System.out.println("5.check seat availability");
System.out.println("6.get price of seat");
System.out.println("7.set price of seat");
System.out.println("8.set type of seat");
System.out.println("9.get details of seat");
System.out.println("----------------SCREEN FUNCTION--------------");
System.out.println("10.check the row");
System.out.println("11.get screen name");
System.out.println("12.get seat");
System.out.println("13.get available seat count");
System.out.println("14.check row type ");
System.out.println("15.check bounds ");
System.out.println("16.total seat counts ");
System.out.println("17.show row length ");
System.out.println("18.display seat by seat details ");
System.out.println("19.show type list ");
System.out.println("20.count row in one screen");
System.out.println("21.first available seat ");
System.out.println("22.display layout of screen ");
System.out.println("23.display seat details on the basis of id ");
System.out.println("24.display seat details on the basis of row and col num ");
System.out.println("----------------CINEMA FUNCTION--------------");
System.out.println("25.find cinema by name ");
System.out.println("26.show complete cinema details ");
System.out.println("27.add screen in screen array ");
System.out.println("----------------CITY FUNCTION--------------");
System.out.println("28.show complete city details ");
System.out.println("29.show complete  details ");
System.out.println("30.give collective price of all booked seats in a screen ");
System.out.println("31.booked seat using random number ");
System.out.println("32.Exit the program");
System.out.println("33.increase price of any whole type of seat");

System.out.println("enter the num what you want to do");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num==1){
dem.a();
}
if(num==2){
  dem.b();
}
if(num==3){
System.out.println("the type of seat that you want is "+dem.c());
}
if(num==4){
System.out.println("the id of seat that you want is "+dem.getid());
}
if(num==5){

     if(dem.avail()){
 System.out.println("the seat that you want is available");
}
else{
System.out.println("the seat that you want is not available");
}
}
if(num==6){
          System.out.println("the price of seat that you want is "+dem.getprice());
}
if(num==7){
 System.out.println("the price of seat is changed to "+dem.setprice());
}
if(num==8){
 System.out.println("the type of seat is changed to "+dem.settype());
}
if(num==9){
 dem.to();
}
if(num==10){
   dem.row();
}
if(num==11){
   System.out.println("the name of wanted screen is "+dem.getname());
}
if(num==12){

dem.to();
}
if(num==13){
  System.out.println("the total seat available is "+dem.count());
}
if(num==14){
  System.out.println("the type of row is "+dem.rtype());
}
if(num==15){
System.out.println("the total bounds seats are "+dem.bound());
}
if(num==16){
System.out.println("the total seats are "+dem.tcount());
}
if(num==17){
  System.out.println("the total length of row is "+dem.len());
}
if(num==18){
       dem.verbose();
}
if(num==19){
dem.lis();
}
if(num==20){
System.out.println("the num of rows in screen is "+dem.rcount());
}
if(num==21){
dem.fir();
}
if(num==22){
dem.lay();
}
if(num==23){
dem.idis();
}
if(num==24){
 dem.rc(); 
}
if(num==25){
 dem.cname();
}
if(num==26){
dem.tc();
}
if(num==27){
dem.add();
}

if(num==28){
dem.cc();
}
if(num==29){
System.out.print(dem);
}
if(num==30){
dem.pr();
}
if(num==31){
dem.ran();
}
if(num==32){
System.out.println("You Exit the program"); 
break;
}
/*if(num==32){
      dem.uni();
}*/
if(num==33){
 dem.increase();
}
}

}
}