package threading;

public class AA {
	
	public static List<String> multiThreadRequest(List<String> deveuis,int from) {
		List<String> results = new ArrayList<String>();
		if(deveuis!=null && !deveuis.isEmpty()) {
			Thread[] threads = new Thread[deveuis.size()];
			int threadNumber=0;
			for(String deveui:deveuis) {
				threads[threadNumber] =new Thread(()->{
	            	try {
	            		results.add(getLatestData(deveui,"C7AACEB-a7b94aad","Test@123"));
					} catch (Exception e) {
						e.printStackTrace();
					}
	            });
				threads[threadNumber].start();
				threadNumber++;
			}
			System.out.println("till now request created for "+(from+deveuis.size())+" deveuis.");
			for(int i=0;i<deveuis.size();i++) {
				try {
					threads[i].join();
					System.out.println(from);
					from++;
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println(from);
					from++;
				}
			}
		}
		return results;
	}

}
