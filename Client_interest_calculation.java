package client_interest;
import find_simple_interest.Simple_Interest_Calculation;
import find_compound_interest.Compound_Interest_Calculation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Client_interest_calculation
{
private static final logger LOGGER=LogManager.getLogger(Client_interest_calculation.class);

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double principal,rate_of_interest,time;
int choice,x=1;
("Enter the principal\n");
principal=sc.nextDouble();
LOGGER.info("Enter the time\n");
time=sc.nextDouble();
LOGGER.info("Enter rate of interest\n");
rate_of_interest=sc.nextDouble();
Simple_Interest_Calculation s=new Simple_Interest_Calculation(principal,rate_of_interest,time);
Compound_Interest_Calculation c=new Compound_Interest_Calculation(principal,rate_of_interest,time);
while(x!=0)
{
LOGGER.info("1.Simple Interest\n");
LOGGER.info("2.Compound Interest\n");
LOGGER.info("Enter choice\n");
choice=sc.nextInt();
if(choice==1)
{
LOGGER.info("Simple Interest is\n");
LOGGER.info(s.simple_interest());
}
else if(choice==2)
{
LOGGEr.info("Compound Interest is\n");
LOGGER.info(c.compound_interest());
}
else
{
LOGGER.info("Wrong choice");
x=0;
}
}
}
}
