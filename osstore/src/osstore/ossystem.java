package osstore;
import java.util.*;

//100% abstraction
interface ossystem
{
   void login(); //method overriding
}

class Electronicdevice implements ossystem
{
private String ProductName;
private String ProductColour;
private String ProductStorage;
private String ProductModelnumber;
private String ProductOperatingsystem;
private String ProductOSarchitecture;
private String ProductRam;
private String ProductDisplay;
private String ProductBattery;
private String ProductFeatures;
private double ProductPrice;

Scanner sc=new Scanner(System.in);

	
    public void assign(String ProductName, String ProductColour, String ProductStorage,String ProductModelnumber,String ProductOperatingsystem,String ProductOSarchitecture,String ProductRam,String ProductDisplay,String  ProductBattery,String ProductFeatures,double ProductPrice)
{
this.ProductName=ProductName;
this.ProductColour=ProductColour;
this.ProductStorage=ProductStorage;
this.ProductModelnumber=ProductModelnumber;
this.ProductOperatingsystem=ProductOperatingsystem;
this.ProductOSarchitecture=ProductOSarchitecture;
this.ProductRam=ProductRam;
this.ProductDisplay=ProductDisplay;
this.ProductBattery=ProductBattery;
this.ProductFeatures=ProductFeatures;
this.ProductPrice=ProductPrice;

}
 

public void display()
{
System.out.println("ProductName         					:"+ProductName);
System.out.println("ProductColour       					:"+ProductColour);
System.out.println("ProductStorage      					:"+ProductStorage);
System.out.println("ProductModelnumber      				:"+ProductModelnumber);
System.out.println("ProductOperatingsyatem      			:"+ProductOperatingsystem);
System.out.println("ProductOSarchitecture     	 			:"+ProductOSarchitecture);
System.out.println("ProductRam          					:"+ProductRam);
System.out.println("ProductDisplay         					:"+ProductDisplay);
System.out.println("ProductBattery      					:"+ProductBattery);
System.out.println("ProductFeatures    						:"+ProductFeatures);
System.out.println("ProductPrice        					:"+ProductPrice);
buy();
}

public void buy() {
System.out.println("Do you want to buy this product:   ");
System.out.println("press 1 for Buy :");
System.out.println("press 2 for Exit :");
int option=sc.nextInt();
if(option==1)
{
System.out.println("Thank You For Buying");
payment();
}
if(option==2)
{
System.out.println("Thank You For Visiting");

         }

}


public void login()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter UserName :  ");
String name = sc.nextLine();

System.out.println("Create Password : ");
String pass1 = sc.nextLine();

System.out.println("Re-Enter Password : ");
String pass2 = sc.nextLine();
if(pass1.length()>0)
{
if(pass1.equals(pass2))
{
System.out.println("---------------------------------------");
System.out.println();
System.out.println("***********LOGIN SUCCESSFULL***********");
System.out.println();
System.out.println("---------------------------------------");
System.out.println();
System.out.println("=======================================");
System.out.println();
System.out.println("**************LOGIN DETAILS************");
System.out.println();
System.out.println("=======================================");

System.out.println(" NAME :  "+name);
System.out.println(" PASSWORD :  "+pass2);

System.out.println("=======================================");

}
else
{
System.out.println("XXXXXXXX  Enter correct password   XXXXXXXXXX");
login();
}
}
else {
System.out.println("XXXXXXXXX   PASSWORD CAN NOT BE EMPTY   XXXXXXXXXXXX");
System.out.println("====================================================");
System.out.println("            RE-ENTER LOGIN DETAILS                  ");
System.out.println("====================================================");  
login();
}
}

public void payment() {
System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
System.out.println();
System.out.println("                                                       SELECT PAYMENT METHOD                                                        ");
System.out.println("1.ONLINE(GPay / PhonePay / PayTM)");
System.out.println("2.Credit Card");
System.out.println("3.CASH PAYMENT");
System.out.println();
System.out.println("------------------------------------------------------------------------------------------------------------------------------------");

int a = sc.nextInt();
switch(a) {

case 1 : System.out.println("ENTER YOUR UPI NUMBER :");
        long no= sc. nextLong();
        System.out.println("ENTER YOUR UPI PIN :");
        long no1= sc. nextLong();
        System.out.println("*TRANSACTION SUCCESSFULL*");
        System.out.println("!!THANK YOU FOR BOOKING!!");  
        break;
case 2 : System.out.println("ENTER NAME PRESENT ON CREDIT CARD:");
                 String name= sc.next();
    System.out.println("ENTER CREDIT CARD NUMBER :");
                 long no3= sc. nextLong();
                 System.out.println("ENTER 3 DIGIT CVV :");
                 int no4= sc. nextInt();
                 System.out.println("ENTER 6 DIGIT pin:");
                 int no5= sc. nextInt();
                 System.out.println("*TRANSACTION SUCCESSFULL*");
                 System.out.println("!!THANK YOU FOR BOOKING!!");  
      break;
case 3 : System.out.println("!!THANK YOU FOR BOOKING!!");
     break;
   default :System.out.println("CHOOSE CORRECT PAYMENT METHOD");

}
}





