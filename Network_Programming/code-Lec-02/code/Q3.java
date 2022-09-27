import java.net.*; 
class Q3  {
	 public static void main(String [] args ){
		 testProtocol("http://www.TUDublin.ie");
		 testProtocol("https://www.TUDublin.ie ");
	     testProtocol("ftp://TUDublin.ie ");
		 testProtocol("mailto:C20321456@mytudublin.ie");
		}

		public static void testProtocol(String url){
		 try {
			 URL u = new URL(url);
			 System.out.println(u.getProtocol() + " is supported");
			}
		 catch (Exception ex) {
			 System.out.println(url + " is not supported");
	    }	
    } 	
}
