package assignment1aug;

public class Mobile {
	 

	    int model_id;
	    int price;
	    String model_name;
	    String mbl_name;
	    public void initMobile() {

	     m_id=1234;
	     
	     p=30000;
	     
	     mbl_name="Galaxy";
	    }

	    public void DispDetails() {
 
	    System.out.println("model_id:"+m_id +"model_name:"+m_nm+"mble name:"+mbl_name+"price:"p);

	    }

	    public void setmbl_name(String mbl_nm) {

	        mbl_name=mbl_nm;

	        }

	    public String getmbl_name() {

	        return mbl_name;

	        }

	    public void setmodel_id(int model_id){

	    model_id=model_id;

	    }

	    public int getmodel_id() {

	    return model_id;

	    }

	    public void setmodel_name(String model_nm) {

	    model_name=model_nm;

	    }

	    public String getmodel_name() {

	    return model_name;

	    }

	    public void setprice(int p) {

	    price=p;

	    }

	   

	    public int setprice() {

	    return price;

	    }





	   }
}