public int And()
{
      System.out.println();
System.out.println("################################");
System.out.println(" Which TYPE DO YOU WANT ");
System.out.println("################################");
System.out.println();
System.out.println("1.Windows");
System.out.println("2.Macos");
System.out.println("3.Android");
System.out.println("4.iOS");
System.out.println("********************************");

Scanner sc=new Scanner(System.in);
System.out.println("Please Enter Appliances Slno: ");
int a=sc.nextInt();
return a;
}
}
class Electric extends  Electronicdevice
{
private String ProductName;
private String ProductColour;
private String ProductStorage;
private String Productfcamera;
private String Productbcamera;
private String ProductRam;
private String ProductDisplay;
private String ProductBattery;
private String ProductFeatures;
private double ProductPrice;

Scanner sc=new Scanner(System.in);
//Method Overriding
    public void assign(String ProductName, String ProductColour, String ProductStorage,String Productfcamera,String Productbcamera,String ProductRam,String ProductDisplay,String  ProductBattery,String ProductFeatures,double ProductPrice)
{
this.ProductName=ProductName;
this.ProductColour=ProductColour;
this.ProductStorage=ProductStorage;
this.Productfcamera=Productfcamera;
this.Productbcamera=Productbcamera;
this.ProductRam=ProductRam;
this.ProductDisplay=ProductDisplay;
this.ProductBattery=ProductBattery;
this.ProductFeatures=ProductFeatures;
this.ProductPrice=ProductPrice;

}
 

public void display()
{
System.out.println("ProductName         					:"+ProductName);
System.out.println("ProductColour       					:"+ProductColour);
System.out.println("ProductStorage      					:"+ProductStorage);
System.out.println("Productfcamera      				:"+Productfcamera);
System.out.println("Productbcamera     	 			:"+Productbcamera);
System.out.println("ProductRam          					:"+ProductRam);
System.out.println("ProductDisplay         					:"+ProductDisplay);
System.out.println("ProductBattery      					:"+ProductBattery);
System.out.println("ProductFeatures    						:"+ProductFeatures);
System.out.println("ProductPrice        					:"+ProductPrice);
buy();
}
}
// sub class Extends Super class
class Windows extends Electronicdevice
{

    public int lap()
{
System.out.println();
System.out.println("################################");
System.out.println("AVAILABLE WINDOWS LAPTOPS ");
System.out.println("################################");
System.out.println();
System.out.println("1.hp");
System.out.println("2.Asus");
System.out.println("3.Dell");
System.out.println("4.acer");
System.out.println("5.lenovo");
System.out.println("6.go back");
System.out.println("********************************");
System.out.println("Please Enter Appliance Slno: ");
Scanner sc1=new Scanner(System.in);
          int b=sc1.nextInt();
switch(b)
{
 case 1: Windows ref1 = new hp();  // upcasting
      hp Windows=(hp)ref1;    // downcasting
      Windows.Hp();
      break;
  case 2: Windows ref2 = new Asus();  //upcasting
      Asus Windows1=(Asus)ref2;       //downcasting
      Windows1.ASus();
           break;
  case 3: Windows ref3 = new Dell();  //upcasting
      Dell Windows2=(Dell)ref3;          //downcasting
      Windows2.DEll();
          break;
  case 4: Windows ref4 = new acer();  //upcasting
      acer Windows3=(acer)ref4;         //downcasting
      Windows3.Acer();
      break;
  case 5: Windows ref5 = new lenovo();   //upcasting
      lenovo Windows4=(lenovo)ref5;           //downcasting
      Windows4.Lenovo();
          break;
  case 6: And();        
      default:System.out.println("UNKNOWN......PLEASE ENTER CORRECT SLNO !!!!!!!!!!!!");
 }
    return b;
   
    }
}


class hp extends Windows
{
public void Hp()
{
System.out.println();
   System.out.println("#################################");
System.out.println("available hp laptops");
System.out.println("##################################");
System.out.println();
System.out.println("1.HP 15s ");
System.out.println("2.HP Pavillon");
System.out.println("3.HP Probook");
System.out.println("4.HP envy");
System.out.println("5.Go Back");
System.out.println("Please Enter device Slno: ");
int a=sc.nextInt();
switch(a)
{
case 1:HP_15s ref1= new HP_15s();  //object creation
    ref1.display();
    break;
case 2:HP_Pavillon ref2= new HP_Pavillon(); //object creation
            ref2.display();
            break;
case 3:HP_Probook ref3= new HP_Probook(); //object creation
                 ref3.display();
                 break;
case 4:HP_envy ref4= new HP_envy(); //object creation
                 ref4.display();
                 break;
case 5: lap();
break;

}
}
}


class HP_15s 
{
public void display() {
Electronicdevice  ref1=new Electronicdevice();
ref1.assign("HP 15s intel core i3 12th Gen","Natural silver","512 GB","15s-fq5007TU","Windows 11 home","64 bit","8 GB","15.6inche","42 wh","mic,1 x HDMI 1.4b",45990);
ref1.display();

}
}

