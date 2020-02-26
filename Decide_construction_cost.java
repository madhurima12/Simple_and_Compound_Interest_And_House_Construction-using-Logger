
package decide;
import java.io.PrintStream;
import customer_input.Customer_house_construction;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import find_constructioncost_forstandard.Construction_cost_for_standard_material;
import find_constructioncost_for_abovestandard.Construction_cost_for_abovestandard_material;
import find_constructioncost_for_highstandard.Construction_cost_for_highstandard_material;
import findconstructioncostforhighstandardfullyautomated.Construction_cost_for_highstandard_material_and_fullyautomated_home; 
public class Decide_construction_cost extends Customer_house_construction
{
public int fully_automated_home,material_standard,total_area_of_house,cost;
public Decide_construction_cost(int fully_automated_home,int cost,int material_standard,int total_area_of_house)
{
this.fully_automated_home=fully_automated_home;
this.cost=cost;
this.material_standard=material_standard;
this.total_area_of_house=total_area_of_house;
}



public void check()
{
private static final Logger LOGGER=LogManager.getLogger(Decide_construction_cost.class);
Construction_cost_for_standard_material c1=new Construction_cost_for_standard_material(fully_automated_home,cost,material_standard,total_area_of_house);
Construction_cost_for_abovestandard_material c2=new Construction_cost_for_abovestandard_material(fully_automated_home,cost,material_standard,total_area_of_house);
Construction_cost_for_highstandard_material c3=new Construction_cost_for_highstandard_material(fully_automated_home,cost,material_standard,total_area_of_house);
Construction_cost_for_highstandard_material_and_fullyautomated_home c4=new Construction_cost_for_highstandard_material_and_fullyautomated_home(fully_automated_home,cost,material_standard,total_area_of_house);

if((fully_automated_home==1)&&(material_standard==3))
{

LOGGER.info("Construction cost is\n");
LOGGER.info(c4.constructioncost_for_highstandard_fullyautomated());
LOGGER.info("\n");
}
else if((fully_automated_home==0)&&(material_standard==1))
{
LOGGER.info("Construction cost is\n");
LOGGER.info(c1.constructioncost_for_standard());
LOGGER.info("\n");
}
else if((fully_automated_home==0) && (material_standard==2))
{
LOGGER.info("Construction cost is\n");
LOGGER.info(c2.constructioncost_for_above_standard());
LOGGER.info("\n");
}
else if((fully_automated_home==0) && (material_standard==3))
{
LOGGER.info("Construction cost is \n");
LOGGER.info(c3.constructioncost_for_high_standard());
LOGGER.info("\n");
}
else
{
LOGGER.info("Wrong input");
}
}
}
