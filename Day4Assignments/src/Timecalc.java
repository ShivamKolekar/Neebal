public class Timecalc{
    public static void main(String[] args) {
        int[] vechile = {850, 945, 1145, 1155, 1230, 1245, 1330, 1340, 1425, 1445};
        
        int totalMinutes = 0;
        
        for (int i = 0; i < vechile.length; i += 2) {
            int inTime = vechile[i];
            int outTime = vechile[i+1];
            
            int inHours = inTime / 100; //8
            int inMin = inTime % 100; //50
            
            int outHours = outTime / 100; //9
            int outMin = outTime % 100; //45
            
            int inTotalMin = inHours * 60 + inMin;
            int outTotalMin = outHours * 60 + outMin;
            
            totalMinutes += (outTotalMin - inTotalMin);
        }
        
              
        int hours = totalMinutes / 60;
        
        int minutes = totalMinutes % 60;
        
        System.out.println("Running time of the electric vehicle is " + hours + " hr " + minutes + " min");
    }
}