class HP_Pavillon
{
public void display() {
Electronicdevice  ref2=new Electronicdevice();
ref2.assign("HP pavillon Ryzen 5 hexa core","shadow","512 GB","15-ec2004AX","Windows 10","64 bit","8 GB","15.6 Inche","42 wh","mic,bluetooth v5.0",54890);
ref2.display();
}
}

class HP_Probook
{
public void display() {
Electronicdevice  ref3=new Electronicdevice();
ref3.assign("HP 430 G8 core","pike silver","512 GB","Probook 430 G8","Windows 10 pro","64 bit","8 GB","13.3 Inche","42 wh","bluetooth 5 combo,non-vpro",66660);
ref3.display();
}
}

class HP_envy
{
public void display() {
Electronicdevice  ref1=new Electronicdevice();
ref1.assign("HP Envy core i5","Natural silver","512 GB","13-ba0011tx","Windows 10 home","64 bit","8 GB","13.3 Inche","42 wh","Touchscreen,bluetooth v5.0",81990);
ref1.display();
}
}




class Asus extends Windows
{
public void ASus()
{   System.out.println();
   System.out.println("#########################");
System.out.println("available Asus laptops");
System.out.println("#########################");
System.out.println();
System.out.println("Please Enter device Slno: ");
System.out.println("1.Asus vivobook 13");
System.out.println("2.Asus vivobook 14");
System.out.println("3.Asus vivobook 15");
System.out.println("4.Asus vivobook S14");
System.out.println("5.Go Back");
int b=sc.nextInt();
switch(b)
{
case 1:Asus_vivobook13 ref1= new Asus_vivobook13(); //object creation
    ref1.display();
    break;
case 2:Asus_vivobook14 ref2= new Asus_vivobook14(); //object creation
            ref2.display();
            break;
case 3:Asus_vivobook15 ref3= new Asus_vivobook15(); //object creation
                 ref3.display();
                 break;
case 4:Asus_vivobookS14 ref4= new Asus_vivobookS14(); //object creation
                 ref4.display();
                 break;
case 5:lap();
            break;
}
}
}


class Asus_vivobook13
{
public void display() {
Electronicdevice  ref1=new Electronicdevice();
ref1.assign("asus vivobook 13 slate OLED pentium quad core","Black","256 GB","T3300KA-LQ111WS","Windows 11 home","64 bit","8 GB","13.3 Inche","42 wh","touchscreen, bluetooth v5.2",39990);
ref1.display();
}
}

class Asus_vivobook14
{
public void display() {
Electronicdevice  ref1=new Electronicdevice();
ref1.assign("asus vivobook14 core 15","transparent silver","512 GB","X415JA-EB531WS","Windows 11 home","64 bit","8 GB","14.0 Inche","50 wh","bluetooth v4.2",49490);
ref1.display();
}
}

class Asus_vivobook15
{
public void display() {
Electronicdevice  ref1=new Electronicdevice();
ref1.assign("Asus vivobook 15 core i5","indie black","512 GB","X1500EA-Ej522WS","Windows 11 home","64 bit","8 GB","15.6 Inche","45 wh","wed camera=vga camera",50990);
ref1.display();
}
}

class Asus_vivobookS14
{
public void display() {
Electronicdevice  ref1=new Electronicdevice();
ref1.assign("ASUS vivobook S14 OLED(2022) intel evo core","indie black","512 GB","S3402ZA-KM502WS","Windows 11 home","64 bit","8 GB","14.0 Inche","45 wh","blutooth v5.2",74990);
ref1.display();
}
}

class Dell extends Windows
{
public void DEll()
{
System.out.println();
   System.out.println("###############################");
System.out.println("available Dell laptops ");
System.out.println("###############################");
System.out.println();
System.out.println("Please Enter device Slno: ");
System.out.println("1.Dell Vostro");
System.out.println("2.Dell inspiron 14");
System.out.println("3.Dell insprion 15");
System.out.println("4.Dell insprion 24");
System.out.println("5.Go Back");
int c=sc.nextInt();
switch(c)
{
case 1:Dell_Vostro ref1= new Dell_Vostro(); //object creation
    ref1.display();
    break;
case 2:Dell_insprion14 ref2= new Dell_insprion14(); //object creation
            ref2.display();
            break;
case 3:Dell_insprion15 ref3= new Dell_insprion15(); //object creation
                ref3.display();
                break;
case 4:Dell_insprion24 ref4= new Dell_insprion24(); //object creation
                ref4.display();
                break;
case 5:lap();
                     break;        

}

}
}

class Dell_Vostro
{
public void display() {
Electronicdevice  ref1=new Electronicdevice();
ref1.assign("DELL Vostro core 15","Dune","512 GB","Vostro 3400","Windows 10","64 bit","8 GB","14.0 Inche","45 wh","bluetooth v4.1",55690);
ref1.display();
}
}

class Dell_insprion14
{
public void display() {
Electronicdevice  ref1=new Electronicdevice();
ref1.assign("DEll Inspiron 14 5000 series core","silver","512 GB","5482AB2","windows 10 h0me","64 bit","8 GB","14.0 inche","45 wh","bluetooth v4.1",53399);
ref1.display();
}
}

