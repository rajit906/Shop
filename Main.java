import java.io.*;
public class shopping
{
    double cost=0.0;
    double dis=0.0;
    double Billamt=0.0;
    public static void main(String args[])throws IOException
    {
        BufferedReader std=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("**********************************************");
            System.out.println("********WELCOME TO THE SHOPPING STORE*********");
            System.out.println("**********************************************");
            shopping obj=new shopping();
                System.out.println("HERE ARE YOUR CHOICES:");
                System.out.println("1. books \n 2. clothes \n 3. food \n 4. exit \n 5. calculate bill");
                System.out.println("ENTER YOUR CHOICE");
                int c=Integer.parseInt(std.readLine());
                while(c!=0)
                {
                switch (c)
                {
                    case 1:
                    obj.books();
                    break;
                    case 2:
                    obj.clothes();
                    break;
                    case 3:
                    obj.food();
                    break;
                    case 4:
                    System.exit(0);
                    break;
                    case 5:
                    obj.calcbill();
                    break;
                    default: 
                    System.out.println("PLEASE CHECK YOUR INPUT");
                }
            }
        }
                
                public void books()throws IOException
                {
                    System.out.println("WELCOME TO THE ICSE BOOKS FOR STUDY SECTION!!");
                    System.out.println("1. COMPUTER APPLICATIONS \n 2. BIOLOGY \n 3. MATHEMATICS \n 4. PHYSICS \n 5. CHEMISTRY");
                    BufferedReader std=new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("ENTER YOUR CHOICE");
                    int chwo=Integer.parseInt(std.readLine());
                    switch(chwo)
                    {
                        case 1:
                        System.out.println("THIS IS THE COMPUTER BOOK FOR CLASS 9 and 10");
                        System.out.println("CHOOSE CLASSS 9 or 10");
                        int bookcmp=Integer.parseInt(std.readLine());
                        if(bookcmp==9)
                        {
                            System.out.println("This is a 9th standard book");
                            System.out.println("ENTER HOW MANY YOU WANT, each costs Rs. 150");
                            int book1=Integer.parseInt(std.readLine());
                            cost=cost+(150*book1);
                        }
                        else if(bookcmp==10)
                        {
                            System.out.println("THIS IS A 10th STANDARD BOOK");
                            System.out.println("ENTER HOW MANY YOU WANT, each costs Rs.200");
                            int book2=Integer.parseInt(std.readLine());
                            cost=cost+(200*book2);
                        }
                        else 
                        System.out.println("CHECK YOUR INPUT");
                        break;
                        case 2:
                        System.out.println("THIS IS THE BIOLOGY BOOK FOR CLASS 9 and 10");
                        System.out.println("CHOOSE CLASS 9 or 10");
                        int bookbio=Integer.parseInt(std.readLine());
                        if(bookbio==9)
                        {
                            System.out.println("THIS IS A 9th STANDARD BOOK");
                            System.out.println("ENTER HOW MANY YOU WANT, each costs Rs. 120");
                            int book3=Integer.parseInt(std.readLine());
                            cost=cost+(120*book3);
                        }
                        else if(bookbio==10)
                        {
                            System.out.println("THIS IS A 10th STANDARD BOOK");
                            System.out.println("ENTER HOW MANY YOU WANT, each cost Rs. 150");
                            int book4=Integer.parseInt(std.readLine());
                            cost=cost+(150*book4);
                        }
                        else
                        System.out.println("CHECK YOUR INPUT");
                        break;
                        case 3:
                        System.out.println("THIS IS THE MATHEMATICS BOOK FOR CLASS 9 and 10");
                        System.out.println("CHOOSE CLASS 9 or 10");
                        int bookmat=Integer.parseInt(std.readLine());
                        if(bookmat==9)
                        {
                            System.out.println("THIS IS A 9th STANDARD BOOK");
                            System.out.println("ENTER HOW MANY YOU WANT, each costs Rs.200");
                            int book5=Integer.parseInt(std.readLine());
                            cost=cost+(200*book5);
                        }
                        else if(bookmat==10)
                        {
                            System.out.println("THIS IS A 10th STANDARD BOOK");
                            System.out.println("ENTER HOW MANY YOU WANT, each costs Rs.250");
                            int book6=Integer.parseInt(std.readLine());
                            cost=cost+(book6*250);
                        }
                        else
                        System.out.println("CHECK YOUR INPUT");
                        break;
                        case 4:
                        System.out.println("THIS IS THE PHYSICS BOOK FOR ClASS 9 and 10");
                        System.out.println("CHOOSE CLASS 9 or 10");
                        int bookphy=Integer.parseInt(std.readLine());
                        if(bookphy==9)
                        {
                            System.out.println("THIS IS A 9th STANDARD BOOK");
                            System.out.println("ENTER HOW MANY YOU WANT, each costs Rs. 140");
                            int book7=Integer.parseInt(std.readLine());
                            cost=cost+(140*book7);
                        }
                        else if(bookphy==10);
                        {
                            System.out.println("THIS IS A 10th STANDARD BOOK");
                            System.out.println("ENTER HOW MANY YOU WANT, each costs Rs.150");
                            int book8=Integer.parseInt(std.readLine());
                            cost=cost+(book8*150);
                        }
                        break;
                        case 5:
                        System.out.println("THIS IS THE CHEMISTRYBOOK FOR CLASS 9 and 10");
                        System.out.println("CHOOSE CLASS 9 or 10");
                        int bookchem=Integer.parseInt(std.readLine());
                        if(bookchem==9)
                        {
                            System.out.println("THIS IS A 9th Standard BOOK");
                            System.out.println("ENTER HOW MANY YOU WANT, each costs Rs. 90");
                            int book9=Integer.parseInt(std.readLine());
                            cost=cost+(book9*90);
                        }
                        if(bookchem==10)
                        {
                            System.out.println("THIS IS A 10th STANDARD BOOK");
                            System.out.println("ENTER HOW MANY YOU WANT, each costs Rs.100");
                            int book10=Integer.parseInt(std.readLine());
                            cost=cost+(book10*100);
                        }
                        else
                        System.out.println("CHECK YOUR INPUT");
                        break;
                        default:
                        System.out.println("WRONG CHOICE");
                    }
                }
                    public void clothes()throws IOException
                    {
                        BufferedReader std=new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("WELCOME TO THE CLOTHES SECTION");
                        System.out.println("1. Ethnic wear 2. casual wear");
                        System.out.println("ENTER YOUR CHOICE");
                        int cha=Integer.parseInt(std.readLine());
                        switch(cha)
                        {
                            case 1:
                            System.out.println("THIS IS THE ETHNIC SECTION");
                            System.out.println("ENTER 1. Saree \n 2. Kurtas \n 3. Pattiyallas \n 4. Jodhpuri suit \n 5. Ghagras ");
                            int chann=Integer.parseInt(std.readLine());
                            if(chann==1)
                            {
                                System.out.println("ITEM NAME: SAREE");
                                System.out.println("PRICE: Rs.900 each");
                                System.out.println("ENTER NO. OF SAREES DESIRED");
                                int num1=Integer.parseInt(std.readLine());
                                cost=cost+(num1*900);
                            }
                            else
                            if(chann==2)
                            {
                                System.out.println("ITEM NAME: KURTA");
                                System.out.println("PRICE: Rs.500 each");
                                System.out.println("ENTER NO. OF KURTAS DESIRED");
                                int num2=Integer.parseInt(std.readLine());
                                cost=cost+(num2*500);
                            }
                            else
                            if(chann==3)
                            {
                                System.out.println("ITEM NAME: PATTIYALLAS");
                                System.out.println("PRICE: Rs. 400 each");
                                System.out.println("ENTER NO. OF PATTIYALLAS DESIRED");
                                int num3=Integer.parseInt(std.readLine());
                                cost=cost+(num3*400);
                            }
                            else
                            if(chann==4)
                            {
                                System.out.println("ITEM NAME:JODHPURI SUIT");
                                System.out.println("PRICE: Rs.750 each");
                                System.out.println("YOU GET 20% DISCOUNT ON THE ITEMS IF YOU PURCHASE MORE THAN ONE");
                                System.out.println("ENTER NO. OF SUITS DESIRED");
                                int num4=Integer.parseInt(std.readLine());
                                if(num4>1)
                                cost=cost+(num4*750)*0.8;
                                else
                                cost=cost+750;
                            }
                            else
                            if(chann==5)
                            {
                                System.out.println("ITEM NAME:GHAGRA");
                                System.out.println("PRICE: Rs.1000 each");
                                System.out.println("ENTER NO. OF GHAGRAS DESIRED");
                                int num5=Integer.parseInt(std.readLine());
                                cost=cost+(num5*1000);
                            }
                            break;
                            case 2:
                            System.out.println("THIS IS THE CASUAL WEAR SECTION");
                            System.out.println("1. Jeans \n 2. Shirt \n 3. T-Shirt \n 4. Tuxedo \n 5. Shorts");
                            int chann1=Integer.parseInt(std.readLine());
                            if(chann1==1)
                            {
                                System.out.println("ITEM NAME: JEANS");
                                System.out.println("PRICE: Rs. 300 each");
                                System.out.println("ENTER NO. OF JEANS DESIRED");
                                int num6=Integer.parseInt(std.readLine());
                                cost=cost+(300*num6);
                            }
                            if(chann1==2)
                            {
                                System.out.println("ITEM NAME: SHIRT");
                                System.out.println("PRICE: Rs.250 each");
                                System.out.println("ENTER NO. OF SHIRTS DESIRED");
                                int num7=Integer.parseInt(std.readLine());
                                System.out.println("BUY 2 FOR THE PRICE OF ONE");
                                if(num7>1)
                                cost=cost+(num7*250)*0.5;
                                else
                                cost=cost+750;
                            }
                            if(chann1==3)
                            {
                                System.out.println("ITEM NAME: T-SHIRT");
                                System.out.println("PRICE: Rs. 400 each");
                                System.out.println("ENTER NO. OF T-SHIRTS DESIRED");
                                int num8=Integer.parseInt(std.readLine());
                                cost=cost+(num8*400);
                            }
                            if(chann1==4)
                            {
                                System.out.println("ITEM NAME: TUXEDO");
                                System.out.println("PRICE: Rs. 3000 each");
                                System.out.println("ENTER NO. OF TUXEDOS DESIRED");
                                int num9=Integer.parseInt(std.readLine());
                                System.out.println("YOU GET A 25% DISCOUNT");
                                cost=cost+(num9*3000)*0.75;
                            }
                            if(chann1==5)
                            {
                                System.out.println("ITEM NAME: SHORTS");
                                System.out.println("PRICE: Rs. 200 each");
                                System.out.println("ENTER NO. OF SHORTS DESIRED");
                                int num10=Integer.parseInt(std.readLine());
                                System.out.println("BUY 3 FOR THE PRICE OF 2");
                                if(num10==3)
                                {
                                    cost=cost+(200*2);
                                }
                                else
                                cost=cost+(num10*200);
                            }
                            break;
                            default:
                            System.out.println("CHECK YOUR INPUT");
                        }
                    }
                        public void food()throws IOException
                        {
                            BufferedReader std=new BufferedReader(new InputStreamReader(System.in));
                            System.out.println("WELCOME TO THE SNACK SECTION");
                            System.out.println("Enter 1. Cold drinks \n 2. Chips \n 3. Chocolates");
                            int n1=Integer.parseInt(std.readLine());
                            switch(n1)
                            {
                                case 1:
                                System.out.println("COLD DRINKS IS YOUR SELECTION");
                                System.out.println("1. Coca-cola \n 2. Sprite \n 3. Fanta");
                                int n2=Integer.parseInt(std.readLine());
                                if(n2==1)
                                {
                                    System.out.println("ITEM NAME: Coca-cola");
                                    System.out.println("1. large \n 2. medium \n 3. can");
                                    int no1=Integer.parseInt(std.readLine());
                                    if(no1==1)
                                    {
                                        System.out.println("SIZE:LARGE");
                                        System.out.println("PRICE: Rs. 20 each");
                                    }
                                    else
                                    if(no1==2)
                                    {
                                        System.out.println("SIZE: MEDIUM");
                                        System.out.println("PRICE: Rs. 18 each");
                                    }
                                    else
                                    if(no1==3)
                                    {
                                        System.out.println("SIZE: CAN");
                                        System.out.println("PRICE: Rs.15 each");
                                    }
                                    else
                                    System.out.println("CHECK YOUR INPUT");
                                }
                                    else
                                    if(n2==2)
                                    {
                                        System.out.println("ITEM NAME: SPRITE");
                                        System.out.println("1. large \n 2. medium \n 3. can");
                                        int no2=Integer.parseInt(std.readLine());
                                        if(no2==1)
                                        {
                                            System.out.println("SIZE: LARGE");
                                            System.out.println("PRICE: Rs.20 each");
                                        }
                                        else
                                        if(no2==2)
                                        {
                                        System.out.println("SIZE:MEDIUM");
                                        System.out.println("PRICE: Rs.18 each");
                                    }
                                    else
                                    if(no2==3)
                                    {
                                        System.out.println("SIZE:CAN");
                                        System.out.println("PRICE: Rs. 12");
                                    }
                                    else
                                    System.out.println("CHECK YOUR INPUT");
                                }
                                    else
                                    if(n2==3)
                                    {
                                        System.out.println("ITEM NAME:FANTA");
                                        System.out.println("1. large \n 2. medium \n 3. can");
                                        int no3=Integer.parseInt(std.readLine());
                                        if(no3==1)
                                        {
                                            System.out.println("SIZE:LARGE");
                                            System.out.println("PRICE:Rs. 20 each");
                                        }
                                        else
                                        if(no3==2)
                                        {
                                            System.out.println("SIZE:MEDIUM");
                                            System.out.println("PRICE:Rs. 14 each");
                                        }
                                        else
                                        if(no3==3)
                                        {
                                            System.out.println("SIZE:CAN");
                                            System.out.println("PRICE: Rs.10 each");
                                        }
                                        else
                                        System.out.println("CHECK YOUR INPUT");
                                    }
                                       break;
                                       case 2:
                                       System.out.println("CHIPS IS YOUR SELECTION");
                                       System.out.println("ENTER 1. large \n 2. medium \n 3. small");
                                       int n3=Integer.parseInt(std.readLine());
                                       if(n3==1)
                                       {
                                           System.out.println("SIZE OF PACKET:LARGE");
                                           System.out.println("PRICE: Rs. 24");
                                        }
                                        else
                                        if(n3==2)
                                        {
                                            System.out.println("SIZE OF PACKET: MEDIUM");
                                            System.out.println("PRICE: RS. 20");
                                        }
                                        else
                                        if(n3==3)
                                        {
                                            System.out.println("SIZE OF PACKET: SMALL");
                                            System.out.println("PRICE:Rs. 15");
                                        }
                                        else
                                        System.out.println("CHECK YOUR INPUT");
                                        break;
                                        case 3:
                                        System.out.println("CHOCOLATES IS YOUR SELECTION");
                                        System.out.println("1. large \n 2. medium \n 3. small");
                                        int n4=Integer.parseInt(std.readLine());
                                        if(n4==1)
                                        {
                                            System.out.println("SIZE:LARGE");
                                            System.out.println("PRICE:Rs. 30");
                                        }
                                        else
                                        if(n4==2)
                                        {
                                            System.out.println("SIZE:MEDIUM");
                                            System.out.println("PRICE: Rs. 25");
                                        }
                                        else
                                        if(n4==3)
                                        {
                                            System.out.println("SIZE:SMALL");
                                            System.out.println("PRICE:Rs.20");
                                        }
                                        else
                                        System.out.println("CHECK YOUR INPUT");
                                        break;
                                        default:
                                        System.out.println("WRONG CHOICE");
                                    }
                                }
                                public void calcbill()
                                {
                                    Billamt=Billamt+cost;
                                    System.out.println("YOUR BILL IS:"+ Billamt);
                            }
                        }
