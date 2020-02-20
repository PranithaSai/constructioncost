package pranitha;

public class Construction {
	double area;
	double material_standard;
	double cost;
	Construction (double area,double material_standard)
	{
	this.area=area;
	this.material_standard=material_standard;
	}
	void const_cost()
	{
	    if(material_standard==1200)
	    {
	    cost= area*1200;
	    }
	    if(material_standard==1500)
	    {
	    cost =area*1500;
	    }
	    if(material_standard==1800)
	    {
	    cost=area*1800;
	    }
	    if(material_standard==2500)
	    {
	       cost=area*2500;
	    }
	    System.out.println("House Construction cost is: "+ cost);
	}

}