class Dell_insprion15  
{
public void display() {
Electronicdevice  ref1=new Electronicdevice();
ref1.assign("DELL Inspiron core 13","silver","1 TB","D560841WIN9S","windows 11 home","64 bit","8 GB","15.6 Inche","50 wh","bluetooth",41990);
ref1.display();
}
}

class Dell_insprion24
{
public void display() {
Electronicdevice  ref1=new Electronicdevice();
ref1.assign("DELL inspiron core ","Platinum silver","512 GB","Inspiron 5518","Windows 11 home","64 bit","8 GB","15.6 Inche","50 wh","Finger print Sensor",71990);
ref1.display();
}
}

class acer extends Windows
{
public void Acer()
{
   System.out.println();
   System.out.println("########################################");
System.out.println("available acer laptops");
System.out.println("########################################");
System.out.println();
System.out.println("Please Enter device Slno: ");
System.out.println("1.acer nitro");
System.out.println("2.acer Extensa");
System.out.println("3.acer Aspire");
System.out.println("4.acer Aspire 3");
System.out.println("5.Go Back");
int d=sc.nextInt();
switch(d)
{
case 1:acer_nitro ref1= new acer_nitro(); //object creation
    ref1.display();
    break;
case 2:acer_EXtensa ref2= new acer_EXtensa(); //object creation
            ref2.display();
            break;
case 3:acer_Aspire ref3= new acer_Aspire(); //object creation
                ref3.display();
                break;
case 4:acer_Aspire3 ref4= new acer_Aspire3(); //object creation
                ref4.display();
                break;
case 5:lap();
                     break;
}
}
}

class acer_nitro 
{
public void display() {
Electronicdevice  ref1=new Electronicdevice();
ref1.assign("acer Nitro 5 ryzen 5 hexa core","obsidian black","1 TB","AN515-44","Windows 10 home","64 bit","8 GB","15.6 Inche","50 wh","bluetooth v5.0",61490);
ref1.display();
}
}

class acer_EXtensa
{
 public void display() {
   Electronicdevice  ref1=new Electronicdevice();
ref1.assign("acer Extensa 15 core","charcoal Black","256 GB","EX215-54","Windows 11 home","64 bit","8 GB","15.6 Inche","45 wh","bluetooth v5.0",32990);
ref1.display();
}
}

class acer_Aspire
{
public void display() {
Electronicdevice  ref1=new Electronicdevice();
ref1.assign("acer aspire 7 core i5","charcoal blsck","512 GB","A715-51G","Windows 11 home","64 bit","18 GB","15.6 Inche","42 wh","bluetooth v5.2",69990);
ref1.display();
}
}

class acer_Aspire3
{
public void display() {
Electronicdevice  ref1=new Electronicdevice();
ref1.assign("acer aspire 3 core","pure silver","256 GB","A315-58","Windows 11 home","64 bit","4 GB","15.6 Inche","42 wh","bluetooth v5.0",35999);
ref1.display();
}
}


class lenovo extends Windows
{
public void Lenovo()
{           System.out.println();
   System.out.println("######################################");
System.out.println("available lenovo laptops");
System.out.println("#####################################");
System.out.println();
System.out.println("Please Enter device Slno: ");
System.out.println("1.lenovo ideapad 1");
System.out.println("2.lenovo ideapad 2");
System.out.println("3.lenovo ideapad 3");
System.out.println("4.lenovo ideapad 4");
System.out.println("5.Go Back");
int e=sc.nextInt();
switch(e)
{
case 1:lenovo_ideapad1 ref1=new lenovo_ideapad1(); //object creation
    ref1.display();
    break;
case 2:lenovo_ideapad2 ref2= new lenovo_ideapad2(); //object creation
            ref2.display();
            break;
case 3:lenovo_ideapad3 ref3= new lenovo_ideapad3(); //object creation
                ref3.display();
                break;
case 4:lenovo_ideapad4 ref4= new lenovo_ideapad4(); //object creation
                ref4.display();
                break;
case 5:lap();
                    break;
}
       
}
}


class lenovo_ideapad1 
{
public void display() {
Electronicdevice  ref1=new Electronicdevice();
ref1.assign("lenovo ideapad 1 ryzen 5 quad core","cloud grey","512 GB","15ADA7","Windows 11 home","64 bit","8 GB","15.6 Inche","50 wh","bluetooth v5.0",42990);
ref1.display();
}
}

class lenovo_ideapad2 
{
        public void display() {
   Electronicdevice  ref1=new Electronicdevice();
ref1.assign("lenovo ideapad 2 ryzen 5 quad core","cloud grey","512 GB","15ADA7","Windows 11 home","64 bit","8 GB","15.6 Inche","50 wh","bluetooth v5.0",42990);
ref1.display();
}
}

class lenovo_ideapad3 
{
public void display() {
Electronicdevice  ref1=new Electronicdevice();
ref1.assign("lenovo ideapad 3 ryzen 5 hexa core","artic grey","512 GB","15AlC6","Windows 11 home","64 bit","8 GB","15.6 Inche","60 wh","bluetooth v5.0",46200);
ref1.display();
}
}

