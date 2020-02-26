
package customer_input;
import decide.Decide_construction_cost;
import find_constructioncost_forstandard.Construction_cost_for_standard_material;
import find_constructioncost_for_abovestandard.Construction_cost_for_abovestandard_material;
import find_constructioncost_for_highstandard.Construction_cost_for_highstandard_material;
import findconstructioncostforhighstandardfullyautomated.Construction_cost_for_highstandard_material_and_fullyautomated_home;
import java.util.Scanner;
import org.apache.logging.logging4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Customer_house_construction
{
private static final Logger LOGGER=LogManager.getLogger(Customer_house_construction.class);
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int material_standard=0,total_area_of_house=0,x=1,enter=0,cost=0,fully_automated_home=0;
while(x!=0)
{
LOGGER.info("Enter the material standard\n");
LOGGER.info("1.Standard-Cost Rs 1200.Enter 1200 in cost after choosing standard\n");
LOGGER.info("2.Above Standard-Cost Rs 1500. Enter 1500 in cost after choosing Above Standard\n");
LOGGER.info("3.High Standard-Rs 1800 without fully automated and 2500 for fully automated.Enter cost accordingly\n");
material_standard=sc.nextInt();
LOGGER.info("Do you want fully automated home\n. Enter 1 for yes and 0 for No. This option available only for high standard\n");
fully_automated_home=sc.nextInt();
LOGGER.info("Enter total area of house\n");
total_area_of_house=sc.nextInt();
LOGGER.info("Enter cost");
cost=sc.nextInt();

Decide_construction_cost d=new Decide_construction_cost(fully_automated_home,cost, material_standard,total_area_of_house);
d.check();
LOGGER.info("Do you want to continue. 1 for yes. 0 for no");
enter=sc.nextInt();
if(enter!=1)
{
LOGGER.info("Stopped");
break;
}
}
}
}