class lenovo_ideapad4 
{
public void display() {
Electronicdevice  ref1=new Electronicdevice();
ref1.assign("lenovo ideapad 1 ryzen 5 quad core","cloud grey","512 GB","15ADA7","Windows 11 home","64 bit","8 GB","15.6 Inche","50 wh","bluetooth v5.0",42990);
ref1.display();
}
}


class Macos extends Electronicdevice
{
public int app()
{
System.out.println();
System.out.println("################################");
System.out.println("AVAILABLE MACOS LAPTOPS ");
System.out.println("################################");
System.out.println();
System.out.println("1.Apple");
System.out.println("2.go back");

            System.out.println("--------------------------------");
Scanner sc2=new Scanner(System.in);
System.out.println("Please Enter Appliance Slno: ");
int d=sc2.nextInt();
switch(d)
{
 case 1: Macos ref1 = new Apple(); //Upcasting
      Apple Macos=(Apple)ref1;   //Downcasting
      	Macos.APple();
      break;
 case 2: And();     
 
 
      default:System.out.println("UNKNOWN......PLEASE ENTER CORRECT SLNO !!!!!!!!!!!!");
 }
    return d;
   }
}

class Apple extends Macos
{
public void APple()
{  
System.out.println();
System.out.println("#########################################");
System.out.println("available Apple devices");
System.out.println("#########################################");
System.out.println();
System.out.println("Please Enter device Slno: ");
System.out.println("1.apple macbook air");
System.out.println("2.apple macbook pro");
System.out.println("3.Go Back");
int f=sc.nextInt();
switch(f)
{
case 1:apple_macbook_air  ref1=new apple_macbook_air(); //object creation
    ref1.display();
    break;
case 2: apple_macbook_pro ref2= new apple_macbook_pro (); //object creation
            ref2.display();
            break;
case 3:app();
        break;

}

}
}


class apple_macbook_air {
public void display() {
Electronicdevice  ref1=new Electronicdevice();
ref1.assign("APPLE 2020 Macbook Air m1","Silver","256 GB","MGN93HN/A","MAC os big sur","64 bit","8 GB","13.3 Inch","45 wh","bluetooth v5.0",89990);
ref1.display();
}
}

class apple_macbook_pro {
public void display() {
Electronicdevice  ref1=new Electronicdevice();
ref1.assign("Apple 2021 Macbook pro M1 Max","Space Grey","1 TB","MK1A3HN/A","Mac os Monterey","64 bit","8 GB","16.2 Inch","45 wh","bluetooth v5.0",307990);
ref1.display();
}
}
class Android extends Electric
{

    public int pho()
{
System.out.println();
System.out.println("################################");
System.out.println("AVAILABLE ANDROID PHONES ");
System.out.println("################################");
System.out.println();
System.out.println("1.Oneplus");
System.out.println("2.Samsung");
System.out.println("3.Redmi");
System.out.println("4.Realme");
System.out.println("5.Nokia");
System.out.println("6.go back");
System.out.println("********************************");
System.out.println("Please Enter Appliance Slno: ");
Scanner sc1=new Scanner(System.in);
          int b=sc1.nextInt();
switch(b)
{
 case 1: Android ref1 = new Oneplus();  // upcasting
      Oneplus Android=(Oneplus)ref1;    // downcasting
      Android.Oplus();
      break;
  case 2: Android ref2 = new Samsung();  //upcasting
      Samsung Android1=(Samsung)ref2;       //downcasting
      Android1.Ssung();
           break;
  case 3: Android ref3 = new Redmi();  //upcasting
      Redmi Android2=(Redmi)ref3;          //downcasting
      Android2.Rmi();
          break;
  case 4: Android ref4 = new Realme();  //upcasting
      Realme Android3=(Realme)ref4;         //downcasting
      Android3.Rme();
      break;
  case 5: Android ref5 = new Nokia();   //upcasting
      Nokia Android4=(Nokia)ref5;           //downcasting
      Android4.Nia();
          break;
  case 6: And();        
      default:System.out.println("UNKNOWN......PLEASE ENTER CORRECT SLNO !!!!!!!!!!!!");
 }
    return b;
   
    }
}


class Oneplus extends Android
{
public void Oplus()
{
System.out.println();
   System.out.println("#################################");
System.out.println("available oneplus devices");
System.out.println("##################################");
System.out.println();
System.out.println("1.Oneplus Nord ");
System.out.println("2.Oneplus Nord CE2");
System.out.println("3.Oneplus Nord 2T");
System.out.println("4.Oneplus Nord 10R");
System.out.println("5.Go Back");
System.out.println("Please Enter device Slno: ");
int a=sc.nextInt();
switch(a)
{
case 1:oneplus_Nord ref1= new oneplus_Nord();  //object creation
    ref1.display();
    break;
case 2:oneplus_NordCE2 ref2= new oneplus_NordCE2(); //object creation
            ref2.display();
            break;
case 3:oneplus_Nord2T ref3= new oneplus_Nord2T(); //object creation
                 ref3.display();
                 break;
case 4:oneplus_Nord10R ref4= new oneplus_Nord10R(); //object creation
                 ref4.display();
                 break;
case 5: pho();
break;

}
}
}


class oneplus_Nord
{
public void display() {
Electric  ref1=new Electric();
ref1.assign("One plus Nord","Grey Ash","256 GB","48 MP","32 MP","12 GB","6.22 Inche","4115 mAh","Dual-LED Flash,HdR,Fingerprint(Under display)",23990);
ref1.display();

}
}

class oneplus_NordCE2
{
public void display() {
Electric  ref2=new Electric();
ref2.assign("One Plus NordCE2","Mirror Ash","128 GB","64 MP","16 MP","8 GB","6.43 Inche","4500 mAh","5g connectivity,Bluetooth Enabled",24998);
ref2.display();
}
}

class oneplus_Nord2T
{
public void display() {
Electric  ref3=new Electric();
ref3.assign("One Plus Nord2T","Grey Shadow","128 GB","50 MP","32 MP","8 GB","6.43 Inche","4500 mAh","Wireless network technology,Mobile broad band generation 5G",28999);
ref3.display();
}
}

class oneplus_Nord10R
{
public void display() {
Electric  ref1=new Electric();
ref1.assign("One Plus Nord10R","Sierra Black","256 GB","50 MP","16 MP","8 GB","6.7 Inche","5000 mAh","Hyper touch,Reading mode,Eye comfort,Auto brightness,Selfie Hdr",38999);
ref1.display();
}
}




class Samsung extends Android
{
public void Ssung()
{   System.out.println();
   System.out.println("#########################");
System.out.println("available oneplus devices");
System.out.println("#########################");
System.out.println();
System.out.println("Please Enter device Slno: ");
System.out.println("1.Samsung galaxy A13");
System.out.println("2.Samsung A53");
System.out.println("3.Samsung S20FE");
System.out.println("4.Samsung Galaxy S22+");
System.out.println("5.Go Back");
int b=sc.nextInt();
switch(b)
{
case 1:Samsung_GalaxyA13 ref1= new Samsung_GalaxyA13(); //object creation
    ref1.display();
    break;
case 2:Samsung_A53 ref2= new Samsung_A53(); //object creation
            ref2.display();
            break;
case 3:Samsung_S20FE ref3= new Samsung_S20FE(); //object creation
                 ref3.display();
                 break;
case 4:Samsung_GalaxyS22Plus ref4= new Samsung_GalaxyS22Plus(); //object creation
                 ref4.display();
                 break;
case 5:pho();
            break;
}
}
}


class Samsung_GalaxyA13
{
public void display() {
Electric  ref1=new Electric();
ref1.assign("Samsung Galaxy A13","Blue","128 GB","50 MP","8 MP","6 GB","6.6 Inche","3000 mAh","Fingerprint(Side Mounted),Barometer",20990);
ref1.display();
}
}

class Samsung_A53
{
public void display() {
Electric  ref1=new Electric();
ref1.assign("Samsung A53","White","128 GB","64 MP","12 MP","6 GB","6.5 Inche","5000 mAh","LED Flash,HDR",33499);
ref1.display();
}
}

class Samsung_S20FE
{
public void display() {
Electric  ref1=new Electric();
ref1.assign("Samsung S20 FE","Cosmic Grey","128 GB","64 MP","12 MP","8 GB","6.2 Inche","4500 mAh","LED Flash,Dual Vedio call",34989);
ref1.display();
}
}

class Samsung_GalaxyS22Plus
{
public void display() {
Electric  ref1=new Electric();
ref1.assign("Samsung Galaxy S22+","Grren","128 GB","72 MP","12 MP","8 GB","6.6 Inche","4500 mAh","Fingerprint(Under Display),Proximity",69999);
ref1.display();
}
}

class Redmi extends Android
{
public void Rmi()
{
System.out.println();
   System.out.println("###############################");
System.out.println("available oneplus devices");
System.out.println("###############################");
System.out.println();
System.out.println("Please Enter device Slno: ");
System.out.println("1.Redmi Note 8PRO");
System.out.println("2.Redmi Note 9PRO");
System.out.println("3.Redmi Note 10PRO");
System.out.println("4.Redmi Note 10PRO");
System.out.println("5.Go Back");
int c=sc.nextInt();
switch(c)
{
case 1:Redmi_Note8_PRO ref1= new Redmi_Note8_PRO(); //object creation
    ref1.display();
    break;
case 2:Redmi_Note9_PRO ref2= new Redmi_Note9_PRO(); //object creation
            ref2.display();
            break;
case 3:Redmi_Note10_PRO ref3= new Redmi_Note10_PRO(); //object creation
                ref3.display();
                break;
case 4:Redmi_Note10_PRO ref4= new Redmi_Note10_PRO(); //object creation
                ref4.display();
                break;
case 5:pho();
                     break;        

}

}
}

class Redmi_Note8_PRO
{
public void display() {
Electric  ref1=new Electric();
ref1.assign("Redmi Note8 pro","Electric Blue","128 GB","72 MP","20 MP","6 GB","6.3 Inche","4500 mAh","Rear Facing camera,Fingerprint",14999);
ref1.display();
}
}

class Redmi_Note9_PRO
{
public void display() {
Electric  ref1=new Electric();
ref1.assign("Redmi Note9 Pro","Aurora Blue","128 GB","48 MP","16 MP","6 GB","6.7 Inche","5000 mAh","Fingerprint,LED Flash",17999);
ref1.display();
}
}

class Redmi_Note10_PRO  
{
public void display() {
Electric  ref1=new Electric();
ref1.assign("Redmi Note10 Pro","Dark Blue","128 GB","64 MP","12 MP","6 GB","6.67 Inche","5020 mAh","Fingerprint,Light Sensor",19999);
ref1.display();
}
}

class Redmi_Note10_PROMAX
{
public void display() {
Electric  ref1=new Electric();
ref1.assign("Redmi Note10 pro Max","Vintage Bronze","128 GB","108 MP","16 MP","6 GB","6.67 Inche","5020 mAh","Light Sensor",21999);
ref1.display();
}
}

class Realme extends Android
{
public void Rme()
{
   System.out.println();
   System.out.println("########################################");
System.out.println("available oneplus devices");
System.out.println("########################################");
System.out.println();
System.out.println("Please Enter device Slno: ");
System.out.println("1.Realme Gi");
System.out.println("2.Realme X7 Pro");
System.out.println("3.Realmi X3");
System.out.println("4.Realmi X50 pro");
System.out.println("5.Go Back");
int d=sc.nextInt();
switch(d)
{
case 1:Realme_Gi ref1= new Realme_Gi(); //object creation
    ref1.display();
    break;
case 2:Realme_X7_Pro ref2= new Realme_X7_Pro(); //object creation
            ref2.display();
            break;
case 3:Realmi_X3 ref3= new Realmi_X3(); //object creation
                ref3.display();
                break;
case 4:Realmi_X50_pro ref4= new Realmi_X50_pro(); //object creation
                ref4.display();
                break;
case 5:pho();
                     break;
}
}
}

class Realme_Gi
{
public void display() {
Electric  ref1=new Electric();
ref1.assign("Realmi Gi","Blue","64 GB","54 MP","8 MP","4 GB","6.6 Inche","5000 mAh","Fingerprint(Side Mounted)",14999);
ref1.display();
}
}

class Realme_X7_Pro
{
 public void display() {
   Electric  ref1=new Electric();
ref1.assign("Realmi X7 pro","Black","128 GB","76 MP","32 MP","8 GB","6.55 Inche","4500 mAh","Dual Mic Noise,FingerPrint,facelock",29999);
ref1.display();
}
}

class Realmi_X3
{
public void display() {
Electric  ref1=new Electric();
ref1.assign("Realmi X53","White","256 GB","84 MP","40 MP","12 GB","6.57 Inche","4200 mAh","Side Fingerprint Sensor,Theme Store",33049);
ref1.display();
}
}

class Realmi_X50_pro
{
public void display() {
Electric  ref1=new Electric();
ref1.assign("Realmi X50 Pro","Black","128 GB","86 MP","40 MP","12 GB","6.44 Inche","4200 mAh","Theme Store,APP Market",47999);
ref1.display();
}
}


class Nokia extends Android
{
public void Nia()
{           System.out.println();
   System.out.println("######################################");
System.out.println("available oneplus devices");
System.out.println("#####################################");
System.out.println();
System.out.println("Please Enter device Slno: ");
System.out.println("1.Nokia C01 Plus");
System.out.println("2.Nokia 2.2");
System.out.println("3.Nokia C30");
System.out.println("4.Nokia G21");
System.out.println("5.Go Back");
int e=sc.nextInt();
switch(e)
{
case 1:Nokia_C01_Plus ref1=new Nokia_C01_Plus(); //object creation
    ref1.display();
    break;
case 2:Nokia_22 ref2= new Nokia_22(); //object creation
            ref2.display();
            break;
case 3:Nokia_C30 ref3= new Nokia_C30(); //object creation
                ref3.display();
                break;
case 4:Nokia_G21 ref4= new Nokia_G21 (); //object creation
                ref4.display();
                break;
case 5:pho();
                    break;
}
       
}
}


class Nokia_C01_Plus {
public void display() {
Electric  ref1=new Electric();
ref1.assign("Blue","Blue","16 GB","5 MP","2 MP","2 GB","5.4 Inche","5000 mAh","Browser-HTML5,Email,MMS,SMS",5549);
ref1.display();
}
}

class Nokia_22 {
        public void display() {
   Electric  ref1=new Electric();
ref1.assign("Nokia 22","Black","16 GB","13 MP","5 MP","2 GB","5.7 Inche","3000 mAh","Sensor,Accelerometer,Email,SMS",8699);
ref1.display();
}
}

class Nokia_C30 {
public void display() {
Electric  ref1=new Electric();
ref1.assign("Nokia C30","Green","64 GB","15 MP","5 MP","4 GB","6.82 Inche","6000 mAh","Side Fingerprint(Rear-Mounted),accelerometer",10949);
ref1.display();
}
}

class Nokia_G21 {
public void display() {
Electric  ref1=new Electric();
ref1.assign("Nokia G21","nordic Blue","128 GB","54 MP","8 MP","6 GB","6.5 Inche","5050 mAh","print sensor,accelerometer",12999);
ref1.display();
}
}
class iOS extends Electric
{

    public int ios()
{
System.out.println();
System.out.println("################################");
System.out.println("AVAILABLE IOS PHONES ");
System.out.println("################################");
System.out.println();
System.out.println("1.Applee");
System.out.println("2.go back");
System.out.println("********************************");
System.out.println("Please Enter Appliance Slno: ");
Scanner sc1=new Scanner(System.in);
          int c=sc1.nextInt();
switch(c)
{
 case 1: iOS ref1 = new Applee();  // upcasting
      Applee iOS=(Applee)ref1;    // downcasting
      iOS.Ale();
      break;
  case 2: And(); 
      default:System.out.println("UNKNOWN......PLEASE ENTER CORRECT SLNO !!!!!!!!!!!!");
 }
    return c;
   
    }
}


class Applee extends iOS
{
public void Ale()
{
System.out.println();
   System.out.println("#################################");
System.out.println("available oneplus devices");
System.out.println("##################################");
System.out.println();
System.out.println("1.iphone 11 ");
System.out.println("2.iphone 11 pro");
System.out.println("3.iphone 12");
System.out.println("4.iphone 12 pro max");
System.out.println("5.iphone 13");
System.out.println("6.iphone 13 pro max");
System.out.println("7.Go Back");
System.out.println("Please Enter device Slno: ");
int a=sc.nextInt();
switch(a)
{
case 1:iphone_11 ref1= new iphone_11();  //object creation
    ref1.display();
    break;
case 2:iphone_11_pro ref2= new iphone_11_pro(); //object creation
            ref2.display();
            break;
case 3:iphone_12 ref3= new iphone_12(); //object creation
                 ref3.display();
                 break;
case 4:iphone12_pro_max ref4= new iphone12_pro_max(); //object creation
                 ref4.display();
                 break;
case 5:iphone_13 ref5= new iphone_13(); //object creation
					ref5.display();
					break;
case 6:iphone13_pro_max ref6= new iphone13_pro_max(); //object creation
					ref6.display();
					break;
case 7: ios();
break;

}
}
}


class iphone_11
{
public void display() {
Electric  ref1=new Electric();
ref1.assign("Apple iphone 11"," Green "," 128 GB","24 MP","12 MP","8 GB","6.1 Inche","4115 mAh","Dual-LED Flash,HdR,Fingerprint(Under display)",40999);
ref1.display();

}
}

class iphone_11_pro
{
public void display() {
Electric  ref2=new Electric();
ref2.assign("iphone 11 pro","Gold","256 GB","12 MP","36 MP","8 GB","5.80 Inche","4500 mAh","Wireless network technology",121300);
ref2.display();
}
}

class iphone_12
{
public void display() {
Electric  ref3=new Electric();
ref3.assign("iphone 12","blue","256 GB","12 MP","24 MP","8 GB","5.80 Inche","4500 mAh","supported network type= ALL",66990);
ref3.display();
}
}

class iphone12_pro_max
{
public void display() {
Electric  ref1=new Electric();
ref1.assign("iphone12 pro max","Silver","512 GB","12 MP","36 MP","8 GB","6.7 Inche","5000 mAh","Hyper touch,Reading mode,Eye comfort,Auto brightness,Selfie Hdr",123990);
ref1.display();
}
}


class iphone_13
{
public void display() {
Electric  ref1=new Electric();
ref1.assign("iphone 13","Blue","256 GB","12 MP","36 MP","8 GB","6.7 Inche","5000 mAh","Hyper touch,Reading mode,Eye comfort,Auto brightness,Selfie Hdr",70999);
ref1.display();
}
}

class iphone13_pro_max
{
public void display() {
Electric  ref1=new Electric();
ref1.assign("iphone13 pro max","Silver","256 GB","12 MP","36 MP","8 GB","6.7 Inche","5000 mAh","Hyper touch,Reading mode,Eye comfort,Auto brightness,Selfie Hdr",125999);
ref1.display();
}
}









//driver class
class laptop
{
//static block
    static
    {  
    System.out.println("----------------------------------------");
    System.out.println();
    System.out.println("***********************WELCOME**********************");
    System.out.println();
    System.out.println("-------------RAKESH LAPTOPS & ACCESSORIES--------------");
    System.out.println();
    System.out.println("      		!!!NEW DEVICES AVAILABLE!!!     		");
    System.out.println();
    System.out.println("-----------------------------------------------------------");
    System.out.println();
    }

    public static void main(String[] args)
    {
    Electronicdevice m=new Electronicdevice();
    m.login();

    Electronicdevice ref=new Electronicdevice();
int a=ref.And();
switch(a)
{
case 1: Electronicdevice ref1= new Windows();   //upcasting
       Windows A=(Windows)ref1;              //Downcasting
       A.lap();
       break;
case 2: Electronicdevice ref2= new Macos();       //upcasting
            Macos B=(Macos)ref2;                     //Downcasting
            B.app();
            break;
case 3: Electric ref3= new Android();       //upcasting
			Android c=(Android)ref3;                     //Downcasting
			c.pho();
			break;
case 4: Electric ref4= new iOS();       //upcasting
			iOS d=(iOS)ref4;                     //Downcasting
			d.ios();
break;

   
    }
  }
 }
